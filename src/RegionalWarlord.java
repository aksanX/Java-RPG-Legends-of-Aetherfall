class RegionalWarlord extends Character {
    
   
    public RegionalWarlord(String name){
        super(name,130,110);

    }
    public int getSpecialcost(){
        return 35;
    }
    public void attack(Character opponent){
    
        if(power>=10){
            System.out.println(name+" used Attack on "+opponent.name);
            int damage=20;
            
            this.power=this.power-10;
            opponent.health-=damage;
            System.out.println(name+" caused"+damage+ " damage.");
        }
        else{
            System.out.println("Not enough power");
        }
    }
    public void special(Character opponent){
        
        if(power>=35){
            int damage=30;
            System.out.println(name+"used Special on "+ opponent.name);
            
            power-=35;
            opponent.health-=damage;  
            System.out.println(name+"caused"+damage+"damage.");
              System.out.println(name + " uses Toxic Aura! to " + opponent.name);
             opponent.canAttackAfter = System.currentTimeMillis() + 20000;
        }
        else{
            System.out.println(" not enough power");
        }
        
    }
    

}


