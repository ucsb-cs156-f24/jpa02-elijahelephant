package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f24-09", t.getName());
    }

        @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Elijah"),"Team should contain Elijah");
        assertTrue(t.getMembers().contains("Nathaniel"),"Team should contain Nathaniel");
        assertTrue(t.getMembers().contains("Alec"),"Team should contain Alec");
        assertTrue(t.getMembers().contains("Neil"),"Team should contain Neil");
        assertTrue(t.getMembers().contains("Tom"),"Team should contain Tom");
        assertTrue(t.getMembers().contains("Hongtao"),"Team should contain Hongtao");

    
    }
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    @Test
    public void equals_returns_true_for_same_team() {
        Team team2 = new Team("test-team");
        assert(team.equals(team2));
    }

    @Test
    public void equals_returns_false_for_different_team() {
        Team team2 = new Team("test-team2");
        assert(!team.equals(team2));
    }

    @Test
    public void equals_returns_false_for_null() {
        assert(!team.equals(null));
    }

    @Test
    public void equals_returns_false_for_different_class() {
        assert(!team.equals("test-team"));
    }

    @Test
    public void equals_returns_true_when_compared_with_itself() {
        assertTrue(team.equals(team), "A team should be equal to itself.");
    }


   @Test
    public void equals_returns_false_for_same_name_different_members() {
        Team team1 = new Team("test-team");
        team1.addMember("Elijah");

        Team team2 = new Team("test-team");
        team2.addMember("Nathaniel");

        assertFalse(team1.equals(team2), "Teams with the same name but different members should not be equal.");
    }

    @Test
    public void equals_returns_false_for_different_name_same_members() {
        Team team1 = new Team("test-team1");
        team1.addMember("Elijah");

        Team team2 = new Team("test-team2");
        team2.addMember("Elijah");

        assertFalse(team1.equals(team2), "Teams with different names but the same members should not be equal.");
    }

    @Test
    public void hashCode_is_equal_for_equal_teams1() {
        Team t1 = new Team("foo");
        t1.addMember("bar");

        Team t2 = new Team("foo");
        t2.addMember("bar");

        assertEquals(t1.hashCode(), t2.hashCode(), "Equal teams should have the same hash code.");
    }

    @Test
    public void hashCode_is_equal_for_equal_teams2() {
        Team t1 = new Team("foo");
        t1.addMember("bar");

        Team t2 = new Team("foo");
        t2.addMember("bar");

        assertEquals(t1.hashCode(), t2.hashCode(), "Equal teams should have the same hash code.");
    }

    @Test
    public void hash_code_equality() {
    Team t = new Team("foo");
    int result = t.hashCode();
    int expectedResult = 101575;
    assertEquals(expectedResult, result);
    }





    



}
