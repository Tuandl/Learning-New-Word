/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningnewword;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TUANDASE62310
 */
public class WordsList extends javax.swing.JFrame {

    private static DefaultTableModel tableModel;
    private JFileChooser fchooser = new JFileChooser();

    public WordsList() {
        initComponents();
        tableModel = (DefaultTableModel) tbWordList.getModel();
    }

    public static void addWord(Word newWord) {
        Vector tmp = new Vector();
        tmp.add(newWord.getJa());
        tmp.add(newWord.getEng());
        tmp.add(newWord.getVi());
        tableModel.addRow(tmp);
    }

    public static ArrayList<Word> getData() {
        ArrayList<Word> res = new ArrayList();
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            res.add(new Word((String) tableModel.getValueAt(i, 0),
                    (String) tableModel.getValueAt(i, 1),
                    (String) tableModel.getValueAt(i, 2)));
        }
        return res;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbWordList = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        bnNew = new javax.swing.JButton();
        bnAdd = new javax.swing.JButton();
        bnRemove = new javax.swing.JButton();
        bnSave = new javax.swing.JButton();
        bnTest = new javax.swing.JButton();
        bnLoad = new javax.swing.JButton();
        bnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Words List");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("WORDS LIST");

        tbWordList.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        tbWordList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Japanese", "English", "Vietnamese"
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
        jScrollPane1.setViewportView(tbWordList);

        bnNew.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bnNew.setText("New");
        bnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnNewActionPerformed(evt);
            }
        });

        bnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bnAdd.setText("Add");
        bnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAddActionPerformed(evt);
            }
        });

        bnRemove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bnRemove.setText("Remove");
        bnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnRemoveActionPerformed(evt);
            }
        });

        bnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bnSave.setText("Save");
        bnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSaveActionPerformed(evt);
            }
        });

        bnTest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bnTest.setText("Test");
        bnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnTestActionPerformed(evt);
            }
        });

        bnLoad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bnLoad.setText("Load");
        bnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnLoadActionPerformed(evt);
            }
        });

        bnExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bnExit.setText("Exit");
        bnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnTest, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bnAdd, bnExit, bnLoad, bnNew, bnRemove, bnSave, bnTest});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bnNew)
                    .addComponent(bnAdd)
                    .addComponent(bnRemove)
                    .addComponent(bnSave)
                    .addComponent(bnTest)
                    .addComponent(bnLoad)
                    .addComponent(bnExit))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bnAdd, bnExit, bnLoad, bnNew, bnRemove, bnSave, bnTest});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bnExitActionPerformed

    private void bnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAddActionPerformed
        new AddNewWord().setVisible(true);
    }//GEN-LAST:event_bnAddActionPerformed

    private void bnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnRemoveActionPerformed
        try {
            tableModel.removeRow(tbWordList.getSelectedRow());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_bnRemoveActionPerformed

    private void bnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnTestActionPerformed
        ArrayList<Word> words = new ArrayList<>();
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            words.add(new Word((String) tableModel.getValueAt(i, 0),
                    (String) tableModel.getValueAt(i, 1),
                    (String) tableModel.getValueAt(i, 2)));
        }
        new Test(words).setVisible(true);
    }//GEN-LAST:event_bnTestActionPerformed

    private void bnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnLoadActionPerformed
        fchooser = new JFileChooser();
        fchooser.showOpenDialog(this);
        File openFile = fchooser.getSelectedFile();
        if (openFile == null) {
            return;
        }
        try {
            FileReader fr = new FileReader(openFile);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                StringTokenizer tmp = new StringTokenizer(br.readLine(), "@");
                Word word = new Word(tmp.nextToken(), tmp.nextToken(),
                        tmp.nextToken());
                WordsList.addWord(word);
            }
            JOptionPane.showMessageDialog(this, "Loading Complete!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bnLoadActionPerformed

    private void bnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSaveActionPerformed
        fchooser = new JFileChooser();
        fchooser.showSaveDialog(this);
        File saveFile = fchooser.getSelectedFile();
        if (saveFile == null) {
            return;
        }
        try {
//            FileWriter fr = new FileWriter(saveFile);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(saveFile), "UTF-8"));
            Vector<Vector<String>> data = tableModel.getDataVector();
            for (int i = 0; i < data.size(); i++) {
                for (int j = 0; j < data.elementAt(i).size(); j++) {
//                    fr.write(data.elementAt(i).elementAt(j) + "@");
                    out.write(data.elementAt(i).elementAt(j) + "@");
                }
//                fr.write("\n");
                out.write("\n");
            }
            out.close();
            JOptionPane.showMessageDialog(this, "Saving Complete!");
//            fr.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bnSaveActionPerformed

    private void bnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnNewActionPerformed
        tableModel.setNumRows(0);
    }//GEN-LAST:event_bnNewActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WordsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WordsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WordsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WordsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WordsList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnAdd;
    private javax.swing.JButton bnExit;
    private javax.swing.JButton bnLoad;
    private javax.swing.JButton bnNew;
    private javax.swing.JButton bnRemove;
    private javax.swing.JButton bnSave;
    private javax.swing.JButton bnTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbWordList;
    // End of variables declaration//GEN-END:variables
}
