import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
//import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
//import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class Line {

    public static void main(String[] args) {

        System.out.println("�q�Ʀr�C��, �z�ǳƦn�F��?");
        System.out.println("�п�J�m�W�ήy��:");
        Scanner sc = new Scanner(System.in);
        String yourName = sc.next();
        boolean flag = true;
        int tryCount = 1;

        System.out.println("�Y�n���}, �п�J exit");

        do {
            System.out.printf("�п�J1-100���Ʀr(%d):\n", tryCount);
            String input = sc.next();

            if (input.equals("exit")) {
                break;
            }

            if (input.equals("63")) {
                sendLineNotify(yourName + " ���߱z�q���F, �z�q�F " + tryCount + "��");
                flag = false;
            }

            tryCount++;

        } while (flag);

        System.out.println("���߱z, �q���F");
        sc.close();

    }

    public static HttpResponse<String> sendLineNotify(String mag) {

        //�z�� LINE Channel access token
        String accessToken = "JM1Q3IeeiegAAQblr+DTmQnKHC95Njg0tJXLZQJeDiscC6RsMuHkZo1zbt6qb/GT+eEkIfWRcegUxrDCW0/esldZ3YLO+6PKixJPL+vWp4lIlgZsSMN/jHZRBbCGdLrjgpFvtGJvnQwS0UOXhK8x8gdB04t89/1O/w1cDnyilFU=";
        String groupID = "C78c6ebf5ea96ebb7f9ed67941b4794e3";  // �z�� LINE �s�� ID
        String message = mag;

        // �]�w JSON ��X�榡

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
              // �]�w POST �ШD

              HttpRequest request = HttpRequest.newBuilder()

              .uri(new URI("https://api.line.me/v2/bot/message/push"))

              .header("Authorization", "Bearer " + accessToken)              // �[�J Authorization �Y��

              .header("Content-Type", "application/json")  // �]�w Content-Type �� application/json

              .POST(HttpRequest.BodyPublishers.ofString(jsonBody))  // �ǻ� JSON �r�Ŧ�

              .build();

        

              // �o�e�ШD�óB�z�^��

             HttpClient client = HttpClient.newHttpClient();
             response = client.send(request, HttpResponse.BodyHandlers.ofString());

    
        // ��ܦ^�����e
    
        if (response.statusCode() == 200)
             {
     
            System.out.println("�T���o�e���\\�I");
    
        }
             else
             {

                  System.out.println("�o�e���ѡA���A�X�G" + response.statusCode());

                  System.out.println("���~���e�G" + response.body());
   
        }

        } catch (Exception e) {
            e.printStackTrace();  // �p�G�����~�A���L���~�T��
        }

        return response;
    }
}