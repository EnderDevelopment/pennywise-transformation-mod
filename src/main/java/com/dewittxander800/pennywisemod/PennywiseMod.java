package com.dewittxander800.pennywisemod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("pennywisemod")
public
class PennywiseMod {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "pennywisemod";

    public PennywiseMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Pennywise Mod Initialized");
    }
}
