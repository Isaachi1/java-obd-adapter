package com.devesion.commons.obd.adapter.command.diagnostic.sensors.units;

import com.devesion.commons.obd.adapter.command.CommandResult;

/**
 * Represents Fuel Level Value Object.
 */
class FuelLevelValue extends SimpleValue {

	FuelLevelValue(CommandResult commandResult) {
		super(commandResult, 100, 255);
	}
}