interface MyScore {							
	void ScoreMax(); 		    			// 最高分
	void SoreMin();							// 最低分
	void ScoreAve();						// 平均
}
interface MyTest extends MyScore {							
	void ShowScore();
}
class MyStuTime implements MyTest {	
		protected String name;				// 姓名
		protected String Chinese			// 國文成績
		protected int math;					// 數學成績
		protected int physics				// 物理成績
		protected int english				// 英文成績
	// 讀者需要設計此類別內容
	void printinfo() {
		System.out.println("國文成績 = " + Chinese);
}
public class ex17_6 {
	public static void main(String[] args) {
		MyStuTime obj = new MyStuTime("John", 98, 97, 100, 99); 	
		obj.showScore();
	}
}

姓名:John
國文成績:98
英文成績:97
數學成績:100
物理成績:99
最高分:100
最低分:97
平均:99.00




