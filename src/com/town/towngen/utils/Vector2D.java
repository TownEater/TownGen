/*
 * Vector2D is a class to track and modify two dimensional vector data
 */

package com.town.towngen.utils;

public class Vector2D
{
	// Values
	public float x;
	public float y;
	
	// Create a new Vector2D
	public Vector2D(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Vector2D(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Vector2D(double x, double y)
	{
		this.x = (float)x;
		this.y = (float)y;
	}
	
	// Create an empty Vector2D
	public Vector2D()
	{
		this.x = 0f;
		this.y = 0f;
	}
	
	
	
	// Utilities //
	
	// Set another Vector2Ds values to this one, while preserving the pointer
	public void set(Vector2D value)
	{
		x = value.x;
		y = value.y;
	}
}
