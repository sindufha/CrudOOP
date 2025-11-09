package kelas;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author MyBook Hype AMD
 */
public class koneksi {
        private Connection mysqlconfig;
        public Connection configDB(){
            try {
                String url = "jdbc:mysql://localhost:3306/crudoop_202457201062";
                String user = "root";
                String pass = "";
                mysqlconfig = DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                System.err.println(e.getMessage());
                
            }return mysqlconfig;
        } 
}
