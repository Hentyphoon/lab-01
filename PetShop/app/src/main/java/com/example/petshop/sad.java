package com.example.petshop;

import java.util.Date;

public class sad extends Mood implements CurrentMood{
    public Date sadDate;

    public sad(){
        super(new Date());
    }
    public sad(Date sadDate){
        super(sadDate);
    }
    public Date getSadDate() {
        return sadDate;
    }

    public void setSadDate(Date sadDate) {
        this.sadDate = sadDate;
    }


    @Override
    public String mood_rn(){
        return "sad";
    }


    @Override
    public void mood() {

    }
}
