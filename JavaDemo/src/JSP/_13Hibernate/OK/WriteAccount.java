package hibrnt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import hibrnt.Account;

public class WriteAccount {

	public static void main(String[] args) {
		
		//Ū�� Hibernate ���]�w���
		Configuration conf = new Configuration(); 
		conf = conf.configure();
		
		//���o Session ����
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		
		//�إ� Transaction ����
		Transaction trans = session.beginTransaction();
		
		//�إ� Account ����  
		Account account = new Account();
		
		//�]�w������줺�e
		account.setName("jojo");
		
		//�g�J������줺�e  
		session.save(account); 
		
		//�T�{�g�J
		trans.commit(); 
		
		session.close();
		System.out.println("���\�g�J!!!");
	}
}