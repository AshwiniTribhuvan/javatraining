import java.sql.Connection;
class MySQLHelper{
public static Connection getMySqlDBConnection(){
return null;
}
}
class OracleHelper{
public static Connection
getOracleDBConnection(){
return null;
}
}
class HelperFacade{
static Connection getConnection(String type){
Connection con=null;
if(type.equals("oracle")){
            con=OracleHelper.getOracleDBConnection();
        }else if(type.equals("mysql")){
            con=MySQLHelper.getMySqlDBConnection();
        }
        return con;
    }
}
public class DemoFacade {
    public static void main(String[] args) {
        Connection con;
        con=HelperFacade.getConnection("oracle");
    }
}
