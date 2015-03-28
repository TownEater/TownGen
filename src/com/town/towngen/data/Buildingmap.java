/*
 * Buildingmap is the data module which holds information regarding
 * where buildings are in town.
 * 
 */

package com.town.towngen.data;

import java.util.ArrayList;
import java.util.List;

import com.town.towngen.utils.Vector2D;

public class Buildingmap extends DataModule
{
	// Building data
	List<Building> buildings;

	// Create a new, empty building map
	public Buildingmap()
	{
		buildings = new ArrayList<Building>();
	}
	
	
	
	// Getters/Setters //
	
	// Get a building by index
	public Building getBuilding(int index)
	{
		// Borders checking on the list
		if(index < buildings.size() && index > 0)
		{
			// Return the data
			return buildings.get(index);
		}
		else
		{
			// Outside of the list, return an empty building and issue a warning
			System.out.println("Invalid building index " + index + " in Buildingmap of size " + buildings.size());
			return new Building();
		}
	}
	
	// Create a new building
	public Building newBuilding()
	{
		// Create the new building object
		Building newBuilding = new Building();
		// Add it to the data
		buildings.add(newBuilding);
		// Return to the caller
		return newBuilding;
	}
	
	// Add a building
	public void addBuilding(Building newBuilding)
	{
		buildings.add(newBuilding);
	}
	
	
	
	// To/From String //
	
	@Override
	public String toString()
	{
		return "";
	}
	
	@Override
	public Buildingmap fromString()
	{
		return new Buildingmap();
	}
	
	
	
	
	
	// Sub-Classes //
	
	/*
	 * Building is a data module which contains information regarding
	 * a specific building, such as location, rotation, and type.
	 */
	public static class Building extends DataModule
	{
		// The data of this building
		String tag = "";	// The tag or name of this building
		Vector2D location;	// The location of this building in the city
		float rotation;		// The rotation of this building
		
		
		// Create a new, empty building
		public Building()
		{
			// Create the empty location object
			location = new Vector2D();
		}
		
		
		
		// Getters/Setters //
		
		// Get tag
		public String tag()
		{
			return tag;
		}
		
		// Get location
		public Vector2D location()
		{
			return location;
		}
		
		// Get rotation
		public float rotation()
		{
			return rotation;
		}
		
		// Set tag
		public void setTag(String value)
		{
			tag = value;
		}
		
		// Set location
		public void setLocation(Vector2D value)
		{
			location.set(value);
		}
		
		// Set rotation
		public void setRotation(float value)
		{
			rotation = value;
		}
		
		
		
		// To/From String //
		
		@Override
		public String toString()
		{
			return "";
		}
		
		@Override
		public Building fromString()
		{
			return new Building();
		}
	}
}
