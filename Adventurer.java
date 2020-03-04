//I worked on the homework assignment alone, using only course materials.
/**
 *
 * @author Noah Longhi
 * @version 1.0
 */

public abstract class Adventurer {
    protected String name;
    protected final int attack;
    protected int health;

    /**
     * Constructor that creates an Adventurer object with a user set name, attack,
     * and health.
     *
     * @param n Name for the Adventurer
     * @param a Attack value that the Adventurer can inflict on others // amount of
     *          health they can remove from others
     * @param h Health value that the Adventurer starts with
     */
    public Adventurer(String n, int a, int h) {
        name = n;
        attack = a;
        health = h;
    }

    /**
     * Allows for an adventurer to health with the use of this potion.
     */
    public void potion() {
        this.health += 15;
    }

    /**
     * Accessor for the health variable.
     *
     * @return Health of an adventurer
     */
    public int getHealth() {
        return health;
    }

    /**
     * Mutator for the health variable.
     *
     * @param health Initial health of the adventurer before changing
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Accessor for the attack variable.
     *
     * @return Attack of an adventurer
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Abstract method that is overridden in subclasses.
     *
     * @param a Take in an adventurer to be attacked by another adventurer
     */
    public abstract void attack(Adventurer a);

    /**
     * Checks if two adventurers are equal to each other.
     *
     * @param a Takes in an adventurer and compares it to another
     * @return Outputs a boolean showing whether if they are equal or not
     */
    public boolean equals(Object o) {
        Adventurer a = (Adventurer)o;
        if (this.name == a.name && this.attack == a.attack && this.health == a.health) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Adventurer [name=" + name + ", attack=" + attack + ", health=" + health + "]";
    }
}
