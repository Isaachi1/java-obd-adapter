package com.devesion.obd.command.invoker;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;

import java.nio.IntBuffer;

/**
 * Represents OBD command result.
 */
@ToString
public final class CommandResult {

	@Getter(AccessLevel.PACKAGE)
	private IntBuffer responseBuffer;

	private CommandResult(IntBuffer responseBuffer) {
		this.responseBuffer = responseBuffer;
	}

	public static CommandResult empty() {
		return withBuffer(IntBuffer.allocate(0));
	}

	public static CommandResult withBuffer(IntBuffer responseBuffer) {
		return new CommandResult(responseBuffer);
	}

	public int getByteNumber(int byteNumber) {
		return responseBuffer.get(byteNumber);
	}
}
