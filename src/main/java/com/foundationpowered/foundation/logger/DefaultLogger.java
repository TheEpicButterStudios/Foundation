package com.foundationpowered.foundation.logger;

public class DefaultLogger implements com.foundationpowered.foundation.logger.Logger {

	private org.apache.logging.log4j.Logger logger;
	private String prefix = "";

	public DefaultLogger(org.apache.logging.log4j.Logger _logger){
		logger = _logger;
	}

	@Override
	public void setPrefix(String _prefix) {
		prefix = _prefix;
	}

	@Override
	public void debug(String msg) {
		logger.debug(prefix + msg);
	}

	@Override
	public void debug(String[] msg) {
		for(String s : msg) {
			info(s);
		}
	}

	@Override
	public void info(String msg) {
		logger.info(prefix + msg);
	}

	@Override
	public void info(String[] msg) {
		for(String s : msg) {
			info(s);
		}
	}

	@Override
	public void warning(String msg) {
		logger.warn(msg);
	}

	@Override
	public void warning(String[] msg) {
		for(String s : msg) {
			warning(s);
		}
	}

	@Override
	public void high(String msg) {
		logger.error(msg);
	}

	@Override
	public void high(String[] msg) {
		for(String s : msg) {
			high(s);
		}
	}

	@Override
	public void severe(String msg) {
		logger.fatal(msg);
	}

	@Override
	public void severe(String[] msg) {
		for(String s : msg) {
			severe(s);
		}
	}

}
