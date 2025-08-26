package ex_31_Collections_Framework_DSA.List.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab226_Map_Iterator {
    public static void main(String[] args){
        Map<String, Object> map = new HashMap();
        map.put("Name","Dinesh");
        map.put("RollNo",98989);
        map.put("Class","A Class");
        map.put("Address","Chennai");
        map.put("Mobile",746473);

        for(Map.Entry<String, Object> item:map.entrySet()){
            System.out.println(item.getKey()+"--->"+item.getValue());
        }
    }
}
