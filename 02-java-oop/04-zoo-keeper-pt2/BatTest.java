public class BatTest{
    public static void main(String[] args) {
        Bat giantBat = new Bat(300);
        giantBat.displayEnergy();
        System.out.println("-------------------------------------------------------------------------------------------------");

        //attack 3 towns
        System.out.println("\nATTACK TOWN:");
        giantBat.attackTown();
        giantBat.attackTown();
        giantBat.attackTown();

        //eat 2 humans
        System.out.println("\nEAT HUMANS:");
        giantBat.eatHumans();
        giantBat.eatHumans();

        //fly twice
        System.out.println("\nFLY:");
        giantBat.fly();
        giantBat.fly();
        System.out.println("-------------------------------------------------------------------------------------------------");
    
        //Print the giantBat's energy level.
        System.out.println("\nGIANT BAT IS DEAD -- YAAAAAAAAY!");
        giantBat.displayEnergy();
    }
}