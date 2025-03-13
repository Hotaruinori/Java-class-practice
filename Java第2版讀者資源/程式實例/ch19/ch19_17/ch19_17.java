import id.IdCreater;					    			 // 匯入自建單一類別名稱宣告
public class ch19_17 {						
    public static void main(String args[]){
		IdCreater n1 = new IdCreater();					 // 建立n1物件
		IdCreater n2 = new IdCreater();					 // 建立n2物件
		IdCreater n3 = new IdCreater();					 // 建立n3物件
		
		System.out.println("n1的編號是 : " + n1.getID()); // 獲得與列印編號
		System.out.println("n2的編號是 : " + n2.getID()); // 獲得與列印編號
		System.out.println("n3的編號是 : " + n3.getID()); // 獲得與列印編號
	}
}

