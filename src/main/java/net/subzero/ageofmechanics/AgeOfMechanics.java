package net.subzero.ageofmechanics;

import net.fabricmc.api.ModInitializer;
import net.subzero.ageofmechanics.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AgeOfMechanics implements ModInitializer {
	public static final String MOD_ID = "ageofmechanics";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
			ModItems.registerModItems();
	}
}
