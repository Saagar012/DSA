
/*
 

Given an array of integers: [1, 2, 1, 3, 2] and we are given some queries: [1, 3, 4, 2, 10].
For each query, we need to find out how many times the number appears in the array. For example, 
if the query is 1 our answer would be 2, and if the query is 4 the answer will be 0. 

so we can achieve this using hashing technique.
Hashing - Prestoring and Fetching.

5
1 3 2 1 3
creating an array for prestoring the data.
Number Hashing maximmum hash size global vs inside main
10 power 7 and 10 power 6

 */

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int sizeOfArray = scan.nextInt();
        int[] integersArray = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++){
            integersArray[i] = scan.nextInt();
        }

        // precomputing or prestoring
        int [] prestoredArray = new int[13];
        for(int i = 0; i< sizeOfArray; i++){    
                prestoredArray[integersArray[i]] += 1 ;
        }

        int sizeOfQuery = scan.nextInt();
        while (sizeOfQuery < 13) {
            int queryInput = scan.nextInt() ;
            System.out.println(prestoredArray[queryInput]);
        }
    }
}
