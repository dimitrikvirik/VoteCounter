package election;

/**
 * The main Human Class
 */
public class Human {
   //Values
    protected String ID;
    protected String firstName;
    protected String lastName;
    protected Gender gender;
    //Methods
    public Human(String ID, String firstName, String lastName, Gender gender) {
        try {
            //Data Validation
            if(ID.length() != 11) throw new Exception("ID must contain only 11 digits!");
            if(!ID.matches("[0-9]+"))throw new Exception("ID must contain only digits!");
            if(!firstName.matches("[a-zA-Z]+") || firstName.length() < 2)throw new Exception("Firstname must contain only letters!");
            if(!lastName.matches("[a-zA-Z]+") || lastName.length() < 2)throw new Exception("Lastname must contain only letters");
            //If all okay
            this.ID = ID;
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
        }
        catch (Exception err){
            err.printStackTrace();
        }
    }

    //Getters
    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
