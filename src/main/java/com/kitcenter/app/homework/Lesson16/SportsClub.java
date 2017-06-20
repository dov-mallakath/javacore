package com.kitcenter.app.homework.Lesson16;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-06-20
 */
public abstract class SportsClub {

    private String name;
    private String location;
    protected int wins;
    protected int draws;
    protected int defeats;

    public SportsClub(String name, String location) {
        this.setName(name);
        this.setLocation(location);
    }

    public String getName(){
        return this.name;
    }

    public String getLocation(){
        return this.location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    abstract int getWins();

    abstract int getDraws();

    abstract int getDefeats();

    abstract void setWins(int wins);

    abstract void setDraws(int draws);

    abstract void setDefeats(int defeats);

    public String toString(){
        return "Sports club type: " + this.getClass().getSimpleName() + "\n" +
                "Sports club name: " + this.getName() + "\n" +
                "Sports club location: " + this.getLocation() + "\n" +
                "Club statistics: " + "\n" +
                " wins: " + getWins() + "\n" +
                " defeats: " + getDefeats() + "\n" +
                " draws: " + getDraws();
    }}
