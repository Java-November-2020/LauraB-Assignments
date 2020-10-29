import java.lang.Math;

public class Pythagorean {
    //hypotenuse = sideC opposite the right angle = longest side
    public double calculateHypotenuse(int legA, int legB){
        double sideA = legA;
        double sideB = legB;
        //calculate the square root of sideA + sideB
        double sideC = Math.sqrt((sideA*sideA) + (sideB*sideB));
        return sideC;
    }
}

/*
//import java.util.Scanner; //Scanner -- see --> https://www.tutorialspoint.com/java/util/java_util_scanner.htm

public class Pythagorean {
    //hypotenuse = sideC opposite the right angle = longest side
    public double calculateHypotenuse(){
        //
        Scanner keyboard = new Scanner(System.in);

        double sideA;
        double sideB;
        System.out.println("PYTHAGOREAN THEOREM -- RETURN THE VALUE OF SIDE C:");

        System.out.println("Enter whole number for Side A");
        sideA = keyboard.nextFloat();

        System.out.println("Enter whole number for Side B");
        sideB = keyboard.nextFloat();
        //calculate the square root of sideA + sideB
        double sideC = Math.sqrt((sideA*sideA) + (sideB*sideB));
        return sideC;

    }
}

    /* RESOURCE:
    https://coderanch.com/t/434515/java/Pythagorean-theorem
    */