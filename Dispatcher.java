package com.Rassokhin_OOP;

import java.util.ArrayList;

public class Dispatcher extends Worker{

    ArrayList<SupportBid> currentSupportBids = new ArrayList<SupportBid>();
    ArrayList<Bid> currentBids = new ArrayList<Bid>();

    ArrayList<SupportBid>closedSupportBids = new ArrayList<SupportBid>();
    ArrayList<Bid> bidsInProcess = new ArrayList<Bid>();

    Dispatcher(int iD, int pointNum, String phoneNum, String workerName, String workerEmail)
    {
        super(iD, pointNum, phoneNum, workerName, workerEmail);
    }

    void addBid(Bid bid)
    {

    }

    void deleteBid(int bidIndex)
    {

    }

    void addSupportBid(int newSupportBidTrackCode)
    {

    }

    void deleteSupportBid(int supportBidIndex)
    {

    }

    void MakeRoute(int bidIndex)
    {

    }

    void answerToSupportBid(int supportBidIndex)
    {

    }



}
