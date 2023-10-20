package tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class map2 {
    public static void main(String[] args) {
        HashMap<String, Double> ord = new HashMap<>();
        ord.put("Иван", 10.0);
        ord.put("Галина",20.0);
        ord.put("Екатерина О.", 30.0);

        Double resSum = 0.;

        for (Double d: ord.values()){
            resSum += d;
        }
        System.out.println(resSum);

        Set<String> keySet =  ord.keySet();
        System.out.println(keySet);

        Collection<Double> valueArr = ord.values();
        System.out.println(valueArr);

    }
}
