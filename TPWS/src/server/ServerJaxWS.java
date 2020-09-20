 package server;

import javax.xml.ws.Endpoint;

import ws.BqService;

public class ServerJaxWS {
	
	public static void main(String[] args) {
		String url= "http://0.0.0.0:8686/";
		Endpoint.publish(url, new BqService());
		System.out.println("Web service deployé sur: "+url);
	}

}
