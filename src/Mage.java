   class Mage extends Character {
    public int weakenCount=0;
   
    public Mage(String name){
        super(name+" the mage",80,100);

    }
    public void attack(Character opponent){
    
        if(power>=10){
            System.out.println(name+" used Attack on "+opponent.name);
            int damage=20;
            if(weakenCount>0){
                damage=10;
                weakenCount--;
            }
            this.power=this.power-10;
            opponent.health-=damage;
            System.out.println(name+" caused"+damage+ " damage.");
        }
        else{
            System.out.println("Not enough power");
        }
    }
    public void special(Character opponent){
        
        if(power>=30){
            int damage=40;
            System.out.println(name+"used Special on "+ opponent.name);
            if(weakenCount>0){
                damage/=2;
                weakenCount--;
            }
            power-=30;
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
