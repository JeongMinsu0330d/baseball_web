package com.baesball.baseball2.models;

public class Stadium {
    private int nStadiumNo;
    private String StrStadiumName;
    private String strStadiumImagePath;

    public Stadium() {}

    public Stadium(int nStadiumNo, String strStadiumName, String strStadiumImagePath) {
        this.nStadiumNo = nStadiumNo;
        StrStadiumName = strStadiumName;
        this.strStadiumImagePath = strStadiumImagePath;
    }

    public int getnStadiumNo() {
        return nStadiumNo;
    }

    public void setnStadiumNo(int nStadiumNo) {
        this.nStadiumNo = nStadiumNo;
    }

    public String getStrStadiumName() {
        return StrStadiumName;
    }

    public void setStrStadiumName(String strStadiumName) {
        StrStadiumName = strStadiumName;
    }

    public String getStrStadiumImagePath() {
        return strStadiumImagePath;
    }

    public void setStrStadiumImagePath(String strStadiumImagePath) {
        this.strStadiumImagePath = strStadiumImagePath;
    }
}
