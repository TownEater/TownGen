/*
 * DataModule is the core of any data involved in the program. includes
 * required utilities which should be overridden in child classes which
 * allow for more central data management.
 */

package com.town.towngen.data;

public abstract class DataModule
{
	// We override toString for saving to the file system
	@Override
	public abstract String toString();
	
	// We need a method for loading from a string, usually from the file system. Returns a generic DataModule by default.
	public abstract DataModule fromString();
}
