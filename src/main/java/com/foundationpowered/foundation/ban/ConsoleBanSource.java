package com.foundationpowered.foundation.ban;

import com.foundationpowered.foundation.logger.Logger;

/**
 * A ConsoleBanSource is the source of a ban that has
 * been issued through the console
 */
public interface ConsoleBanSource extends BanSource {

	/**
	 * Get the default console logger
	 * @return  the console logger
	 */
	public Logger getConsole();

}
