package com.example.myapplication;

public class DataVal {
    private int flagID;
    private int nameID;
    private int abbreviationID;

    public DataVal (int _flagID, int _nameID, int _abbreviationID){
        flagID = _flagID;
        nameID = _nameID;
        abbreviationID = _abbreviationID;
    }

    public int getFlagID(){
        return flagID;
    }

    public int getNameID(){
        return nameID;
    }

    public int getAbbreviationID() {
        return abbreviationID;
    }
}
