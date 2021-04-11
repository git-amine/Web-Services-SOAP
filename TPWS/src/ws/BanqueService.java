package ws;
import metier.compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@WebService(serviceName = "BanqueWS")

public class BanqueService {

    @WebMethod(operationName = "ConversionEuroToDH")

    public double conversion(@WebParam(name = "Montant") double mt){

        return mt*10.6;
    }
    @WebMethod
    public compte getCompte(@WebParam(name = "code")  long code){
         return new compte(code,Math.random()*90000, new Date());

    }
     @WebMethod
    public List<compte> getComptes(){

        List<compte> comptes= new ArrayList<>();
        comptes.add(new compte(1,Math.random()*90000, new Date()));
        comptes.add(new compte(2,Math.random()*90000, new Date()));
        comptes.add(new compte(3,Math.random()*90000, new Date()));

        return comptes;
    }
}

