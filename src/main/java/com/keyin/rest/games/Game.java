package com.keyin.rest.games;

import com.keyin.rest.team.Team;
import jakarta.persistence.*;

import java.util.Calendar;

public class Game {

    @Id
    @SequenceGenerator(name = "game_sequence", sequenceName = "game_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "game_sequence")
    private long id;

    @ManyToOne
    @JoinColumn(name = "home_team_id")
    private Team homeTeam;

    @ManyToOne
    @JoinColumn(name = "away_team_id")
    private Team awayTeam;

    private Calendar gameDate;

    // Getters & Setters //

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Team getHomeTeam(){
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Calendar getGameDate(){
        return gameDate;
    }

    public void setGameDate(Calendar gameDate){
        this.gameDate = gameDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
