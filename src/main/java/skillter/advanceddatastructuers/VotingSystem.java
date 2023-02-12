package skillter.advanceddatastructuers;

import java.util.LinkedHashMap;
import java.util.function.BiFunction;

public class VotingSystem {

    // Create a LinkedHashMap here, with the contestant name as the key
    // and the number of votes as the value.

    public static LinkedHashMap<String, Integer> voteList = new LinkedHashMap<>();

    public static void vote(String contestant) {
        // Implement this method so that a new contestant is added to the map if it's
        // not already there. If it is already there, increment the value by one.
        voteList.merge(contestant, 1, Integer::sum);
    }

    // This method should return the LinkedHashMap field you create at the top of
    // the class.
    public static LinkedHashMap getVoteList() {
        return voteList;
    }


}
