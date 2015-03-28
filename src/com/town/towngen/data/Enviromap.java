/*
 * Enviromap contains miscellaneous objects in the world, like trees or rocks
 * or ruins. This is represented by arrays of vectors, [0] being the origin point and 
 * subsequent vectors being directions away from it. There is an assumed
 * connection between [0] and the final vector. The resulting shape is the final
 * volume of the data.
 */

package com.town.towngen.data;

import java.util.ArrayList;
import java.util.List;

import com.town.towngen.utils.Vector2D;

public class Enviromap extends DataModule
{
	// Area data, the heart of the Enviromap
	List<Area> areas;
	
	// Create a new, empty enviromap
	public Enviromap()
	{
		areas = new ArrayList<Area>();
	}

	
	
	// To/From String //
	
	@Override
	public String toString()
	{
		return "";
	}
	
	@Override
	public Enviromap fromString()
	{
		return new Enviromap();
	}
	
	
	
	
	
	// Sub-Classes //
	
	/*
	 * Area is the data of a particular environment. An Enviromap is a
	 * collection of these.
	 */
	public static class Area extends DataModule
	{
		// The tag this is known as. "Trees", "Rocks", or "Ruins" are all examples.
		String tag = "";
		// Does this area block other areas and anything else that would take up this data?
		boolean blocking = false;
		
		// The actual data of the space taken by this area
		protected Vector2D[] space;
		
		
		
		// Create a new, empty Area
		public Area(String tag)
		{
			this.tag = tag;
		}
		
		// Create a new Area with space data
		public Area(String tag, Vector2D[] space)
		{
			this.space = space;
		}
		
		
		
		// Getters/Setters //
		
		// Get tag
		public String tag()
		{
			return tag;
		}
		
		// Get blocking
		public boolean blocking()
		{
			return blocking;
		}
		
		// Get space data
		public Vector2D[] getSpace()
		{
			// Make sure our space data has been initialized
			if(space != null)
			{
				return space;
			}
			else
			{
				// Space data has not been initialized. Return empty and issue a warning
				System.out.println("Space data for Area " + tag() + " not initialized, but called for.");
				return new Vector2D[0];
			}
		}
		
		// Set space data
		public void setSpace(Vector2D[] space)
		{
			this.space = space;
		}
		
		
		
		// To/From String //
		
		@Override
		public String toString()
		{
			return "";
		}
		
		@Override
		public Area fromString()
		{
			return new Area("");
		}
	}

}
