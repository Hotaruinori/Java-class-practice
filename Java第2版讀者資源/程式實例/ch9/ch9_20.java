class NBAteam {
	public static int counter;					// 所有物件共享此份資料
	public int id;								// 人員id
	public String name;							// 人員姓名
	static {									// static的初始區塊
		counter = 0;						
	}
	public NBAteam() {
		id = ++counter;							// 同時設定id和人數總計
	}
	public void output() {
		System.out.println("id:" + id + "  Name: " + name);
		System.out.println("共有 " + counter + " 名成員");
	}
}

public class ch9_20 {
	public static void main(String[] args) {
		NBAteam t1 = new NBAteam();
		t1.name = "Durant";
		t1.output();
		NBAteam t2 = new NBAteam();				
		t2.name = "Curry";
		t2.output();
	}
}
 
