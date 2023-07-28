package com.pixelthump.backendtemplate.rest.model;
import java.time.OffsetDateTime;

/**
 * Ping response with the current time.
 */
public class Ping {

	private OffsetDateTime time;

	public Ping() {
		time = OffsetDateTime.now();
	}

	public OffsetDateTime getTime() {
		return time;
	}
}
