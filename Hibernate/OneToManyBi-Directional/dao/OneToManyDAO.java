package edu.jspiders.onetomanybidirectional.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import edu.jspiders.onetomanybidirectional.dto.Batches;
import edu.jspiders.onetomanybidirectional.dto.TrainerProfessional;
import edu.jspiders.singletonfactory.classes.SingletonFactory;

public class OneToManyDAO 
{
	public void insert()
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		TrainerProfessional trainer = session.get(TrainerProfessional.class, "JSP001");
		
		if(trainer!=null)
		{
			Batches batch1 = new Batches("OECM27", "Core Java");
			Batches batch2 = new Batches("OECM28", "Core Java");
			Batches batch3 = new Batches("OEJE1", "Adv Java");
		
			trainer.addBatches(batch1);
			trainer.addBatches(batch2);
			trainer.addBatches(batch3);
			
			session.save(batch1);
			session.save(batch2);
			session.save(batch3);
			
			session.beginTransaction().commit();
			
		}
		else
		{
			System.out.println("Trainer with the given Emp Id is not present");
		}
		session.close();
	}
}
