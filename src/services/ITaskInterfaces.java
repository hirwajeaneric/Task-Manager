package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Tasks;

public interface ITaskInterfaces extends Remote{
    public void saveTasks(Tasks tasks) throws RemoteException;
    public List<Tasks> retrieveTaskList(Tasks task) throws RemoteException;
    public List<Tasks> searchingEmployeesAndTheirTasks(Tasks tasks, String employeeId) throws RemoteException;
}
