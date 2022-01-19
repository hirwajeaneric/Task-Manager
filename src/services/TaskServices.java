package services;

import controller.GenericDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Tasks;

public class TaskServices extends UnicastRemoteObject implements ITaskInterfaces {
    
    GenericDao genericDao = new GenericDao();
    
    public TaskServices () throws RemoteException {
        
    }
    
    @Override
    public void saveTasks(Tasks tasks) throws RemoteException {
        genericDao.saveTasks(tasks);
    }
    
    @Override
    public List<Tasks> retrieveTaskList(Tasks task) throws RemoteException {
        return genericDao.retrieveTaskList(task);
    }
    
    @Override
    public List<Tasks> searchingEmployeesAndTheirTasks(Tasks tasks, String employeeId) throws RemoteException {
        return genericDao.searchingEmployeesAndTheirTasks(tasks, employeeId);
    }
}
