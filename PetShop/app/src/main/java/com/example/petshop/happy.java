package com.example.petshop;

import java.util.Date;

public class happy extends Mood implements CurrentMood{


    public Date happyDate;

    public happy(){
        super(new Date());
    }

    public happy(Date happyDate){
        super(happyDate);
    }
    public Date getHappyDate() {
        return happyDate;
    }

    public void setHappyDate(Date happyDate) {
        this.happyDate = happyDate;
    }

    @Override
    public String mood_rn(){
        return "happy";
    }


    @Override
    public void mood() {

    }
}
