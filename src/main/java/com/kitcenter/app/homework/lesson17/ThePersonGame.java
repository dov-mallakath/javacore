package com.kitcenter.app.homework.lesson17;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;

/**
 * @author Denys Ovcharuk (DOV) / WorldTicket A/S
 * @since 2017-07-01
 */
public class ThePersonGame {

    private HashSet<Persons> personsPlayed = new HashSet<>();
    private ArrayList<Persons> personsList = new ArrayList<>();
    private int correctCount = 0;

    public ThePersonGame(){
        for (Persons person:Persons.values()) {
            personsList.add(person);
        }
    }

    private boolean isTheEnd(){
        if (personsPlayed.size()==personsList.size()){
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinner(){
        if (correctCount<3){
            return false;
        } else {
            return true;
        }
    }

    private int nextIndex(){
        if(!isTheEnd()) {
            int index = new Random().nextInt(personsList.size());
            while (personsPlayed.contains(personsList.get(index))) {
                index = new Random().nextInt(personsList.size());
            }
            return index;
        }
        return -1;
    }

    public Persons getNexPerson(){
        if(!isTheEnd()&&!isWinner()) {
            Persons nextPerson = personsList.get(nextIndex());
            personsPlayed.add(nextPerson);
            return nextPerson;
        } else {
            return null;
        }
    }

    public boolean isResponseCorrect(Persons person, String date) throws Exception{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = new Calendar.Builder().build();
        try {
            calendar.setTime(simpleDateFormat.parse(date));
        } catch (Exception e) {
            calendar.setTime(simpleDateFormat.parse("0000-00-00"));
        }
        boolean response = person.getBirthDay().equals(calendar);
        if (response) {this.correctCount++;}
        return response;
    }

    public boolean isResponseCorrect(Persons person, String date, Boolean isAlive) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = new Calendar.Builder().build();
        try {
            calendar.setTime(simpleDateFormat.parse(date));
        } catch (Exception e) {
            calendar.setTime(simpleDateFormat.parse("0000-00-00"));
        }
        boolean response = person.getBirthDay().equals(calendar)&&isAlive==person.isAlive();
        if (response) {this.correctCount++;}
        return response;
    }

    public int getCorrectCount() {
        return correctCount;
    }
}
