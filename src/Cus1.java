/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Dimmy
 */
public class Cus1 extends javax.swing.JFrame {

    /**
     * Creates new form Cus1
     */
    public Cus1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Customer");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("New Customer");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 20, 130, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CustomerID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 85, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CustomerName");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 150, 108, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("PhoneNo");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 200, 64, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 250, 36, 17);
        jPanel1.add(tf1);
        tf1.setBounds(300, 90, 130, 30);
        jPanel1.add(tf2);
        tf2.setBounds(300, 140, 130, 30);
        jPanel1.add(tf3);
        tf3.setBounds(300, 190, 130, 30);
        jPanel1.add(tf4);
        tf4.setBounds(300, 240, 130, 30);

        jButton1.setText("Add Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(300, 310, 111, 32);

        jButton2.setText("Home Page");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 310, 95, 32);

        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(390, 20, 55, 32);

        jButton4.setText("Customer Page");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(10, 20, 118, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String CustomerID=tf1.getText();
        String CustomerName=tf2.getText();
        String PhoneNo=tf3.getText();
        String Email=tf4.getText();
        
        if(CustomerID.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"CustomerID is not Entered");
        }
        else if(CustomerName.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Customer Name is not Entered");
        }
        else if(PhoneNo.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Phone Number is not Entered");
        }
        else if(Email.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Email is not Entered");
        }
        else
        {
            try
            {
              Class.forName("java.sql.DriverManager");
              Connection con=(Connection)
              DriverManager.getConnection("jdbc:mysql://localhost:3306/smart","root","");
            Statement stmt=(Statement) con.createStatement();
            String qurey="insert into customer values('"+CustomerID+"',"
                    + "'"+CustomerName+"','"+PhoneNo+"','"+Email+"')";
            stmt.executeUpdate(qurey);
            {
                JOptionPane.showMessageDialog(this, "Succes");
            }          
            }
            catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        home h=new home();
        dispose();
        h.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Customer c=new Customer();
        dispose();
        c.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Cus1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cus1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cus1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cus1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cus1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    // End of variables declaration//GEN-END:variables
}