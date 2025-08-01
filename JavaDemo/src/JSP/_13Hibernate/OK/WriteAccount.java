package hibrnt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import hibrnt.Account;

public class WriteAccount {

	public static void main(String[] args) {
		
		//讀取 Hibernate 的設定文件
		Configuration conf = new Configuration(); 
		conf = conf.configure();
		
		//取得 Session 物件
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		
		//建立 Transaction 物件
		Transaction trans = session.beginTransaction();
		
		//建立 Account 物件  
		Account account = new Account();
		
		//設定相關欄位內容
		account.setName("jojo");
		
		//寫入相關欄位內容  
		session.save(account); 
		
		//確認寫入
		trans.commit(); 
		
		session.close();
		System.out.println("成功寫入!!!");
	}
}