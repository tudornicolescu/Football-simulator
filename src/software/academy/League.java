package software.academy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println("The team " + team.getName() + " is already playing in the " + this.getName());
            return false;
        } else {
            teams.add(team);
            return true;
        }
    }

    public void seeTable() {
        Collections.sort(teams, Collections.reverseOrder());
        for (T team : teams) {
            System.out.println(team.getName() + "     " + team.ranking() + "p");
        }
    }
}
