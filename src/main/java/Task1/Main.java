package Task1;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Написать метод, возвращающий первый уникальный элемент из списка целых чисел
 * Для чисел {0, 0, -7, -7, -7, 1, 2, 5, 3, 1, 2} метод должен вернуть 5
 *
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = {0, 0, -7, -7, -7, 1, 2, 5, 3, 1, 2};
        System.out.println(getFirst(arr));
    }

    public static Integer getFirst(int[] arr ){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int j : arr) {
            if (!map.containsKey(j))
                map.put(j, 1);
            else map.put(j, map.get(j) + 1);
        }

        for (var i: map.entrySet()) {
            if (i.getValue() == 1)
                return i.getKey();
        }
        return -1;
    }
}
