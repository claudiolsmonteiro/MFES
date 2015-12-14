package MingMang.quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class SpaceQuote {
    private static int hc = 0;
    private static SpaceQuote instance = null;

    public SpaceQuote() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static SpaceQuote getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new SpaceQuote();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof SpaceQuote;
    }

    public String toString() {
        return "<space>";
    }
}
