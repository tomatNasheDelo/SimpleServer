package v1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Main {
	
	  public static void main(String[] args) throws IOException, InterruptedException {

	        HttpClient client = HttpClient.newHttpClient();

	        HttpRequest request = HttpRequest.newBuilder()               
	                .uri(URI.create("http://localhost:8000/app"))                
	                .build();

	        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
	        
	        System.out.println("Status code: " + response.statusCode());        
	        System.out.println("\n Body: " + response.body());
	    }

}
