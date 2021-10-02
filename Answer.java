package com.Rassokhin_OOP;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Answer {

    public static final byte CLIENT =  0;
    public static final byte DISPATCHER = 1;

    String  answer;
    byte sender;
    Calendar date = Calendar.getInstance(new Locale("ru"));

    Answer(String text, byte sndr)
    {
        if (sndr > 1 || sndr < 0)
            return;

        date.setTime(new Date());
        answer = text;
        sender = sndr;
    }

    String WhoSender()
    {
        if (sender == CLIENT)
            return "Client";
        else
            return "Dispatcher";
    }

    String Text()
    {
        return answer;
    }

    Calendar getTime()
    {
        return date;
    }
}
