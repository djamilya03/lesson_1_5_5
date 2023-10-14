public class Hero {
    private int health;
    private int damage;
    private String superpower;

    public Hero(int health, int damage, String superPower){
        this.health = health;
        this.damage = damage;
        this.superpower = superPower;
    }
    public Hero(int health, int damage){
        this.health = health;
        this.damage = damage;
        this.superpower = "No Superpower";
    }

    public int getHealth(){
        return health;
    }

    public int getDamage(){
        return damage;
    }
    public String getSuperPower(){
        return superpower;
    }
}
