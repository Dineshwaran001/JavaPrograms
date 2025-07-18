package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {
        HashMap<String,String> hm1 = new HashMap<String, String>();
        hm1.put("Username", "Dinesh");
        hm1.put("Username1", "Aravind");
        hm1.put("Username2", "Giri");
        hm1.put("Username3", "Naveen");
        hm1.put("Username4", "Ganesh");
        System.out.println(hm1.get("Username"));
        Set s = hm1.entrySet(); // get all the key value pairs from Map
        Iterator it = s.iterator();

        while(it.hasNext()){
            Map.Entry mp = (Map.Entry)it.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }

    }

}
