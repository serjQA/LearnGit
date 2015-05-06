/**
 * Created by user on 04.05.2015.
 */
import static sergienko.sergei.Print.*;
public class ConnectionManager {
    public static void main(String[] args){
        for(int i = 0; i <10 ;i++){
            Connection con = Connection.newConnection();
        }
    }
    
}
class Connection{
    static int max = 0;
    private Connection(){
        print("new Connection");
    }

    public static Connection newConnection(){
        max++;
        if(max > 3)
            return null;
        Connection con = new Connection();
        return con;
    }
}
