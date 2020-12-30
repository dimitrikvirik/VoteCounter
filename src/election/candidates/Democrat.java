package election.candidates;

import election.Candidate;
import election.Gender;

public class Democrat extends Candidate {
    public Democrat(String ID, String firstName, String lastName, Gender gender) {
        super(ID, firstName, lastName, gender, "Democrat");
    }

    @Override
    public String saySpeech() {
        return  "Give vote to Donal Trump!";
    }
}
