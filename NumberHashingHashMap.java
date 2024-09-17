

import java.util.*;
import java.util.Scanner;
public class NumberHashingHashMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] totalArray = new int[5]; // suppose tht the max size is 15

        for(int i= 0 ; i < totalArray.length;i++){
            int inputNumber = scan.nextInt();
            totalArray[i] = inputNumber;
        }
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i=0; i< totalArray.length; i++){
            int key = totalArray[i];
            int frequency = 1;
            if(mp.containsKey(key)){
                frequency =  mp.get(key);
                frequency ++;
            }
            mp.put(key, frequency);
        }

        int q = scan.nextInt();

        while(q-- >  0){
            int number = scan.nextInt();
            if(mp.containsKey(number)){
                System.out.println(mp.get(number));
            } else {
                System.out.println(0);
            }
        }


    }
}
