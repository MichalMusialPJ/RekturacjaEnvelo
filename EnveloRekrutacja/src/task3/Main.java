package task3;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws Exception {

        String text;
        HttpClient client = HttpClient.newHttpClient();


        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://api.kanye.rest/"))
                .GET()
                .build();



        do {

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String myString = response.body().split(":")[1].split("}")[0];
            System.out.println(myString);
            System.out.println("wpisz \"next\" zeby wyswietli kolejny cytat");
            Scanner myText = new Scanner(System.in);
            text = myText.nextLine();
        }while(text.equals("next"));


    }


}
