package com.devesion.commons.obd.command.at;

/**
 * Represents AT Reset Command.
 */
public class SetBaudRateCommand extends AbstractAtCommand {

	@Override
	public String getOperands() {
		return "PP 0C SV D0";
	}

	@Override
	public boolean checkResponseEnabled() {
		return false;
	}
}
