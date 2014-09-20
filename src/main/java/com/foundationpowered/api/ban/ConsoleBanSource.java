package com.foundationpowered.api.ban;

import com.foundationpowered.api.logger.Logger;

/**
 * A ConsoleBanSource is the source of a ban that has
 * been issued through the console
 */
public interface ConsoleBanSource extends BanSource {

	/**
	 * Get the default console logger
	 * @return  the console logger
	 */
	Logger getConsole();

}
