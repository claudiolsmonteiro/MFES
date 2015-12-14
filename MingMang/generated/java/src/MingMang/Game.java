package MingMang;

import org.overture.codegen.runtime.*;

import MingMang.quotes.SpaceQuote;

import java.util.*;


@SuppressWarnings("all")
public class Game {
    private Board gameBoard;
    private Player player1;
    private Player player2;

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

    public Board getgameBoard() {
        return gameBoard;
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

    public VDMSeq getNextFriendlyPos(final VDMSeq currentPos,
        final Number direction) {
        Boolean andResult_4 = false;

        if (Utils.equals(direction, 0L)) {
            if (!(Utils.equals(((Number) Utils.get(currentPos, 1L)), 0L))) {
                andResult_4 = true;
            }
        }

        if (andResult_4) {
            long toVar_1 = 0L;

            for (Long i = ((Number) Utils.get(currentPos, 1L)).longValue() -
                    1L; i <= toVar_1; i++) {
                if (Utils.equals(Utils.get(gameBoard.getBoard(), currentPos),
                            Utils.get(gameBoard.getBoard(),
                                SeqUtil.seq(i,
                                    ((Number) Utils.get(currentPos, 2L)))))) {
                    return SeqUtil.seq(i, ((Number) Utils.get(currentPos, 2L)));
                }
            }
        } else {
            Boolean andResult_5 = false;

            if (Utils.equals(direction, 1L)) {
                if (!(Utils.equals(((Number) Utils.get(currentPos, 1L)), 7L))) {
                    andResult_5 = true;
                }
            }

            if (andResult_5) {
                long toVar_2 = 7L;

                for (Long i = ((Number) Utils.get(currentPos, 1L)).longValue() +
                        1L; i <= toVar_2; i++) {
                    if (Utils.equals(Utils.get(gameBoard.getBoard(), currentPos),
                                Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(i,
                                        ((Number) Utils.get(currentPos, 2L)))))) {
                        return SeqUtil.seq(i,
                            ((Number) Utils.get(currentPos, 2L)));
                    }
                }
            } else {
                Boolean andResult_6 = false;

                if (Utils.equals(direction, 2L)) {
                    if (!(Utils.equals(((Number) Utils.get(currentPos, 2L)), 0L))) {
                        andResult_6 = true;
                    }
                }

                if (andResult_6) {
                    long toVar_3 = 0L;

                    for (Long i = ((Number) Utils.get(currentPos, 2L)).longValue() -
                            1L; i <= toVar_3; i++) {
                        if (Utils.equals(Utils.get(gameBoard.getBoard(),
                                        currentPos),
                                    Utils.get(gameBoard.getBoard(),
                                        SeqUtil.seq(
                                            ((Number) Utils.get(currentPos, 1L)),
                                            i)))) {
                            return SeqUtil.seq(((Number) Utils.get(currentPos,
                                    1L)), i);
                        }
                    }
                } else {
                    Boolean andResult_7 = false;

                    if (Utils.equals(direction, 3L)) {
                        if (!(Utils.equals(
                                    ((Number) Utils.get(currentPos, 2L)), 7L))) {
                            andResult_7 = true;
                        }
                    }

                    if (andResult_7) {
                        long toVar_4 = 7L;

                        for (Long i = ((Number) Utils.get(currentPos, 2L)).longValue() +
                                1L; i <= toVar_4; i++) {
                            if (Utils.equals(Utils.get(gameBoard.getBoard(),
                                            currentPos),
                                        Utils.get(gameBoard.getBoard(),
                                            SeqUtil.seq(
                                                ((Number) Utils.get(
                                                    currentPos, 1L)), i)))) {
                                return SeqUtil.seq(((Number) Utils.get(
                                        currentPos, 1L)), i);
                            }
                        }
                    }
                }
            }
        }

        return SeqUtil.seq(9L, 9L);
    }

