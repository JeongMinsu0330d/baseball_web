package com.baesball.baseball2.models;

public class Team {

    private int nTeamNo;
    private String strTeamName;
    private String strTeamImage;
    private int nStadiumNo;
    private String strStadiumName;

    public Team() {
    }

    public Team(int nTeamNo, String strTeamName, String strTeamImage, int nStadiumNo, String strStadiumName) {
        this.nTeamNo = nTeamNo;
        this.strTeamName = strTeamName;
        this.strTeamImage = strTeamImage;
        this.nStadiumNo = nStadiumNo;
        this.strStadiumName = strStadiumName;
    }

    public int getnTeamNo() {
        return nTeamNo;
    }

    public void setnTeamNo(int nTeamNo) {
        this.nTeamNo = nTeamNo;
    }

    public String getStrTeamName() {
        return strTeamName;
    }

    public void setStrTeamName(String strTeamName) {
        this.strTeamName = strTeamName;
    }

    public String getStrTeamImage() {
        return strTeamImage;
    }

    public void setStrTeamImage(String strTeamImage) {
        this.strTeamImage = strTeamImage;
    }

    public int getnStadiumNo() {
        return nStadiumNo;
    }

    public void setnStadiumNo(int nStadiumNo) {
        this.nStadiumNo = nStadiumNo;
    }

    public String getStrStadiumName() {
        return strStadiumName;
    }

    public void setStrStadiumName(String strStadiumName) {
        this.strStadiumName = strStadiumName;
    }
}
