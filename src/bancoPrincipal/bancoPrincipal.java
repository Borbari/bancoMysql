package bancoPrincipal;

import bancomysql.BancoMysql;
import java.awt.EventQueue;

/**
 * @author Ricardo
 */
public class bancoPrincipal {
    public static void main(String[]args){
        EventQueue.invokeLater(new Runnable(){
        
        @Override
        public void run (){
            new BancoMysql();
            }
        });
    }
    
}
