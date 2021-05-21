/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allocateTime_modifySessions;

import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author hvdil
 */
public class addConsecutiveSession extends javax.swing.JPanel {

    Connection connectionabc;
    PreparedStatement pst;
    ResultSet rs;
    String finalTags = null;
    String sessID = null;
    ArrayList<ConsecutiveSession> Conseclist = new ArrayList<ConsecutiveSession>();
    /**
     * Creates new form addConsecutiveSession
     */
    public addConsecutiveSession() {
        initComponents();
        
        txt_id.setVisible(false);
        SubGroupSelection();
        txt_csSelectionId.setVisible(false);
        txt_csSelectedId.setVisible(false);
        txt_error_cs.setText("");
        showConsecutiveSessionNList();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_select = new javax.swing.JButton();
        txt_csSelectionId = new javax.swing.JTextField();
        txt_error_selection = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_cs = new javax.swing.JTable();
        btn_set = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_csSelected = new javax.swing.JTable();
        txt_csSelectedId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_error_cs = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        del = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        btn_remove = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_csSelection = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        selection_sId = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(100, 149, 237));
        setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(100, 149, 237));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SET CONSECUTIVE SESSION");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        btn_select.setBackground(new java.awt.Color(0, 102, 255));
        btn_select.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_select.setForeground(new java.awt.Color(255, 255, 255));
        btn_select.setText("Select");
        btn_select.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btn_select.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectActionPerformed(evt);
            }
        });

        txt_error_selection.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error_selection.setForeground(new java.awt.Color(255, 51, 51));
        txt_error_selection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tbl_cs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Group Id", "Consecutive Session", "Session ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_cs.setRowHeight(20);
        tbl_cs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_csMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_cs);

        btn_set.setBackground(new java.awt.Color(0, 102, 0));
        btn_set.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_set.setForeground(new java.awt.Color(255, 255, 255));
        btn_set.setText("Set");
        btn_set.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btn_set.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setActionPerformed(evt);
            }
        });

        tbl_csSelected.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Session ID", "Session", "Tag"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_csSelected.setRowHeight(20);
        tbl_csSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_csSelectedMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_csSelected);

        jPanel2.setBackground(new java.awt.Color(100, 149, 237));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONSECUTIVE SESSION DETAILS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        txt_error_cs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error_cs.setForeground(new java.awt.Color(255, 0, 51));
        txt_error_cs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_error_cs.setText("jLabel4");

        jPanel1.setBackground(new java.awt.Color(100, 149, 237));

        del.setBackground(new java.awt.Color(153, 0, 0));
        del.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        del.setForeground(new java.awt.Color(255, 255, 255));
        del.setText("Delete");
        del.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        btn_remove.setBackground(new java.awt.Color(153, 0, 0));
        btn_remove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_remove.setForeground(new java.awt.Color(255, 255, 255));
        btn_remove.setText("Remove");
        btn_remove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btn_remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        tbl_csSelection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Session ID", "Session", "Tag"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_csSelection.getTableHeader().setReorderingAllowed(false);
        tbl_csSelection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_csSelectionMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_csSelection);

        jPanel4.setBackground(new java.awt.Color(100, 149, 237));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Group ID");

        selection_sId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Find");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selection_sId, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(selection_sId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(txt_error_selection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(409, 409, 409))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3)
                .addGap(138, 138, 138))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txt_error_cs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_remove, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_select, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_set, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_csSelectedId, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txt_csSelectionId, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(376, 376, 376)))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_csSelectedId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_csSelectionId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_select, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_set, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_error_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 209, Short.MAX_VALUE)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(txt_error_cs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectActionPerformed
        if (txt_csSelectionId.getText().equals("")){

            txt_error_selection.setText("Select First*");
        }
        else{
            txt_error_selection.setText("");
            String selected_id = txt_csSelectionId.getText();
            showSelectedSessionNList(selected_id);
        }
        txt_csSelectionId.setText("");
    }//GEN-LAST:event_btn_selectActionPerformed

    private void tbl_csMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_csMouseClicked
       int i = tbl_cs.getSelectedRow();
        TableModel model = tbl_cs.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tbl_csMouseClicked

    private void btn_setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setActionPerformed

        try{
            DefaultTableModel model = (DefaultTableModel)tbl_csSelected.getModel();
            DefaultTableModel model2 = (DefaultTableModel)tbl_cs.getModel();
            connection = DBconnection.getConnection();
            if (tbl_csSelected.getRowCount() == 0){

                txt_error_selection.setText("Select Sessions First*");
            }
            else{
                txt_error_selection.setText("");

                TagCreator();

                String sessionList[] = sessID.split(",");
                boolean lock = false;
                Conseclist = getConsecutiveSessionNList();

                for(int x=0;x<sessionList.length;x++){

                    for(int i =0;i<Conseclist.size();i++){
                        String sessionList2[] = Conseclist.get(i).getSessionID().split(",");

                        for(int a=0;a<sessionList2.length;a++){
                            if(sessionList[x].equals(sessionList2[a])){
                                lock = true;
                            }
                        }
                    }
                }
                if(lock){
                    txt_error_selection.setText("This Sessions Already Exist");
                }
                else{
                    PreparedStatement statement = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_SP2_CONSECUTIVE_SESSION_TABLE));
                    System.out.println(sessID);
                    statement.setString(1, selection_sId.getSelectedItem().toString());
                    statement.setString(2, finalTags);
                    statement.setString(3, sessID);

                    statement.executeUpdate();
                    model.setRowCount(0);
                    model2.setRowCount(0);
                    showConsecutiveSessionNList();
                    txt_id.setText("");
                    JOptionPane.showMessageDialog(null, "Inserting Successful!");
                }
            }
        }catch(Exception e)
        {
            Logger.getLogger(addNonOverlapping.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_setActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel)tbl_csSelection.getModel();
        model.setRowCount(0);
        String sGid = selection_sId.getSelectedItem().toString();
        showSessionNList(sGid);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_csSelectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_csSelectedMouseClicked
        int i = tbl_csSelected.getSelectedRow();
        TableModel model = tbl_csSelection.getModel();
        //txt_id.setText(model.getValueAt(i, 0).toString());
        txt_id.setText(String.valueOf(i));
        txt_csSelectedId.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tbl_csSelectedMouseClicked

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed

        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_cs.getModel();
            Statement smt = connection.createStatement();

            if (txt_id.getText().equals("")){

                txt_error_cs.setText("Select First*");
            }
            else{
                txt_error_cs.setText("");

                String id = txt_id.getText();

                smt.execute("DELETE FROM sp2_consecutive_session WHERE id = "+id);
                model.setRowCount(0);
                showConsecutiveSessionNList();
                txt_id.setText("");
                JOptionPane.showMessageDialog(this, "Deleted");

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_delActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
         if (txt_id.getText().equals("")){

            txt_error_selection.setText("Select First*");
        }
        else{
            txt_error_selection.setText("");
            DefaultTableModel model = (DefaultTableModel) tbl_csSelected.getModel();
            model.removeRow(Integer.parseInt(txt_id.getText()));
        }
        txt_id.setText("");
    }//GEN-LAST:event_btn_removeActionPerformed

    private void tbl_csSelectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_csSelectionMouseClicked
        // TODO add your handling code here:
        int i = tbl_csSelection.getSelectedRow();
        TableModel model = tbl_csSelection.getModel();
        txt_csSelectionId.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tbl_csSelectionMouseClicked

    public ArrayList<sessionDetails> getSessionNList(String sGid)
    {
        ArrayList<sessionDetails> list = new ArrayList<sessionDetails>();
        try{
        connection = DBconnection.getConnection();
        String querry = "select * from session where group_id = '"+sGid+"'";
        Statement st;
        ResultSet rs;
        
        st = connection.createStatement();
        rs= st.executeQuery(querry);
        sessionDetails sDetails;
        while(rs.next())
        {
            sDetails = new sessionDetails(rs.getInt("id"), rs.getString("subject"), rs.getString("tag"), rs.getString("group_id"));
            list.add(sDetails);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showSessionNList(String sGid)
    {
        try {
            ArrayList<sessionDetails> list = getSessionNList(sGid);
        DefaultTableModel model = (DefaultTableModel)tbl_csSelection.getModel();
        Object[] row = new Object[3];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getSession();
            row[2] = list.get(i).gettag();
            
            model.addRow(row);
        }
        } catch (Exception e) {
            Logger.getLogger(addConsecutiveSession.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
    public ArrayList<sessionDetails> getselectedSessionNList(String id)
    {
        ArrayList<sessionDetails> list = new ArrayList<sessionDetails>();
        try{
        connection = DBconnection.getConnection();
        String querry = "select * from session where id = '"+id+"'";
        Statement st;
        ResultSet rs;
        
        st = connection.createStatement();
        rs= st.executeQuery(querry);
        sessionDetails sDetails;
        while(rs.next())
        {
            sDetails = new sessionDetails(rs.getInt("id"), rs.getString("subject"), rs.getString("tag"), rs.getString("subgroup_id"));
            list.add(sDetails);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showSelectedSessionNList(String id)
    {
        ArrayList<sessionDetails> list = getselectedSessionNList(id);
        DefaultTableModel model = (DefaultTableModel)tbl_csSelected.getModel();
        Object[] row = new Object[3];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getSession();
            row[2] = list.get(i).gettag();
            
            model.addRow(row);
        }
    }
    
    public ArrayList<ConsecutiveSession> getConsecutiveSessionNList()
    {
        ArrayList<ConsecutiveSession> list = new ArrayList<>();
        try{
        connection = DBconnection.getConnection();
        String querry = "select * from sp2_consecutive_session";
        Statement st;
        ResultSet rs;
        
        st = connection.createStatement();
        rs= st.executeQuery(querry);
        ConsecutiveSession ConsecutiveSession;
        while(rs.next())
        {
            ConsecutiveSession = new ConsecutiveSession(rs.getInt("id"), rs.getString("sGid"), rs.getString("cSession"), rs.getString("sessionID"));
            list.add(ConsecutiveSession);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showConsecutiveSessionNList()
    {
        ArrayList<ConsecutiveSession> list = getConsecutiveSessionNList();
        DefaultTableModel model = (DefaultTableModel)tbl_cs.getModel();
        Object[] row = new Object[4];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getSgid();
            row[2] = list.get(i).gettag();
            row[3] = list.get(i).getSessionID();
            
            model.addRow(row);
        }
    }
    
    public  void SubGroupSelection(){
        try{  
        connection = DBconnection.getConnection();
        String query = "select * from session group by group_id";
        pst = connection.prepareStatement(query);
        rs = pst.executeQuery();
        
        while(rs.next())
        {
            String Gid = rs.getString("group_id");
            if(Gid != null){
                selection_sId.addItem(Gid);
//                System.out.println(Gid);
            }
        }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public void TagCreator(){
        DefaultTableModel model = (DefaultTableModel)tbl_csSelected.getModel();
        int x = tbl_csSelected.getRowCount();
        String[] tags = new String[x];
        String[] newtags = new String[x];
        
                                
        newtags[0] = model.getValueAt(0, 2).toString()+','+model.getValueAt(0, 1).toString();
        sessID = model.getValueAt(0, 0).toString();
        int i = 1;
        while (x!=i){

            tags[i] = model.getValueAt(i, 2).toString()+','+model.getValueAt(i, 1).toString();
            newtags[i] = '('+newtags[i-1]+')'+','+'('+tags[i]+')';
            finalTags = newtags[i];
            sessID = sessID.concat(","+model.getValueAt(i, 0));
            i++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_select;
    private javax.swing.JButton btn_set;
    private javax.swing.JButton del;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> selection_sId;
    private javax.swing.JTable tbl_cs;
    private javax.swing.JTable tbl_csSelected;
    private javax.swing.JTable tbl_csSelection;
    private javax.swing.JTextField txt_csSelectedId;
    private javax.swing.JTextField txt_csSelectionId;
    private javax.swing.JLabel txt_error_cs;
    private javax.swing.JLabel txt_error_selection;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
