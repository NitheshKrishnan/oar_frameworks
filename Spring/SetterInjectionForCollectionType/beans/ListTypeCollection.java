package edu.jspiders.setterinjectionforcollectiontype.beans;

import java.util.List;

public class ListTypeCollection
{
	private List<Integer> list;
	
	public ListTypeCollection() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ListTypeCollection [list=" + list + "]";
	}
}