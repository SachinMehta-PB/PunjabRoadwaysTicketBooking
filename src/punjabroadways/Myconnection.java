package punjabroadways;
import java.sql.*;
public class Myconnection 
{
    public Connection c;
    public Statement s;
    
    public Myconnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///punjabroadways","root","");
            s=c.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
