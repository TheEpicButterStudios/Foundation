package com.foundationpowered.foundation.module;

import java.nio.file.Path;

public interface ModuleLoader {

	/**
	 * Scans the available modules.
	 */
	void scanModules();


	/**
	 * Builds the dependencies tree.
	 */
	void orderDependencies();

	/**
	 * Verify that the modules supports
	 * the core version.
	 */
	void verifyCoreVersions();

	/**
	 * Loads a single module.
	 * @param path of the module
	 */
	void loadModule(Path path);

	/**
	 * Loads all modules.
	 */
	void loadAllModule();

}
