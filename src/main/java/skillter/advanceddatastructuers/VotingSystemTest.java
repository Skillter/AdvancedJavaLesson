package skillter.advanceddatastructuers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VotingSystemTest {

    VotingSystem votingSystem = new VotingSystem();

    @Test
    public void testVote() {

        votingSystem.vote("Contestant One");
        votingSystem.vote("Contestant One");
        votingSystem.vote("Contestant Two");
        votingSystem.vote("Contestant One");
        votingSystem.vote("Contestant Three");
        votingSystem.vote("Contestant Three");

        assertEquals(3, votingSystem.getVoteList().get("Contestant One"));
        assertEquals(1, votingSystem.getVoteList().get("Contestant Two"));
        assertEquals(2, votingSystem.getVoteList().get("Contestant Three"));

    }


    @Test
    public void testOrderOfVotes() {
        votingSystem.vote("Contestant One");
        votingSystem.vote("Contestant One");
        votingSystem.vote("Contestant Two");
        votingSystem.vote("Contestant One");
        votingSystem.vote("Contestant Three");
        votingSystem.vote("Contestant Three");

        assertEquals("Contestant One", votingSystem.getVoteList().keySet().iterator().next());
    }



}