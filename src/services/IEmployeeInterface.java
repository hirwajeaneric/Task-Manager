package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Employees;

public interface IEmployeeInterface extends Remote {
    public void saveEmployees(Employees employees) throws RemoteException;
    public List<Employees> retrieveEmployeeList(Employees employees) throws RemoteException;         
    public List<Employees> getChoosenEmployee(Employees employees, String anEmployee) throws RemoteException;
}
