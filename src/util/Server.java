package util;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.EmployeeServices;
import services.TaskServices;

public class Server {
    public static void main(String[] args) {
        try {
            
            Registry registry = LocateRegistry.createRegistry(Config.PORT);
            registry.rebind("EmployeeServices", new EmployeeServices());
            registry.rebind("TaskServices", new TaskServices());
            System.out.println("Server has Started .....");
            
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
