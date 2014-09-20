package com.foundationpowered.foundation.ban;

import org.spongepowered.api.entity.Player;
import org.spongepowered.api.plugin.Plugin;

public interface BanManager {

	/**
	 * Get all bans
	 * @return  all bans
	 */
	public Ban[] getBans();

	/**
	 * Gets all bans that aren't pardoner or expired
	 * @return  active bans
	 */
	public Ban[] getActiveBans();

	public boolean isPlayerBanned(Player player);

	public boolean isIPBanned(String ip);

	public void pardonPlayer(Player player);

	public void pardonIP(String ip);

	/**
	 * To be used with a ban builder function.
	 * Automatically kicks the target
	 * @param ban
	 */
	public void addBan(Ban ban);

	public Ban buildPlayerBan(Player source, Player target);

	public Ban buildPlayerBan(Player source, String ip);

	public Ban buildSystemBan(Plugin source, Player target);

	public Ban buildSystemBan(Plugin source, String ip);

	public Ban buildConsoleBan(Player target);

	public Ban buildConsoleBan(String ip);

}
