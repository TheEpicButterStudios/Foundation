package com.foundationpowered.foundation.ban;

/**
 * An IP that has been targeted by a ban
 */
public interface IPBanTarget extends BanTarget {

	public String getIP();

	public String getLastUsername();

	public String getLastUUID();

}
