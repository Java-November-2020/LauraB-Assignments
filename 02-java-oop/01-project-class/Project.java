/*You have been asked by a serial entrepreneur to create a class that she can use to create projects easily. She asks that each project has a name and a description. She needs to be able to create empty projects that she can add a name and description to later; projects with just a name; and projects with both. Every single project should be able to get and set both properties.

She also needs each project to be able to give an elevator pitch that will return the name and description separated by a colon.

Of course, you will also need to demo its capabilities for her, so make a ProjectTest class to do this.*/

public class Project {
    //Create a Project class that has the fields of name and description.
    private String name;   //field
    private String description;   //field

    //Constructor
    public Project (String name, String description){
        this.name = name;
        this.description = description;
    }

    //Create an instance method called elevatorPitch that will return the name and description separated by a colon
    public String elevatorPitch(String name, String description){
        return name + ":  " + description;
    }



    //Create getter and setters for each field
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    // Overload the constructor method in three different ways.
    // She needs to be able to create:

    // 1.  Empty projects that she can add a name and description to later
    public String Project() {
        return "";
    }


    //TRIED THIS --> DID NOT WORK
    // //2.  Projects with just a name
    // public String elevatorPitch(String name, String description) {
    //     this.name = name;
    //     return name;
    // }

    // //3.   Projects with name and description
    // public String elevatorPitch(String name, String description) {
    //     this.name = name;
    //     this.description = description;
    //     return "Topic:  " + name + "\n" +  "Description:  " + description;
    // }
}






