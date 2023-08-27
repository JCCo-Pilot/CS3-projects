import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        ExpressionSolverRun ();
        //myFrameKey frame = new myFrameKey();
        //myMouseTest test = new myMouseTest();
        
        
    }
    public static void ExpressionSolverRun(){
        Scanner sc = new Scanner(System.in);
        ExpressionSolver e;
        String exp;
        while(sc.hasNext()) {
            exp = sc.nextLine();
            e = new ExpressionSolver(exp);
            System.out.println(exp + " = " + e.solve());
        }
    }
    public static void karenRunner(){
        System.out.println("Hello adventurer!");
        System.out.println("Pick a character");
        System.out.println("1. Barbarian: uses a sword but has no cool down");
        System.out.println("2. Archer: uses a bow but has 2 sec cooldown");
        Scanner sc = new Scanner(System.in);
        int CharacterChosen = sc.nextInt();
        String Charactername = "Barbarian";
        String CharacterName = "Archer"; 
        String Chracterclothing = "Heavy Armor";
        String Characterclothing = "Light Armor";
    
        if (CharacterChosen==1) {
            Charactername="Barbarian";
            System.out.println("Now choose your clothing");
            System.out.println("1.Heavy armor: Very protective but slows player down");
            System.out.println("2. Light armor: Very vulnerable to attacks but allows player to move fast");
        }
        else if (CharacterChosen==2) {
        Charactername="Hunter"; 
    
        System.out.println("Now choose your clothing");
        System.out.println("1.black hood: very stealthy but very hot");
        System.out.println("2. White hood: easily seen but keeps player cooled-down");
        }
        int clothingChosen = sc.nextInt();
        System.out.println("Now choose your shelter");
        System.out.println("1. Hut: easily damaged but hard to spot");  
        System.out.println("2. Brick house: Easily spot but hard to destroy");
        int shelterChosen = sc.nextInt();
   

        System.out.println("Great, you are ready to start your adventure");
 
        
        boolean correctDecision  = true;
        while (correctDecision){
            System.out.println("Loading into adventure...");
            System.out.println("You are in a dark forest. Suddenly you hear footsteps. It gets louder. You are curious where the footsteps are coming from but you are too scared. What do you do?");
            System.out.println("1.Run away from sound because you are afraid");
            System.out.println("2.Walk towards the sound because you are curious");
            int decisionChosen = sc.nextInt();
            if (decisionChosen==1){
                System.out.println("You run away from the sounds, afraid it is going to hurt you.... But then you slip and you get trapped in a unescapeable net because you were a coward. Try Again.");
            }
            else if (decisionChosen==2) {
                System.out.println("You walked towards the sound. Turns out it was just a raccoon in the woods looking for food. It stares at you and scuried as fast as possible.");
                correctDecision = false;
            }
        }
    
    
      correctDecision = true;
      while (correctDecision){
        System.out.println("You continue walking through the forest. Your goal is to find a safe place to stay for the night and leave when the sun comes out ");
        System.out.println("You wandered further and further and found yourself stuck in a cave. You are terrifed and dont know what to do. You find three things in your pouch");
        System.out.println("1. flashlight");
        System.out.println("2. Hammer");
        System.out.println("3.Burger");
        int decisionChosen1 = sc.nextInt();
        if (decisionChosen1==1) {
            System.out.println("You chose the flashlight, and it leads your way out.");
            correctDecision = false;
        }
        if (decisionChosen1==2) {
            System.out.println("You chose the hammer, but it turns out you aren't trapped, just lost. Try again."); }
        if (decisionChosen1==3) {
           System.out.println("You chose the burger. You really thought you were staying here for the night? Try again."); 
        }
      }
      correctDecision = true;
      while(correctDecision){
        System.out.println ("You find your way out of the cave but turns out a bear is standing outside the cave waiting for its next meal. What do you do?"); 
       System.out.println("Hide in a cave where it can't see you");
       System.out.println(" Run away");
          System.out.println(" Shoot it with your bow");
      System.out.println("Scream at it");
       int decisionChosen2 = sc.nextInt();

        if (decisionChosen2==1){
        System.out.println("You tried running into the cave. The bear has bad eyesight but its ability to smell very far makes it easy to find you.");
        }
        else if (decisionChosen2==2){
            System.out.println("You just can't outrun a bear.Try Again.");
        }
        else if (decisionChosen2==3){
            System.out.println("You take out your bow and shoot the bear but it doesn't do anything.Try Again");
        }
        else if (decisionChosen2==4){
            System.out.println("You scream. The bear runs off.");
            correctDecision = false;
        }
      }
    System.out.println("You quickly run away but the bear has found you and decides to chase you down. You run into your shelter and stay for the night. The next day you find your way out of the forest safely");
    }          
    
    public static void runner(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the RPG Adventure!");
        System.out.println("Choose your character:");
        System.out.println("1. Hunter (Special Ability: Tracking)");
        System.out.println("2. Archer (Special Ability: Precision Shooting)");

        int characterChoice = scanner.nextInt();
        String characterName = "";
        String specialAbility = "";

        if (characterChoice == 1) {
            characterName = "Hunter";
            specialAbility = "Tracking";
        } else if (characterChoice == 2) {
            characterName = "Archer";
            specialAbility = "Precision Shooting";
        } else {
            System.out.println("Invalid choice. Exiting game.");
            System.exit(0);
        }

        System.out.println("You are " + characterName + " with the special ability: " + specialAbility);
        String clothing = "";
        // Character picks clothing and shelter
        System.out.println("Pick your clothing:");
        while(clothing.equals("")){
            clothing = scanner.nextLine();
        }
        //System.out.println("Pick your clothing:");
        //String clothing = scanner.nextLine();
        System.out.println("You are wearing "+clothing);
        System.out.println("Pick your shelter:");
        String shelter = scanner.nextLine();

        System.out.println("Your journey begins!");

        // Problem encounter
        System.out.println("While exploring, you encounter a bear!");
        System.out.println("What will you do?");
        System.out.println("1. Run");
        System.out.println("2. Fight");
        System.out.println("3. Hide");

        int decision = scanner.nextInt();
        String outcome = "";

        if (decision == 1) {
            outcome = "You manage to outrun the bear and find safety.";
        } else if (decision == 2) {
            outcome = "With your " + specialAbility + ", you defeat the bear in a fierce battle!";
        } else if (decision == 3) {
            outcome = "You hide in your " + shelter + " until the bear leaves.";
        } else {
            outcome = "You freeze and the bear notices you. It's not looking good.";
        }

        System.out.println(outcome);
        System.out.println("Congratulations on your adventure, " + characterName + "!");

        scanner.close();
    }
    public static void HistogramRunner(){
        Scanner kbd = new Scanner(System.in);
        Histogram test = new Histogram();
        String input = kbd.nextLine();
        test.run(input);
        System.out.println(test.toString());
    }
    /*public static void ExpressionSolverRunner(){
        Scanner kbd = new Scanner(System.in);
        String input = kbd.nextLine();
        ExpressionSolver solve = new ExpressionSolver(input);
        System.out.println(solve.test());
    }*/
    public static void FibonacciRunner(){
        Scanner kbd = new Scanner(System.in);
        String input = kbd.nextLine();
        Fibonacci fibo = new Fibonacci(input);
        fibo.fill();
        String result = fibo.answer();
        System.out.println(result);
    }
    public static void Spiral(){
        Scanner kbd = new Scanner(System.in);
        int input = kbd.nextInt();
        SpiralMatrix spira = new SpiralMatrix(input);
        spira.fill();
        System.out.println(spira);
    }
}
