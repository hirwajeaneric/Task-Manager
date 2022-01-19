package controller;

import java.util.List;
import model.Employees;
import model.Tasks;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

public class GenericDao {
    Session session;
    Transaction transaction;
    
    public void saveTasks(Tasks tasks) {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(tasks);
        transaction.commit();
        session.close();
    }

    public void saveEmployees(Employees employees) {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(employees);
        transaction.commit();
        session.close();
    }
    
    public List<Tasks> retrieveTaskList(Tasks task) {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Tasks> tasks = session.createCriteria(task.getClass()).list();
        transaction.commit();
        session.close();
        return tasks;
    }
    
    public List<Employees> retrieveEmployeeList(Employees employees) {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Employees> allEmployees = session.createCriteria(employees.getClass()).list();
        transaction.commit();
        session.close();
        return allEmployees;
    }
    
    public List<Employees> getChoosenEmployee(Employees employees, String anEmployee) {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();

        Criteria crit = session.createCriteria(employees.getClass());
        crit.add(Restrictions.eq("employeeId",""+anEmployee+""));
        List<Employees> theEmployee = crit.list();
        
        transaction.commit();
        session.close();
        return theEmployee;
    }
    
    public List<Tasks> searchingEmployeesAndTheirTasks(Tasks tasks, String employeeId) {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();

        Criteria crit = session.createCriteria(tasks.getClass());
        crit.add(Restrictions.eq("employeeId",""+employeeId+""));
        List<Tasks> theEmployeeFound = crit.list();
        
        transaction.commit();
        session.close();
        return theEmployeeFound;
    }
    
}
