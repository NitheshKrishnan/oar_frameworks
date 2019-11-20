package edu.jspiders.setterinjectionforcollectiontype.beans;

import java.util.Map;

public class MapType
{
	private Map<Integer, Character> map;
	
	public MapType() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public Map<Integer, Character> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Character> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "MapType [map=" + map + "]";
	}
}