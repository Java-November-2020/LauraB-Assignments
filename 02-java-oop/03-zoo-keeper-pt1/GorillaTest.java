public class GorillaTest{
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(100);
        gorilla.displayEnergy();
        System.out.println("-------------------------------------------------------------------------------------------------");

        //She asks that you demonstrate that the class works as expected by having the gorilla throw things 3 times.
        System.out.println("\nTHROW SOMETHING:");
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();

        //eat bananas twice
        System.out.println("\nEAT BANANAS:");
        gorilla.eatBananas();
        gorilla.eatBananas();

        //Climb once
        System.out.println("\nCLIMB:");
        gorilla.climb();
        System.out.println("-------------------------------------------------------------------------------------------------");
    
        //Print the gorilla's energy level.
        System.out.println("\nAFTER ACTIVITIES:");
        gorilla.displayEnergy();
    }
}