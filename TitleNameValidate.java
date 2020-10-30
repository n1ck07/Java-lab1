package Stock.classes;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;

public class TitleNameValidate {
    public static List<String> nameslist = new ArrayList<String>();

    public static boolean titlevalidate(String title) {
        
        if(title.length() == 0){
            return false; 
        }
        else {
            nameslist.add(title);
            return true; 
        }

        
        
    }



}
