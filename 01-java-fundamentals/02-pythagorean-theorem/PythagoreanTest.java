public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean hypSideC = new Pythagorean();
        double hypotenuse = hypSideC.calculateHypotenuse(3,4);
        System.out.println("The hypotenuse (sideC) is: " + hypotenuse);
    }  
}


/*

//Get Hypotenuse by asking for user input
public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean hypotenuse = new Pythagorean();
        double result = hypotenuse.calculateHypotenuse();
        System.out.println("The hypotenuse (Side C) is: " + result);
    }  
}

*/