package com.opticalfeatures;

import com.opticalfeatures.client.LangHandler;

import com.gregtechceu.gtceu.api.addon.*;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;

import com.tterrag.registrate.providers.ProviderType;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

@SuppressWarnings("unused")
@GTAddon
public class OpticalFeaturesGTAddon implements IGTAddon {

    @Override
    public GTRegistrate getRegistrate() {
        return OpticalFeatures.OpticalRegister;
    }

    @Override
    public void initializeAddon() {
        OpticalFeatures.OpticalRegister.addDataGenerator(ProviderType.LANG, LangHandler::init);
    }

    @Override
    public String addonModId() {
        return OpticalFeatures.MOD_ID;
    }

}
