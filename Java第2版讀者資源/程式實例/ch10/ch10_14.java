public class ch10_14 {
	public static void main(String[] args) {
		double r = 6371;									// 地球半徑
		double x1 = 22.2838; 								// 香港紅勘車站緯度
		double y1 = 114.1731; 								// 香港紅勘車站經度
		double x2 = 25.0452; 								// 台北車站緯度
		double y2 = 121.5168; 								// 台北車站經度
		double d;
		d = r * Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+
		                  Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*
			              Math.cos(Math.toRadians(y1-y2)));
		
		System.out.println("distance = " + d);				
	}
}

