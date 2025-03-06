import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class Line {

	public static void main(String[] args) {

		System.out.println("猜數字遊戲, 您準備好了嗎?");
		System.out.println("請輸入姓名或座號:");
		Scanner sc = new Scanner(System.in);
		String yourName = sc.next();
		boolean flag = true;
		int tryCount = 1;

		System.out.println("若要離開, 請輸入 exit");

		do {
			System.out.printf("請輸入1-100的數字(%d):\n", tryCount);
			String input = sc.next();

			if (input.equals("exit")) {
				break;
			}

			if (input.equals("63")) {
				sendLineNOtify(yourName + " 恭喜您猜中了, 您猜了 " + tryCount + "次");
				flag = false;
			}

			tryCount++;

		} while (flag);

		System.out.println("恭喜您, 猜中了");
		sc.close();

	}

	public static HttpResponse<String> sendLineNOtify(String mag) {

		String accessToken = "cll8qwI66fM750OlDAySH0cvvcRCz6CMn1uHEkxSRl5";
		String message = mag;
		HttpResponse<String> response = null;

		try {

			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://notify-api.line.me/api/notify"))
					.header("Authorization", "Bearer " + accessToken)
					.header("Content-Type", "application/x-www-form-urlencoded")
					.POST(BodyPublishers.ofString("message=" + message)).build();

			response = client.send(request, BodyHandlers.ofString());

			// System.out.println("Response code: " + response.statusCode());
			// System.out.println("Response body: " + response.body());
		} catch (Exception e) {
			// TODO: handle exception
		}

		return response;
	}

}
