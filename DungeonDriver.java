/**
 * 
 * @author nonol
 *
 */
public class DungeonDriver {
    public static void main(String[] args) {
        Knight Galahad = new Knight("Galahad", 6, 7, true);
        Knight Lancelot = new Knight("Lancelot", 5, 30, false);
        Archer Archie = new Archer("Archie", 2, 10);

        Archie.attack(Lancelot);
        System.out.println(Archie);
        System.out.println(Lancelot);
        System.out.println("////////////////////////////////////////");
        Galahad.attack(Archie);
        System.out.println(Galahad);
        System.out.println(Archie);
        System.out.println("////////////////////////////////////////");
        Archie.attack(Galahad);
        System.out.println(Archie);
        System.out.println(Galahad);
        System.out.println("////////////////////////////////////////");
        Lancelot.attack(Galahad);
        System.out.println(Galahad);
        System.out.println(Lancelot);
        System.out.println("////////////////////////////////////////");
        Lancelot.challenge(Galahad);
        System.out.println(Galahad);
        System.out.println(Lancelot);
        System.out.println("////////////////////////////////////////");
    }
}
