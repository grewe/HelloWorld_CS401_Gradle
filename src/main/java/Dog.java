/**
 * Dog class.  Represents the basics of a Dog and related methods
 */
public class Dog {

    //variables
    /**
     * name of Dog as a String
     */
    String name;

    /**
     * owner's name
     */
    String owner;

    /**
     * age as an int
     */
    int age;

    /**
     * breed of Dog
     */
    String breed;



    //constructors

    /**
     * default constructor initiallizes variables to dummy values
     */
    Dog() {
        name ="Fido";
        owner = "Lynne";
        age = 1;
        breed = "unkown";
    }

    /**
     * constructor that takes in initial values for following class variables
     * @param n   Dog's name
     * @param o   Dog's owner's name
     * @param a   Dog's age as an int
     * @param b   Dog's breed
     */
    Dog(String n, String o, int a, String b){
        this.name = n;
        this.owner = o;
        this.age = a;
        this.breed = b;
    }


    //methods

    /**
     * getter for name of Dog
     * @return the name as a String
     */
    String getName(){
        return this.name;
    }

    /**
     * setter for name of Dog
     * @param n  name to be stored
     */
    void setName(String n){
        this.name = n;
    }

}
