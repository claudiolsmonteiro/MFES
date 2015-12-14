package MingMang;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class TestGame extends MyTestCase {
    public TestGame() {
    }

    public void TestGameStart() {
        Game g = new Game();
        super.assertEqual(g.getgameBoard().getBoard(),
            MapUtil.map(
                new Maplet(SeqUtil.seq(0L, 0L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(0L, 1L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(0L, 2L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(0L, 3L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(0L, 4L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(0L, 5L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(0L, 6L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(0L, 7L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 0L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 1L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 2L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 3L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 4L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 5L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 6L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 7L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 0L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 1L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 2L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 3L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 4L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 5L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 6L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 7L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 0L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 1L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 2L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 3L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 4L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 5L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 6L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 7L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 0L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 1L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 2L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 3L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 4L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 5L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 6L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 7L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 0L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 1L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 2L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 3L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 4L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 5L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 6L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 7L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 0L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 1L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 2L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 3L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 4L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 5L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 6L),
                    MingMang.quotes.SpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 7L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 0L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 2L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 3L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 4L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 5L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 6L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 7L),
                    MingMang.quotes.BlackQuote.getInstance())));
        super.assertEqual(((Object) g.getplayer1().getName()),
            MingMang.quotes.player1Quote.getInstance());
        super.assertEqual(((Object) g.getplayer2().getName()),
            MingMang.quotes.player2Quote.getInstance());
        super.assertEqual(((Object) g.currentplayer().getName()),
            MingMang.quotes.player1Quote.getInstance());

        return;
    }

    public void TestMovePiece() {
        Game g = new Game();
        super.assertTrue(g.movepiece(SeqUtil.seq(3L, 0L), SeqUtil.seq(3L, 3L)));
        super.assertEqual(((Object) Utils.get(g.getgameBoard().getBoard(),
                SeqUtil.seq(3L, 0L))), MingMang.quotes.SpaceQuote.getInstance());
        super.assertEqual(((Object) Utils.get(g.getgameBoard().getBoard(),
                SeqUtil.seq(3L, 3L))), MingMang.quotes.WhiteQuote.getInstance());

        return;
    }

    public void checkGameOver() {
        Game g = new Game();
        g.getplayer1().setnOwned(33L);
        super.assertEqual(g.checkGameOver(), 1L);

        return;
    }

    public void TestCapturePiece() {
        Game g = new Game();
        super.assertTrue(g.movepiece(SeqUtil.seq(3L, 0L), SeqUtil.seq(3L, 3L)));
        g.changecurrentplayer();
        super.assertEqual(((Object) g.currentplayer().getName()),
            MingMang.quotes.player2Quote.getInstance());
        super.assertTrue(g.movepiece(SeqUtil.seq(0L, 2L), SeqUtil.seq(3L, 2L)));
        super.assertEqual(((Object) Utils.get(g.getgameBoard().getBoard(),
                SeqUtil.seq(3L, 3L))), MingMang.quotes.WhiteQuote.getInstance());
        g.changepiecesbetween(SeqUtil.seq(3L, 2L), SeqUtil.seq(3L, 7L));
        super.assertEqual(((Object) Utils.get(g.getgameBoard().getBoard(),
                SeqUtil.seq(3L, 3L))), MingMang.quotes.BlackQuote.getInstance());

        return;
    }

    public void TestChangeOwnedNumber() {
        Game g = new Game();
        super.assertTrue(g.movepiece(SeqUtil.seq(3L, 0L), SeqUtil.seq(3L, 3L)));
        g.changecurrentplayer();
        super.assertTrue(g.movepiece(SeqUtil.seq(0L, 2L), SeqUtil.seq(3L, 2L)));
        g.updatePositionsOwned();
        super.assertEqual(g.getplayer1().getnOwned(), 18L);
        super.assertEqual(g.getplayer2().getnOwned(), 15L);
        g.changepiecesbetween(SeqUtil.seq(3L, 2L), SeqUtil.seq(3L, 7L));
        g.updatePositionsOwned();
        super.assertEqual(g.getplayer1().getnOwned(), 14L);
        super.assertEqual(g.getplayer2().getnOwned(), 21L);

        return;
    }

    public void TestChangeActivePlayer() {
        Game g = new Game();
        super.assertEqual(((Object) g.currentplayer().getName()),
            MingMang.quotes.player1Quote.getInstance());
        g.changecurrentplayer();
        super.assertEqual(((Object) g.currentplayer().getName()),
            MingMang.quotes.player2Quote.getInstance());
        g.changecurrentplayer();
        super.assertEqual(((Object) g.currentplayer().getName()),
            MingMang.quotes.player1Quote.getInstance());
        g.changecurrentplayer();
        super.assertEqual(((Object) g.currentplayer().getName()),
            MingMang.quotes.player2Quote.getInstance());

        return;
    }

    public static void main() {
        new TestGame().TestGameStart();
        new TestGame().TestMovePiece();
        new TestGame().checkGameOver();
        new TestGame().TestCapturePiece();
        new TestGame().TestChangeOwnedNumber();
        new TestGame().TestChangeActivePlayer();
    }

    public String toString() {
        return "TestGame{}";
    }
}
