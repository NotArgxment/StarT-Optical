package com.opticalfeatures.client;

import com.tterrag.registrate.providers.RegistrateLangProvider;

import static com.gregtechceu.gtceu.data.lang.LangHandler.replace;

public class LangHandler {

    public static void init(RegistrateLangProvider provider) {
        Common(provider);
    }

    private static void Common(RegistrateLangProvider provider) {
        replace(provider, "block.opticalfeatures.zpm_data_access_hatch", "ZPM Data Access Hatch");
        replace(provider, "block.opticalfeatures.uv_data_access_hatch", "UV Data Access Hatch");
        replace(provider, "block.opticalfeatures.uhv_data_access_hatch", "UHV Data Access Hatch");

        // Optical
        replace(provider, "opticalfeatures.machine.wireless_optical_hatch.tooltip.range", "Scan range: §f%s blocks§7 (right-click with an empty hand)");
        replace(provider, "opticalfeatures.machine.wireless_optical_hatch.tooltip.connections", "Max linked receivers: §f%s");
        replace(provider, "opticalfeatures.machine.wireless_optical_hatch.tooltip.scan", "Links to nearby unlinked receivers of the same tier, and to any physical Data Access Hatch in range");
        replace(provider, "opticalfeatures.machine.wireless_optical_hatch.tooltip.receiver", "Gets linked automatically when scanned by a Wireless Transmission Hatch of the same tier");
        replace(provider, "opticalfeatures.machine.wireless_optical_hatch.not_formed", "This multiblock is not formed - form the structure before scanning");
        replace(provider, "opticalfeatures.machine.wireless_optical_hatch.linked_summary", "Linked %s new receiver(s) and %s new data hatch(es)");
        replace(provider, "opticalfeatures.machine.wireless_optical_hatch.no_receivers_found", "No new compatible receivers or data hatches found in range");
        replace(provider, "opticalfeatures.machine.wireless_optical_hatch.range_shown", "Displaying current range of connections: %s blocks in X/Z");

        // Jade integration
        replace(provider, "config.jade.plugin_opticalfeatures.wireless_optical_hatch", "Wireless Optical Info");
        replace(provider, "opticalfeatures.jade.wireless_optical_hatch.linked_data_hatches", "Linked Data Access Hatches: %s");
        replace(provider, "opticalfeatures.jade.wireless_optical_hatch.linked_receivers_header", "Linked Wireless Optical Receivers:");
        replace(provider, "opticalfeatures.jade.wireless_optical_hatch.receiver_entry", "   - Receiver %s: %s");
        replace(provider, "opticalfeatures.jade.wireless_optical_hatch.no_receivers", "   - Not linked");
    }
}
