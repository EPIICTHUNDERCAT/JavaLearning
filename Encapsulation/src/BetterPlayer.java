public class BetterPlayer {

    private int hitPoints = 100;
    private String name;
    private String weapon;

    public BetterPlayer(int health, String name, String weapon) {
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.name = name;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;

        if (this.hitPoints <= 0) {
            System.out.println("Player Has Died");
        }

    }


    public int getHitPoints() {
        return hitPoints;
    }
}
