/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package carrental.newpackage.view;

import carrental.newpackage.controller.CustomerController;
import carrental.newpackage.dto.CustomerDTO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import carrental.newpackage.service.custom.CustomerService;
import java.util.regex.Pattern;

/**
 *
 * @author eshan
 */
public class PanelCustomer extends javax.swing.JPanel {

    private CustomerController customercontroller;

    /**
     *
     */
    public PanelCustomer() {
        customercontroller = new CustomerController();
        initComponents();
        loadAllCustomers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        fromPanel = new javax.swing.JPanel();
        custIdLabel = new javax.swing.JLabel();
        custIdText = new javax.swing.JTextField();
        custFnameLabel = new javax.swing.JLabel();
        custFnameText = new javax.swing.JTextField();
        custLnameLabel = new javax.swing.JLabel();
        custLnameText = new javax.swing.JTextField();
        custnumLabel = new javax.swing.JLabel();
        cusaddLabel = new javax.swing.JLabel();
        custnumberText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        custAddressText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();

        basePanel.setBackground(new java.awt.Color(209, 250, 255));

        headerPanel.setBackground(new java.awt.Color(155, 209, 229));

        headerlabel.setBackground(new java.awt.Color(255, 255, 255));
        headerlabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText("Manage Customer");

        fromPanel.setBackground(new java.awt.Color(155, 209, 229));
        fromPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        custIdLabel.setText("Customer ID");

        custFnameLabel.setText("First Name");

        custLnameLabel.setText("Last Name");

        custnumLabel.setText("Contact number");

        cusaddLabel.setText("Address");

        addButton.setBackground(new java.awt.Color(255, 255, 255));
        addButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addButton.setText("Save Customer");
        addButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(255, 255, 255));
        updateButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        updateButton.setText("Update Customer");
        updateButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        deleteButton.setText("Delete Customer");
        deleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fromPanelLayout = new javax.swing.GroupLayout(fromPanel);
        fromPanel.setLayout(fromPanelLayout);
        fromPanelLayout.setHorizontalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addComponent(custIdLabel)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromPanelLayout.createSequentialGroup()
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(custLnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custFnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(custIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custFnameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custLnameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton)
                        .addGap(18, 18, 18)
                        .addComponent(addButton))
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(fromPanelLayout.createSequentialGroup()
                                .addComponent(cusaddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(custAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fromPanelLayout.createSequentialGroup()
                                .addComponent(custnumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custnumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185)))
                        .addGap(0, 202, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fromPanelLayout.setVerticalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custIdLabel)
                    .addComponent(cusaddLabel)
                    .addComponent(custAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(updateButton)
                            .addComponent(deleteButton))
                        .addGap(23, 23, 23))
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custFnameLabel)
                            .addComponent(custFnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custnumLabel)
                            .addComponent(custnumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custLnameLabel)
                            .addComponent(custLnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fromPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(headerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerPanelLayout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(fromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE))
                .addContainerGap())
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        searchCustomer();
    }//GEN-LAST:event_customerTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            deleteustomer();
        } catch (CustomerService.CustomerServiceException ex) {
            Logger.getLogger(PanelCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            if(!validateData()){
                return;
            }
            updateCustomer();
        } catch (CustomerService.CustomerServiceException ex) {
            Logger.getLogger(PanelCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
            if(!validateData()){
                return;
            }
            addcustomer();
        } catch (CustomerService.CustomerServiceException ex) {
            Logger.getLogger(PanelCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addButtonActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel basePanel;
    private javax.swing.JLabel cusaddLabel;
    private javax.swing.JTextField custAddressText;
    private javax.swing.JLabel custFnameLabel;
    private javax.swing.JTextField custFnameText;
    private javax.swing.JLabel custIdLabel;
    private javax.swing.JTextField custIdText;
    private javax.swing.JLabel custLnameLabel;
    private javax.swing.JTextField custLnameText;
    private javax.swing.JLabel custnumLabel;
    private javax.swing.JTextField custnumberText;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel fromPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void addcustomer() throws CustomerService.CustomerServiceException {
        CustomerDTO managecustdto = new CustomerDTO(
                Integer.parseInt(custIdText.getText()),
                custFnameText.getText(),
                custLnameText.getText(),
                custnumberText.getText(),
                custAddressText.getText()
        );
        String result = customercontroller.addcustomer(managecustdto);

        JOptionPane.showMessageDialog(this, result);
        clear();
        loadAllCustomers();
    }

    private void clear() {
        custIdText.setText("");
        custLnameText.setText("");
        custFnameText.setText("");
        custnumberText.setText("");
        custAddressText.setText("");
    }

    private void loadAllCustomers() {
        try {
            String[] collumns = {"Id", "Firstname", "Lastname", "Contact", "Address"};
            DefaultTableModel dtm = new DefaultTableModel(collumns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            customerTable.setModel(dtm);

            ArrayList<CustomerDTO> customers = customercontroller.getAllCustomer();

            for (CustomerDTO customer : customers) {
                Object[] rowData = {customer.getId(), customer.getFirstname(), customer.getLastname(), customer.getContactnumber(), customer.getAddress()};
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(PanelCustomer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void searchCustomer() {
        try {
            String custId = customerTable.getValueAt(customerTable.getSelectedRow(), 0).toString();
            CustomerDTO managecustdto = customercontroller.getCustomer(custId);

            if (managecustdto != null) {
                custIdText.setText(Integer.toString(managecustdto.getId()));
                custFnameText.setText(managecustdto.getFirstname());
                custLnameText.setText(managecustdto.getLastname());
                custnumberText.setText(managecustdto.getContactnumber());
                custAddressText.setText(managecustdto.getAddress());

            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }

        } catch (Exception ex) {
            Logger.getLogger(PanelCustomer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void deleteustomer() throws CustomerService.CustomerServiceException {
        String result = customercontroller.deleteCustomer(custIdText.getText());

        JOptionPane.showMessageDialog(this, result);
        clear();
        loadAllCustomers();
    }

    private void updateCustomer() throws CustomerService.CustomerServiceException {
        CustomerDTO managecustdto = new CustomerDTO(
                Integer.parseInt(custIdText.getText()),
                custFnameText.getText(),
                custLnameText.getText(),
                custnumberText.getText(),
                custAddressText.getText()
        );
        String result = customercontroller.updateCustomer(managecustdto);

        JOptionPane.showMessageDialog(this, result);
        clear();
        loadAllCustomers();
    }

    private boolean validateData() {
        if(!Pattern.matches("^[0-9]{1,3}$", custIdText.getText())){
            JOptionPane.showMessageDialog(fromPanel, "Invalid or Empty Customer ID");
            return false;
        }
        if(!Pattern.matches("^[A-Za-z]+$", custFnameText.getText())){
            JOptionPane.showMessageDialog(fromPanel, "Invalid or Empty Customer First Name");
            return false;
        }
        if(!Pattern.matches("^[A-Za-z]+$", custLnameText.getText())){
            JOptionPane.showMessageDialog(fromPanel, "Invalid or Empty Customer lasst Name");
            return false;
        }
        if(!Pattern.matches("^[0-9]{10,15}$", custnumberText.getText())){
            JOptionPane.showMessageDialog(fromPanel, "Invalid or Empty Customer Number");
            return false;
        }
        
        if(!Pattern.matches("^[A-Z a-z 0-9 / . , ]+$", custAddressText.getText())){
            JOptionPane.showMessageDialog(fromPanel, "Invalid or Empty Customer Address");
            return false;
        }
        return true;
    }
    
    
}

