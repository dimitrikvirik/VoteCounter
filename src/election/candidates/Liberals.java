package election.candidates;

import election.Candidate;
import election.Gender;

public class Liberals extends Candidate {

    public Liberals(String ID, String firstName, String lastName, Gender gender){
        super(ID, firstName, lastName, gender, "Liberals");
    }

    @Override
    public String saySpeech() {
       return  "Give vote to Joe Biden!";
    }
}
