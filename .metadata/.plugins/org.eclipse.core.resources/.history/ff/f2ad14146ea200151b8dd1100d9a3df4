package MingMang;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class Player {
    public Object name;
    public nPecas np;
    public Boolean currentplayer;
    public Boolean pass;

    public Player(final Object pn) {
        cg_init_Player_1(((Object) pn));
    }

    public Player() {
    }

    public void cg_init_Player_1(final Object pn) {
        name = pn;

        if (Utils.equals(name, MingMang.quotes.player1Quote.getInstance())) {
            currentplayer = true;
        } else {
            currentplayer = false;
        }

        np = new nPecas(14L, 14L, 0L);
        pass = false;

        return;
    }

    public Object getName() {
        return name;
    }

    public void setName(final Object PlayerName) {
        name = PlayerName;
    }

    public Boolean getActive() {
        return currentplayer;
    }

    public void setActive(final Boolean Active) {
        currentplayer = Active;
    }

    public void changeActive() {
        if (Utils.equals(currentplayer, true)) {
            currentplayer = false;
        } else {
            currentplayer = true;
        }
    }

    public Number getnBoard() {
        return np.nboard;
    }

    public void setnBoard(final Number nboard) {
        np.nboard = nboard;
    }

    public Number getnBench() {
        return np.nbench;
    }

    public void setnBench(final Number nbench) {
        np.nbench = nbench;
    }

    public void setnOwned(final Number nowned) {
        np.nowned = nowned;
    }

    public Number getnOwned() {
        return np.nowned;
    }

    public Boolean getPass() {
        return pass;
    }

    public void setPass(final Boolean Pass) {
        pass = Pass;
    }

    public void updatepieces(final Object type) {
        if (Utils.equals(type, MingMang.quotes.colourQuote.getInstance())) {
            addboard();
        } else {
            setnOwned(np.nowned.longValue() + 1L);
        }
    }

    public void addboard() {
        np.nboard = np.nboard.longValue() + 1L;
        np.nbench = np.nbench.longValue() - 1L;
        np.nowned = np.nowned.longValue() + 1L;
    }

    public void removepieces(final Object type) {
        if (Utils.equals(type, MingMang.quotes.colourQuote.getInstance())) {
            removeboard();
        } else {
            setnOwned(np.nowned.longValue() - 1L);
        }
    }

    public void removeboard() {
        np.nboard = np.nboard.longValue() - 1L;
        np.nbench = np.nbench.longValue() + 1L;
        np.nowned = np.nowned.longValue() - 1L;
    }

    public String toString() {
        return "Player{" + "name := " + Utils.toString(name) + ", np := " +
        Utils.toString(np) + ", currentplayer := " +
        Utils.toString(currentplayer) + ", pass := " + Utils.toString(pass) +
        "}";
    }

    private static Boolean inv_nPecas(final nPecas np) {
        Boolean andResult_6 = false;

        if (np.nboard.longValue() > 1L) {
            if (np.nbench.longValue() >= 0L) {
                andResult_6 = true;
            }
        }

        return andResult_6;
    }

    private static class nPecas implements Record {
        public Number nboard;
        public Number nbench;
        public Number nowned;

        public nPecas(final Number _nboard, final Number _nbench,
            final Number _nowned) {
            nboard = _nboard;
            nbench = _nbench;
            nowned = _nowned;
        }

        public boolean equals(final Object obj) {
            if (!(obj instanceof nPecas)) {
                return false;
            }

            nPecas other = ((nPecas) obj);

            return (Utils.equals(nboard, other.nboard)) &&
            (Utils.equals(nbench, other.nbench)) &&
            (Utils.equals(nowned, other.nowned));
        }

        public int hashCode() {
            return Utils.hashCode(nboard, nbench, nowned);
        }

        public nPecas copy() {
            return new nPecas(nboard, nbench, nowned);
        }

        public String toString() {
            return "mk_Player`nPecas" +
            Utils.formatFields(nboard, nbench, nowned);
        }
    }
}
