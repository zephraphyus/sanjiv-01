/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Uhome.java
 *
 * Created on 10 Jan, 2015, 11:14:17 AM
 */

package hellmessanger;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author CRUZE ON FIRE
 */
public class Uhome extends javax.swing.JFrame {
int id;
    /** Creates new form Uhome */
public Uhome() {
        initComponents();
        gg.setVisible(false);
        gg1.setVisible(false);
        gg2.setVisible(false);
        gg3.setVisible(false);
    }
    public Uhome(int userid) {
          initComponents();
        id=userid;
        gg.setVisible(false);
        gg1.setVisible(false);
        gg2.setVisible(false);
        gg3.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        l5 = new javax.swing.JLabel();
        gg4 = new javax.swing.JButton();
        l4 = new javax.swing.JLabel();
        gg3 = new javax.swing.JButton();
        l3 = new javax.swing.JLabel();
        gg2 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        gg1 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        gg = new javax.swing.JButton();
        gg5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 626));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        l6.setFont(new java.awt.Font("Tahoma", 0, 18));
        l6.setForeground(new java.awt.Color(51, 255, 0));
        l6.setText("Send message to someone");
        getContentPane().add(l6);
        l6.setBounds(60, 470, 370, 60);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton1.setText("WANT TO SHARE SOME VIEWS ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 540, 280, 40);

        l5.setFont(new java.awt.Font("Tahoma", 0, 18));
        l5.setForeground(new java.awt.Color(51, 255, 51));
        l5.setText("View  older  conversation");
        getContentPane().add(l5);
        l5.setBounds(60, 390, 370, 60);

        gg4.setText("TAKE ME THERE");
        gg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gg4ActionPerformed(evt);
            }
        });
        getContentPane().add(gg4);
        gg4.setBounds(520, 420, 200, 30);

        l4.setFont(new java.awt.Font("Tahoma", 1, 24));
        l4.setForeground(new java.awt.Color(255, 0, 0));
        l4.setText("You  have  --- warnings");
        getContentPane().add(l4);
        l4.setBounds(60, 310, 370, 60);

        gg3.setText("VIEW");
        gg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gg3ActionPerformed(evt);
            }
        });
        getContentPane().add(gg3);
        gg3.setBounds(520, 320, 200, 30);

        l3.setFont(new java.awt.Font("Tahoma", 0, 18));
        l3.setForeground(new java.awt.Color(51, 255, 51));
        l3.setText("You  have  ---  replies to your complaints ");
        getContentPane().add(l3);
        l3.setBounds(60, 230, 370, 40);

        gg2.setText("VIEW");
        gg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gg2ActionPerformed(evt);
            }
        });
        getContentPane().add(gg2);
        gg2.setBounds(520, 240, 200, 30);

        l2.setFont(new java.awt.Font("Tahoma", 0, 18));
        l2.setForeground(new java.awt.Color(51, 255, 51));
        l2.setText("You  have  ---  replies to your feedback");
        getContentPane().add(l2);
        l2.setBounds(60, 140, 370, 40);

        gg1.setText("VIEW");
        gg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gg1ActionPerformed(evt);
            }
        });
        getContentPane().add(gg1);
        gg1.setBounds(520, 150, 200, 30);

        l1.setFont(new java.awt.Font("Tahoma", 0, 24));
        l1.setForeground(new java.awt.Color(51, 255, 51));
        l1.setText("You   have  ---  new  messages");
        getContentPane().add(l1);
        l1.setBounds(60, 60, 370, 50);

        gg.setText("VIEW");
        gg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ggActionPerformed(evt);
            }
        });
        getContentPane().add(gg);
        gg.setBounds(520, 80, 190, 30);

        gg5.setText("TAKE ME THERE");
        gg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gg5ActionPerformed(evt);
            }
        });
        getContentPane().add(gg5);
        gg5.setBounds(520, 480, 200, 30);

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 2, 30));
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("WELCOME  TO  HELL");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 360, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hellmessanger/Aslain - Copy.jpg"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(700, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(663, 734));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -7, 720, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ufeedback j=new Ufeedback(id);
        j.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_jButton1ActionPerformed

    private void gg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gg4ActionPerformed
        Uolderconversation1 g=new Uolderconversation1(id);
        g.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_gg4ActionPerformed

    private void gg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gg3ActionPerformed
        Uwarning j=new Uwarning(id);
        j.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_gg3ActionPerformed

    private void gg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gg2ActionPerformed
        Ureplycomplaint h=new Ureplycomplaint(id);
        h.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_gg2ActionPerformed

    private void gg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gg1ActionPerformed
        Ufeedbackreply h=new Ufeedbackreply(id);
        h.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_gg1ActionPerformed

    private void ggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ggActionPerformed
        Unewmessages h=new Unewmessages(id);
        h.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_ggActionPerformed

    private void gg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gg5ActionPerformed
        Umessagesend f=new Umessagesend(id);
        f.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_gg5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int user=id;
        System.out.println(""+id);
        try
        {

             Class.forName("java.sql.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yochat","root","mysql");
             Statement stmt=con.createStatement();
             String a="SELECT COUNT(*) as hahaha FROM MESSAG WHERE Status='unseen' and receiver="+user;
             ResultSet rsa=stmt.executeQuery(a);
             rsa.first();
             int f=rsa.getInt("hahaha");
             if(f==0)
             {
                 l1.setText("you have no new messages");
             }
             else
             {
                 l1.setText("you have "+ f +" unread messages");
                 gg.setVisible(true);
             }




             String b="SELECT COUNT(*) as hahaha FROM feed WHERE senderid="+user+" and status='unseen'";
             ResultSet rsb=stmt.executeQuery(b);
             rsb.first();
             int g=rsb.getInt("hahaha");
             if(g==0)
             {
                 l2.setText("you have no replies to your feedbacks");
             }
             else
             {
                 l2.setText("you have "+ g +" replies to your feedbacks");
                 gg1.setVisible(true);
             }




             String c="SELECT COUNT(*) as hahaha FROM complain WHERE hero="+user+" and statushero='unseen'";
             ResultSet rsc=stmt.executeQuery(c);
             rsc.first();
             int h=rsc.getInt("hahaha");
             if(h==0)
             {
                 l3.setText("you have no replies to your complaints");
             }
             else
             {
                 l3.setText("you have "+ h +" replies to your complaints");
                 gg2.setVisible(true);
             }




             String d="SELECT COUNT(*) as hahaha FROM complain WHERE daku="+user+" and statusdaku='unseen'";
             ResultSet rsd=stmt.executeQuery(d);
             rsd.first();
             int i=rsd.getInt("hahaha");
             if(i==0)
             {
                 l4.setText("you have no warnings");
             }
             else
             {
                 l4.setText("you have "+ i +"warnings");
                 gg3.setVisible(true);
             }
        }
             catch(Exception e)
             {
                    JOptionPane.showMessageDialog(this,e.getMessage());
             }
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uhome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gg;
    private javax.swing.JButton gg1;
    private javax.swing.JButton gg2;
    private javax.swing.JButton gg3;
    private javax.swing.JButton gg4;
    private javax.swing.JButton gg5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    // End of variables declaration//GEN-END:variables

}
