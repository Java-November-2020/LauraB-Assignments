/*You have been asked by a serial entrepreneur to create a class that she can use to create projects easily. She asks that each project has a name and a description. She needs to be able to create empty projects that she can add a name and description to later; projects with just a name; and projects with both. Every single project should be able to get and set both properties.

She also needs each project to be able to give an elevator pitch that will return the name and description separated by a colon.

Of course, you will also need to demo its capabilities for her, so make a ProjectTest class to do this.*/

public class Project { //definition/blueprint for the class
    //Create a Project class that has the fields of name and description.
    private String name;   //field //private because of information hiding - don't reveal more of the content than necessary
    private String description;   //field

    //Constructor overloading - different ways to make an object (define multiple constructors with different parameters
    //Constructor

    //Constructor 1.  Empty projects that she can add a name and description to later
    public Project (){
    }

    //Constructor 2.  Projects with just a name
    public Project (String name){
        this.name = name; //assignment expression
    }
    //Constructor 3.   Projects with name and description
    public Project (String name, String description){
        this.name = name; //assignment expression
        this.description = description;
    }

    //Create an instance method called elevatorPitch that will return the name and description separated by a colon
    public String elevatorPitch(){
        return this.name + ":  " + this.description;
    }

    //Create getter and setters for each field
    //for Getters - visibility (public), return type (String), method name (getName(with no parameters in this case))
    public String getName(){
        return this.name;
    }

    //for Setters - visibility (public), return type (void), method name(parameter type parameter name)  (setName(String name) in this case)
    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}

// NOTE:
//This file is the Blueprint (Beehive)




