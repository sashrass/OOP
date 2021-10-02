package com.Rassokhin_OOP;

import java.util.ArrayList;
import java.util.Calendar;

public class SupportBid {
    private int trackCode = 0;
    private int supportCode;
    private String Name;
    private String phone;
    private String email;
    private String topic;
    private String description;
    private String receivingDateTime;
    private short typeOfAnswer;
    private boolean isActive;

    ArrayList<Answer> ans = new ArrayList<Answer>();

    void newAnswer(String text, byte sender)
    {
        ans.add(new Answer(text, sender));
    }

    int getTrackCode()
    {
        return trackCode;
    }

}
