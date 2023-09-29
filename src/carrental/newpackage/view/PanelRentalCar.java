/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package carrental.newpackage.view;

import carrental.newpackage.controller.CarController;
import carrental.newpackage.controller.CustomerController;
import carrental.newpackage.controller.RentalController;
import carrental.newpackage.dto.CarDTO;
import carrental.newpackage.dto.CustomerDTO;
import carrental.newpackage.dto.RentalDTO;
import carrental.newpackage.service.custom.CarService;
import carrental.newpackage.service.custom.CustomerService;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eshan
 */
public class PanelRentalCar extends javax.swing.JPanel {

    private CarController carcontroller;
    private CustomerController customercontroller;
    private RentalController rentalcontroller;

    /**
     */
    public PanelRentalCar() {
        rentalcontroller = new RentalController();
        carcontroller = new CarController();
        customercontroller = new CustomerController();

        initComponents();
        loadrentaltable();

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
        fromPanel = new javax.swing.JPanel();
        customerLabel = new javax.swing.JLabel();
        customerIdText = new javax.swing.JTextField();
        cutDataLabel = new javax.swing.JLabel();
        itemLabel = new javax.swing.JLabel();
        caridText = new javax.swing.JTextField();
        searchIcarButton = new javax.swing.JButton();
        qtyLabel = new javax.swing.JLabel();
        discountLabel = new javax.swing.JLabel();
        rentaldueTxt = new javax.swing.JTextField();
        addcarButton = new javax.swing.JButton();
        qtyLabel1 = new javax.swing.JLabel();
        discountLabel1 = new javax.swing.JLabel();
        rentalcostTxt = new javax.swing.JTextField();
        startdatepick = new com.toedter.calendar.JDateChooser();
        enddatepick = new com.toedter.calendar.JDateChooser();
        headerlabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rentalTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rentalTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        basePanel.setBackground(new java.awt.Color(209, 250, 255));
        basePanel.setLayout(null);

        headerPanel.setBackground(new java.awt.Color(155, 209, 229));

        fromPanel.setBackground(new java.awt.Color(155, 209, 229));
        fromPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        customerLabel.setText("Customer ID");

        itemLabel.setText("Car ID");

        searchIcarButton.setBackground(new java.awt.Color(255, 255, 255));
        searchIcarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchIcarButton.setText("Search");
        searchIcarButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchIcarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIcarButtonActionPerformed(evt);
            }
        });

        qtyLabel.setText("Rental start Date");

        discountLabel.setText("Rental Cost");

        rentaldueTxt.setEditable(false);

        addcarButton.setBackground(new java.awt.Color(255, 255, 255));
        addcarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addcarButton.setText("Add Car");
        addcarButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addcarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcarButtonActionPerformed(evt);
            }
        });

        qtyLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qtyLabel1.setText("End Date");

        discountLabel1.setText("Rental Duration");

        rentalcostTxt.setEditable(false);

        javax.swing.GroupLayout fromPanelLayout = new javax.swing.GroupLayout(fromPanel);
        fromPanel.setLayout(fromPanelLayout);
        fromPanelLayout.setHorizontalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromPanelLayout.createSequentialGroup()
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addComponent(qtyLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(enddatepick, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(customerIdText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startdatepick, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(discountLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discountLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(cutDataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 4, Short.MAX_VALUE)
                        .addGap(207, 207, 207))
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addComponent(rentaldueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addcarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(searchIcarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rentalcostTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caridText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        fromPanelLayout.setVerticalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addcarButton)
                    .addComponent(searchIcarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cutDataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(customerIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(customerLabel)
                        .addComponent(caridText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(itemLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(startdatepick, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtyLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rentalcostTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(discountLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rentaldueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(discountLabel1))
                    .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(qtyLabel1)
                        .addComponent(enddatepick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        headerlabel.setBackground(new java.awt.Color(155, 209, 229));
        headerlabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText("Manage Car Rentals");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fromPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        basePanel.add(headerPanel);
        headerPanel.setBounds(12, -5, 875, 170);

        rentalTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        rentalTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentalTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(rentalTable1);

        basePanel.add(jScrollPane3);
        jScrollPane3.setBounds(10, 360, 875, 131);

        jLabel1.setBackground(new java.awt.Color(155, 209, 229));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Overdue Rentals ");
        basePanel.add(jLabel1);
        jLabel1.setBounds(10, 330, 886, 20);

        rentalTable.setModel(new javax.swing.table.DefaultTableModel(
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
        rentalTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentalTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(rentalTable);

        basePanel.add(jScrollPane2);
        jScrollPane2.setBounds(10, 180, 878, 133);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rentalTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentalTableMouseClicked
        if (rentalTable.getSelectedRowCount() == 1) {
            int state = Integer.parseInt(rentalTable.getValueAt(rentalTable.getSelectedRow(), 6).toString());
            if(state == 1){
                int id = Integer.parseInt(rentalTable.getValueAt(rentalTable.getSelectedRow(), 0).toString());
                String x = JOptionPane.showInputDialog(fromPanel, "Do you want to complete this rental, Type YES to confirm:");
                if (x.equals("YES") || x.equals("yes") ||  x.equals("Yes")) {
                    rentalcontroller.returnCar(id + "");
                    loadrentaltable();
                }
            }

        }
    }//GEN-LAST:event_rentalTableMouseClicked

    private void rentalTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentalTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rentalTable1MouseClicked

    private void addcarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcarButtonActionPerformed
        if(!validateData()){
            return;
        }
        addToTable();
    }//GEN-LAST:event_addcarButtonActionPerformed

    private void searchIcarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIcarButtonActionPerformed
        if(!validateData()){
            return;
        }
        searchCardetails();
    }//GEN-LAST:event_searchIcarButtonActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcarButton;
    private javax.swing.JPanel basePanel;
    private javax.swing.JTextField caridText;
    private javax.swing.JTextField customerIdText;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JLabel cutDataLabel;
    private javax.swing.JLabel discountLabel;
    private javax.swing.JLabel discountLabel1;
    private com.toedter.calendar.JDateChooser enddatepick;
    private javax.swing.JPanel fromPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JLabel qtyLabel1;
    private javax.swing.JTable rentalTable;
    private javax.swing.JTable rentalTable1;
    private javax.swing.JTextField rentalcostTxt;
    private javax.swing.JTextField rentaldueTxt;
    private javax.swing.JButton searchIcarButton;
    private com.toedter.calendar.JDateChooser startdatepick;
    // End of variables declaration//GEN-END:variables

    private void searchcustomerdetails() {
        try {
            String custId = customerIdText.getText();
            CustomerDTO cust = customercontroller.getCustomer(custId);
            if (cust != null) {
                cutDataLabel.setText(cust.getFirstname() + ", " + cust.getContactnumber());
            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void overDueTable( ArrayList<RentalDTO> rentaldtos){
        try {
            String[] collumns = {"Rental ID", "Car ID", "Customer ID", "Start Date", "End Date", "Rental Cost", "State"};
            DefaultTableModel dtm = new DefaultTableModel(collumns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            rentalTable1.setModel(dtm);
           Date today = new Date();

            for (RentalDTO rental : rentaldtos) {
                Object[] rowData = {rental.getRentalId(), rental.getCar().getCarid(), rental.getCustomer().getId(), rental.getRentalStartDate(), rental.getRentalEndDate(), rental.getRentalCost(), rental.getState()};
                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                
                Date date = sdf.parse(rental.getRentalEndDate());
                if (today.after(date) && rental.getState() == 1) {
                     dtm.addRow(rowData);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(PanelManageCar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void loadrentaltable() {
        try {
            String[] collumns = {"Rental ID", "Car ID", "Customer ID", "Start Date", "End Date", "Rental Cost", "State"};
            DefaultTableModel dtm = new DefaultTableModel(collumns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            rentalTable.setModel(dtm);
            ArrayList<RentalDTO> rentaldtos = rentalcontroller.getAllRentals();

            for (RentalDTO rental : rentaldtos) {
                Object[] rowData = {rental.getRentalId(), rental.getCar().getCarid(), rental.getCustomer().getId(), rental.getRentalStartDate(), rental.getRentalEndDate(), rental.getRentalCost(), rental.getState()};
                dtm.addRow(rowData);
            }
            
            overDueTable(rentaldtos);
        } catch (Exception ex) {
            Logger.getLogger(PanelManageCar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    private void searchCardetails() {
        try {
            String carId = caridText.getText();
            String customerId = customerIdText.getText();

            if (!rentalcontroller.isCarFree(carId)) {
                JOptionPane.showMessageDialog(fromPanel, "The car is not available");
                return;
            }
            if (!rentalcontroller.isCustomerFree(customerId)) {
                JOptionPane.showMessageDialog(fromPanel, "The customer is not available");
                return;
            }
            
             if (carcontroller.getcar(carId) == null) {
                JOptionPane.showMessageDialog(fromPanel, "The car id is invalid");
                return;
            }
            if (customercontroller.getCustomer(customerId) == null) {
                JOptionPane.showMessageDialog(fromPanel, "The customer id is invalid");
                return;
            }
            

            if(startdatepick.getDate() == null || enddatepick.getDate() == null){
                JOptionPane.showMessageDialog(fromPanel, "Fill The Dates");
                return;
            }
            
            Date startDate = startdatepick.getDate();
            Date endDate = enddatepick.getDate();

            long timeDifference = endDate.getTime() - startDate.getTime();
            int daysBetween = (int) TimeUnit.DAYS.convert(timeDifference, TimeUnit.MILLISECONDS);
            
            if(daysBetween > 30){
                JOptionPane.showMessageDialog(fromPanel, "You can choose maximum of 30 days");
                return;
            }
            
            CarDTO cardto = carcontroller.getcar(carId);
            double fee = cardto.getDailyrate() * daysBetween;

            rentalcostTxt.setText(fee + "");
            rentaldueTxt.setText(String.valueOf(daysBetween));

        } catch (CarService.Exceptions | CustomerService.CustomerServiceException | HeadlessException ex) {

           JOptionPane.showMessageDialog(fromPanel, "Invalid car or customer id");
           cleanData();
        }
    }

    private void addToTable() {

        try {
            CarDTO cardto = carcontroller.getcar(caridText.getText());
            CustomerDTO customerDTO = customercontroller.getCustomer(customerIdText.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            RentalDTO od = new RentalDTO(
                    0,
                    customerDTO,
                    cardto,
                    sdf.format(startdatepick.getDate()),
                    sdf.format(enddatepick.getDate()),
                    Double.parseDouble(rentalcostTxt.getText()),
                    1
            );

            String rst = rentalcontroller.rentCar(od);
            JOptionPane.showMessageDialog(this, rst);
            loadrentaltable();
            cleanData();
        } catch (CustomerService.CustomerServiceException | CarService.Exceptions ex) {
            Logger.getLogger(PanelRentalCar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void cleanData() {
        rentalcostTxt.setText("");
        customerIdText.setText("");
        /// startdatepick.setDate("");
        rentalcostTxt.setText("");
        rentaldueTxt.setText("");
    }

    private boolean validateData() {
        if(!Pattern.matches("^[0-9]{1,3}$", customerIdText.getText())){
            JOptionPane.showMessageDialog(fromPanel, "Invalid or Empty Customer ID");
            return false;
        }
        if(!Pattern.matches("^[0-9]{1,3}$", caridText.getText())){
            JOptionPane.showMessageDialog(fromPanel, "Invalid or Empty Car ID");
            return false;
        }
        return true;
    }

}

