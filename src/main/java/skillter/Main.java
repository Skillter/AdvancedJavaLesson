package skillter;

import skillter.advanceddatastructuers.HashmapExample;
import skillter.advanceddatastructuers.VotingSystem;

public class Main {
    public static void main(String[] args) {
        HashmapExample.initHashmap("snack", 1);

        VotingSystem.vote("Skillter");
        System.out.println(VotingSystem.getVoteList());
        VotingSystem.vote("Skillter");
        System.out.println(VotingSystem.getVoteList());
    }
}