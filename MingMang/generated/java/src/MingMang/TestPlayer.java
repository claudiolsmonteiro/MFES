package MingMang;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class TestPlayer extends MyTestCase {
    public TestPlayer() {
    }

    public void TestPlayerStart() {
        Player player = new Player(MingMang.quotes.player1Quote.getInstance());
        super.assertEqual(((Object) player.getName()),
            MingMang.quotes.player1Quote.getInstance());
        super.assertTrue(player.getActive());
        super.assertEqual(player.getnBoard(), 14L);
        player.setnBoard(15L);
        super.assertEqual(player.getnBoard(), 15L);
        super.assertEqual(player.getnBench(), 14L);
        player.setnBench(15L);
        super.assertEqual(player.getnBench(), 15L);

        return;
    }

    private void TestUpdateRemovepieces() {
        Player p = new Player(MingMang.quotes.player1Quote.getInstance());
        super.assertEqual(p.getnBoard(), 14L);
        super.assertEqual(p.getnBench(), 14L);
        p.updatepieces(MingMang.quotes.colourQuote.getInstance());
        super.assertEqual(p.getnBoard(), 15L);
        super.assertEqual(p.getnBench(), 13L);
        p.removepieces(MingMang.quotes.colourQuote.getInstance());
        super.assertEqual(p.getnBoard(), 14L);
        super.assertEqual(p.getnBench(), 14L);
        p.resetPosOwned();
        super.assertEqual(p.getnOwned(), 0L);
        p.increaseOwned();
        super.assertEqual(p.getnOwned(), 1L);

        return;
    }

    public static void main() {
        new TestPlayer().TestPlayerStart();
        new TestPlayer().TestUpdateRemovepieces();
    }

    public String toString() {
        return "TestPlayer{}";
    }
}
