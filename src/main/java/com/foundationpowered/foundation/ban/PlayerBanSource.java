package com.foundationpowered.foundation.ban;

import org.spongepowered.api.entity.Player;

import java.util.UUID;

/**
 * A PlayerBanSource is the source of a ban that has
 * been issued by a Player
 */
public interface PlayerBanSource extends BanSource {

	public UUID getUUID();

	/**
	 * Does no guarantee that the player is online
	 */
	public Player getPlayer();

}
