
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dimmy
 */
public class Discount extends javax.swing.JFrame {

    /**
     * Creates new form Discount
     */
    public Discount() {
        initComponents();
    }

 public Discount(String amt){
     initComponents();
     jTextField1.setText(amt);
 }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mode of Payment");
        setName("Discount"); // NOI18N

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Payment-PNG-Transparent-Picture.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 70, 410, 250);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("MODE OF PAYMENT ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 10, 270, 50);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Cash");
        jRadioButton1.setToolTipText("No Discount Available");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(10, 90, 61, 28);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Card");
        jRadioButton2.setToolTipText("Discount @  5%");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(10, 150, 59, 28);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Cheque");
        jRadioButton3.setToolTipText("Discount @ 5.5%");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(10, 210, 75, 28);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Online Payment");
        jRadioButton4.setToolTipText("Discount @ 2.5%");
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(10, 270, 140, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Price");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(650, 110, 41, 17);

        jTextField1.setEditable(false);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(620, 140, 90, 24);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Discount ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(550, 280, 64, 17);

        jTextField2.setEditable(false);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(620, 270, 90, 24);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Total");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(560, 350, 41, 20);

        jTextField3.setEditable(false);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(620, 350, 90, 24);

        jButton1.setText("Discount");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 360, 90, 30);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(640, 30, 60, 32);

        jButton3.setText("Products");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(40, 360, 82, 32);

        jButton4.setText("Home Page");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(30, 30, 100, 32);

        jButton5.setText("Pay");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(390, 360, 100, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double cost,dis=0,total=0;
        cost=Double.parseDouble(jTextField1.getText());
        if(jRadioButton1.isSelected())
        {
            dis=0;
            jTextField2.setText(""+dis);
            jTextField3.setText(""+cost);
        }
        else if(jRadioButton2.isSelected())
        {
            dis=cost*5/100;
            jTextField2.setText(""+dis);
            total=cost-dis;
            jTextField3.setText(""+total);
        }
        else if(jRadioButton3.isSelected())
        {
            dis=cost*5.5/100;
            jTextField2.setText(""+dis);
            total=cost-dis;
            jTextField3.setText(""+total);
        }
        else if(jRadioButton4.isSelected())
        {
            dis=cost*2.5/100;
            jTextField2.setText(""+dis);
            total=cost-dis;
            jTextField3.setText(""+total);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Select Mode of Payment");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        home h=new home();
        dispose();
        h.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Pro1 p=new Pro1();
        dispose();
        p.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        double total=Double.parseDouble(jTextField3.getText());
        int ans=JOptionPane.showConfirmDialog(this, "Do you want to pay "+total);
        if (ans==JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(this,"Thank You for shopping with SMART PARDISE. "
                    + "Your Purchase of RS."+total+ " is comfirmed");
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"SMART PARDISE is making imporvements for the Customer");
            dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Discount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
