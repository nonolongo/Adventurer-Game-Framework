//I worked on the homework assignment alone, using only course materials.
/**
 *
 * @author Noah Longhi
 * @version 1.0
 */
public class Knight extends Adventurer {
    protected boolean squire;

    /**
     * Constructor that creates a Knight object with a given name, attack, health,
     * and squire value.
     *
     * @param n Name of Knight
     * @param a Attack of Knight // How much this knight can inflict on another
     * @param h Health value of knight
     * @param s Displays whether or not a knight has a squire
     */
    public Knight(String n, int a, int h, boolean s) {
        super(n, a, h);
        squire = s;
    }

    /**
     * Constructor that creates a knight object with only a name inputed.
     *
     * @param n Name of the Knight
     */
    public Knight(String n) {
        super(n, 15, 100);
        squire = true;
    }

    /**
     * Mutator for the squire value of a knight.
     *
     * @param squire Takes in the existing value of squire and changes it
     */
    public void setSquire(boolean squire) {
        this.squire = squire;
    }

    /**
     * Allows the knight to attack another adventurer.
     * 
     * @param a Adventurer that is being attacked
     */
    public void attack(Adventurer a) {
        if (a.name == null || this.name == null) {
            return;
        }
        if (this.health > 0) {
            if (this.squire) {
                a.setHealth(a.getHealth() - (this.getAttack() * 2));
            } else {
                a.setHealth(a.getHealth() - this.getAttack());
            }
            if (a.getHealth() < 0) {
                a.setHealth(0);
            }
        }
    }

    /**
     * Allows for a knight to challenge another knight for their squire given that
     * the knight had above zero health and does not have a squire while the other
     * one does.
     * 
     * @param k The Knight that is being challenged and has a squire
     */
    public void challenge(Knight k) {
        if (k.name == null || this.name == null)
            return;
        if (this.health > 0 && !this.squire && k.squire) {
            k.setHealth(k.getHealth() - this.getAttack());
            if (k.health > 0) {
                this.setHealth(this.getHealth() - k.getAttack());
            } else {
                this.setSquire(true);
                k.setSquire(false);
            }
            if (k.getHealth() < 0) {
                k.setHealth(0);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        Knight a = (Knight)o;
        if (this.name == a.name && this.attack == a.attack && this.health == a.health) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Knight [squire=" + squire + ", name=" + name + ", attack=" + attack + ", health=" + health + "]";
    }

}
