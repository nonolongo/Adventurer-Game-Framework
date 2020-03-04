//I worked on the homework assignment alone, using only course materials.
/**
 *
 * @author Noah Longhi
 * @version 1.0
 */
public class Archer extends Adventurer {
    protected int arrows = 10;

    /**
     * Constructor that creates an Archer object with a given name, attack, and
     * health value.
     *
     * @param n Name of the Archer
     * @param a Attack value of the Archer // How much damage the archer can inflict
     *          onto other adventurers.
     * @param h Health value of the Archer
     */
    public Archer(String n, int a, int h) {
        super(n, a, h);
    }

    /**
     * Constructor that creates an Archer object with only a given name.
     *
     * @param n Name of the Archer
     */
    public Archer(String n) {
        super(n, 40, 75);
    }

    /**
     * Accessor for the arrows variable for the Archer object.
     *
     * @return Returns an integer for the number of arrows an archer has
     */
    public int getArrows() {
        return arrows;
    }

    /**
     * Mutator for the arrows variable for the Archer object.
     *
     * @param arrows Changes the Archer's amount of arrows
     */
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    /**
     * Makes an archer attack another adventurer.
     *
     * @param a Adventurer that is being attacked
     */
    public void attack(Adventurer a) {
        if (a.name == null || this.name == null) {
            return;
        }
        if (this.getArrows() >= 1 && this.health > 0) {
            a.setHealth(a.getHealth() - (this.getAttack()));
            this.setArrows(this.getArrows() - 1);
            if (a.getHealth() < 0) {
                a.setHealth(0);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        Archer a = (Archer)o;
        if (this.name == a.name && this.attack == a.attack && this.health == a.health) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Archer [arrows=" + arrows + ", name=" + name + ", attack=" + attack + ", health=" + health + "]";
    }

}
