/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punjabroadways;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sachin Mehta
 */
public class PunjabRoadways {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        try
        {
            Myconnection c1 = new Myconnection();
            String s1 = "select * from admin";
            ResultSet rs = c1.s.executeQuery(s1);
            if(rs.next())
            {
                login obj = new login();
                obj.setVisible(true);
            }
            else
            {
                admin_new obj2 = new admin_new();
                obj2.setVisible(true);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error Occurred in Query.");
            //System.out.println("Error Occurred in Query due to 11 : "+ex);
        }
    }
    
}
