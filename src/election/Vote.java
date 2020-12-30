package election;


import java.util.Arrays;

public class Vote{
    //Values
    private final Candidate candidate;
    private final Voter voter;
    //Methods
    public Vote(Candidate candidate, Voter voter) {
        this.candidate = candidate;
        this.voter = voter;
    }


    //Static Inner Class
    static public class Calculator{
         private final Vote[] votes;
        public Calculator(Vote[] votes) {
            this.votes = votes;
        }

        public Candidate revealWinner(){
            //Count Votes
            for (Vote vote: votes) {
               if(vote.voter.getALive()) vote.candidate.addVote();
            }
            //Compare Votes
            int MaxVotes = 0;
            Candidate winner = null;
            for (Vote vote : votes) {
                if(vote.candidate.getVotes() > MaxVotes){
                    winner = vote.candidate;
                    MaxVotes = vote.candidate.getVotes();
                }
            }
            return  winner;
        }

        public Vote[] getVotes() {
            return votes;
        }

        @Override
        public String toString() {
            return "Calculator{" +
                    "votes=" + Arrays.toString(votes) +
                    '}';
        }
    }
}
