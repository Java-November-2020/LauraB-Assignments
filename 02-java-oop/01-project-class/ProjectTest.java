public class ProjectTest{
    public static void main(String[] args){

    // Create a ProjectTest file that will test all the functionality
    Project project1 = new Project("Java", "Undoubtedly, a very hard language to learn.  I have a headache.");
    String pitch1 = project1.elevatorPitch(); //invokes method from line 33
    System.out.println(pitch1);

    Project emptyProject = new Project();
    System.out.println(emptyProject.getName()); //should print null for an empty project

    Project project3 = new Project("The Orange Belt", "The most difficult birthday gift I ever received.");
    System.out.println(project3.getName());
    System.out.println(project3.elevatorPitch()); //invokes method from line 33 //Print the elevator pitch for project 3
    }
}

// NOTE:
//This file is the Executable (Worker Bee)