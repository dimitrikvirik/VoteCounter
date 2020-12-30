package election;

/**
 * The Candidate Class. Extends Human Class
 */
abstract public class Candidate extends Human {
    private String name;//Name of party
    private int votes = 0;
    public Candidate(String ID, String firstName, String lastName, Gender gender, String name) {
        super(ID, firstName, lastName, gender);
        try{
          if(!name.matches("[a-zA-Z]+") || name.length() < 2)throw new Exception("Party must contain only letters!");
          this.name = name;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    public void addVote(){votes++;}

    public abstract String saySpeech();

    @Override
    public String toString() {
        return " Candidate from party " + name +
                ", ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender;
    }
}
