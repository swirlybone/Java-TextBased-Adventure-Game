import java.util.Scanner;
import java.util.Random;
public class Adventure {
    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    int playerHP;
    String playerName;
    String playerWeapon;
    int choice;
    Random ran = new Random();
    int chance;
    int monsterHP;
    int damage;
    int hitChance;
    public void playerSetUp(){
        playerHP = 10;
        playerWeapon = "These Hands";
        System.out.println("Your HP is " + playerHP);
        System.out.println("Your weapon is " + playerWeapon);
        System.out.println("Please enter your name: ");
        playerName = myScanner.nextLine();
        System.out.println("Hello " + playerName);
        System.out.println("Welcome, " + playerName + "to the world of Ilya");
        System.out.println("We hope you enjoy your stay.");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Instructions:");
        System.out.println("Select a number choice when presented.");
        System.out.println("Click Enter to Continue when an arrow is present.");
    }
    public void morioCity(){
        System.out.println("----------------------------------------------------------------------");
        //myScanner = new Scanner(System.in);
        //enterScanner = new Scanner(System.in);
        //System.out.println("\n");
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
            System.out.println("While running you find yourself lost.");
            System.out.println("Oh boy. ->");
            enterScanner.nextLine();
            crossRoad();
        }
        if(choice == 3) {
            System.out.println("You pull out " + playerWeapon + " and attempted to battle the man.");
            System.out.println("You bopped the man in the eye then proceeded to get beaten down by him.");
            System.out.println("Seriously!? Try a more subtle approach, at least for now.");
            System.out.println("Game Over. ->");
            morioCity();
            enterScanner.nextLine();
        }
        else{
            System.out.println("Invalid Choice");
            morioCity();
        }
    }
    public void crossRoad(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("As you continue to wonder around you find yourself at a crossroad.");
        System.out.println("There are three branching paths before you.");
        System.out.println("It feels as if each path presents itself a different fate. ->");
        enterScanner.nextLine();
        System.out.println("Will you go down the first path?");
        System.out.println("It reeks of decaying corpse however... ->");
        enterScanner.nextLine();
        System.out.println("Will you go down the second path?");
        System.out.println("You can see something shiny draw your attention in the distance. ->");
        enterScanner.nextLine();
        System.out.println("Or will you go down the third path?");
        System.out.println("You can see a nice house in the distance.");
        System.out.println("It looks like the safest option honestly. ->");
        enterScanner.nextLine();
        System.out.println("(Well, there looks to be one hidden path.)");
        enterScanner.nextLine();
        System.out.println("... ->");
        enterScanner.nextLine();
        System.out.println("(I mean it really looks like your best option is the last but your call.) ->");
        enterScanner.nextLine();
        System.out.println("1: Go down first path.");
        System.out.println("2. Go down second path.");
        System.out.println("3. Go down third path.");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("");
        choice = myScanner.nextInt();
        if(choice == 1){
            System.out.println("Really? The path that reeks of...well, you do you buddy.");
            System.out.println("You begin walking down the path that reeks of decaying corpse.");
            System.out.println("While heading down the path you see a bird fly over and die.");
            firstPath();
        }
        if(choice == 2){
            secondPath();
        }
        if(choice == 3){
            thirdPath();
        }
        if(choice == 4){
            secretPath();
            System.exit(0);
        }
        else{
            System.out.println("Invalid Choice");
            crossRoad();
        }
        //crossRoad();
        System.out.println("----------------------------------------------------------------------");
    }
    public void firstPath(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("As you proceed down the path you run into a pool of crimson water. ->");
        enterScanner.nextLine();
        System.out.println("Within the water there lie multiple bodies floating around. ->");
        enterScanner.nextLine();
        System.out.println("You notice a sword one on of the bodies and a book on the other. ->");
        enterScanner.nextLine();
        System.out.println("Do you reach for the sword or the book?");
        System.out.println("1. Sword");
        System.out.println("2. Book.");
        System.out.println("3. Neither, just leave them.");
        choice = myScanner.nextInt();
        if(choice == 1) {
            System.out.println("As you reach for the sword you notice one of the bodies moves. ->");
            enterScanner.nextLine();
            System.out.println("The corpse lifts its head and begins to scream at you. ->.");
            System.out.println("It grabs your arms and yells at you to leave.");
            System.out.println("FLEE THIS PLACE AT ONCE...THERE IS NOTHING FOR YOU ONWARD...");
            System.out.println("You look towards the exit and back to the sword.");
            System.out.println("Do you wish to leave this place or remain?");
            System.out.println("1. I'm outta here!");
            System.out.println("2. I'm too deep in now, no thanks.");
            choice = myScanner.nextInt();
            if (choice == 1) {
                System.out.println("You decided that it was better to leave after all.. ->");
                enterScanner.nextLine();
                System.out.println("The Corpse: Thanks for actually listening kid.");
                System.out.println("The Corpse: Other people tend to ignore and go anyway. ->");
                enterScanner.nextLine();
                System.out.println("The Corpse: ...I was one of those people before.");
                System.out.println("The Corpse: Go on and live a good life.");
                enterScanner.nextLine();
                System.out.println("You thank the corpse kindly and proceed to run like hell. ->");
                enterScanner.nextLine();
                System.out.println("Ending 1 of 7: Not Today Satan.");
                System.exit(0);
            }
            if (choice == 2) {
                System.out.println("You shrug your shoulders and grab the sword with your free hand.");
                System.out.println("You proceeded to cut the corpse's arm off to get free. ->");
                playerWeapon = "cursed sword";
                System.out.println("You now possess the " + playerWeapon + ".");
                System.out.println("With your newly found weapon you continue down the path. ->");
                enterScanner.nextLine();
                System.out.println("Onward down the path you find yourself in front of a large building. ->");
                enterScanner.nextLine();
                System.out.println("It looks to be some some sort of castle. ->");
                enterScanner.nextLine();
                System.out.println("You see some ghost fortnite dancing around the castle. ->");
                enterScanner.nextLine();
                System.out.println("Yep, definitely a haunted castle. ->");
                firstPath2();
            }
            else{
                System.out.println("Invalid Choice");
                firstPath();
            }
        }
        if(choice == 2) {
            System.out.println("For whatever reason you chose to reach for the book. ->");
            enterScanner.nextLine();
            System.out.println("As you picked up the book it gave you a sudden shock and burn.");
            System.out.println("You took 5 damage.");
            playerHP = playerHP - 5;
            System.out.println("Your HP is now sitting at " + playerHP + ". ->");
            enterScanner.nextLine();
            System.out.println("You drop the book after being shocked and it opens to a random page. ->");
            enterScanner.nextLine();
            chance = ran.nextInt(4);
            System.out.println("The page it falls open to is page " + chance + ".");
            System.out.println("Note: The power you get is random.");
            if (chance == 0) {
                playerWeapon = "sparkles";
                System.out.println("You read the page that the book fell open on. ->");
                enterScanner.nextLine();
                System.out.println("After reading the page the book turns to ash and your hand begins to glow. ->");
                enterScanner.nextLine();
                System.out.println("You've learned the spell... " + playerWeapon + ".");
                System.out.println("You somehow ended up with the worst possible spell, that sucks buddy. ->");
                enterScanner.nextLine();
                System.out.println("With your newly found power you continue down the path. ->");
                enterScanner.nextLine();
                System.out.println("Onward down the path you find yourself in front of a large building. ->");
                enterScanner.nextLine();
                System.out.println("It looks to be some some sort of castle. ->");
                enterScanner.nextLine();
                System.out.println("You see some ghost Fortnite dancing around the castle. ->");
                enterScanner.nextLine();
                System.out.println("Yep, definitely a haunted castle. ->");
                firstPath2();
            }
            if (chance == 1) {
                playerWeapon = "fire ball";
                System.out.println("You read the page that the book fell open on. ->");
                enterScanner.nextLine();
                System.out.println("After reading the page the book turns to ash and your hand begins to glow. ->");
                enterScanner.nextLine();
                System.out.println("You've learned the spell " + playerWeapon + ".");
                System.out.println("With your newly found power you continue down the path. ->");
                enterScanner.nextLine();
                System.out.println("Onward down the path you find yourself in front of a large building. ->");
                enterScanner.nextLine();
                System.out.println("It looks to be some some sort of castle. ->");
                enterScanner.nextLine();
                System.out.println("You see some ghost Fortnite dancing around the castle. ->");
                enterScanner.nextLine();
                System.out.println("Yep, definitely a haunted castle. ->");
                firstPath2();
            }
            if (chance == 2) {
                playerWeapon = "thunder spark";
                System.out.println("You read the page that the book fell open on. ->");
                enterScanner.nextLine();
                System.out.println("After reading the page the book turns to ash and your hand begins to glow. ->");
                enterScanner.nextLine();
                System.out.println("You've learned the spell " + playerWeapon + ".");
                System.out.println("With your newly found power you continue down the path. ->");
                enterScanner.nextLine();
                System.out.println("Onward down the path you find yourself in front of a large building. ->");
                enterScanner.nextLine();
                System.out.println("It looks to be some some sort of castle. ->");
                enterScanner.nextLine();
                System.out.println("You see some ghost Fortnite dancing around the castle. ->");
                enterScanner.nextLine();
                System.out.println("Yep, definitely a haunted castle. ->");
                firstPath2();
            }
            if (chance == 3) {
                playerWeapon = "ice shard";
                System.out.println("You read the page that the book fell open on. ->");
                enterScanner.nextLine();
                System.out.println("After reading the page the book turns to ash and your hand begins to glow. ->");
                enterScanner.nextLine();
                System.out.println("You've learned the spell " + playerWeapon + ".");
                System.out.println("With your newly found power you continue down the path. ->");
                enterScanner.nextLine();
                System.out.println("Onward down the path you find yourself in front of a large building. ->");
                enterScanner.nextLine();
                System.out.println("It looks to be some some sort of castle. ->");
                enterScanner.nextLine();
                System.out.println("You see some ghost Fortnite dancing around the castle. ->");
                enterScanner.nextLine();
                System.out.println("Yep, definitely a haunted castle. ->");
                firstPath2();
            }
            if (chance == 4) {
                playerWeapon = "Hamon";
                System.out.println("You read the page that the book fell open on. ->");
                enterScanner.nextLine();
                System.out.println("After reading the page the book turns to ash and your hand begins to glow. ->");
                enterScanner.nextLine();
                System.out.println("You've learned the spell " + playerWeapon + ".");
                System.out.println("With your newly found power you continue down the path.");
                enterScanner.nextLine();
                System.out.println("Onward down the path you find yourself in front of a large building. ->");
                enterScanner.nextLine();
                System.out.println("It looks to be some some sort of castle. ->");
                enterScanner.nextLine();
                System.out.println("You see some ghost Fortnite dancing around the castle. ->");
                enterScanner.nextLine();
                System.out.println("Yep, definitely a haunted castle.");
                System.out.println("My Hamon should do great here. ->");
                firstPath2();
            }
            if (chance == 5) {
                playerWeapon = "Stand: Midnight Crusade";
                System.out.println("You read the page that the book fell open on. ->");
                enterScanner.nextLine();
                System.out.println("After reading the page the book turns to ash and your hand begins to glow. ->");
                enterScanner.nextLine();
                System.out.println("You've learned the spell " + playerWeapon + ".");
                enterScanner.nextLine();
                System.out.println("Stand Name: Midnight Crusade.");
                System.out.println("Stand Master: " + playerName);
                System.out.println("Stand ability: Critical Blows");
                enterScanner.nextLine();
                System.out.println("With your newly found power you continue down the path. ->");
                enterScanner.nextLine();
                System.out.println("Onward down the path you find yourself in front of a large building. ->");
                enterScanner.nextLine();
                System.out.println("It looks to be some some sort of castle. ->");
                enterScanner.nextLine();
                System.out.println("You see some ghost Fortnite dancing around the castle. ->");
                enterScanner.nextLine();
                System.out.println("Yep, definitely a haunted castle. ->");
                firstPath2();
            }
        }
        if(choice == 3){
            System.out.println("You decide to leave both and respect the dead.");
            System.out.println("Commendable, stupid, but none the less commendable. ->");
            enterScanner.nextLine();
            System.out.println("Onward down the path you find yourself in front of a large building. ->");
            enterScanner.nextLine();
            System.out.println("It looks to be some some sort of castle. ->");
            enterScanner.nextLine();
            System.out.println("You see some ghost Fortnite dancing around the castle. ->");
            enterScanner.nextLine();
            System.out.println("Yep, definitely a haunted castle. ->");
            enterScanner.nextLine();
            System.out.println("Bet you wish you picked up a weapon now, huh? ->");
            firstPath2();
        }
        else{
            System.out.println("Invalid Choice");
            firstPath();
        }
        System.out.println("----------------------------------------------------------------------");
    }
    public void firstPath2(){
        System.out.println("Ignoring the Fortnite dancing ghost you proceed on  into the castle. ->");
        enterScanner.nextLine();
        System.out.println("You're met with two paths presented you before. ->");
        enterScanner.nextLine();
        System.out.println("Don't act so surprised, we're used to choices by now. ->");
        enterScanner.nextLine();
        System.out.println("Anyway...path one is a dark room with screams coming from it. ->");
        enterScanner.nextLine();
        System.out.println("And...path two looks to lead to a big red door. ->");
        enterScanner.nextLine();
        System.out.println("Geez, both of these options suck... ->");
        enterScanner.nextLine();
        System.out.println("Then again it is your fault we're here now");
        System.out.println("As usual, your call friend. ->");
        enterScanner.nextLine();
        System.out.println("1. Path one.");
        System.out.println("2. Path two.");
        choice = myScanner.nextInt();
        if(choice == 1){
            System.out.println("So the dark room with the...you know there aren't bad options anymore. ->");
            enterScanner.nextLine();
            System.out.println("As you head down the hall and into the room you hear a voice calling out for you. ->");
            enterScanner.nextLine();
            System.out.println("As you walk towards the room you see something moving towards you");
            enterScanner.nextLine();
            System.out.println("Once you fully reach the room you see....something...");
            System.out.println("...Something so very unsightly");
            enterScanner.nextLine();
            System.out.println("A creature stands before you that has tentacles for arms. ->");
            enterScanner.nextLine();
            System.out.println("The body is shaped like a crab but the legs resemble penguin feet.");
            enterScanner.nextLine();
            System.out.println("And the head...it's a goldfish head...weird. ->");
            enterScanner.nextLine();
            System.out.println("Well, guess the only choice left now is do we beat it or let it live?");
            enterScanner.nextLine();
            System.out.println("1. Initiate a fight.");
            System.out.println("2. Be friendly with it.");
            choice = myScanner.nextInt();
            if(choice == 1){
                System.out.println("You prepare yourself for battle with your trusted " + playerWeapon + ".");
                monsterHP = 10;
                System.out.println("The monster has " + monsterHP + ".");
                damage = 10;
                hitChance = ran.nextInt(4);
                if(hitChance >= 1){
                    System.out.println("You attacked the monster for " + damage);
                    System.out.println("You successively killed the monster. ->");
                    enterScanner.nextLine();
                    System.out.println("The monster let out a loud scream as it took its last breath. ->");
                    enterScanner.nextLine();
                    firstpathEnd();
                }
                if(hitChance < 1){
                    System.out.println("You've failed to kill the monster. -> ");
                    enterScanner.nextLine();
                    System.out.println("The monster started beating on you relentlessly. ->");
                    enterScanner.nextLine();
                    System.out.println("You've been killed by the monster. ->");
                    enterScanner.nextLine();
                    System.out.println("Fin. ->");
                    enterScanner.nextLine();
                    System.out.println("Ending 2 of 7: You've been met with the wrong side of RNG.");
                    System.out.println("Try again, maybe next time you'll kill it.");
                    System.exit(0);
                }
            }
            if(choice == 2){
                System.out.println("You slowly approach the monster and offer him a...hug. ->");
                enterScanner.nextLine();
                System.out.println("It's so sweet...stupid...but really sweet. ->");
                enterScanner.nextLine();
                System.out.println("The monster hugs you back and cries");
                System.out.println("Monster: You're the first adventurer to be nice to me you know.");
                System.out.println("Monster: We should be friends. ->");
                enterScanner.nextLine();
                System.out.println("So you and the monster would go off to be buddies");
                System.out.println("After leaving the castle you headed back to Morio and opened a bar. ->");
                enterScanner.nextLine();
                System.out.println("You two named the bar 'Timmy and " + playerName + "' after both your names. ->");
                enterScanner.nextLine();
                System.out.print("You both married the love of your lives as Timmy met a monster to fall for.");
                System.out.print("You both have kids and decide to retire after 50 years");
                System.out.println("Fortunately your kids took over and many generations would run it. ->");
                enterScanner.nextLine();
                System.out.println("Ending 3 of 7: Friends Til The End.");
                System.exit(0);
            }
            else{
                System.out.println("Invalid Choice");
                firstPath2();
            }
            System.out.println("----------------------------------------------------------------------");
        }
        if(choice == 2){
            System.out.println("You reach to open the door it falls over and lands on you. Crushing you. ->");
            enterScanner.nextLine();
            System.out.println("Seems you've been met with an unfortunate fate friend.");
            enterScanner.nextLine();
            System.out.println("Fin.");
            System.out.println("Gag Ending: Doormat.");
        }
        else{
            System.out.println("Invalid Choice");
            firstPath2();
        }
        System.out.println("----------------------------------------------------------------------");
    }
    public void firstpathEnd(){
        System.out.println("After killing the monster you come across a treasure room. ->");
        enterScanner.nextLine();
        System.out.println("Oh sweet, treasure. We can end this journey in style. ->");
        enterScanner.nextLine();
        System.out.println("You grab the chest and head back to Morio where you build a shop. ->");
        enterScanner.nextLine();
        System.out.println("After years of running it you became the richest in the city. ->");
        enterScanner.nextLine();
        System.out.println("You open up the Speedwagon foundation in your old age and retired. ->");
        enterScanner.nextLine();
        System.out.println("Generations later your descendants speak greatly of you.");
        System.out.println("Though some wonder if that monster was friendly... ->");
        enterScanner.nextLine();
        System.out.println("Fin");
        System.out.println("Ending 4 of 7: The Richest Adventurer.");
        System.exit(0);
    }
    public void secondPath(){
        System.out.println("You run towards the shiny thing in the distance as if you're a cat.");
        System.out.println("The shiny object in the distance is a golden chest. ->");
        enterScanner.nextLine();
        System.out.println("On the chest lies a note saying 'take one, the other will vanish'");
        System.out.println("The first item is a golden stand arrow. This will grant you the power of your own stand!");
        System.out.println("The second item is a time stone. One of the six infinity stones. Woah!");
        System.out.println("But which one will you take? ->");
        enterScanner.nextLine();
        System.out.println("1. Stand Arrow.");
        System.out.println("2. Time Stone.");
        choice = myScanner.nextInt();
        if(choice == 1){
            System.out.println("You stabbed yourself with the stand arrow. ->");
            enterScanner.nextLine();
            System.out.println("Admittedly, it hurts at first however the pain heals and you gain a stand.");
            System.out.println("Your stand name is Star Killer. ->");
            enterScanner.nextLine();
            System.out.println("Just then a buff blond man approaches. ->");
            enterScanner.nextLine();
            System.out.println("The Man: It is I, DIO, and I have come to make you my servent.");
            System.out.println("DIO: Do not refuse me, or you will die. ->");
            enterScanner.nextLine();
            System.out.println("Just then, out of panic you release your stand and attack DIO.");
            System.out.println("DIO appears to be behind you as if he teleported. ->");
            enterScanner.nextLine();
            System.out.println("DIO: Come now, don't make me kill you. ->");
            enterScanner.nextLine();
            System.out.println("You use the power of your stand to punch DIO. ->");
            enterScanner.nextLine();
            System.out.println("You the area you punched DIO has become frozen solid.");
            System.out.println("DIO: Wh- what the hell? Your stand can freeze?! ->");
            enterScanner.nextLine();
            System.out.println("Realistically, you have no idea how your stand works. You just got lucky.");
            System.out.println("You prepare to punch again but DIO manages to get carried away by an airplane.");
            System.out.println("DIO: You're lucky I'm still new to this body. Next time we meet will be different however. ->");
            enterScanner.nextLine();
            System.out.println("As DIO flew away with a henchman driving you see an old man with his grandson approach you. ->");
            enterScanner.nextLine();
            System.out.println("Old Man: My name is Joseph Joestar, and this is my grandson Jotaro.");
            System.out.println("Jotaro stands in front of you with a mean look. ->");
            enterScanner.nextLine();
            System.out.println("Jotaro: Tell me everything you know about that man that just flew away.");
            System.out.println("Joseph: Relax Jotaro, can't you see they're shooken up already?");
            System.out.println("Joseph: Look, if you know anything about DIO it is best to tell us. He's dangerous. ->");
            enterScanner.nextLine();
            System.out.println("You explain you know nothing of him and that he just came after you.");
            System.out.println("Joseph pats you on the shoulder and tells you to stay safe.");
            System.out.println("As they proceeded to head off you asked if you could join them, you could be a viable ally.");
            System.out.println("They question you at first but after seeing your stand they agree. ->");
            enterScanner.nextLine();
            System.out.println("You, alongside a man named Advol, asisted them in their world wide trip to stop the evil DIO.");
            System.out.println("After a while you learned the fully potential of your stand, elemental power!");
            System.out.println("You stuck your neck out for them as they did for you.");
            System.out.println("After DIO was defeated you headed back to Morio to retire.");
            System.out.println("However, years later you were called in to help find more stand arrows and DIO's kids.");
            System.out.println("You eventually met your end in the fight against Father Pucci");
            System.out.println("You died surrounded by Jotaro, his daughter and their friends. May they defeat Pucci. ->");
            enterScanner.nextLine();
            System.out.println("Fin");
            System.out.println("Ending 5 of 7: A Member of The Crusaders.");
            System.exit(0);
        }
        if(choice == 2){
            System.out.println("You pick up the time stone and began to fiddle with it. ->");
            enterScanner.nextLine();
            System.out.println("Out of no where a space ship lands and a purple alien charges for you.");
            System.out.println("He says his name is Thanos and needs that time stone to better the universe.");
            System.out.println("You hand the time stone over to Thanos and with that his gauntlet is complete.");
            System.out.println("Thanos thanks you one last time before snapping his fingers.->");
            enterScanner.nextLine();
            System.out.println("You witness some people turning ash.");
            System.out.println("Thanos: Do not worry friend, all of this was for the better of the universe.");
            System.out.println("Thanos: I simply erased half of all life, population is now controlled. ->");
            enterScanner.nextLine();
            System.out.println("Thanos teleports away and you feel yourself filled with guilt.");
            System.out.println("What have you done? ->");
            enterScanner.nextLine();
            System.out.println("Fin.");
            System.out.println("Ending 6 of 7: Infinity Gauntlet.");
            System.exit(0);
        }
        else{
            System.out.println("Invalid choice.");
            secondPath();
        }
    }
    public void thirdPath(){
        System.out.println("Ah, so you made the safest choice after all.");
        System.out.println("Maybe you really are a competent adventurer. ->");
        enterScanner.nextLine();
        System.out.println("You proceed down the path and enter the house. ->");
        enterScanner.nextLine();
        System.out.println("The house seems empty, but full of furniture and treasures. ->");
        enterScanner.nextLine();
        System.out.println("You begin to settle into your new home and think on how life can be good at times. ->");
        enterScanner.nextLine();
        thirdpathEnd();
        System.out.println("----------------------------------------------------------------------");
    }
    public void thirdpathEnd(){
        System.out.println("It has been a week since you've moved in and life has been great. ->");
        enterScanner.nextLine();
        System.out.println("As you prepare your meal for the day a large meteor comes crashing out of the sky. ->");
        enterScanner.nextLine();
        System.out.println("Of course...you don't survive. ->");
        enterScanner.nextLine();
        System.out.println("Fin");
        System.out.println("Ending 7 of 7: Life Isn't So Kind, Friend.");
        System.exit(0);
    }
    public void secretPath(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("While thinking about what path to go down you find a fourth path.");
        System.out.println("You proceed to head down this fourth path. -> ");
        enterScanner.nextLine();
        System.out.println("After walking for thirty minutes you find yourself at a little village.");
        System.out.println("As you walk closer to the village gate you see a bunch of workers. -> ");
        enterScanner.nextLine();
        System.out.println("They all drop what they're doing and look at you with awe. ->");
        System.out.println("Random Villager: The legends were true! ->");
        enterScanner.nextLine();
        System.out.println("You look at them with confusion and begin to wonder if you should go. ->");
        enterScanner.nextLine();
        System.out.println("Another Villager: The successor has returned to us! ->");
        enterScanner.nextLine();
        System.out.println("Farmer: Everyone look! THE SUCCESSOR IS BACK! ->");
        enterScanner.nextLine();
        System.out.println("A knight comes marching out to the field. ->");
        System.out.println("Knight: What is all the ruckus about? ->");
        enterScanner.nextLine();
        System.out.println("You explain to the knight that you were just a wanderer who got lost. ->");
        enterScanner.nextLine();
        System.out.println("Knight: I don't believe my eyes, the successor has returned.");
        System.out.println("Good grief. ->");
        System.out.println("Knight: Adventurer, do you not know who you are? ->");
        enterScanner.nextLine();
        System.out.println("Knight: You're the lost child of the late King and Queen!");
        System.out.println("Knight: We thought you were lost forever, or worse...dead!");
        enterScanner.nextLine();
        System.out.println("Knight: Tell me, your name is " + playerName + " correct? ->");
        enterScanner.nextLine();
        System.out.println("You nod your head in confusion. ->");
        enterScanner.nextLine();
        System.out.println("Knight: Let me lead you to the castle, successor " + playerName + ". ->");
        enterScanner.nextLine();
        System.out.println("At first you were confused and distrusting as you knew no one there.");
        System.out.println("However, the more you stayed you began to open yourself to the villagers.");
        System.out.println("You ruled over the village for 70 years. ->");
        enterScanner.nextLine();
        System.out.println("Within that time you restructured the village and made it better.");
        System.out.println("You married the love of your life and brought children into this world.");
        System.out.println("In your old you reflected on how things would be if you hadn't chose the fourth path.");
        System.out.println("You retired in the second castle you had built and your child became a worthy successor.");
        System.out.println("Fin. ->");
        enterScanner.nextLine();
        System.out.println(" Secret Ending.");
        System.exit(0);
    }
    public static void main(String[] args) {
        Adventure game;
        game = new Adventure();
        game.playerSetUp();
        game.morioCity();
    }
}


