package com.foundationpowered.foundation.ban;

import javafx.util.Duration;

import java.util.Date;

public interface Ban {

	/**
	 * If the ban is temporary
	 * @return true if temporary
	 */
	public boolean isTemporary();

	/**
	 * If the ban was issued by the system or and administrator
	 * @return  true if issued automatically
	 */
	public boolean isSystemIssued();

	/**
	 * If the ban has a expire time defined
	 * @return  true if has a expire time
	 */
	public boolean hasExpire();

	/**
	 * If the ban is expired
	 * @return  true if expired
	 */
	public boolean isExpired();

	/**
	 * If the ban is pardoned
	 * @return  true if pardoned
	 */
	public boolean isPardoned();

	/**
	 * Gets the source that has issued the ban
	 * @return  BanSource
	 */
	public BanSource getSource();

	/**
	 * Gets the target of the ban
	 * @return  BanTarget
	 */
	public BanTarget getTarget();

	/**
	 * Gets the pardon time of the ban
	 * @return the pardon time if set, null if not
	 */
	public Date getExpiresTime();

	/**
	 * Gets the creation time
	 * @return origin date
	 */
	public Date getCreated();

	/**
	 * Gets the reason of the ban
	 * @return  reason
	 */
	public String getReason();

	/**
	 * Sets the ban expires from the creation time + duration
	 * @param   duration of the ban
	 */
	public void setExpireInterval(Duration duration);

	/**
	 * Sets the ban expires to the param date
	 * @param   date of expires
	 */
	public void setExpires(Date date);

	/**
	 * Sets if the ban is temporary
	 */
	public void setTemporary(boolean temporary);

	/**
	 * Sets the reason of the ban
	 * @param   reason
	 */
	public void setReason(String reason);

	/**
	 * Pardons the ban
	 */
	public void pardon();

}
