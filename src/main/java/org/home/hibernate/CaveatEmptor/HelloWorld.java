package org.home.hibernate.CaveatEmptor;





import java.util.Iterator;
import java.util.List;

import junit.framework.Assert;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HelloWorld {

	public static void execute()
	{
		System.out.println("----------------------------");
		System.out.println("Testing Hibernate Settings");
		System.out.println("----------------------------");
		// First unit of work
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Message message = new Message();
		message.setText("Hello World");
		
		Long msgId = (Long) session.save(message);
		
		tx.commit();
		session.close();
		
		//Second unit of work
		Session newSession = HibernateUtil.getSessionFactory().openSession();
		Transaction newTx = newSession.beginTransaction();
		
		List messages = newSession.createQuery("from Message m order by m.text asc").list();
		System.out.println(messages.size() + " message(s) found:");
	
	
		for (Iterator itr = messages.iterator(); itr.hasNext();){
			Message loadedMsg = (Message) itr.next();
			System.out.println(loadedMsg.getText());
		}

		if(1== messages.size()) {
	  	  System.out.println("-------------------------------------");
		  System.out.println("Completed successfully testting Hibernate Settings");
		  System.out.println("-------------------------------------");
		}

		newTx.commit();newSession.close();
		HibernateUtil.shutdown();
		

		
	}
	
	public static void main(String[] args) {
		execute();

	}

}

