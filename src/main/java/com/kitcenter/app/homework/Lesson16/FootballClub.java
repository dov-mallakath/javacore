package com.kitcenter.app.homework.Lesson16;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-20
 */
public class FootballClub extends SportsClub {

    public FootballClub(String name, String location) {
        super(name, location);
        this.setDefeats(0);
        this.setDraws(0);
        this.setWins(0);
    }

    @Override
    public int getWins() {
        return wins;
    }

    @Override
    public int getDraws() {
        return draws;
    }

    @Override
    public int getDefeats() {
        return defeats;
    }

    @Override
    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public void setDraws(int draws) {
        this.draws = draws;
    }

    @Override
    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }
}
