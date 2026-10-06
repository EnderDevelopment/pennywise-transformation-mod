package com.dewittxander800.pennywisemod.progression;

import net.minecraft.world.entity.player.Player;

public
class ProgressionSystem {
    public static void feedEnemy(Player player) {
        int power = player.getPersistentData().getInt("pennywisePower");
        player.getPersistentData().putInt("pennywisePower", power + 2);
    }

    public static void defeatEnemy(Player player) {
        int power = player.getPersistentData().getInt("pennywisePower");
        player.getPersistentData().putInt("pennywisePower", power + 5);
    }
}
