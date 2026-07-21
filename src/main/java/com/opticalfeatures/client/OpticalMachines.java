package com.opticalfeatures.client;

import com.opticalfeatures.OpticalFeatures;
import com.opticalfeatures.client.optical.*;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.*;
import com.gregtechceu.gtceu.api.machine.multiblock.*;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.common.machine.multiblock.electric.research.DataBankMachine;

import net.minecraft.network.chat.Component;

import static com.opticalfeatures.OpticalFeatures.OpticalRegister;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.machine.property.GTMachineModelProperties.*;
import static com.gregtechceu.gtceu.api.pattern.Predicates.*;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class OpticalMachines {

    static {
        OpticalRegister.creativeModeTab(() -> OpticalFeatures.OPTICAL_TAB);
    }

    // Expanded Data Hatches
    public static MachineDefinition ZPM_DATA_ACCESS_HATCH = OpticalRegister
            .machine("zpm_data_access_hatch", (holder) -> new ExpandedDataHatchLogic(holder, ZPM, false) {
                @Override
                protected int getInventorySize() {
                    return 36;
                }
            })
            .tier(ZPM)
            .rotationState(RotationState.ALL)
            .abilities(PartAbility.DATA_ACCESS)
            .modelProperty(IS_FORMED, false)
            .tooltips(
                    Component.translatable("gtceu.machine.data_access_hatch.tooltip.0"),
                    Component.translatable("gtceu.machine.data_access_hatch.tooltip.1", 36),
                    Component.translatable("gtceu.part_sharing.disabled")
            )
            .overlayTieredHullModel("expanded_data_access_hatch")
            .register();

    public static MachineDefinition UV_DATA_ACCESS_HATCH = OpticalRegister
            .machine("uv_data_access_hatch", (holder) -> new ExpandedDataHatchLogic(holder, UV, false) {
                @Override
                protected int getInventorySize() {
                    return 49;
                }
            })
            .tier(UV)
            .rotationState(RotationState.ALL)
            .abilities(PartAbility.DATA_ACCESS)
            .modelProperty(IS_FORMED, false)
            .tooltips(
                    Component.translatable("gtceu.machine.data_access_hatch.tooltip.0"),
                    Component.translatable("gtceu.machine.data_access_hatch.tooltip.1", 49),
                    Component.translatable("gtceu.part_sharing.disabled")
            )
            .overlayTieredHullModel("expanded_data_access_hatch")
            .register();

    public static MachineDefinition UHV_DATA_ACCESS_HATCH = OpticalRegister
            .machine("uhv_data_access_hatch", (holder) -> new ExpandedDataHatchLogic(holder, UHV, false) {
                @Override
                protected int getInventorySize() {
                    return 64;
                }
            })
            .tier(UHV)
            .rotationState(RotationState.ALL)
            .abilities(PartAbility.DATA_ACCESS)
            .modelProperty(IS_FORMED, false)
            .tooltips(
                    Component.translatable("gtceu.machine.data_access_hatch.tooltip.0"),
                    Component.translatable("gtceu.machine.data_access_hatch.tooltip.1", 64),
                    Component.translatable("gtceu.part_sharing.disabled")
            )
            .overlayTieredHullModel("expanded_data_access_hatch")
            .register();

    // Wireless Optical
    public static MachineDefinition UV_WIRELESS_TRANSMITTER = OpticalRegister
            .machine("uv_wireless_data_transmitter", (holder) -> new WirelessOpticalDataHatchMachine(holder, true, UV))
            .langValue("UV Wireless Transmission Hatch")
            .tier(UV)
            .rotationState(RotationState.ALL)
            .abilities(WirelessAbilities.WIRELESS_OPTICAL_TRANSMITTER)
            .overlayTieredHullModel("wireless_transmitter")
            .tooltips(
                    Component.translatable("opticalfeatures.machine.wireless_optical_hatch.tooltip.range", 16),
                    Component.translatable("opticalfeatures.machine.wireless_optical_hatch.tooltip.connections", 4),
                    Component.translatable("opticalfeatures.machine.wireless_optical_hatch.tooltip.scan"),
                    Component.translatable("gtceu.part_sharing.disabled")
            )
            .register();

    public static MachineDefinition UV_WIRELESS_RECEIVER = OpticalRegister
            .machine("uv_wireless_data_receiver", (holder) -> new WirelessOpticalDataHatchMachine(holder, false, UV))
            .langValue("UV Wireless Optical Reception Hatch")
            .tier(UV)
            .rotationState(RotationState.ALL)
            .abilities(WirelessAbilities.WIRELESS_OPTICAL_RECEIVER)
            .overlayTieredHullModel("wireless_receiver")
            .tooltips(
                    Component.translatable("opticalfeatures.machine.wireless_optical_hatch.tooltip.receiver"),
                    Component.translatable("gtceu.part_sharing.disabled")
            )
            .register();

    public static MachineDefinition UHV_WIRELESS_TRANSMITTER = OpticalRegister
            .machine("uhv_wireless_data_transmitter", (holder) -> new WirelessOpticalDataHatchMachine(holder, true, UHV))
            .langValue("UHV Wireless Transmission Hatch")
            .tier(UHV)
            .rotationState(RotationState.ALL)
            .abilities(WirelessAbilities.WIRELESS_OPTICAL_TRANSMITTER)
            .overlayTieredHullModel("wireless_transmitter")
            .tooltips(
                    Component.translatable("opticalfeatures.machine.wireless_optical_hatch.tooltip.range", 24),
                    Component.translatable("opticalfeatures.machine.wireless_optical_hatch.tooltip.connections", 8),
                    Component.translatable("opticalfeatures.machine.wireless_optical_hatch.tooltip.scan"),
                    Component.translatable("gtceu.part_sharing.disabled")
            )
            .register();

    public static MachineDefinition UHV_WIRELESS_RECEIVER = OpticalRegister
            .machine("uhv_wireless_data_receiver", (holder) -> new WirelessOpticalDataHatchMachine(holder, false, UHV))
            .langValue("UHV Wireless Reception Hatch")
            .tier(UHV)
            .rotationState(RotationState.ALL)
            .abilities(WirelessAbilities.WIRELESS_OPTICAL_RECEIVER)
            .overlayTieredHullModel("wireless_receiver")
            .tooltips(
                    Component.translatable("opticalfeatures.machine.wireless_optical_hatch.tooltip.receiver"),
                    Component.translatable("gtceu.part_sharing.disabled")
            )
            .register();

    public static MachineDefinition UEV_WIRELESS_TRANSMITTER = OpticalRegister
            .machine("uev_wireless_data_transmitter", (holder) -> new WirelessOpticalDataHatchMachine(holder, true, UEV))
            .langValue("UEV Wireless Transmission Hatch")
            .tier(UEV)
            .rotationState(RotationState.ALL)
            .abilities(WirelessAbilities.WIRELESS_OPTICAL_TRANSMITTER)
            .overlayTieredHullModel("wireless_transmitter")
            .tooltips(
                    Component.translatable("opticalfeatures.machine.wireless_optical_hatch.tooltip.range", 32),
                    Component.translatable("opticalfeatures.machine.wireless_optical_hatch.tooltip.connections", 16),
                    Component.translatable("opticalfeatures.machine.wireless_optical_hatch.tooltip.scan"),
                    Component.translatable("gtceu.part_sharing.disabled")
            )
            .register();

    public static MachineDefinition UEV_WIRELESS_RECEIVER = OpticalRegister
            .machine("uev_wireless_data_receiver", (holder) -> new WirelessOpticalDataHatchMachine(holder, false, UEV))
            .langValue("UEV Wireless Reception Hatch")
            .tier(UEV)
            .rotationState(RotationState.ALL)
            .abilities(WirelessAbilities.WIRELESS_OPTICAL_RECEIVER)
            .overlayTieredHullModel("wireless_receiver")
            .tooltips(
                    Component.translatable("opticalfeatures.machine.wireless_optical_hatch.tooltip.receiver"),
                    Component.translatable("gtceu.part_sharing.disabled")
            )
            .register();

    // Multiblock for testing
    public static MultiblockMachineDefinition OPTICAL_TRANSMISSION_NETWORK = OpticalRegister
                    .multiblock("optical_transmission_network", DataBankMachine::new)
                    .rotationState(RotationState.NON_Y_AXIS)
                    .recipeType(DUMMY_RECIPES)
                    .appearanceBlock(HIGH_POWER_CASING)
                    .pattern(definition -> FactoryBlockPattern.start()
                            .aisle(" CCCCC ", " C   C ", " C   C ", " C   C ", " CCCCC ")
                            .aisle("CCDEDCC", "CC E CC", "CC E CC", "CC E CC", "CCDEDCC")
                            .aisle("CDDEDDC", "       ", "       ", "       ", "CDDEDDC")
                            .aisle("CEEEEEC", " E E E ", " E H E ", " E E E ", "CEEEEEC")
                            .aisle("CDDEDDC", "       ", "       ", "       ", "CDDEDDC")
                            .aisle("CCDEDCC", "CC E CC", "CC @ CC", "CC E CC", "CCDEDCC")
                            .aisle(" CCCCC ", " C   C ", " C   C ", " C   C ", " CCCCC ")
                            .where('@', controller(blocks(definition.get())))
                            .where(' ', any())
                            .where('#', air())
                            .where('D', blocks(ADVANCED_COMPUTER_CASING.get()))
                            .where('C', blocks(COMPUTER_CASING.get()))
                            .where('E', blocks(HIGH_POWER_CASING.get())
                                    .or(abilities(PartAbility.MAINTENANCE).setExactLimit(1))
                                    .or(abilities(PartAbility.INPUT_ENERGY).setMaxGlobalLimited(2))
                                    .or(abilities(PartAbility.DATA_ACCESS).setExactLimit(1)))
                            .where('H', abilities(WirelessAbilities.WIRELESS_OPTICAL_TRANSMITTER).setExactLimit(1))
                            .build())
                    .workableCasingModel(
                            GTCEu.id("block/casings/hpca/high_power_casing"),
                            GTCEu.id("block/multiblock/fusion_reactor"))
                    .register();

    public static MultiblockMachineDefinition RECEIVER_TEST = OpticalRegister
            .multiblock("receiver_test", WorkableElectricMultiblockMachine::new)
            .rotationState(RotationState.NON_Y_AXIS)
            .recipeType(DUMMY_RECIPES)
            .appearanceBlock(HIGH_POWER_CASING)
            .pattern(definition -> FactoryBlockPattern.start()
                    .aisle("AAAAA@AAAAA", "AAAAAAAAAAA", "AAAAAAAAAAA", "AAAAAAAAAAA", "AAAAAAAAAAA")
                    .where('@', controller(blocks(definition.get())))
                    .where('A', blocks(HIGH_POWER_CASING.get())
                            .or(abilities(WirelessAbilities.WIRELESS_OPTICAL_RECEIVER)))
                    .build())
            .workableCasingModel(
                    GTCEu.id("block/casings/hpca/high_power_casing"),
                    GTCEu.id("block/multiblock/fusion_reactor"))
            .register();

    public static void init() {
    }
}