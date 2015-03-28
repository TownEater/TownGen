/*
 * City is the data module that contains and manages all the smaller data
 * modules which make up the city.
 */

package com.town.towngen.data;

public class City extends DataModule
{
	// City data modules
	protected Heightmap heightmap;
	protected Watermap watermap;
	protected Enviromap enviromap;
	protected Roadmap roadmap;
	protected Buildingmap buildingmap;
	
	// Create a new, empty city.
	public City()
	{
		
	}

	
	// To/From String //
	
	@Override
	public String toString()
	{
		return "";
	}

	@Override
	public City fromString()
	{
		return new City();
	}
}
