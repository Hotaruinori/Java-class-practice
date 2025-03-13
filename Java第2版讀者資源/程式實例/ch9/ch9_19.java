class NBAteam {
	public static String team;					// 所有物件共享此份資料
	public String name;							// 每一個物件有一份此資料
	static {									// static的初始區塊
		team = "Warriors";						
	}
	public NBAteam(String name) {
		this.name = name;
	}
	public void output() {
		System.out.println("Team: " + team);
		System.out.println("Name: " + name);
	}
}

public class ch9_19 {
	public static void main(String[] args) {
		NBAteam t1 = new NBAteam("Curry");
		NBAteam t2 = new NBAteam("Durant");
		t1.output();
		t2.output();
		NBAteam.team = "Golden State";				
		t1.output();
		t2.output();
	}
}
 
