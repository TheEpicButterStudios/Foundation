package com.foundationpowered.foundation.ban;

/**
 * A BanTarget is a target that has been banned.
 * It can be either an IP or a Player.
 */
public interface BanTarget {

	public String getTargetName();
}
