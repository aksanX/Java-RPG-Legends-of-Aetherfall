import java.util.*;
class Archer extends Character {
    public int weakenCount=0;
   
    public Archer(String name){
        super(name+" the Archer",100,100);

    }
    public void attack(Character opponent){
    
        if(power>=8){
            System.out.println(name+" used Attack on "+opponent.name);
            int damage=15;
            if(weakenCount>0){
                damage/=2;
                weakenCount--;
            }
            this.power=this.power-8;
            opponent.health-=damage;
            System.out.println(name+" caused"+damage+ "damage.");
        }
        else{
            System.out.println("Not enough power");
        }
    }
    public void special(Character opponent){
       System.out.println("Choose special move: 1.quickshot 2.multishot");
       Scanner sc = new Scanner(System.in);
      
       int choice= sc.nextInt();
       if(choice==1){
         quickShot(opponent);
       }
       else if(choice==2){
        multiShot(opponent);
       }
       
    } 
      
        
        public void quickShot(Character opponent){
            if(power>=25){
            int damage=30;
            System.out.println(name+"used Special on "+ opponent.name);
            if(weakenCount>0){
                damage/=2;
                weakenCount--;
            }
            power-=25;
            opponent.health-=damage;  
            System.out.println(name+"caused"+damage+" damage.");
        }
        else{
            System.out.println("not enough power");
        }
        
    }
    public void multiShot(Character opponent){
            if(power>=50){
            int damage=60;
            System.out.println(name+"used Special on "+ opponent.name);
            if(weakenCount>0){
                damage/=2;
                weakenCount--;
            }
            power-=50;
            opponent.health-=damage;  
            System.out.println(name+"caused"+damage+" damage.");
        }
        else{
            System.out.println("not enough power");
        }
        
    }
      


    public void applyWeaken(){
     this.weakenCount=3;
}

}

