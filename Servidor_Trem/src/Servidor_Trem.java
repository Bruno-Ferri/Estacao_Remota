
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public class Servidor_Trem {

    /**
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     */
    public Servidor_Trem() throws RemoteException{
        try {
           LocateRegistry.createRegistry(1234);
           Naming.rebind("rmi://localhost:1234/trem", new Implementacao_Trem());
         //  Naming.rebind("rmi://localhost:9999/tarifa", new TarifaDAO());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws RemoteException {
       new Servidor_Trem();
    }
}
    

