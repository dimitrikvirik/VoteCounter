package dimitrikvirik.git;

import election.*;
import election.candidates.*;

public class Main {

    public static void main(String[] args) {
        Candidate[] candidates = {
                new Democrat("01005021650", "Donald", "Trump", Gender.MALE),
                new Liberals("01005021654", "Joe", "Biden", Gender.MALE)
        };
        Voter[] voters = {
                new Voter("01005021659", "Dimitri", "Kvirikashvili", Gender.MALE, true, 23),
                new Voter("01005021656", "Maka", "Kobiashvili", Gender.FEMALE, true, 21),
                new Voter("01005021690", "Lana", "Sandroshvili", Gender.FEMALE, true, 18),
                new Voter("01005021691", "Bub", "Aigen", Gender.MALE, true, 19),
                new Voter("01005021692", "Elon", "Mask", Gender.MALE, true, 20),
        };
        Vote[] votes = {
                new Vote(candidates[0], voters[0]),
                new Vote(candidates[0], voters[1]),
                new Vote(candidates[0], voters[2]),
                new Vote(candidates[1], voters[3]),
                new Vote(candidates[1], voters[4]),
        };
        Vote.Calculator election = new Vote.Calculator(votes);
        System.out.println(election.revealWinner());
    }
}
