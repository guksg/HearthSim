package com.hearthsim.card.minion.concrete;

import com.hearthsim.card.minion.Minion;

public class Whelp extends Minion {

    private static final boolean HERO_TARGETABLE = true;

    public Whelp() {
        super();
        heroTargetable_ = HERO_TARGETABLE;
    }
}
