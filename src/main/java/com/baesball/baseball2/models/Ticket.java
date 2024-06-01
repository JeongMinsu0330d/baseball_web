package com.baesball.baseball2.models;

public class Ticket {
    private int nSeq;
    private int nStadiumNo;
    private String cSectionType;
    private int nSectionNo;
    private int nSeatCol;
    private int nSeatRow;
    private String dtRegDate;

    public Ticket() {
    }

    public int getnSeq() {
        return nSeq;
    }

    public void setnSeq(int nSeq) {
        this.nSeq = nSeq;
    }

    public int getnStadiumNo() {
        return nStadiumNo;
    }

    public void setnStadiumNo(int nStadiumNo) {
        this.nStadiumNo = nStadiumNo;
    }

    public String getcSectionType() {
        return cSectionType;
    }

    public void setcSectionType(String cSectionType) {
        this.cSectionType = cSectionType;
    }

    public int getnSectionNo() {
        return nSectionNo;
    }

    public void setnSectionNo(int nSectionNo) {
        this.nSectionNo = nSectionNo;
    }

    public int getnSeatCol() {
        return nSeatCol;
    }

    public void setnSeatCol(int nSeatCol) {
        this.nSeatCol = nSeatCol;
    }

    public int getnSeatRow() {
        return nSeatRow;
    }

    public void setnSeatRow(int nSeatRow) {
        this.nSeatRow = nSeatRow;
    }

    public String getDtRegDate() {
        return dtRegDate;
    }

    public void setDtRegDate(String dtRegDate) {
        this.dtRegDate = dtRegDate;
    }
}
