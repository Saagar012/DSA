/*
 * The logic for the character hashing is like
 * when we subtract the particular character with a then we can get the
 * corresponding index value from 0.
 * 
 * 
 * 
 */

 import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();

        int[] asciiCharacterArray = new int[256];
        for(int i=0; i< inputString.length(); i++){
              asciiCharacterArray[inputString.charAt(i)] += 1;
        }

        int q = scanner.nextInt();
        while(q-- >0){
            char c = scanner.next().charAt(0);
            System.out.println("The frequency is " + asciiCharacterArray[c]);
        }
    }
}
