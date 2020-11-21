/*Create an a Galaxy class; should extend from the Phone abstract class and implement the Ringable interface.*/

public class Galaxy  extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return getRingTone();
    }
    @Override
    public String unlockPhone() {
        return "Unlocks via finger print scan\n";
    }
    @Override
    public void displayInfo() {
    	System.out.printf("**********" + getClass().getSimpleName() + " %s**********\n", versionNumber);
    	System.out.printf("Carrier:   \t%s\n", carrier);
    	System.out.printf("Battery:  \t%d\n", batteryPercentage);
    	System.out.print("Ringtone:  \t");


    }
}