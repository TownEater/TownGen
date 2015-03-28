/*
 * Heightmap is the data module which contains an array of grid information
 * regarding the height of different portions of the city. The 2 dimensional
 * array which is the backbone of the module consists of floats, and each
 * point of data is considered to be a "corner" of the grid, not a block.
 * 
 * A visualization is included below.
 * 
 * 0---0---0---0---0---0---0---0
 * |   |   |   |   |   |   |   |
 * 0---0---0---0---0---0---0---0
 * |   |   |   |   |   |   |   |
 * 0---0---0---0---0---0---0---0
 * |   |   |   |   |   |   |   |
 * 0---0---0---0---0---0---0---0
 * |   |   |   |   |   |   |   |
 * 0---0---0---0---0---0---0---0
 * 
 * Each "0" is representative of a point of data on the grid. Rather than the
 * center blocks being a point of data(which would result in more drastic
 * changes in elevation where they meet, as in voxel heightmaps)
 * 
 * Data maps may be a square or a rectangle, but no other shapes.
 * 
 * Data can be any value 0 and up. The higher the value, the higher the
 * terrain is.
 * 
 */

package com.town.towngen.data;

public class Heightmap extends DataModule
{
	// The main map of data
	protected float[][] map;
	
	// Create a new heightmap of a size
	public Heightmap(int sizeX, int sizeY)
	{
		map = new float[sizeX][sizeY];
	}
	
	
	
	// Getters/Setters //
	
	// Get X size
	public int getSizeX()
	{
		// Rip the size from the map data array
		return map.length;
	}
	
	// Get Y size
	public int getSizeY()
	{
		// Rip the size from the map data array
		return map[0].length;
	}
	
	// Get a value from the map
	public float getPoint(int x, int y)
	{
		// Borders checking on the arrays
		if(x < map.length && x > 0 && y < map[0].length && y > 0)
		{
			// Return the data
			return map[x][y];
		}
		else
		{
			// Outside of the map, return 0 and issue a warning
			System.out.println("Invalid coordinates in map of size " + getSizeX() + "," + getSizeY() + ": " + x + "," + y);
			return 0;
		}
	}
	
	// Explicitly set a point of data
	public void setPoint(int x, int y, float value)
	{
		// Borders checking on the arrays
		if(x < map.length && x > 0 && y < map[0].length && y > 0)
		{
			// Make sure the value is positive
			if(value > 0)
			{
				// Return the data
				map[x][y] = value;
			}
			else
			{
				// Value is negative, issue a warning and place no data
				System.out.println("Invalid value issued to heightmap: " + value + ", at coordinates: " + x + "," + y);
			}
		}
		else
		{
			// Outside of the map, issue a warning and place no data
			System.out.println("Invalid coordinates in map of size " + getSizeX() + "," + getSizeY() + ": " + x + "," + y);
		}
	}
	
	
	
	// To/From String //
	
	@Override
	public String toString()
	{
		return "";
	}

	@Override
	public Heightmap fromString()
	{
		return new Heightmap(0,0);
	}
}
