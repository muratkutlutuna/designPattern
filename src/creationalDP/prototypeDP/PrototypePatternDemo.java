package creationalDP.prototypeDP;

/**
 * Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time
 * and resources you have a similar object already existing.
 *
 * Prototype pattern provides a mechanism to copy the original object to a new object and modify it according to our needs.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        Soldier availableSoldier = new Soldier(10, 45, 28,
                50, 60, 5, "Sward", true);
        availableSoldier.showSoldierInfo();

        Soldier notAvailableSoldier = new Soldier(10, 45, 28,
                50, 60, 5, "Sward", false);
        notAvailableSoldier.showSoldierInfo();

        //to clone the prototype class
        Soldier notAvailableSoldier2 = availableSoldier.clone();
        notAvailableSoldier2.setAvailableToFight(false);
        notAvailableSoldier2.setWeapon("Gun");
        notAvailableSoldier2.showSoldierInfo();

    }
}
