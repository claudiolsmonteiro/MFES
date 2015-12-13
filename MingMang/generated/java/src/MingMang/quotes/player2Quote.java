package MingMang.quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class player2Quote {
    private static int hc = 0;
    private static player2Quote instance = null;

    public player2Quote() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static player2Quote getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new player2Quote();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof player2Quote;
    }

    public String toString() {
        return "<player2>";
    }
}
