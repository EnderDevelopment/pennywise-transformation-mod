package com.dewittxander800.pennywisemod.abilities;

import net.minecraft.world.entity.player.Player;

public
class PennywiseAbilities {
    public static void increasePower(Player player) {
        int power = player.getPersistentData().getInt("pennywisePower");
        player.getPersistentData().putInt("pennywisePower", power + 1);
    }

    public static void deadlightsAbility(Player player) {
        // Implement Deadlights ability logic
    }

    public static void shapeshiftingAbility(Player player) {
        // Implement shapeshifting ability logic
    }

    public static void realityWarpingAbility(Player player) {
        // Implement reality-warping ability logic
    }
}
