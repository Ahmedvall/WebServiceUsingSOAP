package ws;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(serviceName = "BanqueWS")
public class BqService {
	
	@WebMethod(operationName = "ConversionEuroToDh")
	public double conversion(@WebParam(name="montant") double mt) {
		return mt*11;
	}
	
	@WebMethod
	public Compte getCompte(@WebParam(name="code") int code) {
		return new Compte(1, Math.random()*9000, new Date());
	}
	
	@WebMethod
	public List<Compte> listCompte() {
		List<Compte> cpts = new ArrayList<Compte>();
		cpts.add(new Compte(1, Math.random()*9000, new Date()));
		cpts.add(new Compte(2, Math.random()*5000, new Date()));
		cpts.add(new Compte(3, Math.random()*1000, new Date()));
		
		return cpts;
	}

}
