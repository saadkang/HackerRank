package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by saadi on 6/10/2017.
 */
public class DictionaryPractice {

    public static void main(String[] args) {
//        English to Spanish Dictionary
        Map<String, String> englSpanDictionary = new HashMap<String, String>();
//        Putting things inside our dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");
//        Retrieve things from our dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        System.out.println(englSpanDictionary.get("Saturday"));
        System.out.println(englSpanDictionary.get("Sunday"));
//        Print out all keys
        System.out.println(englSpanDictionary.keySet());
//        Print out all values
        System.out.println(englSpanDictionary.values());
//        Print out size
        System.out.println("The size of our Dictionary is: "+englSpanDictionary.size());

        System.out.println();
        System.out.println();

//        Shopping List
        Map<String, Boolean> shopingList = new HashMap<String, Boolean>();
//        Put some stuff in dictionary
        shopingList.put("Ham", true);
        shopingList.put("Bread", Boolean.TRUE);
        shopingList.put("Oreo", Boolean.TRUE);
        shopingList.put("Eggs", Boolean.FALSE);
        shopingList.put("Sugar", false);
//        Retrieve items
        System.out.println(shopingList.get("Ham"));
        System.out.println(shopingList.get("Sugar"));
        System.out.println(shopingList.get("Oreo"));
//        Key-value Pairs Print Out
        System.out.println(shopingList.toString());
//        Clear our dictionary
        shopingList.clear();
        System.out.println(shopingList.toString());
        
    }
}
