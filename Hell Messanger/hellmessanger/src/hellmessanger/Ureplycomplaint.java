package hellmessanger;

import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ureplycomplaint.java
 *
 * Created on Nov 9, 2014, 3:01:40 PM
 */

/**
 *
 * @author user
 */
public class Ureplycomplaint extends javax.swing.JFrame {
int id;
    /** Creates new form Ureplycomplaint */
    public Ureplycomplaint() {
        initComponents();
    }
    public Ureplycomplaint(int userid)
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

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtmid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tam = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(663, 490));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setText("delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 300, 110, 30);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(80, 400, 120, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("enter id of the complaint you have problem with");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 60, 340, 20);
        getContentPane().add(txtmid);
        txtmid.setBounds(0, 90, 280, 20);

        tam.setColumns(20);
        tam.setRows(5);
        jScrollPane1.setViewportView(tam);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(366, 0, 280, 500);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hellmessanger/water-flame-fantasy01.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 640, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int user=id;
        int i=0,j=0,k=0,l=9;
        try
         {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yochat","root","mysql");
            Statement stmt=con.createStatement();


             do
            {
              String x="select * from complain where hero="+user+" and statushero='unseen'";
              ResultSet rs=stmt.executeQuery(x);
              rs.last();
              int ccc=rs.getInt("complaintid");
              rs.first();
              k=j;
              if(k!=0)
              {
                  do
                  {
                      rs.next();
                      k--;
                  }while(k!=0);
              }

             int cccc=rs.getInt("complaintid");
              if(ccc==cccc)
                  l=0;

              if(l==1)
                  i=1;

              if(i==0)
              {
              int mid=rs.getInt("complaintid");
              int s=rs.getInt("daku");
              String m=rs.getString("content");
              String rep=rs.getString("reply");
              String hh="select * from regist where userid="+s;
              ResultSet rshh=stmt.executeQuery(hh);
              rshh.first();
              String sname=rshh.getString("name");
              int cla=rshh.getInt("class");
              String sec=rshh.getString("section");
              tam.append("complaint id="+mid+"\n");
              tam.append("you complaint of "+sname+" of class "+cla+sec+" about the message_____>>\n");
              tam.append("\n");
              tam.append(m+"\n");
              tam.append("\n");
              tam.append("administrator said about it that>>\n");
              tam.append(rep+"\n");
              tam.append("***************************************************\n");
              tam.append("***************************************************\n");

              j++;
              l++;
              }

            }while(i==0 && i!=1);
        }
        catch(Exception e)
        {
                 
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int user=id;
        int i=0,j=0,k=0,l=9;
        int kkk=Integer.parseInt(txtmid.getText());
        try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yochat","root","mysql");
            Statement stmt=con.createStatement();
            String kk="delete from complain where complaintid="+kkk;
            stmt.executeUpdate(kk);
            tam.setText("");

             do
            {
              String x="select * from complain where hero="+user+" and statushero='unseen'";
              ResultSet rs=stmt.executeQuery(x);
              rs.last();
              int ccc=rs.getInt("complaintid");
              rs.first();
              k=j;
              if(k!=0)
              {
                  do
                  {
                      rs.next();
                      k--;
                  }while(k!=0);
              }

             int cccc=rs.getInt("complaintid");
              if(ccc==cccc)
                  l=0;

              if(l==1)
                  i=1;

              if(i==0)
              {
              int mid=rs.getInt("complaintid");
              int s=rs.getInt("daku");
              String m=rs.getString("content");
              String rep=rs.getString("reply");
              String hh="select * from regist where userid="+s;
              ResultSet rshh=stmt.executeQuery(hh);
              rshh.first();
              String sname=rshh.getString("name");
              int cla=rshh.getInt("class");
              String sec=rshh.getString("section");
              tam.append("complaint id="+mid+"\n");
              tam.append("you complaint of "+sname+" of class "+cla+sec+" about the message_____>>\n");
              tam.append("\n");
              tam.append(m+"\n");
              tam.append("\n");
              tam.append("administrator said about it that>>\n");
              tam.append(rep+"\n");
              tam.append("***************************************************\n");
              tam.append("***************************************************\n");

              j++;
              l++;
              }

            }while(i==0 && i!=1);
        }
        catch(Exception e)
        {
                 
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int user=id;
        try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yochat","root","mysql");
            Statement stmt=con.createStatement();
            String x="update complain set statushero='yoyo' where hero="+user;
            stmt.executeUpdate(x);

            Uhome nh=new Uhome(id);
            nh.setVisible(true);
            this.setVisible(false);
        } catch(Exception e) {

        }
}//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ureplycomplaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tam;
    private javax.swing.JTextField txtmid;
    // End of variables declaration//GEN-END:variables

}
