package MingMang.quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class spaceQuote {
    private static int hc = 0;
    private static spaceQuote instance = null;

    public spaceQuote() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static spaceQuote getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new spaceQuote();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof spaceQuote;
    }

    public String toString() {
        return "<space>";
    }
}
