package cd.get.ready.algorithms;

import java.util.*;

public class CountDuplicates<countDups> {

    /* create a new hashtable
     iterate through the array
     if the array value does not exists as a key in the hashtable..
        add new key = array value, set hash value = 1
     if the key does exist in the hashtable
        get the value at that key and increase by one
     when the whole array is processed, count the number of values in the table > 1
     */
    public int checkDuplicates(Enumeration<Integer> vals){


        int el;
        int countDups = 0;

        while( vals.hasMoreElements() ){
            el = vals.nextElement();
            if(el > 1){
                //System.out.println("Duplicates exist");
                countDups += 1;
            }
        }
        return countDups;
    }


    public Integer countDuplicates(String[] input){
        Hashtable<String, Integer> hashedCount =
                new Hashtable<String, Integer>();
        int arrayLength = input.length;

        for(int i=0; i<arrayLength; i++){
            if(!hashedCount.containsKey(input[i])){
                hashedCount.put(input[i], 1);
            } else{
                int previousVal = hashedCount.get(input[i]);
                hashedCount.put(input[i], previousVal+1);
            }
        }

        Enumeration<Integer> values = hashedCount.elements();

        return checkDuplicates(values);
}

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        Hashtable<Integer, Integer> hashedCount =
                new Hashtable<Integer, Integer>();
        int arrayLength = input.length;

        for(int i=0; i<arrayLength; i++){
            if(!hashedCount.containsKey(input[i])){
                hashedCount.put(input[i], 1);
            } else{
                int previousVal = hashedCount.get(input[i]);
                hashedCount.put(input[i], previousVal+1);
            }
        }

        Enumeration<Integer> values = hashedCount.elements();

        return checkDuplicates(values);
    }
}
