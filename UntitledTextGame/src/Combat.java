import java.util.Random;
import java.util.Scanner;

public class Combat {
    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    Scanner potiScan = new Scanner(System.in);
    int playerHP;
    String playerName;
    String playerWeapon;
    int choice;
    Random ran = new Random();
    int monsterHP;
    int playerXP;
    int playerLvl;
    int potion;
    int potionheal;
    int protection;
    String potionchoice;
    int lossTrack;
    public void playerSetUp(){
        playerHP = 10;
        monsterHP = 15;
        potion = 10;
        potionheal = 3;
        protection = 2;
        playerWeapon = "Sky Sword";
        System.out.println("Your HP is " + playerHP);
        System.out.println("Your weapon is " + playerWeapon);
        System.out.println("Please enter your name: ");
        playerName = myScanner.nextLine();
        System.out.println("Hello " + playerName);
        System.out.println("Welcome to the combat test " + playerName);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Instructions:");
        System.out.println("Select a number choice when presented.");
        System.out.println("Click Enter to Continue when an arrow is present. Like this ->");
    }
    public void morioCity(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("You awake at the border of a town");
        System.out.println("You read a big sign saying 'welcome to Morio City.' ->");
        enterScanner.nextLine();
        System.out.println("A tall man with a cloak stands before you. ->");
        enterScanner.nextLine();
        System.out.println("The man pulls out a knife and points it towards you.");
        System.out.println("The Man: Hand over ye money and ye can pass safely.");
        System.out.println("What do you do? ->");
        enterScanner.nextLine();
        System.out.println("1. Tell the guy to back off.");
        System.out.println("2. Run for the hills.");
        System.out.println("3. Attack the man");
        System.out.println("----------------------------------------------------------------------");
        choice = myScanner.nextInt();
        if(choice == 1){
            System.out.println("You yell 'back off!'");
            System.out.println("The man backs away. 'Woah, it was just a prank! Relax guy!' ->");
            enterScanner.nextLine();
            System.out.println("The Man: Just kidding. ");
            System.out.println("The man proceeds to beat the life out of you.");
            System.out.println("Game Over. ->");
            enterScanner.nextLine();
            morioCity();
        }
        if(choice == 2){
            System.out.println("You turn around and unleash the secret Joestar technique. RUN!");
            System.out.println("You got away safely");
            System.out.println("The end");
            System.exit(0);
        }
        if(choice == 3) {
            System.out.println("----------------------------------------------------------------------");
            if(lossTrack == 1){
                playerWeapon = "Sun Sword";
            }
            System.out.println("You engage in battle with the man.");
            System.out.println("1. Fight.");
            System.out.println("2. Run");

            choice = myScanner.nextInt();
            if(choice == 1){
                fight();
            }
            if(choice == 2){
                crossRoad();
            }
            else{
                tragicEnd();
            }
            enterScanner.nextLine();
            System.out.println("----------------------------------------------------------------------");
        }
        else{
            System.out.println("Invalid Choice");
            morioCity();
        }
    }
    public void fight(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Player Health: " + playerHP);
        System.out.println("Monster health: " + monsterHP);
        System.out.println("1: Attack");
        System.out.println("2: Block");
        System.out.println("3: Potion");
        System.out.println("----------------------------------------------------------------------");
        choice = myScanner.nextInt();

        if(choice == 1){
            attack();
        }
        if(choice == 2){
            block();
        }
        if(choice == 3){
            usePotion();
        }
        else{
            tragicEnd();
        }
    }
    public void usePotion(){
        System.out.println("You currently have: " + potion + " amount of potions");
        System.out.println("Would you like to heal?");
        System.out.println("Type Y to use");
        System.out.println("Type N to not");
        potionchoice = potiScan.nextLine();
        if(potionchoice.equals("Y") || potionchoice.equals("y")){
            potion = potion - 1;
            System.out.println("You gulp down a bottle of your potions.");
            System.out.println("Your HP has increased by " + potionheal + "!");
            playerHP = playerHP + potionheal;
            System.out.println("Player health: " + playerHP);
        }
        if(potionchoice.equals("N") || potionchoice.equals("n")){
            System.out.println("You chose not to use a potion");
        }
        else{
            System.out.println("Invalid command.");
        }
        fight();

    }
    public void attack(){
        int playerDamage;
        int weaponDamage;
        int monsterDamage;
        playerDamage = ran.nextInt(5);
        if(playerWeapon == "Sky Sword"){
            weaponDamage = 2;
            playerDamage = playerDamage + weaponDamage;
        }
        if(playerWeapon == "Sun Sword"){
            playerDamage = playerDamage * 2;
        }
        if(playerWeapon.equals("God")){
            playerDamage = ran.nextInt(100);
        }
        System.out.println("You've dealt " + playerDamage);

        monsterHP = monsterHP - playerDamage;
        System.out.println("Monster HP: " + monsterHP);
        if(monsterHP < 1){
            win();
        }
        if(monsterHP > 0) {
            monsterDamage = ran.nextInt(5);
            playerHP = playerHP - monsterDamage;
            System.out.println("Monster dealt " + monsterDamage + "!");
            System.out.println("Player health: " + playerHP + "!");
            if(playerHP <1){
                dead();
            }
            if(playerHP > 0){
                fight();
            }
        }
    }
    public void win(){
        playerLvl = 0;
        System.out.println("Victory!");
        playerXP = 101;
        System.out.println("EXP + " + playerXP);
        if(playerXP > 100){
            playerLvl = playerLvl + 1;
        }
        System.out.println("Level up!");
        System.out.println("You are now level " + playerLvl);
        System.exit(0);
    }
    public void dead(){
        lossTrack = lossTrack + 1;
        System.out.println("You have fallen in battle");
        System.out.println("Game Over");
        System.out.println("Try Again?");
        System.out.println("1. Yes.");
        System.out.println("2. No.");
        choice = myScanner.nextInt();
        if(choice == 1){
            morioCity();
        }
        if(choice == 2){
            System.out.println("How unfortunate.");
            System.exit(0);
        }
        else{
            System.out.println("Invalid");
            dead();
        }
    }
    public void block(){
        int monsterDmg;
        monsterDmg = ran.nextInt(5);
        System.out.println("You tilt your sword to prepare to block incoming damage.");
        System.out.println("The guy lunges towards you.");
        System.out.println("You blocked some of the damage.");
        System.out.println("The man dealt " + monsterDmg + " damage!");
        monsterDmg = monsterDmg / protection;
        playerHP =  playerHP - monsterDmg;
        System.out.println("Player Health: " + playerHP);
        if(playerHP < 1){
            dead();
        }
        fight();
    }
    public void tragicEnd(){
        System.out.println("Invalid");
        System.out.println("The man beat you down");
        System.out.println("Fin");
        System.exit(0);
    }
    public void crossRoad(){
        System.out.println("You are now free.");
        System.exit(0);
    }
    public static void main(String[] args) {
        Combat game;
        game = new Combat();
        game.playerSetUp();
        game.morioCity();
    }
}
