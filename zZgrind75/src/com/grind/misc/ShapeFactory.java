package com.grind.misc;

public class ShapeFactory 
{
	
	public Shape getShape(String shapeType) 
	{
		if(shapeType.equalsIgnoreCase("CIRCLE")) 
		{
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) 
		{
			return new Rectangle();
		}
		else 
		{
			return null;
		}		
	}
}
