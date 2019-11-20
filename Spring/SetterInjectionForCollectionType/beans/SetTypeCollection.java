package edu.jspiders.setterinjectionforcollectiontype.beans;

import java.util.Set;

public class SetTypeCollection
{
	private Set<Character> set;
	
	public SetTypeCollection() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public Set<Character> getSet() {
		return set;
	}

	public void setSet(Set<Character> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "SetTypeCollection [set=" + set + "]";
	}
}