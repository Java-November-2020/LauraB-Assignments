public class ProjectTest{
    public static void main(String[] args){

    // Create a ProjectTest file that will test all the functionality
    Project project1 = new Project("Java", "Undoubtedly, a very hard language to learn.  I have a headache.");
    String pitch1 = project1.elevatorPitch("Java", "Undoubtedly, a very hard language to learn.  I have a headache.");
    System.out.println(pitch1);

    Project elevatorPitch = new Project("The Orange Belt", "The most difficult birthday gift I ever received.");
    System.out.println(elevatorPitch.Project());
    System.out.println(elevatorPitch.getName());
    System.out.println(elevatorPitch.getName() +": " + elevatorPitch.getDescription());
    }
}

//Need more clarification on this subject.  I don't understand it.