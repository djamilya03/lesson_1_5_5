public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenceType("Armor");

        System.out.println("Boss Information:");
        System.out.println("Health:" + boss.getHealth());
        System.out.println("Damage:" + boss.getDamage());
        System.out.println("Defense Type:" + boss.getDefenceType());
    }
}