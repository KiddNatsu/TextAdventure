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
        int killCount = 0;
        boolean running = true;
                
        GAME: // Game starts here
        while(running) {
            
            // Setting up enemy
            Enemy enemy = enemies[rand.nextInt(enemies.length)];
            int enemyHealth = rand.nextInt(enemy.maxHealth);
            System.out.println("\t# " + enemy.toString() + " appeared!");
            
            // While enemy is still alive
            while(enemyHealth > 0) {
                System.out.println("\n\tYour HP: " + player.health);
                System.out.println("\t" + enemy.toString() + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");
                
                // Read user input
                String input = in.nextLine();
                if (input.equals("1")) {
                    int damageDealt =  player.attack();
                    int damageTaken = enemy.enemyAttack();
                    
                    enemyHealth -= damageDealt;
                    player.health -= damageTaken;
                    
                    System.out.println("\t> You strike the " + enemy.toString() 
                    + " for " + damageDealt + " damage.");
                    Thread.sleep(1000);
                    System.out.println("\t> You recieve " + damageTaken + " damage.");
                    
                    Thread.sleep(1000);
                    
                    if (player.health < 1) {                        
                        running = false;
                        System.out.println("\t> You have taken too much damage, "
                                + "you lack the strength to continue!");
                        Thread.sleep(1000);
                        // Following block can probably go in a method as used
                        // more than once
                        if (killCount > 1) {
                        System.out.println("\n\tYou defeated " + killCount + " "
                                + "enemies!");
                        }
                        else if (killCount == 1) {
                            System.out.println("\n\tYou defeated " + killCount + " "
                                + "enemy!");
                        }
                        Thread.sleep(1000);
                        System.out.println("\n\tThanks for playing ! ^.^");
                        Thread.sleep(3000);
                        System.exit(0);
                    }
                }
                else if (input.equals("2")) {
                    if (player.healthPotions > 0) {
                        player.drinkHealthPotion();
                        player.healthPotions--;
                        System.out.println("\t> You drink a health potion...");
                        Thread.sleep(1000);
                        System.out.println("\t> You heal for 35 health points!");
                        Thread.sleep(1000);
                        System.out.println("\t> You now have " +
                                player.health + " HP\n");
                        Thread.sleep(1000);
                    }
                    else {
                        System.out.println("\t> You do not have enough health "
                                + "potions to heal!");
                        System.out.println("\t*** Earn health potions from "
                                + "killing enemies ***\n");
                        Thread.sleep(2000);
                    }
                }
                else if (input.equals("3")) {
                    System.out.println("\n\tYou got away safely\n");
                    break;
                }
                else {
                    System.out.println("\tInvalid input\n");
                    continue;
                }
                
                // Labeled statement for enemies death code block
                ENEMY_DEAD:
                if (enemyHealth <= 0) {
                    killCount++;
                    
                    float healthDrop = rand.nextFloat();
                    
                    if (healthDrop < enemy.dropRate) {
                        player.healthPotions++;
                        System.out.println("\t> You defeated the " + enemy.toString() + 
                            "!");
                        Thread.sleep(1000);
                        System.out.println("\t> The " + enemy.toString()
                                + " dropped a health potion.");
                        Thread.sleep(1000);
                        System.out.println("\n\tYour Health Potions: " + 
                                player.healthPotions + "\n");
                        Thread.sleep(1000);
                    } else {
                        System.out.println("\t> You defeated the " + enemy.toString() + 
                            "!\n");
                        Thread.sleep(1000);
                    }
                    System.out.println("\tWhat would you like to do next?");
                    System.out.println("\t1. Keep running");
                    System.out.println("\t2. Rest for the night (replenish some "
                            + "health)");
                    System.out.println("\t3. Quit");
                    
                    input = in.nextLine();
                    
                    if (input.equals("1")) {
                        Thread.sleep(1000);
                        System.out.println();
                        break;
                    } 
                    else if (input.equals("2")) {
                        System.out.println();
                        int sleepHealAmount = 10;
                        for (int i = 0; i < 3; i++) {
                            System.out.print("\t...   ");
                            Thread.sleep(1000);
                            player.health += sleepHealAmount;
                        }
                        System.out.println();
                        System.out.println();                        
                    }
                    else if (input.equals("3")) {
                        Thread.sleep(1000);
                        System.out.println("\n\tCongratulations, you survived!");
                        Thread.sleep(1000);
                        if (killCount > 1) {
                        System.out.println("\tYou defeated " + killCount + " "
                                + "enemies!");
                        }
                        else if (killCount == 1) {
                            System.out.println("\tYou defeated " + killCount + " "
                                + "enemy!");
                        }
                        // Still to be implemented properlly, cannot quit 
                        // without first defeating at least 1 enemy
                        else {
                            System.out.println("You didn't manage to defeat a "
                                    + "single enemy... Better luck next time!");
                        }
                        Thread.sleep(1000);
                        System.out.println("\n\tThanks for playing ! ^.^");
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
