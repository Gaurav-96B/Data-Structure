import java.util.*;
public class Solution {
    public static void main(String []args) {
        Integer a[]=new Integer[] {1,1,2,3,4,4,5,5,6,7,8,9,10};
        Map<Integer,Integer>map=new HashMap<>();

        //Adding element in map using for loop
        for(int i=0; i<a.length; i++) {
            if(map.containsKey(a[i])==false) {
                map.put(a[i],1);
            } else {
                map.put(a[i],map.get(a[i])+1);
            }
        }

        //Adding element in map using for each loop
        for(int nums:a) {
            if(map.containsKey(nums)==false) {
                map.put(nums,1);
            } else {
                map.put(nums,map.get(nums)+1);
            }
        }

        //Adding element in map using for loop and getOrDefault() method
        for(int i=0; i<a.length; i++) {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

        //Adding element in map using for each loop and getOrDefault() method
        for(int nums:a) {
            map.put(nums,map.getOrDefault(nums,0)+1);
        }


        /*Different way to iterate map in java*/

        //1.Using Iterator and Map.Entry
        Iterator<Map.Entry<Integer, Integer>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        //2.Using forEach loop and Map.Entry
        for(Map.Entry<Integer,Integer>mp:map.entrySet()) {
            System.out.println(mp.getKey()+" "+mp.getValue());
        }

        //3.Using forEach loop and keySet() method
        for(Integer key:map.keySet()) {
            System.out.println(key+" "+map.get(key));
        }

        //4.Using forEach loop and lambda Expression in java 8
        map.forEach((key,value)->System.out.println(key+" "+value));

        //5.Using forEach loop and stream API in java 8
        map.entrySet().stream().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));

        //6.Using forEach loop and parallel stream API in java 8
        map.entrySet().parallelStream().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));

    }
}
