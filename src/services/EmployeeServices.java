package services;

import controller.GenericDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Employees;

public class EmployeeServices extends UnicastRemoteObject implements IEmployeeInterface{
    
    GenericDao genericDao = new GenericDao();
    
    public EmployeeServices() throws RemoteException {
    
    }
    
    @Override
    public void saveEmployees(Employees employees) throws RemoteException {
        genericDao.saveEmployees(employees);
    }
        
    @Override
    public List<Employees> retrieveEmployeeList(Employees employees) throws RemoteException {
        return genericDao.retrieveEmployeeList(employees);
    }        
    
    @Override
    public List<Employees> getChoosenEmployee(Employees employees, String anEmployee) throws RemoteException {
        return genericDao.getChoosenEmployee(employees, anEmployee);
    }
}
