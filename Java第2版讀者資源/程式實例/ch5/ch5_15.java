import java.util.Scanner;
public class ch5_15 {
	public static void main(String[] args) {
		String lastname;
		Scanner scanner = new Scanner(System.in);
		System.out.println("百家姓排名");
		System.out.print("請輸入你的姓氏 : ");	// 以字串方式讀取
		lastname = scanner.next();				// 讀取姓	
		switch (lastname) {	
			case "李":
				System.out.println("百家姓排名第1,約占中國7.94%總人口約95000000人");
				break;
			case "王":
				System.out.println("百家姓排名第2,約占中國7.41%總人口約89000000人");
				break;
			case "張":
				System.out.println("百家姓排名第3,約占中國7.07%總人口約85000000人");
				break;
			case "劉":
				System.out.println("百家姓排名第4,約占中國5.38%總人口約65000000人");
				break;
			case "陳":
				System.out.println("百家姓排名第5,約占中國4.53%總人口約54000000人");
				break;
			default:
				System.out.println("百家姓氏排名不在前5大");
		}
	}
}

