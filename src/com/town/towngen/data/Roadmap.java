/*
 * Roadmap is the data module which contains road information for the city.
 * This is represented by arrays of vectors, [0] being the origin point and 
 * subsequent vectors being directions away from it.
 * 
 * Plazas are large areas paved like a road, represented by a single vector,
 * which is it's location in the city.
 */

package com.town.towngen.data;

import java.util.ArrayList;
import java.util.List;

import com.town.towngen.utils.Vector2D;

public class Roadmap extends DataModule
{
	// Stored roadmap data
	protected List<Vector2D[]> roads; // Roads
	protected List<Vector2D> plazas; // Plazas
	
	// Create a new, emptry roadmap
	public Roadmap()
	{
		roads = new ArrayList<Vector2D[]>();
		plazas = new ArrayList<Vector2D>();
	}
	
	
	
	// Getters/Setters//
	
	// Get a road by it's index 
	public Vector2D[] getRoad(int index)
	{
		// Borders checking on the list
		if(index < roads.size() && index > 0)
		{
			// Return the data
			return roads.get(index);
		}
		else
		{
			// Outside of the list, return an empty road and issue a warning
			System.out.println("Invalid road index " + index + " in Roadmap of size " + roads.size());
			return new Vector2D[0];
		}
	}
	
	// Get a road by it's index 
	public Vector2D getPlaza(int index)
	{
		// Borders checking on the list
		if(index < plazas.size() && index > 0)
		{
			// Return the data
			return plazas.get(index);
		}
		else
		{
			// Outside of the list, return an empty plaza and issue a warning
			System.out.println("Invalid plaza index " + index + " in Roadmap of size " + plazas.size());
			return new Vector2D();
		}
	}
	
	// Create a new road and return it's reference
	public Vector2D[] newRoad(int size)
	{
		// Create the new road object
		Vector2D[] newRoad = new Vector2D[size];
		// Add it to the data
		roads.add(newRoad);
		// Return to the caller
		return newRoad;
	}
	
	// Create a new plaza and return it's reference
	public Vector2D newPlaza()
	{
		// Create the new road object
		Vector2D newPlaza = new Vector2D();
		// Add it to the data
		plazas.add(newPlaza);
		// Return to the caller
		return newPlaza;
	}
	
	// Add a new road
	public void addRoad(Vector2D[] road)
	{
		roads.add(road);
	}
	
	// Add a new plaza
	public void addPlaza(Vector2D plaza)
	{
		plazas.add(plaza);
	}
	
	
	
	// To/From String //
	
	@Override
	public String toString()
	{
		return "";
	}
	
	@Override
	public Roadmap fromString()
	{
		return new Roadmap();
	}
}
