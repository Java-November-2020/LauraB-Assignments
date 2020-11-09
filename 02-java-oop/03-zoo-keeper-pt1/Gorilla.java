// create a separate class of gorilla
public class Gorilla extends Mammal {
    public Gorilla(int energyLvl) {
		super(energyLvl);
    }
    
    //can throw things at people but will lose energy level (-5) whenever this is done.
    public void throwSomething(){
        energyLvl -= 5;
        System.out.printf("Energy Level decreased to:  %d\n", this.energyLvl);
    }

    //Eeat Bananas and regain energy level (+10). 
    public void eatBananas(){
        energyLvl += 10;
        System.out.printf("Reenergized to:  %d\n", this.energyLvl);
    }

    //The gorilla should also be able to climb at the expense of energy level (-10).
    public void climb(){
        energyLvl -= 10;
        System.out.printf("Energy Level decreased to:  %d\n", this.energyLvl);
    }
}