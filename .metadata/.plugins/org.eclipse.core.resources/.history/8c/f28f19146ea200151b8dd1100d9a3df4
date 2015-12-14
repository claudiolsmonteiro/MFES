package MingMang.quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class player1Quote {
    private static int hc = 0;
    private static player1Quote instance = null;

    public player1Quote() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static player1Quote getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new player1Quote();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof player1Quote;
    }

    public String toString() {
        return "<player1>";
    }
}
