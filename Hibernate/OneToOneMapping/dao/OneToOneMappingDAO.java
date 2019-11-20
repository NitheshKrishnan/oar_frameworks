package edu.jspiders.onetoonemapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import edu.jspiders.onetoonemapping.dto.TrainerPersonal;
import edu.jspiders.onetoonemapping.dto.TrainerProfessional;
import edu.jspiders.singletonfactory.classes.SingletonFactory;

public class OneToOneMappingDAO 
{
	public void insert()
	{
		TrainerPersonal personal = new TrainerPersonal(1, "Kannada", "Mysore", "Single");
		
		TrainerProfessional trainer = new TrainerProfessional("JSP001", "Rajesh", "Male", 25000, 2.5);
		
		trainer.setPersonal(personal);
		
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		session.save(trainer);
		
		session.beginTransaction().commit();
		
		session.close();
	}
}