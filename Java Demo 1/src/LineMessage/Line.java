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
                sendLineNotify(yourName + " 恭喜您猜中了, 您猜了 " + tryCount + "次");
                flag = false;
            }

            tryCount++;

        } while (flag);

        System.out.println("恭喜您, 猜中了");
        sc.close();

    }

    public static HttpResponse<String> sendLineNotify(String mag) {

        //您的 LINE Channel access token
        String accessToken = "JM1Q3IeeiegAAQblr+DTmQnKHC95Njg0tJXLZQJeDiscC6RsMuHkZo1zbt6qb/GT+eEkIfWRcegUxrDCW0/esldZ3YLO+6PKixJPL+vWp4lIlgZsSMN/jHZRBbCGdLrjgpFvtGJvnQwS0UOXhK8x8gdB04t89/1O/w1cDnyilFU=";
        String groupID = "C78c6ebf5ea96ebb7f9ed67941b4794e3";  // 您的 LINE 群組 ID
        String message = mag;

        // 設定 JSON 輸出格式

        String jsonBody = "{\n" +

                          "  \"to\": \"" + groupID + "\",\n" +

                          "  \"messages\": [\n" +

                          "    {\n" +

                          "      \"type\": \"text\",\n" +

                          "      \"text\": \"" + message + "\"\n" +

                          "    }\n" +
                          "  ]\n" +

                          "}";

        HttpResponse<String> response = null;

        try {
              // 設定 POST 請求

              HttpRequest request = HttpRequest.newBuilder()

              .uri(new URI("https://api.line.me/v2/bot/message/push"))

              .header("Authorization", "Bearer " + accessToken)              // 加入 Authorization 頭部

              .header("Content-Type", "application/json")  // 設定 Content-Type 為 application/json

              .POST(HttpRequest.BodyPublishers.ofString(jsonBody))  // 傳遞 JSON 字符串

              .build();

        

              // 發送請求並處理回應

             HttpClient client = HttpClient.newHttpClient();
             response = client.send(request, HttpResponse.BodyHandlers.ofString());

    
        // 顯示回應內容
    
        if (response.statusCode() == 200)
             {
     
            System.out.println("訊息發送成功！");
    
        }
             else
             {

                  System.out.println("發送失敗，狀態碼：" + response.statusCode());

                  System.out.println("錯誤內容：" + response.body());
   
        }

        } catch (Exception e) {
            e.printStackTrace();  // 如果有錯誤，打印錯誤訊息
        }

        return response;
    }
}