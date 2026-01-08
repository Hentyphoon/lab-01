package com.example.petshop;

import java.util.Date;

public abstract class Mood {

    private Date day;
    public abstract String mood_rn();
    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Mood(Date day){
        this.day = day;
    }


}
