package view;


import controller.GenericDao;
import java.rmi.RemoteException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employees;
import model.Tasks;
import services.EmployeeServices;
import services.IEmployeeInterface;
import services.ITaskInterfaces;
import services.TaskServices;

public class ManagerForm extends javax.swing.JFrame {
    
    DefaultTableModel model;
    List<Employees> listOfEmployees;
    List<Tasks> listOfTasks;
    GenericDao genericDao = new GenericDao();
    Employees employee = new Employees();
    Tasks tasks = new Tasks();
    IEmployeeInterface employeInterface;
    ITaskInterfaces taskInterface;
    
    
    public ManagerForm() {
        initComponents();
        retrieveEmployees();
        retrieveTasks();
        addItemToEmployeeCombo();
        displayingDataToTable();
    }
    
    public void retrieveEmployees(){
        try {
            employeInterface = new EmployeeServices();
            listOfEmployees = employeInterface.retrieveEmployeeList(employee);
            //listOfEmployees = genericDao.retrieveEmployeeList(employee);
        } catch (RemoteException ex) {
            Logger.getLogger(ManagerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void retrieveTasks(){
        try {
            taskInterface = new TaskServices();
            listOfTasks = taskInterface.retrieveTaskList(tasks);
            //listOfTasks = genericDao.retrieveTaskList(tasks);
        } catch (RemoteException ex) {
            Logger.getLogger(ManagerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsTextArea = new javax.swing.JTextArea();
        employeeComboBox = new javax.swing.JComboBox<>();
        assignTasksButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        managerTable = new javax.swing.JTable();
        deadlineDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manager Form");

        jLabel2.setText("Title:");

        jLabel3.setText("Details");

        jLabel4.setText("Deadline Date:");

        jLabel5.setText("Employee");

        detailsTextArea.setColumns(20);
        detailsTextArea.setRows(5);
        jScrollPane1.setViewportView(detailsTextArea);

        employeeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeComboBoxActionPerformed(evt);
            }
        });

        assignTasksButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        assignTasksButton.setText("Assign Tasks");
        assignTasksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTasksButtonActionPerformed(evt);
            }
        });

        managerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Details", "Deadline", "Employee Names"
            }
        ));
        jScrollPane2.setViewportView(managerTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(titleTextField)
                            .addComponent(employeeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deadlineDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(assignTasksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(deadlineDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(employeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(assignTasksButton)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(123, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void assignTasksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignTasksButtonActionPerformed
        try {
            tasks.setTitle(titleTextField.getText());
            tasks.setDetails(detailsTextArea.getText());
            tasks.setDeadlineDate(deadlineDateChooser.getDate());
            tasks.setEmployee(employee);
            
            taskInterface.saveTasks(tasks);
            //genericDao.saveTasks(taskData);
            
            retrieveTasks();
            displayingDataToTable();
                    
            JOptionPane.showMessageDialog(this, "Saved Task");
        } catch (RemoteException ex) {
            Logger.getLogger(ManagerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_assignTasksButtonActionPerformed

    public void getEmployee(){
        try {
            String anEmployee = employeeComboBox.getSelectedItem().toString();
            
            List<Employees> choosenEmployee = employeInterface.getChoosenEmployee(employee, anEmployee);
            //List<Employees> choosenEmployee = genericDao.getChoosenEmployee(employee, anEmployee);
            
            for (Employees theEmployee : choosenEmployee) {
                employee = theEmployee;
            }
        } catch (RemoteException ex) {
            Logger.getLogger(ManagerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void employeeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeComboBoxActionPerformed
        getEmployee();
    }//GEN-LAST:event_employeeComboBoxActionPerformed
    
    private void addItemToEmployeeCombo(){
        employeeComboBox.removeAllItems();
        for (Employees aEmployee : listOfEmployees) {
            employeeComboBox.addItem(aEmployee.getEmployeeId());   
        }
    }
    
    private void displayingDataToTable(){
        model = (DefaultTableModel) managerTable.getModel();
        model.setRowCount(0);
        
        for (Tasks retrivedData : listOfTasks) {
            model.addRow(new Object[]{
                retrivedData.getTitle(),
                retrivedData.getDetails(),
                retrivedData.getDeadlineDate(),
                retrivedData.getEmployee().getFullname()
            });
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignTasksButton;
    private com.toedter.calendar.JDateChooser deadlineDateChooser;
    private javax.swing.JTextArea detailsTextArea;
    private javax.swing.JComboBox<String> employeeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable managerTable;
    private javax.swing.JTextField titleTextField;
    // End of variables declaration//GEN-END:variables
}
