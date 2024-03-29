/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poly.edu.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poly.edu.model.Users;
import poly.edu.repo.BooksRepo;
import poly.edu.service.BookService;

/**
 *
 * @author user
 */
public class View_Books extends javax.swing.JFrame {

    static Users user = null;

    String[] cbItems = {"Book Id", "Title", "Publisher", "Author Name"};
    DefaultTableModel tbModel = new DefaultTableModel(new String[]{"Book ID", "Title", "Publisher", "Author", "Note"}, 0);

    int id = -1;
    BookService ser;
    ArrayList<BooksRepo> list;

    /**
     * Creates new form View_Books
     */
    public View_Books(Users u) {
        if (u == null) {
            int o = JOptionPane.showConfirmDialog(this, "Bạn chưa đăng nhập. Mở cửa sổ đăng nhập không?");
            if (o == 0) {
                new View_Login().setVisible(true);
                dispose();
            } else {
                dispose();
                System.exit(0);
            }
        } else {
            initComponents();
            user = u;
            lbHello.setText("Wellcome " + u.getUserName());
            System.out.println("đăng nhập thành công");

            this.setTitle("Home");
            setAlwaysOnTop(true);
            setLocationRelativeTo(null);

            ser = new BookService();
            list = ser.getListRepo(u);

            tblListBook.setModel(tbModel);
            cboSearchBy.removeAllItems();

            for (String cb : cbItems) {
                cboSearchBy.addItem(cb);
            }
            fillToTable();

        }
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
        cboSearchBy = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtKeyword = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListBook = new javax.swing.JTable();
        btnOpenViewAddNewBook = new javax.swing.JButton();
        lbHello = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search by:");

        cboSearchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSearchBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSearchByActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter keyword:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblListBook.setModel(new javax.swing.table.DefaultTableModel(
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
        tblListBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListBook);

        btnOpenViewAddNewBook.setText("Add New");
        btnOpenViewAddNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenViewAddNewBookActionPerformed(evt);
            }
        });

        lbHello.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnSearch)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnOpenViewAddNewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbHello, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpenViewAddNewBook)
                    .addComponent(lbHello))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboSearchByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSearchByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSearchByActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        list = ser.findArray(txtKeyword.getText(), clName(cboSearchBy.getSelectedIndex()), user);
        fillToTable();
        if (list.size() <= 0) {
            JOptionPane.showMessageDialog(this, "Không có bản ghi nào thỏa mãn");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnOpenViewAddNewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenViewAddNewBookActionPerformed
        // TODO add your handling code here:
        new View_AddNewBook(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOpenViewAddNewBookActionPerformed

    private void tblListBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListBookMouseClicked
        // TODO add your handling code here:
        id = tblListBook.getSelectedRow();
        new View_BookDetail(user, list.get(id)).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tblListBookMouseClicked

    public String clName(int i) {
        switch (i) {
            case 0:
                return "book_id";
            case 1:
                return "title";
            case 2:
                return "pub_name";
            case 3:
                return "au_name";
            default:
                return "xxx";
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
            java.util.logging.Logger.getLogger(View_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Books(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpenViewAddNewBook;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cboSearchBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbHello;
    private javax.swing.JTable tblListBook;
    private javax.swing.JTextField txtKeyword;
    // End of variables declaration//GEN-END:variables

    private void fillToTable() {
        tbModel.setRowCount(0);
        if (list.size() <= 0) {
            return;
        }
        for (BooksRepo b : list) {
            tbModel.addRow(new String[]{b.getBookID(), b.getTitle(), b.getPub_name(), b.getAu_name(), b.getNotes()});
        }

    }

    private void showDetail() {
        if (id < 0) {
            return;
        }
    }
}
