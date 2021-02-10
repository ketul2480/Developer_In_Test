package uk.axone.devintest.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {

        /*
        HashMap - insertion order is not maintained
                - Duplicate keys are not allowed

        TreeMap -The entries are ordered based on the key
                -Duplicate keys are not allowed
         */

        Map<String, String> appConfig = new TreeMap<>();
        appConfig.put("url","www.axone.uk");
        appConfig.put("username", "admin");
        appConfig.put("password", "password123");
        appConfig.put("ipaddress", "192.168.1.10");
        appConfig.put("ipaddress", "192.168.1.10");
        appConfig.put("ipaddress", "192.168.1.10");
        appConfig.put("AppName", "Student Cloud");

        System.out.println(appConfig.get("password"));

        for(Map.Entry<String, String> config : appConfig.entrySet()){
            System.out.println(config.getKey() +"----------" + config.getValue());
        }

        Map<String, Book> bookMap = new HashMap<>();
        bookMap.put("ketul",new Book(123, "I LOVE JAVA"));
    }

}
