package com.hearthsim.card.minion.concrete;

import com.hearthsim.card.minion.Minion;

public class CoreHound extends Minion {

    private static final boolean HERO_TARGETABLE = true;

    public CoreHound() {
        super();
        heroTargetable_ = HERO_TARGETABLE;
    }
}
