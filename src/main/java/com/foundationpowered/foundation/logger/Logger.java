package com.foundationpowered.foundation.logger;

public interface Logger {

	public void setPrefix(String prefix);

	public void debug(String msg);

	public void debug(String[] msg);

	public void info(String msg);

	public void info(String[] msg);

	public void warning(String msg);

	public void warning(String[] msg);

	public void high(String msg);

	public void high(String[] msg);

	public void severe(String msg);

	public void severe(String[] msg);

}
