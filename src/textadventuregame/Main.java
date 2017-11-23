package textadventuregame;

import java.util.Random;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        // Object to receive user input and generate random number
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        // Game variables - to be set later
        
        
        Assassin a1 = new Assassin();
        System.out.println(a1.health);
        
    }

}
