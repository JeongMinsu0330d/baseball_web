package com.baesball.baseball2.models;

public class Reservation {
    private int nTradeId;
    private int nUserNo;
    private int nStadiumNo;
    private String strStadiumName;
    private int nHomeTeamNo;
    private String strHomeTeamName;
    private int nAwayTeamNo;
    private String strAwayTeamName;
    private String cPaymentType;
    private String cReservationState;
    private int nReservationPrice;
    private String dtSuccessDate;
    private String dtCancelDate;
    private String cUserCancelPolicyFlag;
    private String dtUserCancelPolicyAgreeDate;
    private String cUserAgreePrivateInfoSaveFlag;
    private String dtUserAgreePrivateInfoSaveDate;
    private String cUserAgreeMarketingFlag;
    private String dtUserAgreeMarketingDate;
    private String cPaymentAgencyAgreeFlag;
    private String dtPaymentAgencyAgreeDate;
    private int nGameSeq;
    private String dtRegDate;

    public Reservation() {
    }

    public int getnTradeId() {
        return nTradeId;
    }

    public void setnTradeId(int nTradeId) {
        this.nTradeId = nTradeId;
    }

    public int getnUserNo() {
        return nUserNo;
    }

    public void setnUserNo(int nUserNo) {
        this.nUserNo = nUserNo;
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

    public int getnHomeTeamNo() {
        return nHomeTeamNo;
    }

    public void setnHomeTeamNo(int nHomeTeamNo) {
        this.nHomeTeamNo = nHomeTeamNo;
    }

    public String getStrHomeTeamName() {
        return strHomeTeamName;
    }

    public void setStrHomeTeamName(String strHomeTeamName) {
        this.strHomeTeamName = strHomeTeamName;
    }

    public int getnAwayTeamNo() {
        return nAwayTeamNo;
    }

    public void setnAwayTeamNo(int nAwayTeamNo) {
        this.nAwayTeamNo = nAwayTeamNo;
    }

    public String getStrAwayTeamName() {
        return strAwayTeamName;
    }

    public void setStrAwayTeamName(String strAwayTeamName) {
        this.strAwayTeamName = strAwayTeamName;
    }

    public String getcPaymentType() {
        return cPaymentType;
    }

    public void setcPaymentType(String cPaymentType) {
        this.cPaymentType = cPaymentType;
    }

    public String getcReservationState() {
        return cReservationState;
    }

    public void setcReservationState(String cReservationState) {
        this.cReservationState = cReservationState;
    }

    public int getnReservationPrice() {
        return nReservationPrice;
    }

    public void setnReservationPrice(int nReservationPrice) {
        this.nReservationPrice = nReservationPrice;
    }

    public String getDtSuccessDate() {
        return dtSuccessDate;
    }

    public void setDtSuccessDate(String dtSuccessDate) {
        this.dtSuccessDate = dtSuccessDate;
    }

    public String getDtCancelDate() {
        return dtCancelDate;
    }

    public void setDtCancelDate(String dtCancelDate) {
        this.dtCancelDate = dtCancelDate;
    }

    public String getcUserCancelPolicyFlag() {
        return cUserCancelPolicyFlag;
    }

    public void setcUserCancelPolicyFlag(String cUserCancelPolicyFlag) {
        this.cUserCancelPolicyFlag = cUserCancelPolicyFlag;
    }

    public String getDtUserCancelPolicyAgreeDate() {
        return dtUserCancelPolicyAgreeDate;
    }

    public void setDtUserCancelPolicyAgreeDate(String dtUserCancelPolicyAgreeDate) {
        this.dtUserCancelPolicyAgreeDate = dtUserCancelPolicyAgreeDate;
    }

    public String getcUserAgreePrivateInfoSaveFlag() {
        return cUserAgreePrivateInfoSaveFlag;
    }

    public void setcUserAgreePrivateInfoSaveFlag(String cUserAgreePrivateInfoSaveFlag) {
        this.cUserAgreePrivateInfoSaveFlag = cUserAgreePrivateInfoSaveFlag;
    }

    public String getDtUserAgreePrivateInfoSaveDate() {
        return dtUserAgreePrivateInfoSaveDate;
    }

    public void setDtUserAgreePrivateInfoSaveDate(String dtUserAgreePrivateInfoSaveDate) {
        this.dtUserAgreePrivateInfoSaveDate = dtUserAgreePrivateInfoSaveDate;
    }

    public String getcUserAgreeMarketingFlag() {
        return cUserAgreeMarketingFlag;
    }

    public void setcUserAgreeMarketingFlag(String cUserAgreeMarketingFlag) {
        this.cUserAgreeMarketingFlag = cUserAgreeMarketingFlag;
    }

    public String getDtUserAgreeMarketingDate() {
        return dtUserAgreeMarketingDate;
    }

    public void setDtUserAgreeMarketingDate(String dtUserAgreeMarketingDate) {
        this.dtUserAgreeMarketingDate = dtUserAgreeMarketingDate;
    }

    public String getcPaymentAgencyAgreeFlag() {
        return cPaymentAgencyAgreeFlag;
    }

    public void setcPaymentAgencyAgreeFlag(String cPaymentAgencyAgreeFlag) {
        this.cPaymentAgencyAgreeFlag = cPaymentAgencyAgreeFlag;
    }

    public String getDtPaymentAgencyAgreeDate() {
        return dtPaymentAgencyAgreeDate;
    }

    public void setDtPaymentAgencyAgreeDate(String dtPaymentAgencyAgreeDate) {
        this.dtPaymentAgencyAgreeDate = dtPaymentAgencyAgreeDate;
    }

    public int getnGameSeq() {
        return nGameSeq;
    }

    public void setnGameSeq(int nGameSeq) {
        this.nGameSeq = nGameSeq;
    }

    public String getDtRegDate() {
        return dtRegDate;
    }

    public void setDtRegDate(String dtRegDate) {
        this.dtRegDate = dtRegDate;
    }
}
