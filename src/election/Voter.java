package election;

/**
 * Voter Class. Extends Human Class
 */
public class Voter extends Human {
    private Boolean isALive;
    private int age;
    public Voter(String ID, String firstName, String lastName, Gender gender, Boolean isALive, int age) {
        super(ID, firstName, lastName, gender);
        try {
            if (age < 18) throw  new    Exception("Voter too young!");
            this.isALive = ID != null && isALive;
            this.age = age;
        }
        catch (Exception err){
            err.printStackTrace();
        }
    }

    public Boolean getALive() {
        return isALive;
    }


    @Override
    public String toString() {
        return "Voter{" +
                "isALive=" + isALive +
                ", ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
