import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        if (rand.nextInt(10) == 0) {

            System.out.println("You got lucky");
        }
        System.out.println("You awake in Morio City.");
        String myWeapon;
        String myArmor;
        myWeapon = "Sword";
        myArmor = "Basic tunic";
        System.out.println("Your current weapon is a " + myWeapon);
        System.out.println("Your current armor is " + myArmor);
        int yourHP = 0;
        //yourHP = 10;
        Random r = new Random();
        yourHP = r.nextInt(3);
        System.out.println("Your current HP is " + yourHP);
        System.out.println("A monster attacked you and took 4 damage!");
        yourHP = yourHP - 4;
        System.out.println("Your current HP is now " + yourHP);
    }
}
