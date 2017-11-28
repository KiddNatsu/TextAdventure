package textadventuregame;

import java.util.Random;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        // Object to receive user input and generate random number
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        // Game variables - to be set later
        Player player = new Player();
        Enemy[] enemies = { new Assassin(), new Demon(), new Wolf(), 
            new Zombie() };
        
        boolean running = true;
                
        GAME:
        while(running) {
            
            Enemy enemy = enemies[rand.nextInt(enemies.length)];
            int enemyHealth = rand.nextInt(enemy.maxHealth);
            System.out.println("\t# " + enemy.toString() + " appeared!\n");
            
            // While enemy is still alive
            while(enemyHealth > 0) {
                System.out.println("\tYour HP: " + player.health);
                System.out.println("\t" + enemy.toString() + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Run!");
                
                String input = in.nextLine();
                if (input.equals("1")) {
                    int damageDealt =  player.attack();
                    int damageTaken = enemy.enemyAttack();
                    
                    enemyHealth -= damageDealt;
                    player.health -= damageTaken;
                    
                    System.out.println("\t> You strike the " + enemy.toString() 
                    + " for " + damageDealt + " damage.\n");
                    Thread.sleep(1000);
                    System.out.println("\t> You recieve " + damageTaken + " damage.\n");
                    
                    Thread.sleep(1000);
                    
                    if (player.health < 1) {                        
                        System.out.println("\t> You have taken too much damage, "
                                + "you lack the strength to continue!");
                        break;
                    }
                }
                else if (input.equals("2")) {
                    System.out.println("\n\tYou got away safely\n");
                    break;
                }
                else {
                    System.out.println("\n\tInvalid input\n");
                    continue;
                }
                
                ENEMY_DEAD:
                if (enemyHealth <= 0) {
                    System.out.println("\t> You defeated the " + enemy.toString() + 
                            "!\n");
                    Thread.sleep(1000);
                    System.out.println("\tWhat would you like to do next?");
                    System.out.println("\t1. Keep running");
                    System.out.println("\t2. Rest for the night (replenish some "
                            + "health");
                    System.out.println("\t3. Quit");
                    
                    input = in.nextLine();
                    
                    if (input.equals("1")) {
                        Thread.sleep(1000);
                        System.out.println();
                        break;
                    } 
                    else if (input.equals("2")) {
                        System.out.println();
                        for (int i = 0; i < 3; i++) {
                            System.out.print("\t...   ");
                            Thread.sleep(1000);
                            player.health += 10;
                        }
                        System.out.println();
                        System.out.println();                        
                    }
                    else if (input.equals("3")) {
                        Thread.sleep(1000);
                        System.out.println("\nThanks for playing ! ^.^");
                        Thread.sleep(3000);
                        System.exit(0);
                    }
                    else {
                        Thread.sleep(1000);
                        System.out.println();
                        System.out.println("\tInvalid input");
                        System.out.println();
                        Thread.sleep(1000);
                        break ENEMY_DEAD;
                    }
                    
                    
                }
            }
            
            
            
            
            
        }
        
    }

}
