package MingMang;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class Game {
    public Board gameBoard;
    public Player player1;
    public Player player2;

    public Game() {
        cg_init_Game_1();
    }

    public void cg_init_Game_1() {
        gameBoard = new Board();
        player1 = new Player(MingMang.quotes.player1Quote.getInstance());
        player2 = new Player(MingMang.quotes.player2Quote.getInstance());
    }

    public Boolean correctpiece(final Object name, final VDMSeq array) {
        Boolean andResult_1 = false;

        if (Utils.equals(name, MingMang.quotes.player1Quote.getInstance())) {
            if (Utils.equals(Utils.get(gameBoard.getBoard(), array),
                        MingMang.quotes.WhiteQuote.getInstance())) {
                andResult_1 = true;
            }
        }

        if (andResult_1) {
            return true;
        } else {
            Boolean andResult_2 = false;

            if (Utils.equals(name, MingMang.quotes.player2Quote.getInstance())) {
                if (Utils.equals(Utils.get(gameBoard.getBoard(), array),
                            MingMang.quotes.BlackQuote.getInstance())) {
                    andResult_2 = true;
                }
            }

            if (andResult_2) {
                return true;
            } else {
                return false;
            }
        }
    }

    public Player currentplayer() {
        if (Utils.equals(player1.getActive(), true)) {
            return player1;
        } else {
            return player2;
        }
    }

    public Player secondplayer() {
        if (Utils.equals(player1.getActive(), true)) {
            return player2;
        } else {
            return player1;
        }
    }

    public void changecurrentplayer() {
        player1.changeActive();
        player2.changeActive();
    }

    public Player getplayer1() {
        return player1;
    }

    public Player getplayer2() {
        return player2;
    }

    public Boolean checkhorizontalvertical(final VDMSeq current,
        final VDMSeq objective) {
        Boolean andResult_3 = false;

        Boolean orResult_1 = false;

        if (Utils.equals(((Number) Utils.get(current, 1L)),
                    ((Number) Utils.get(objective, 1L)))) {
            orResult_1 = true;
        } else {
            orResult_1 = Utils.equals(((Number) Utils.get(current, 2L)),
                    ((Number) Utils.get(objective, 2L)));
        }

        if (orResult_1) {
            Boolean orResult_2 = false;

            if (!(Utils.equals(((Number) Utils.get(current, 1L)),
                        ((Number) Utils.get(objective, 2L))))) {
                orResult_2 = true;
            } else {
                orResult_2 = !(Utils.equals(((Number) Utils.get(current, 2L)),
                        ((Number) Utils.get(objective, 1L))));
            }

            if (orResult_2) {
                andResult_3 = true;
            }
        }

        if (andResult_3) {
            return true;
        } else {
            return false;
        }
    }

    public void changepiecesbetween(final VDMSeq current, final VDMSeq objective) {
        if (Utils.equals(((Number) Utils.get(current, 1L)),
                    ((Number) Utils.get(objective, 1L)))) {
            long toVar_1 = ((Number) Utils.get(objective, 2L)).longValue();

            for (Long i = ((Number) Utils.get(current, 2L)).longValue();
                    i <= toVar_1; i++) {
                Boolean andResult_4 = false;

                if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                SeqUtil.seq(((Number) Utils.get(current, 1L)),
                                    ((Number) Utils.get(current, 2L)))),
                            Utils.get(gameBoard.getBoard(),
                                SeqUtil.seq(((Number) Utils.get(current, 1L)), i))))) {
                    if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(
                                        ((Number) Utils.get(current, 1L)), i)),
                                MingMang.quotes.SpaceQuote.getInstance()))) {
                        andResult_4 = true;
                    }
                }

                if (andResult_4) {
                    gameBoard.setBoard(MapUtil.override(gameBoard.getBoard(),
                            MapUtil.map(
                                new Maplet(SeqUtil.seq(
                                        ((Number) Utils.get(current, 1L)), i),
                                    Utils.get(gameBoard.getBoard(),
                                        SeqUtil.seq(
                                            ((Number) Utils.get(current, 1L)),
                                            ((Number) Utils.get(current, 2L))))))));
                }

                Boolean orResult_3 = false;

                if (Utils.equals(Utils.get(gameBoard.getBoard(),
                                SeqUtil.seq(((Number) Utils.get(current, 1L)), i)),
                            MingMang.quotes.WhiteQuote.getInstance())) {
                    orResult_3 = true;
                } else {
                    orResult_3 = Utils.equals(Utils.get(gameBoard.getBoard(),
                                SeqUtil.seq(((Number) Utils.get(current, 1L)), i)),
                            MingMang.quotes.BlackQuote.getInstance());
                }

                if (orResult_3) {
                    updatepiecenr(MingMang.quotes.colourQuote.getInstance());
                } else {
                    updatepiecenr(MingMang.quotes.spaceQuote.getInstance());
                }
            }
        } else if (Utils.equals(((Number) Utils.get(current, 2L)),
                    ((Number) Utils.get(objective, 2L)))) {
            long toVar_2 = ((Number) Utils.get(objective, 1L)).longValue();

            for (Long i = ((Number) Utils.get(current, 1L)).longValue();
                    i <= toVar_2; i++) {
                Boolean andResult_5 = false;

                if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                SeqUtil.seq(((Number) Utils.get(current, 1L)),
                                    ((Number) Utils.get(current, 2L)))),
                            Utils.get(gameBoard.getBoard(),
                                SeqUtil.seq(i, ((Number) Utils.get(current, 2L))))))) {
                    if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(i,
                                        ((Number) Utils.get(current, 2L)))),
                                MingMang.quotes.SpaceQuote.getInstance()))) {
                        andResult_5 = true;
                    }
                }

                if (andResult_5) {
                    gameBoard.setBoard(MapUtil.override(gameBoard.getBoard(),
                            MapUtil.map(
                                new Maplet(SeqUtil.seq(i,
                                        ((Number) Utils.get(current, 2L))),
                                    Utils.get(gameBoard.getBoard(),
                                        SeqUtil.seq(
                                            ((Number) Utils.get(current, 1L)),
                                            ((Number) Utils.get(current, 2L))))))));
                }

                Boolean orResult_4 = false;

                if (Utils.equals(Utils.get(gameBoard.getBoard(),
                                SeqUtil.seq(i, ((Number) Utils.get(current, 2L)))),
                            MingMang.quotes.WhiteQuote.getInstance())) {
                    orResult_4 = true;
                } else {
                    orResult_4 = Utils.equals(Utils.get(gameBoard.getBoard(),
                                SeqUtil.seq(i, ((Number) Utils.get(current, 2L)))),
                            MingMang.quotes.BlackQuote.getInstance());
                }

                if (orResult_4) {
                    updatepiecenr(MingMang.quotes.colourQuote.getInstance());
                } else {
                    updatepiecenr(MingMang.quotes.spaceQuote.getInstance());
                }
            }
        }
    }

    public void updatepiecenr(final Object type) {
        currentplayer().updatepieces(type);
        secondplayer().removepieces(type);
    }

    public String toString() {
        return "Game{" + "gameBoard := " + Utils.toString(gameBoard) +
        ", player1 := " + Utils.toString(player1) + ", player2 := " +
        Utils.toString(player2) + "}";
    }
}
