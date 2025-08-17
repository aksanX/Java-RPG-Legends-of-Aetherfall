class DarkOverLord extends Character{
    
    public int getSpecialcost(){
        return 40;
    }

     public DarkOverLord(String name){
        super(name,200,150);

    }
    public void attack(Character opponent){
    
        if(power>=17){
            System.out.println(name+" used Attack on "+opponent.name);
            int damage=25;
            
            this.power=this.power-17;
            opponent.health-=damage;
            System.out.println(name+" caused"+damage+ " damage.");
        }
        else{
            System.out.println("Not enough power");
        }
    }
    public void special(Character opponent){
        
        if(power>=40){
            int damage=50;
            System.out.println(name+"used Special on "+ opponent.name);
            
            power-=40;
            opponent.health-=damage;  
            System.out.println(name+"caused"+damage+" damage.");
            opponent.applyWeaken();
        }
        else{
            System.out.println("not enough power");
        }
        
    }

}
