package tasks;

import java.util.ArrayList;
import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Double>> menu = new HashMap<>();
        ArrayList<Double> teaPrice = new ArrayList<>();
        teaPrice.add(50.6);
        teaPrice.add(13.2);
        teaPrice.add(23.3);
        menu.put("tea", teaPrice);

        ArrayList<Double> ramenPrice = new ArrayList<>();
        ramenPrice.add(120.3);
        ramenPrice.add(45.3);
        ramenPrice.add(70.1);
        menu.put("ramen", ramenPrice);

        System.out.println(menu);

        for (String s: menu.keySet()){
            for (int i = 0; i < menu.get(s).size(); i++) {
                System.out.println(menu.get(s).get(i));
            }
        }
    }
}
