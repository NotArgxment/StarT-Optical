package com.opticalfeatures;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.opticalfeatures.client.OpticalMachines;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.*;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.api.sound.SoundEntry;

import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.*;

@Mod(OpticalFeatures.MOD_ID)
@SuppressWarnings("removal")
public class OpticalFeatures {

    public static final String MOD_ID = "opticalfeatures";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final GTRegistrate OpticalRegister = GTRegistrate.create(OpticalFeatures.MOD_ID);

    public static RegistryEntry<CreativeModeTab> OPTICAL_TAB = OpticalRegister
            .defaultCreativeTab(OpticalFeatures.MOD_ID, builder -> builder
                            .displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator(OpticalFeatures.MOD_ID, OpticalRegister))
                            .title(
                                OpticalRegister.addLang("itemGroup",
                                                        OpticalFeatures.id("creative_tab"), 
                                                        "StarT - Optical Features"))
                            .icon(OpticalMachines.UV_DATA_ACCESS_HATCH::asStack)
                            .build())
            .register();

    public OpticalFeatures() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        OpticalRegister.registerRegistrate();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        modEventBus.addGenericListener(MachineDefinition.class, this::registerMachines);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(OpticalFeatures.MOD_ID, path);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            LOGGER.info("Hello from common setup! This is *after* registries are done, so we can do this:");
            LOGGER.info("Look, I found a {}!", net.minecraft.world.item.Items.DIAMOND);
        });
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("God Bless Komaru - Property of Star Technology");
    }

    private void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {
        OpticalMachines.init();
    }

}
