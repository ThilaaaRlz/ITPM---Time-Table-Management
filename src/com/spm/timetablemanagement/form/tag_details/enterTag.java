/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.tag_details;

import com.spm.timetablemanagement.models.tag;
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
 * @author RPsandeepa
 */
public class enterTag extends javax.swing.JPanel {

    Connection connectionabc;
    PreparedStatement statement;

    /**
     * Creates new form NewJPanel
     */
    public enterTag() {
        initComponents();
        showTagList();
        txt_id.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tag = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_addTag = new javax.swing.JButton();
        btn_editTag = new javax.swing.JButton();
        btn_deleteTag = new javax.swing.JButton();
        txt_relatedTag = new javax.swing.JComboBox<>();
        tet_tagCode = new javax.swing.JTextField();
        txt_tag = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_error = new javax.swing.JLabel();

        setBackground(new java.awt.Color(100, 149, 237));

        tbl_tag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_tag.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tag Name", "Tag Code", "Related Tag"
            }
        ));
        tbl_tag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_tag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tagMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_tag);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MANAGE TAGS");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_id.setText("ID");

        jPanel1.setBackground(new java.awt.Color(100, 149, 237));

        btn_addTag.setBackground(new java.awt.Color(0, 102, 0));
        btn_addTag.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_addTag.setForeground(java.awt.Color.white);
        btn_addTag.setText("Insert");
        btn_addTag.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btn_addTag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTagActionPerformed(evt);
            }
        });

        btn_editTag.setBackground(new java.awt.Color(0, 102, 255));
        btn_editTag.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_editTag.setForeground(java.awt.Color.white);
        btn_editTag.setText("Update");
        btn_editTag.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btn_editTag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editTagActionPerformed(evt);
            }
        });

        btn_deleteTag.setBackground(new java.awt.Color(153, 0, 0));
        btn_deleteTag.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_deleteTag.setForeground(java.awt.Color.white);
        btn_deleteTag.setText("Delete");
        btn_deleteTag.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btn_deleteTag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deleteTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteTagActionPerformed(evt);
            }
        });

        txt_relatedTag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Lecture", "Practicle", "Tutorial", "Evaluation" }));

        txt_tag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_tag.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_tag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_tagMouseClicked(evt);
            }
        });
        txt_tag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tagActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tag Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tag Code");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Related Tag");

        txt_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 51, 51));
        txt_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tag)
                    .addComponent(tet_tagCode)
                    .addComponent(txt_relatedTag, 0, 206, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_addTag, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editTag, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deleteTag, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_tag)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tet_tagCode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_relatedTag, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addTag, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editTag, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deleteTag, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addGap(51, 51, 51)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addTagActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) tbl_tag.getModel();
            connection = DBconnection.getConnection();

            if (txt_tag.getText().equals("") && tet_tagCode.getText().equals("") && txt_relatedTag.getSelectedItem().equals("Select")) {
                txt_error.setText("Enter All Details*");
            } else {

                txt_error.setText("");

                statement = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_TAG_TABLE));
                statement.setString(1, txt_tag.getText());
                statement.setString(2, tet_tagCode.getText());
                statement.setString(3, txt_relatedTag.getSelectedItem().toString());

                statement.executeUpdate();
                model.setRowCount(0);
                showTagList();
                txt_tag.setText("");
                tet_tagCode.setText("");
                txt_relatedTag.setSelectedItem("Select");
                JOptionPane.showMessageDialog(null, "inserting successful");

            }
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(enterTag.class.getName()).log(Level.SEVERE, null, e);
        }

    }//GEN-LAST:event_btn_addTagActionPerformed

    private void btn_editTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editTagActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();

        try {
            DefaultTableModel model = (DefaultTableModel) tbl_tag.getModel();
            Statement smt = connection.createStatement();

            if (txt_tag.getText().equals("")) {
                txt_error.setText("Select Tag*");
            } else {

                txt_error.setText("");

//                smt.execute("UPDATE tag SET tag = '" + txt_tag.getText() + "', '"+tet_tagCode.getText()+"', '"+txt_relatedTag.getText()+"' WHERE id = '"+id+"'");
                smt.execute("UPDATE tag SET tag = '"+ txt_tag.getText() +"', tagCode = '"+tet_tagCode.getText()+"', relatedTag = '"+txt_relatedTag.getSelectedItem()+"' WHERE id = '"+id+"' ");
                model.setRowCount(0);
                showTagList();
                txt_tag.setText("");
                tet_tagCode.setText("");
                txt_relatedTag.setSelectedItem("Select");
                JOptionPane.showMessageDialog(this, "Updated");

            }
        } catch (Exception e) {
            Logger.getLogger(enterTag.class.getName()).log(Level.SEVERE, null, e);
        }
        //txt_tag.setText("Lecture/Practical/Tutorial");
    }//GEN-LAST:event_btn_editTagActionPerformed

    private void btn_deleteTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteTagActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();

        try {
            DefaultTableModel model = (DefaultTableModel) tbl_tag.getModel();
            Statement smt = connection.createStatement();

            if (txt_tag.getText().equals("")) {
                txt_error.setText("Select Tag*");
            } else {
                txt_error.setText("");

                smt.execute("DELETE FROM tag WHERE id = " + id);
                model.setRowCount(0);
                showTagList();
                txt_tag.setText("");
                tet_tagCode.setText("");
                txt_relatedTag.setSelectedItem("Select");
                JOptionPane.showMessageDialog(this, "Deleted");
            }
        } catch (Exception e) {
            Logger.getLogger(enterTag.class.getName()).log(Level.SEVERE, null, e);
        }
        //txt_tag.setText("Lecture/Practical/Tutorial");
    }//GEN-LAST:event_btn_deleteTagActionPerformed

    private void tbl_tagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tagMouseClicked
        // TODO add your handling code here:
        int i = tbl_tag.getSelectedRow();
        TableModel model = tbl_tag.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
        txt_tag.setText(model.getValueAt(i, 1).toString());
        tet_tagCode.setText(model.getValueAt(i, 2).toString());
        txt_relatedTag.setSelectedItem(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_tbl_tagMouseClicked

    private void txt_tagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tagActionPerformed
        txt_tag.setText("");
    }//GEN-LAST:event_txt_tagActionPerformed

    private void txt_tagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tagMouseClicked
        
    }//GEN-LAST:event_txt_tagMouseClicked

    public ArrayList<tag> getTagList() {
        ArrayList<tag> list = new ArrayList<tag>();
        try {
            connection = DBconnection.getConnection();
            String querry = "select * from tag";
            Statement st;
            ResultSet rs;

            st = connection.createStatement();
            rs = st.executeQuery(querry);
            tag Tag;
            while (rs.next()) {
                Tag = new tag(rs.getInt("id"), rs.getString("tag"), rs.getString("tagCode"), rs.getString("relatedTag"));
                list.add(Tag);
            }

        } catch (Exception e) {
            Logger.getLogger(enterTag.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public void showTagList() {
        ArrayList<tag> list = getTagList();
        DefaultTableModel model = (DefaultTableModel) tbl_tag.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getTag();
            row[2] = list.get(i).getTagCode();
            row[3] = list.get(i).getRelatedTag();

            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addTag;
    private javax.swing.JButton btn_deleteTag;
    private javax.swing.JButton btn_editTag;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_tag;
    private javax.swing.JTextField tet_tagCode;
    private javax.swing.JLabel txt_error;
    private javax.swing.JTextField txt_id;
    private javax.swing.JComboBox<String> txt_relatedTag;
    private javax.swing.JTextField txt_tag;
    // End of variables declaration//GEN-END:variables
}
