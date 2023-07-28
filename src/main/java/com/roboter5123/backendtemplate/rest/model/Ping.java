package com.roboter5123.backendtemplate.rest.model;
import java.time.OffsetDateTime;

/**
 * Ping response with the current time.
 */
public class Ping {

	private final OffsetDateTime time;

	public Ping() {
		time = OffsetDateTime.now();
	}

	public OffsetDateTime getTime() {
		return time;
	}
}
