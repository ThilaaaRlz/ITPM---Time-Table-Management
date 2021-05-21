/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.student_details;
import com.spm.timetablemanagement.models.YnS;
import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import static com.spm.timetablemanagement.util.DBconnection.getConnection;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hvdil
 */
public class enterYnS extends javax.swing.JPanel {

    private Connection connection;
    private int yNsId;
    PreparedStatement pstabcYns;
    ResultSet rs;
    /**
     * Creates new form enterYnS
     */
    public enterYnS() {
        
        initComponents();
        txt_id.setVisible(false);
        showYnSList();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_YnS = new javax.swing.JTextField();
        txt_error = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_yNs = new javax.swing.JTable();
        txt_id = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_addYnS = new javax.swing.JButton();
        btn_updateYnS = new javax.swing.JButton();
        btn_deleteYnS = new javax.swing.JButton();

        setBackground(new java.awt.Color(100, 149, 237));
        setToolTipText("");

        jPanel4.setBackground(new java.awt.Color(100, 149, 237));
        jPanel4.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(100, 149, 237));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Academic Year & Semester");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        txt_YnS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_YnS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_YnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_YnSActionPerformed(evt);
            }
        });

        txt_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 51, 51));
        txt_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_YnS, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_YnS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        tbl_yNs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_yNs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Academic Year & Semester"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_yNs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_yNsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_yNs);
        if (tbl_yNs.getColumnModel().getColumnCount() > 0) {
            tbl_yNs.getColumnModel().getColumn(0).setResizable(false);
            tbl_yNs.getColumnModel().getColumn(1).setResizable(false);
        }

        txt_id.setText("ID");
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(100, 149, 237));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        btn_addYnS.setBackground(new java.awt.Color(0, 102, 255));
        btn_addYnS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_addYnS.setForeground(new java.awt.Color(255, 255, 255));
        btn_addYnS.setText("Insert");
        btn_addYnS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btn_addYnS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addYnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addYnSActionPerformed(evt);
            }
        });
        jPanel3.add(btn_addYnS);

        btn_updateYnS.setBackground(new java.awt.Color(0, 102, 255));
        btn_updateYnS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_updateYnS.setForeground(new java.awt.Color(255, 255, 255));
        btn_updateYnS.setText("Update");
        btn_updateYnS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btn_updateYnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateYnSActionPerformed(evt);
            }
        });
        jPanel3.add(btn_updateYnS);

        btn_deleteYnS.setBackground(new java.awt.Color(153, 0, 0));
        btn_deleteYnS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_deleteYnS.setForeground(new java.awt.Color(255, 255, 255));
        btn_deleteYnS.setText("Delete");
        btn_deleteYnS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btn_deleteYnS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deleteYnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteYnSActionPerformed(evt);
            }
        });
        jPanel3.add(btn_deleteYnS);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(68, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(321, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(289, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_YnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_YnSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_YnSActionPerformed

    private void btn_addYnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addYnSActionPerformed
        // TODO add your handling code here:
        
        try{
            DefaultTableModel model = (DefaultTableModel)tbl_yNs.getModel();
            connection = DBconnection.getConnection(); 
            
            if(txt_YnS.getText().equals("")){
                txt_error.setText("Enter Academic Year & Semester*");
            }
            else{
                txt_error.setText("");
              
            PreparedStatement statement = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_YEAR_AND_SEMESTER_TABLE));
            statement.setString(1, txt_YnS.getText().toUpperCase());
            statement.executeUpdate();
            model.setRowCount(0);
            showYnSList();
            txt_YnS.setText("");
            JOptionPane.showMessageDialog(null, "Inserting Successful!");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_addYnSActionPerformed

    private void tbl_yNsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_yNsMouseClicked
        // TODO add your handling code here:

       int i = tbl_yNs.getSelectedRow();
        TableModel model = tbl_yNs.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
        txt_YnS.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_tbl_yNsMouseClicked

    private void btn_deleteYnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteYnSActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();
        int whileWorking = 0;
               

        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_yNs.getModel();
            Statement smt = connection.createStatement();
            
            if(txt_YnS.getText().equals("")){
                txt_error.setText("Select Academic Year & Semester*");
            }
            else{
                txt_error.setText("");
             
            
            String getYnsQuery = "select yNsId from generated_group_id WHERE yNsId = '"+id+"'";
            pstYns = connection.prepareStatement(getYnsQuery);
            rs = pstYns.executeQuery();
            while(rs.next())
            {    

                    int x = JOptionPane.showConfirmDialog(this,"You have this related data,is it ok?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (x == 0){
                        ResultSet rs = smt.executeQuery("select id from generated_group_id where yNsId = "+id);
                        String id_G="";
                        while(rs.next()){
                            id_G = rs.getString(1);
                            System.out.println(id_G);
                        }
                        smt.execute("DELETE FROM generated_sub_group_id WHERE gId = '"+id_G+"'");
                        smt.execute("DELETE FROM generated_group_id WHERE yNsId = "+id); 
                        smt.execute("DELETE FROM academic_year_and_semester WHERE id = "+id);
                        smt.execute("DELETE FROM all_details WHERE yNs = '"+txt_YnS.getText().toString()+"'");
                        
                        JOptionPane.showMessageDialog(this, "Record Deleted!");

                        
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Delete Canceled!");
                        
                    }
                    whileWorking++;
                
            }
            if(whileWorking == 0){
                smt.execute("DELETE FROM academic_year_and_semester WHERE id = "+id);
                JOptionPane.showMessageDialog(this, "Record Deleted!");

            }
            model.setRowCount(0);
            showYnSList();
            txt_YnS.setText("");

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_deleteYnSActionPerformed

    private void btn_updateYnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateYnSActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();

        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_yNs.getModel();
            Statement smt = connection.createStatement();
            
            if(txt_YnS.getText().equals("")){
                txt_error.setText("Select Academic Year & Semester*");
            }
            else{
                txt_error.setText("");
            
            smt.execute("UPDATE academic_year_and_semester SET yNs = '"+txt_YnS.getText().toUpperCase()+"' WHERE id = "+id); 
            model.setRowCount(0);
            showYnSList();
            txt_YnS.setText("");
            JOptionPane.showMessageDialog(this, "Record Updated!");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_updateYnSActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    
    public ArrayList<YnS> getYnSList()
    {
        ArrayList<YnS> list = new ArrayList<YnS>();
        try{
        connection = DBconnection.getConnection();
        String querry = "select * from academic_year_and_semester";
        Statement st;
        ResultSet rs;
        
        st = connection.createStatement();
        rs= st.executeQuery(querry);
        YnS yns;
        while(rs.next())
        {
            yns = new YnS(rs.getInt("id"), rs.getString("yNs"));
            list.add(yns);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showYnSList()
    {
        ArrayList<YnS> list = getYnSList();
        DefaultTableModel model = (DefaultTableModel)tbl_yNs.getModel();
        Object[] row = new Object[2];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getYnS();
            
            model.addRow(row);
        }
    }
    public void refreshTable()
    {
        try{
            connection = DBconnection.getConnection();
            String querry = "select * from academic_year_and_semester";
            Statement st;
            ResultSet rs;
            
            st = connection.createStatement();
            rs= st.executeQuery(querry);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addYnS;
    private javax.swing.JButton btn_deleteYnS;
    private javax.swing.JButton btn_updateYnS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_yNs;
    private javax.swing.JTextField txt_YnS;
    private javax.swing.JLabel txt_error;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables

    private void executeSQlQuery(String query,String message) {
        
         try{
        connection = DBconnection.getConnection();
        Statement st;
        
        st = connection.createStatement();
        if ((st.executeUpdate(query)) == 1)
        {
            JOptionPane.showMessageDialog(null, "Data "+message+" Successful");
            
        }else{
            JOptionPane.showMessageDialog(null, "Data Not "+message);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } 
    }
}
