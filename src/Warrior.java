class Warrior extends Character {
    public int weakenCount=0;
   
    public Warrior(String name){
        super(name+" the Warrior",120,100);

    }
    public void attack(Character opponent){
    
        if(power>=5){
            System.out.println(name+" used Attack on "+opponent.name);
            int damage=12;
            if(weakenCount>0){
                damage=6;
                weakenCount--;
            }
            this.power=this.power-5;
            opponent.health-=damage;
            System.out.println(name+" caused"+damage+ " damage.");
        }
        else{
            System.out.println("Not enough power");
        }
    }
    public void special(Character opponent){
        
        if(power>=35){
            int damage=35;
            System.out.println(name+"used Special on "+ opponent.name);
            if(weakenCount>0){
                damage/=2;
                weakenCount--;
            }
            power-=35;
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

