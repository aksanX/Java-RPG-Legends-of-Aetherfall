class CorruptedMortal extends Character {
    
   
    public CorruptedMortal(String name){
        super(name,90,90);

    }
    public int getSpecialcost(){
        return 20;
    }
    public void attack(Character opponent){
    
        if(power>=9){
            System.out.println(name+" used Attack on "+opponent.name);
            int damage=18;
            
            this.power=this.power-9;
            opponent.health-=damage;
            System.out.println(name+" caused"+damage+ " damage.");
        }
        else{
            System.out.println("Not enough power");
        }
    }
    public void special(Character opponent){
        
        if(power>=20){
            int damage=25;
            System.out.println(name+"used Special on "+ opponent.name);
            
            power-=20;
            opponent.health-=damage;  
            System.out.println(name+"caused"+damage+" damage.");
        }
        else{
            System.out.println("not enough power");
        }
        
    }
    

}

