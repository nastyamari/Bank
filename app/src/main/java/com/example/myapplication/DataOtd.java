package com.example.myapplication;

public class DataOtd {
    private int addressID;
    private int sostID;
    private int raspID;

    public DataOtd (int _addressID, int _sostID, int _raspID){
        addressID = _addressID;
        sostID = _sostID;
        raspID = _raspID;
    }

    public int getAdresID(){
        return addressID;
    }

    public int getSostID(){
        return sostID;
    }

    public int getRaspID() {
        return raspID;
    }
}