    public VDMSeq getNextPos(final VDMSeq currentPos, final Number direction) {
        Boolean andResult_8 = false;

        if (Utils.equals(direction, 0L)) {
            if (!(Utils.equals(((Number) Utils.get(currentPos, 1L)), 0L))) {
                andResult_8 = true;
            }
        }

        if (andResult_8) {
            long toVar_5 = 0L;

            for (Long i = ((Number) Utils.get(currentPos, 1L)).longValue() -
                    1L; i <= toVar_5; i++) {
                if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                SeqUtil.seq(i,
                                    ((Number) Utils.get(currentPos, 2L)))),
                            MingMang.quotes.SpaceQuote.getInstance()))) {
                    return SeqUtil.seq(i, ((Number) Utils.get(currentPos, 2L)));
                }
            }
        } else {
            Boolean andResult_9 = false;

            if (Utils.equals(direction, 1L)) {
                if (!(Utils.equals(((Number) Utils.get(currentPos, 1L)), 7L))) {
                    andResult_9 = true;
                }
            }

            if (andResult_9) {
                long toVar_6 = 7L;

                for (Long i = ((Number) Utils.get(currentPos, 1L)).longValue() +
                        1L; i <= toVar_6; i++) {
                    if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(i,
                                        ((Number) Utils.get(currentPos, 2L)))),
                                MingMang.quotes.SpaceQuote.getInstance()))) {
                        return SeqUtil.seq(i,
                            ((Number) Utils.get(currentPos, 2L)));
                    }
                }
            } else {
                Boolean andResult_10 = false;

                if (Utils.equals(direction, 2L)) {
                    if (!(Utils.equals(((Number) Utils.get(currentPos, 2L)), 0L))) {
                        andResult_10 = true;
                    }
                }

                if (andResult_10) {
                    long toVar_7 = 0L;

                    for (Long i = ((Number) Utils.get(currentPos, 2L)).longValue() -
                            1L; i <= toVar_7; i++) {
                        if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                        SeqUtil.seq(
                                            ((Number) Utils.get(currentPos, 1L)),
                                            i)),
                                    MingMang.quotes.SpaceQuote.getInstance()))) {
                            return SeqUtil.seq(((Number) Utils.get(currentPos,
                                    1L)), i);
                        }
                    }
                } else {
                    Boolean andResult_11 = false;

                    if (Utils.equals(direction, 3L)) {
                        if (!(Utils.equals(
                                    ((Number) Utils.get(currentPos, 2L)), 7L))) {
                            andResult_11 = true;
                        }
                    }

                    if (andResult_11) {
                        long toVar_8 = 7L;

                        for (Long i = ((Number) Utils.get(currentPos, 2L)).longValue() +
                                1L; i <= toVar_8; i++) {
                            if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                            SeqUtil.seq(
                                                ((Number) Utils.get(
                                                    currentPos, 1L)), i)),
                                        MingMang.quotes.SpaceQuote.getInstance()))) {
                                return SeqUtil.seq(((Number) Utils.get(
                                        currentPos, 1L)), i);
                            }
                        }
                    }
                }
            }
        }

        return SeqUtil.seq(9L, 9L);
    }

    public Boolean movepiece(final VDMSeq current, final VDMSeq objective) {
        gameBoard.setBoard(MapUtil.override(gameBoard.getBoard(),
                MapUtil.map(
                    new Maplet(Utils.copy(objective),
                        Utils.get(gameBoard.getBoard(), current)))));
        gameBoard.setBoard(MapUtil.override(gameBoard.getBoard(),
                MapUtil.map(
                    new Maplet(Utils.copy(current),
                        MingMang.quotes.SpaceQuote.getInstance()))));

        return true;
    }

    public void changepiecesbetween(final VDMSeq current, final VDMSeq objective) {
        if (Utils.equals(((Number) Utils.get(current, 1L)),
                    ((Number) Utils.get(objective, 1L)))) {
            if (((Number) Utils.get(current, 2L)).longValue() < ((Number) Utils.get(
                        objective, 2L)).longValue()) {
                long toVar_9 = ((Number) Utils.get(objective, 2L)).longValue() -
                    1L;

                for (Long i = ((Number) Utils.get(current, 2L)).longValue() +
                        1L; i <= toVar_9; i++) {
                    Boolean andResult_14 = false;

                    if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(
                                        ((Number) Utils.get(current, 1L)),
                                        ((Number) Utils.get(current, 2L)))),
                                Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(
                                        ((Number) Utils.get(current, 1L)), i))))) {
                        if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                        SeqUtil.seq(
                                            ((Number) Utils.get(current, 1L)), i)),
                                    MingMang.quotes.SpaceQuote.getInstance()))) {
                            andResult_14 = true;
                        }
                    }

                    if (andResult_14) {
                        gameBoard.setBoard(MapUtil.override(
                                gameBoard.getBoard(),
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
                                    SeqUtil.seq(
                                        ((Number) Utils.get(current, 1L)), i)),
                                MingMang.quotes.WhiteQuote.getInstance())) {
                        orResult_3 = true;
                    } else {
                        orResult_3 = Utils.equals(Utils.get(
                                    gameBoard.getBoard(),
                                    SeqUtil.seq(
                                        ((Number) Utils.get(current, 1L)), i)),
                                MingMang.quotes.BlackQuote.getInstance());
                    }

                    if (orResult_3) {
                        updatepiecenr(MingMang.quotes.colourQuote.getInstance());
                    } else {
                        updatepiecenr(SpaceQuote.getInstance());
                    }
                }
            } else {
                long toVar_10 = ((Number) Utils.get(objective, 2L)).longValue() +
                    1L;

                for (Long i = ((Number) Utils.get(current, 2L)).longValue() -
                        1L; i <= toVar_10; i++) {
                    Boolean andResult_15 = false;

                    if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(
                                        ((Number) Utils.get(current, 1L)),
                                        ((Number) Utils.get(current, 2L)))),
                                Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(
                                        ((Number) Utils.get(current, 1L)), i))))) {
                        if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                        SeqUtil.seq(
                                            ((Number) Utils.get(current, 1L)), i)),
                                    MingMang.quotes.SpaceQuote.getInstance()))) {
                            andResult_15 = true;
                        }
                    }

                    if (andResult_15) {
                        gameBoard.setBoard(MapUtil.override(
                                gameBoard.getBoard(),
                                MapUtil.map(
                                    new Maplet(SeqUtil.seq(
                                            ((Number) Utils.get(current, 1L)), i),
                                        Utils.get(gameBoard.getBoard(),
                                            SeqUtil.seq(
                                                ((Number) Utils.get(current, 1L)),
                                                ((Number) Utils.get(current, 2L))))))));
                    }

                    Boolean orResult_4 = false;

                    if (Utils.equals(Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(
                                        ((Number) Utils.get(current, 1L)), i)),
                                MingMang.quotes.WhiteQuote.getInstance())) {
                        orResult_4 = true;
                    } else {
                        orResult_4 = Utils.equals(Utils.get(
                                    gameBoard.getBoard(),
                                    SeqUtil.seq(
                                        ((Number) Utils.get(current, 1L)), i)),
                                MingMang.quotes.BlackQuote.getInstance());
                    }

                    if (orResult_4) {
                        updatepiecenr(MingMang.quotes.colourQuote.getInstance());
                    } else {
                        updatepiecenr(SpaceQuote.getInstance());
                    }
                }
            }
        } else if (Utils.equals(((Number) Utils.get(current, 2L)),
                    ((Number) Utils.get(objective, 2L)))) {
            if (((Number) Utils.get(current, 1L)).longValue() < ((Number) Utils.get(
                        objective, 1L)).longValue()) {
                long toVar_11 = ((Number) Utils.get(objective, 1L)).longValue() -
                    1L;

                for (Long i = ((Number) Utils.get(current, 1L)).longValue() +
                        1L; i <= toVar_11; i++) {
                    Boolean andResult_16 = false;

                    if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(
                                        ((Number) Utils.get(current, 1L)),
                                        ((Number) Utils.get(current, 2L)))),
                                Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(i,
                                        ((Number) Utils.get(current, 2L))))))) {
                        if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                        SeqUtil.seq(i,
                                            ((Number) Utils.get(current, 2L)))),
                                    MingMang.quotes.SpaceQuote.getInstance()))) {
                            andResult_16 = true;
                        }
                    }

                    if (andResult_16) {
                        gameBoard.setBoard(MapUtil.override(
                                gameBoard.getBoard(),
                                MapUtil.map(
                                    new Maplet(SeqUtil.seq(i,
                                            ((Number) Utils.get(current, 2L))),
                                        Utils.get(gameBoard.getBoard(),
                                            SeqUtil.seq(
                                                ((Number) Utils.get(current, 1L)),
                                                ((Number) Utils.get(current, 2L))))))));
                    }

                    Boolean orResult_5 = false;

                    if (Utils.equals(Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(i,
                                        ((Number) Utils.get(current, 2L)))),
                                MingMang.quotes.WhiteQuote.getInstance())) {
                        orResult_5 = true;
                    } else {
                        orResult_5 = Utils.equals(Utils.get(
                                    gameBoard.getBoard(),
                                    SeqUtil.seq(i,
                                        ((Number) Utils.get(current, 2L)))),
                                MingMang.quotes.BlackQuote.getInstance());
                    }

                    if (orResult_5) {
                        updatepiecenr(MingMang.quotes.colourQuote.getInstance());
                    } else {
                        updatepiecenr(SpaceQuote.getInstance());
                    }
                }
            } else {
                long toVar_12 = ((Number) Utils.get(objective, 1L)).longValue() +
                    1L;

                for (Long i = ((Number) Utils.get(current, 1L)).longValue() -
                        1L; i <= toVar_12; i++) {
                    Boolean andResult_17 = false;

                    if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(
                                        ((Number) Utils.get(current, 1L)),
                                        ((Number) Utils.get(current, 2L)))),
                                Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(i,
                                        ((Number) Utils.get(current, 2L))))))) {
                        if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                        SeqUtil.seq(i,
                                            ((Number) Utils.get(current, 2L)))),
                                    MingMang.quotes.SpaceQuote.getInstance()))) {
                            andResult_17 = true;
                        }
                    }

                    if (andResult_17) {
                        gameBoard.setBoard(MapUtil.override(
                                gameBoard.getBoard(),
                                MapUtil.map(
                                    new Maplet(SeqUtil.seq(i,
                                            ((Number) Utils.get(current, 2L))),
                                        Utils.get(gameBoard.getBoard(),
                                            SeqUtil.seq(
                                                ((Number) Utils.get(current, 1L)),
                                                ((Number) Utils.get(current, 2L))))))));
                    }

                    Boolean orResult_6 = false;

                    if (Utils.equals(Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(i,
                                        ((Number) Utils.get(current, 2L)))),
                                MingMang.quotes.WhiteQuote.getInstance())) {
                        orResult_6 = true;
                    } else {
                        orResult_6 = Utils.equals(Utils.get(
                                    gameBoard.getBoard(),
                                    SeqUtil.seq(i,
                                        ((Number) Utils.get(current, 2L)))),
                                MingMang.quotes.BlackQuote.getInstance());
                    }

                    if (orResult_6) {
                        updatepiecenr(MingMang.quotes.colourQuote.getInstance());
                    } else {
                        updatepiecenr(SpaceQuote.getInstance());
                    }
                }
            }
        }
    }

    public void updatepiecenr(final Object type) {
        currentplayer().updatepieces(type);
        secondplayer().removepieces(type);
    }

    public void updatePositionsOwned() {
        VDMSeq lastPiece = SeqUtil.seq(9L, 9L);
        player1.resetPosOwned();
        player2.resetPosOwned();

        long toVar_14 = 7L;

        for (Long line = 0L; line <= toVar_14; line++) {
            lastPiece = SeqUtil.seq(9L, 9L);

            long toVar_13 = 7L;

            for (Long column = 0L; column <= toVar_13; column++) {
                if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                SeqUtil.seq(line, column)),
                            MingMang.quotes.SpaceQuote.getInstance()))) {
                    if (Utils.equals(Utils.get(gameBoard.getBoard(),
                                    SeqUtil.seq(line, column)),
                                MingMang.quotes.WhiteQuote.getInstance())) {
                        player1.increaseOwned();
                    } else {
                        player2.increaseOwned();
                    }

                    if (!(Utils.equals(((Number) Utils.get(lastPiece, 1L)), 9L))) {
                        if (Utils.equals(Utils.get(gameBoard.getBoard(),
                                        SeqUtil.seq(line, column)),
                                    Utils.get(gameBoard.getBoard(), lastPiece))) {
                            addPositionsOwned(Utils.copy(lastPiece),
                                SeqUtil.seq(line, column), 0L);
                        }
                    }

                    lastPiece = SeqUtil.seq(line, column);
                }
            }
        }

        long toVar_16 = 7L;

        for (Long column = 0L; column <= toVar_16; column++) {
            lastPiece = SeqUtil.seq(9L, 9L);

            long toVar_15 = 7L;

            for (Long line = 0L; line <= toVar_15; line++) {
                if (!(Utils.equals(Utils.get(gameBoard.getBoard(),
                                SeqUtil.seq(line, column)),
                            MingMang.quotes.SpaceQuote.getInstance()))) {
                    if (!(Utils.equals(((Number) Utils.get(lastPiece, 1L)), 9L))) {
                        if (Utils.equals(Utils.get(gameBoard.getBoard(),
                                        SeqUtil.seq(line, column)),
                                    Utils.get(gameBoard.getBoard(), lastPiece))) {
                            addPositionsOwned(Utils.copy(lastPiece),
                                SeqUtil.seq(line, column), 1L);
                        }
                    }

                    lastPiece = SeqUtil.seq(line, column);
                }
            }
        }
    }

    public void addPositionsOwned(final VDMSeq init, final VDMSeq final_,
        final Number dir) {
        if (Utils.equals(Utils.get(gameBoard.getBoard(), init),
                    MingMang.quotes.WhiteQuote.getInstance())) {
            if (Utils.equals(dir, 0L)) {
                long toVar_17 = ((Number) Utils.get(final_, 2L)).longValue() -
                    1L;

                for (Long i = ((Number) Utils.get(init, 2L)).longValue() + 1L;
                        i <= toVar_17; i++) {
                    player1.increaseOwned();
                }
            } else {
                long toVar_18 = ((Number) Utils.get(final_, 1L)).longValue() -
                    1L;

                for (Long i = ((Number) Utils.get(init, 1L)).longValue() + 1L;
                        i <= toVar_18; i++) {
                    player1.increaseOwned();
                }
            }
        } else {
            if (Utils.equals(dir, 0L)) {
                long toVar_19 = ((Number) Utils.get(final_, 2L)).longValue() -
                    1L;

                for (Long i = ((Number) Utils.get(init, 2L)).longValue() + 1L;
                        i <= toVar_19; i++) {
                    player2.increaseOwned();
                }
            } else {
                long toVar_20 = ((Number) Utils.get(final_, 1L)).longValue() -
                    1L;

                for (Long i = ((Number) Utils.get(init, 1L)).longValue() + 1L;
                        i <= toVar_20; i++) {
                    player2.increaseOwned();
                }
            }
        }
    }

    public Number checkGameOver() {
        if (player1.getnOwned().longValue() > 32L) {
            return 1L;
        } else if (player2.getnOwned().longValue() > 32L) {
            return 2L;
        } else {
            return 3L;
        }
    }

    public String toString() {
        return "Game{" + "gameBoard := " + Utils.toString(gameBoard) +
        ", player1 := " + Utils.toString(player1) + ", player2 := " +
        Utils.toString(player2) + "}";
    }
}
