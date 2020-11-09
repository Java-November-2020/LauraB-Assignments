// create a separate class of bat
public class Bat extends Mammal{
	public Bat(int energyLvl) {
		super(energyLvl);
	}

    //Fly lose energy level (-50).
	public void fly() {
		energyLvl -= 50;
		System.out.printf("WHOOOOOOOOOOOSH!  Bat's energy has been depleted to:  %d\n", this.energyLvl);
	}

	//Eeat Humans regain energy level (+25). 
	public void eatHumans() {
		energyLvl += 25;
		System.out.printf("SO MORBID! Bat's energy increased to:  %d\n", this.energyLvl);
	}

	//Attack Town lose energy level (-100).
	public void attackTown() {
		energyLvl -= 100;
		System.out.printf("Crackle, pop, crackle, crackle, boom!  Attacking the town has depleted the Bat's energy level to:  %d\n", this.energyLvl);
	}
}