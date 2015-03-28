/*
 * Watermap is a collection of data which represents bodies of water in
 * an area. Represented generally by arrays of vectors, [0] being the
 * origin point and subsequent vectors being directions away from it.
 * 
 * Rivers follow the vectors as it's path
 * 
 * Lakes and other standing water use the vectors to define it's borders,
 * with an assumed connection between [0] and the final value.
 * 
 */

package com.town.towngen.data;

import java.util.ArrayList;
import java.util.List;

import com.town.towngen.utils.Vector2D;



public class Watermap extends DataModule
{
	// Data for different bodies of water
	protected List<Vector2D[]> rivers; // Rivers
	protected List<Vector2D[]> lakes; // Lakes/Standing Water
	
	// Create a new, empty watermap
	public Watermap()
	{
		rivers = new ArrayList<Vector2D[]>();
		lakes = new ArrayList<Vector2D[]>();
	}
	
	
	
	// Getters/Setters //
	
	// Get a river by an index
	public Vector2D[] getRiver(int index)
	{
		return rivers.get(index);
	}
	
	// Get a lake by an index
	public Vector2D[] getLake(int index)
	{
		return lakes.get(index);
	}
	
	// Add a new river. Return a reference to it
	public Vector2D[] newRiver(int size)
	{
		// Create the new river object
		Vector2D[] newRiver = new Vector2D[size];
		// Add it to the data
		rivers.add(newRiver);
		// Return to the caller
		return newRiver;
	}
	
	// Add a new lake. Return a reference to it
	public Vector2D[] newLake(int size)
	{
		// Create the new lake object
		Vector2D[] newLake = new Vector2D[size];
		// Add it to the data
		lakes.add(newLake);
		// Return to the caller
		return newLake;
	}
	
	// Add an existing river.
	public void addRiver(Vector2D[] river)
	{
		rivers.add(river);
	}
	
	// Add an existing lake
	public void addLake(Vector2D[] lake)
	{
		lakes.add(lake);
	}
	
	
	
	// To/From String //
	
	@Override
	public String toString()
	{
		return "";
	}

	@Override
	public Watermap fromString()
	{
		return new Watermap();
	}
}
