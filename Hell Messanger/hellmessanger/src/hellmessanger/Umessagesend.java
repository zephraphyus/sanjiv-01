package hellmessanger;

import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Send_message.java
 *
 * Created on Oct 7, 2014, 3:27:40 PM
 */

/**
 *
 * @author user
 */
public class Umessagesend extends javax.swing.JFrame {

    int id;
    /** Creates new form Send_message */
    public Umessagesend() {
        initComponents();
    }
    public Umessagesend(int userid)
    {

        initComponents();
        id=userid;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtclass = new javax.swing.JTextField();
        txtsection = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tam = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbs = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1192, 752));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 0, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Enter class of the person you want to send message to");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 70, 560, 30);

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 0, 24));
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Enter section");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 130, 132, 30);

        jButton1.setText("Generate list");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 270, 370, 30);
        getContentPane().add(txtclass);
        txtclass.setBounds(590, 80, 120, 20);
        getContentPane().add(txtsection);
        txtsection.setBounds(170, 140, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("Select the required student");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 320, 212, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Enter your message");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(690, 260, 150, 15);

        tam.setColumns(20);
        tam.setRows(5);
        jScrollPane2.setViewportView(tam);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(680, 290, 500, 250);

        jButton2.setText("Send message");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(690, 570, 340, 40);

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 0, 18));
        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setText("Click  on  generate  list  button  to  obtain  list  of  students  of  mentioned  class  in  the  drop  down  list  below  then  click  on  the  list......... ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 190, 1140, 30);

        cbs.setFont(new java.awt.Font("Tahoma", 0, 12));
        cbs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Click here and select required student", " ", " " }));
        cbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsActionPerformed(evt);
            }
        });
        getContentPane().add(cbs);
        cbs.setBounds(0, 360, 300, 30);

        jButton3.setText("BACK  TO  HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 570, 290, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hellmessanger/023.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1200, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int clas=Integer.parseInt(txtclass.getText());
       String sec=txtsection.getText();
       String name;
       int rno,i=0;
       try
       {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yochat","root","mysql");
            Statement stmt=con.createStatement();
            String x="SELECT * FROM REGIST WHERE CLASS="+clas+" and section='"+sec+"' and userid not in(1,"+id+")";
            ResultSet rs=stmt.executeQuery(x);
              cbs.removeAllItems();
              rs.first();
              while(rs.next())
              {
                  if(i==0)
                  rs.first();
                  name=rs.getString("name");
                  cbs.addItem(name);
                  i++;
              }
      }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this,e.getMessage());
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int messageid=1;
        int user=id;
        int clas=Integer.parseInt(txtclass.getText());
       String sec=txtsection.getText();
       String name=(String)cbs.getSelectedItem();
   try
       {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yochat","root","mysql");
            Statement stmt=con.createStatement();
            String x="SELECT * FROM REGIST WHERE CLASS="+clas+" and section='"+sec+"' and name='"+name+"'";
            ResultSet rs=stmt.executeQuery(x);
            rs.first();
            int receiver=rs.getInt("userid");
            String message=tam.getText();
            String yoyo="SELECT * FROM MESSAG";
            ResultSet rss=stmt.executeQuery(yoyo);
            if(rss.last())
            messageid=rss.getInt("messageid")+1;
            else
                messageid=1;
            String hahaha="INSERT INTO MESSAG VALUES("+messageid+","+user+","+receiver+",'"+message+"','unseen')";
            stmt.executeUpdate(hahaha);
            JOptionPane.showMessageDialog(this,"Your message was succesfully sent");
       }
   catch(Exception e)
         {
             JOptionPane.showMessageDialog(this,e.getMessage()+"hahahahahahaahahahahahahahahah");
         }
     txtclass.setText("");
     txtsection.setText("");
     tam.setText("");
     cbs.removeAllItems();
     cbs.addItem("Click here and select required student");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Uhome hh=new Uhome(id);
        hh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbsActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Umessagesend().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea tam;
    private javax.swing.JTextField txtclass;
    private javax.swing.JTextField txtsection;
    // End of variables declaration//GEN-END:variables

}
