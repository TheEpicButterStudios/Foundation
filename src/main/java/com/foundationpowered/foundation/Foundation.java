package com.foundationpowered.foundation;

import com.foundationpowered.foundation.logger.DefaultLogger;
import com.foundationpowered.foundation.logger.Logger;
import org.spongepowered.api.event.SpongeEventHandler;
import org.spongepowered.api.event.state.PreInitializationEvent;
import org.spongepowered.api.event.state.ServerStartingEvent;
import org.spongepowered.api.event.state.ServerStoppingEvent;
import org.spongepowered.api.plugin.Plugin;

/**
 * Foundation is a Sponge plugin which provides core functionality
 * to the server. It also provides an API for other plugins
 *
 * @version 1.0.0
 * @since   2014-09-19
 */
@Plugin(id = "Foundation", name = "Foundation", version = "1.0.0")
public class Foundation {

	Logger logger;

	@SpongeEventHandler
	public void onInit(PreInitializationEvent event) {
		org.apache.logging.log4j.Logger pluginLogger = event.getPluginLog();
		logger = new DefaultLogger(pluginLogger);
		logger.info("Foundation initialization");
	}

	@SpongeEventHandler
	public void onStart(ServerStartingEvent event) {
		logger.info("Foundation start");
	}

	@SpongeEventHandler
	public void onStop(ServerStoppingEvent event) {
		logger.info("Foundation stop");
	}

	public void setLogger(Logger _logger) {
		logger = _logger;
	}
}
