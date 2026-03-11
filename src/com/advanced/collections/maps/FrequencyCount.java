package com.advanced.collections.maps;

import java.util.HashMap;

public class FrequencyCount {
    static void main() {
        int[] arr = {1,2,2,3,1,4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            // 1=2, 2=2, 3-1, 4=1
            map.put(num,map.getOrDefault(num,0) + 1);
            System.out.println(map);

        }
        System.out.println(map);
        System.out.println("Count of 4:" + map.get(4));
    }
}
