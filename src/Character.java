
abstract public class Character{
    protected String name;
    protected int health;
    protected int power;
    protected long canAttackAfter = 0;
    public Character(String name,int health, int power){
        this.name=name;
        this.health=health;
        this.power=power;
    }
    public void displayStats(Character opponent){
        System.out.println("-------- Game Stats--------");
        System.out.println(this.name+" -Health: "+this.health+" Power: "+this.power);
        System.out.println(opponent.name+"-Health:  "+ opponent.health+" Power: "+ opponent.power);
}
public abstract void attack(Character opponent);
public abstract void special(Character opponent);

public  boolean isAlive(){
    return health>0;
}
public  int getSpecialcost(){
    return 0;
}
public void applyWeaken(){

}
public boolean canAttackNow() {
    return System.currentTimeMillis() >= canAttackAfter;
}


}