package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;

public class City {
    private String city;
    private String country;
    public City(String city, String country){
        this.city = city;
        this.country = country;
    }

    public static void main(String[] args){
        City city1 = new City("Moscow", "Russia");// ключ-значние
        City city2 = new City("Los Angeles", "USA");
        City city3 = new City("Tacoma", "USA");
        City city4 = new City("Portland", "USA");
        City city5 = new City("New York", "USA");
        City city6 = new City("London", "England");

        City[] cityArray = new City[]{city1, city2, city3, city4, city5, city6};

        java.util.Map<String, ArrayList<String>> map = new HashMap<>(6);

        for(int i = 0; i < cityArray.length; i++){
            if(!map.containsKey(cityArray[i].country)) {
                map.put(cityArray[i].country, null);
            }
        }

        for(java.util.Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            ArrayList<String> temp = new ArrayList<String>();
            for(int i = 0; i < cityArray.length; i++){
                if(item.getKey() == cityArray[i].country) {
                    temp.add(cityArray[i].city);
                }
            }
            item.setValue(temp);
        }
        for(java.util.Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            System.out.println(item.getKey()+ " "+item.getValue());
            System.out.print("");
        }

    }
}