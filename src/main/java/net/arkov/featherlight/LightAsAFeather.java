package net.arkov.featherlight;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LightAsAFeather implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("light-as-a-feather");

	@Override
	public void onInitialize() {
		LOGGER.info("Light as a Feather initialized");
	}
}