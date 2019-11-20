package edu.jspiders.onetoonemapping.util;

import edu.jspiders.onetoonemapping.dao.OneToOneMappingDAO;

public class InsertUtil 
{
	public static void main(String[] args) 
	{
		OneToOneMappingDAO dao = new OneToOneMappingDAO();
		
		dao.insert();
	}
}
