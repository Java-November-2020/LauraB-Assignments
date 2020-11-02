public class StringManipulatorController{
        public static void main(String[] args){

                //***********String trimAndConcat(String, String)************/
        StringManipulator manipulator1 = new StringManipulator();
        String str = manipulator1.trimAndConcat("     Hello     ", "     World     ");
        System.out.println();
        System.out.println("***********Integer getIndexOrNull(String, char)************"); // eworld
        System.out.println();
        System.out.println("Trim both input strings and then concatenate them.");
        System.out.println("Before:  " + "     Hello     " + "      World     ");
        System.out.println("After:  " + str);
        System.out.println();


//***********Integer getIndexOrNull(String, char) ************/

        StringManipulator manipulator2 = new StringManipulator();
        char letter = 'o';
        String a1 = manipulator2.getIndexOrNull("Coding", letter); // o is at index/position 1
        String b1 = manipulator2.getIndexOrNull("Hello World", letter); // o is at index/position 4
        String c1 = manipulator2.getIndexOrNull("Hi", letter);  //o does not exist in this, should get null
        System.out.println();
        System.out.println("***********Integer getIndexOrNull(String, char)************"); // eworld
        System.out.println();
        System.out.println("The letter 'o' is found at index :  " + a1 + " in 'Coding'."); // 1
        System.out.println("The first occurrence of the letter 'o' is found at index :  " + b1 + " in 'Hello World'."); // 4
        System.out.println(c1 + " --> The letter 'o' does not appear in 'Hi'."); // null
        System.out.println();


//***********Integer getIndexOrNull(String, String) ************/

        StringManipulator manipulator3 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        String a2 = manipulator3.getIndexOrNull(word, subString); //get the index position of the substring "llo" in the word "Hello"
        String b2 = manipulator3.getIndexOrNull(word, notSubString); //"world" is not found in the word "Hello"
        System.out.println();
        System.out.println("***********Integer getIndexOrNull(String, String)************"); // eworld
        System.out.println();
        System.out.println("The subString 'llo' begins at index :  " + a2 + " in the word 'Hello'."); // 2
        System.out.println(b2 + " --> The word 'world' does not appear in 'Hello'."); // null
        System.out.println();

//***********String concatSubstring(String, int, int, String)************/
        StringManipulator manipulator4 = new StringManipulator();
        String word1 = manipulator4.concatSubstring("Hello", 1, 2, "world");
        System.out.println();
        System.out.println("***********String concatSubstring(String, int, int, String)************"); // eworld
        System.out.println();
        System.out.println("Let's strip the 'e' from 'Hello' and it to the word 'world', to get: " + word1); // eworld
        }
}