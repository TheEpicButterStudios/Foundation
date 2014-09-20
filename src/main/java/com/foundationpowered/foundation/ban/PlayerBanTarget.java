package com.foundationpowered.foundation.ban;

import org.spongepowered.api.entity.Player;

import java.util.UUID;

/**
 * An Player that has been targeted by a ban
 */
public interface PlayerBanTarget {

	public UUID getUUID();

	/**
	 * Does no guarantee that the player is online
	 */
	public Player getPlayer();

}
