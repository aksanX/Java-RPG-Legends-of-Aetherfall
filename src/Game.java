import java.util.*;
public class Game {
    public static void main(String[] args){
    
    System.out.println("Choose a character: 1.Mage 2.Archer 3.Warrior");
    Scanner sc1= new Scanner(System.in);
    int choice1= sc1.nextInt();
    Character player= null;
    Character enemy =null;
    
    if(choice1==1){
        System.out.println("You've chosen Mage");
        System.out.println("Enter your Mage name: ");
        String name= sc1.next();
         player = new Mage(name);

}
else if(choice1==2){
        System.out.println("You've chosen Archer");
        System.out.println("Enter your Archer name: ");
        String name= sc1.next();
        player = new Archer(name);

}
else if(choice1==3){
    System.out.println("You've chosen Warrior");
        System.out.println("Enter your Warrior name: ");
        String name= sc1.next();
         player = new Warrior(name);

}

     System.out.println("Choose a villain to fight against : 1. Dark Overlord\n" + //
                  " 2. Regional Warlord\n" + //
                  " 3. Corrupted Mortal");
        
        int choice2= sc1.nextInt();
        if(choice2==1){
             enemy = new DarkOverLord("DarkOverLord");
            System.out.println(player.name + " enters the world of Aetherfall ! ");
            System.out.println(enemy.name+" rises to spread chaos !");
        }
        else if(choice2==2){
           enemy = new RegionalWarlord("RegionalWarLord");
            System.out.println(player.name + " enters the world of Aetherfall ! ");
            System.out.println(enemy.name+" rises to spread chaos !");
        }
        else if(choice2==3){
             enemy = new CorruptedMortal("CorruptedMortal");
            System.out.println(player.name + " enters the world of Aetherfall ! ");
            System.out.println(enemy.name+" rises to spread chaos !");

        }
     
    while(player.isAlive() && enemy.isAlive() ){
        System.out.println(" Battle Start !");
        System.out.println("Enter move (attack/special):");
        String move = sc1.next();
        if(move.equalsIgnoreCase("attack")){
            if (!player.canAttackNow()) {
    System.out.println(player.name + " is stunned and cannot attack yet!");
    continue;
}

            player.attack(enemy);
        }
        else if(move.equalsIgnoreCase("special")){
            if (!player.canAttackNow()) {
            System.out.println(player.name + " is stunned and cannot attack yet!");
             continue;
}

            player.special(enemy);

        }
        else{
            System.out.println("Invalid move, please enter 'attack' or 'special'.");
                continue;
        }
             player.displayStats(enemy);
        
        if(!enemy.isAlive()) break;
        System.out.println("Enemy Attacks");
        if(move.equalsIgnoreCase("attack")){
            enemy.attack(player);
        }
        else if(enemy.power>=enemy.getSpecialcost()){
            enemy.special(player);
        }

            player.displayStats(enemy);
    }
       
        System.out.println("--------- Results ---------");
        if (player.isAlive()) {
            System.out.println(player.name + " wins the battle!");
            System.out.println(enemy.name + " has been defeated!");
        } else {
            System.out.println(enemy.name + " wins the battle!");
            System.out.println(player.name + " has been defeated!");
        }
    }


    }

