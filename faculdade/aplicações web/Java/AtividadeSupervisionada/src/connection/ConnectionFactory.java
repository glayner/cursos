
package connection;

import java.sql.*;


public class ConnectionFactory {
    private static final String DRIVE = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/cadastroaluno";
    private static final String USR = "root";
    private static final String PSW = "root";
    
    public static Connection getConnection(){
     try{
         Class.forName(DRIVE);
         return DriverManager.getConnection(URL, USR, PSW);
     }catch (ClassNotFoundException | SQLException ErroSql) {   
           throw new RuntimeException("ERRO! Não foi possivel realizar a conexão: "+ErroSql);
        }   
    }
    
    public static void closeConnection(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                throw new RuntimeException("ERRO! Não foi possivel fechar a conexão. "+ex);
            }
        }
    }
    public static void closeConnection(Connection con, PreparedStatement stmt){
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                throw new RuntimeException("ERRO! Não foi possivel fechar o PreparedStatement. "+ex);
            }
        }
        closeConnection(con);
    }
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                throw new RuntimeException("ERRO! Não foi possivel fechar o ResultSet. "+ex);
            }
        }
        closeConnection(con, stmt);
    }
}
