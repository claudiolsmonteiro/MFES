package MingMang.quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class colourQuote {
    private static int hc = 0;
    private static colourQuote instance = null;

    public colourQuote() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static colourQuote getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new colourQuote();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof colourQuote;
    }

    public String toString() {
        return "<colour>";
    }
}
