package com.Rassokhin_OOP;

import java.util.ArrayList;
import java.util.Calendar;

public class Bid {
    private int trackCode;
    private String recipientName;
    private String senderName;
    private String recipientPhone;
    private String senderPhone;
    private String recipientEmail;
    private String senderEmail;
    private String senderAddress;
    private String recipientAddress;
    private boolean isFragile;
    private int weight;
    private int length;
    private int height;
    private int width;
    private short typeOfSendingCode;
    private Calendar sendingDate;
    private boolean courierForSender;
    private boolean courierForRecipient;
    private Calendar pickingTime;
    private Calendar deliveryTime;
    private byte typeOfPaymentCode;
    private String additionalInfo;

    boolean isActive;

    Bid (int trackCODE, String recipientNAME, String senderNAME,
         String recipientPHONE, String senderPHONE, String recipientEMAIL,
         String senderEMAIL, String senderADDRESS, String recipientADDRESS,
         boolean isFRAGILE, int packageWEIGHT, int packageLENGHT,
         int packageHEIGHT, int packageWIDTH, byte typeOfSendingCODE,
         Calendar sendingDATE, boolean courierForRECIPIENT,
         boolean courierForSENDER, Calendar pickingTIME,
         Calendar deliveryTIME, byte typeOfPaymentCODE, String addINFO)
    {
        trackCode = trackCODE;
        recipientName = recipientNAME;
        senderName = senderNAME;
        recipientPhone = recipientPHONE;
        senderPhone = senderPHONE;
        recipientEmail = recipientEMAIL;
        senderEmail = senderEMAIL;
        senderAddress = senderADDRESS;
        recipientAddress = recipientADDRESS;
        isFragile = isFRAGILE;
        weight = packageWEIGHT;
        length = packageLENGHT;
        height = packageHEIGHT;
        width = packageWIDTH;
        typeOfSendingCode = typeOfSendingCODE;
        sendingDate = sendingDATE;
        courierForRecipient = courierForRECIPIENT;
        courierForSender = courierForSENDER;
        pickingTime = pickingTIME;
        deliveryTime = deliveryTIME;
        typeOfPaymentCode = typeOfPaymentCODE;
        additionalInfo = addINFO;
    }

    ArrayList<Integer>Route = new ArrayList<Integer>();

    void addPoint(int route)
    {
        Route.add(route);
    }

    void switchToActiveStatus()
    {

    }

    void switchToInactiveStatus()
    {

    }
}
