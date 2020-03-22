import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Connection_Factory {
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3307/estacao";
    private static final String USER="root";
    private static final String PASS="usbw";
    
    public static Connection getConnection(){
        try{
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASS);
        }catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException("Erro de conexão: ", e);
        }
    }
    
    public static void closeConnection(Connection con){
                try {
                    if(con!=null)
                    con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Connection_Factory.class.getName()).log(Level.SEVERE, null, ex);
            }
       
    }
    
        public static void closeConnection(Connection con, PreparedStatement stmt){
            
            closeConnection(con);
                try {
                    if(stmt!=null)
                    stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Connection_Factory.class.getName()).log(Level.SEVERE, null, ex);
            }
       
    }

        public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
            
            closeConnection(con, stmt);
            
                try {
                    if(rs!=null)
                    rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Connection_Factory.class.getName()).log(Level.SEVERE, null, ex);
            }
       
    }
}
