package software.academy;

public class Main {

    public static void main(String[] args) {
        /*FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("LA Galaxy");
        brokenTeam.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());*/

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        Team<SoccerPlayer> astonVilla = new Team<>("Aston Villa");
        Team<SoccerPlayer> leedsUnited = new Team<>("Leeds United");
        Team<SoccerPlayer> manUtd = new Team<>("Man Utd");
        Team<SoccerPlayer> arsenal = new Team<>("Arsenal");
        Team<SoccerPlayer> westHam = new Team<>("West Ham");

        liverpool.matchResult(astonVilla, 3, 1);
        leedsUnited.matchResult(arsenal, 2, 2);
        manUtd.matchResult(westHam, 3, 2);
        westHam.matchResult(liverpool, 0, 2);
        leedsUnited.matchResult(manUtd, 0, 0);
        arsenal.matchResult(astonVilla, 1, 2);

        League<Team<SoccerPlayer>> prem = new League<>("Premier League");
        prem.addTeam(liverpool);
        prem.addTeam(astonVilla);
        prem.addTeam(leedsUnited);
        prem.addTeam(manUtd);
        prem.addTeam(arsenal);
        prem.addTeam(westHam);

        prem.seeTable();
    }
}
