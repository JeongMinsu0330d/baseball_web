package com.baesball.baseball2.models;

public class Game {
    private int nSeq;
    private String dtPlayDate;
    private int nStadiumNo;
    private String strStadiumName;
    private int nHomeTeamNo;
    private int nAwayTeam;
    private String strHomeTeamName;
    private String strAwayTeamName;

    public Game() {}

    public Game(int nSeq, String dtPlayDate, int nStadiumNo, String strStadiumName, int nHomeTeamNo, int nAwayTeam, String strHomeTeamName, String strAwayTeamName) {
        this.nSeq = nSeq;
        this.dtPlayDate = dtPlayDate;
        this.nStadiumNo = nStadiumNo;
        this.strStadiumName = strStadiumName;
        this.nHomeTeamNo = nHomeTeamNo;
        this.nAwayTeam = nAwayTeam;
        this.strHomeTeamName = strHomeTeamName;
        this.strAwayTeamName = strAwayTeamName;
    }

    public int getnSeq() {
        return nSeq;
    }

    public void setnSeq(int nSeq) {
        this.nSeq = nSeq;
    }

    public String getDtPlayDate() {
        return dtPlayDate;
    }

    public void setDtPlayDate(String dtPlayDate) {
        this.dtPlayDate = dtPlayDate;
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

    public int getnAwayTeam() {
        return nAwayTeam;
    }

    public void setnAwayTeam(int nAwayTeam) {
        this.nAwayTeam = nAwayTeam;
    }

    public String getStrHomeTeamName() {
        return strHomeTeamName;
    }

    public void setStrHomeTeamName(String strHomeTeamName) {
        this.strHomeTeamName = strHomeTeamName;
    }

    public String getStrAwayTeamName() {
        return strAwayTeamName;
    }

    public void setStrAwayTeamName(String strAwayTeamName) {
        this.strAwayTeamName = strAwayTeamName;
    }

    public static class Reservation {
        private int trade_id;
        private int user_no;
        private int stadium_no;
        private String stadium_name;
        private int home_team_no;
        private String home_team_name;
        private int away_team_no;
        private String away_team_name;
        private String payment_method;
        private String reservation_state;
        private int reservation_price;
        private String success_date;
        private String cancel_date;
        private String user_cancel_policy_agree_flag;
        private String user_cancel_policy_agree_date;
        private String user_agree_private_info_save_flag;
        private String user_agree_private_info_save_date;
        private String user_agree_marketing_flag;
        private String user_agree_marketing_date;
        private String payment_agency_agree_flag;
        private String payment_agency_agree_date;
        private String reg_date;

        public Reservation() {
        }

        public int getTrade_id() {
            return trade_id;
        }

        public void setTrade_id(int trade_id) {
            this.trade_id = trade_id;
        }

        public int getUser_no() {
            return user_no;
        }

        public void setUser_no(int user_no) {
            this.user_no = user_no;
        }

        public int getStadium_no() {
            return stadium_no;
        }

        public void setStadium_no(int stadium_no) {
            this.stadium_no = stadium_no;
        }

        public String getStadium_name() {
            return stadium_name;
        }

        public void setStadium_name(String stadium_name) {
            this.stadium_name = stadium_name;
        }

        public int getHome_team_no() {
            return home_team_no;
        }

        public void setHome_team_no(int home_team_no) {
            this.home_team_no = home_team_no;
        }

        public String getHome_team_name() {
            return home_team_name;
        }

        public void setHome_team_name(String home_team_name) {
            this.home_team_name = home_team_name;
        }

        public int getAway_team_no() {
            return away_team_no;
        }

        public void setAway_team_no(int away_team_no) {
            this.away_team_no = away_team_no;
        }

        public String getAway_team_name() {
            return away_team_name;
        }

        public void setAway_team_name(String away_team_name) {
            this.away_team_name = away_team_name;
        }

        public String getPayment_method() {
            return payment_method;
        }

        public void setPayment_method(String payment_method) {
            this.payment_method = payment_method;
        }

        public String getReservation_state() {
            return reservation_state;
        }

        public void setReservation_state(String reservation_state) {
            this.reservation_state = reservation_state;
        }

        public int getReservation_price() {
            return reservation_price;
        }

        public void setReservation_price(int reservation_price) {
            this.reservation_price = reservation_price;
        }

        public String getSuccess_date() {
            return success_date;
        }

        public void setSuccess_date(String success_date) {
            this.success_date = success_date;
        }

        public String getCancel_date() {
            return cancel_date;
        }

        public void setCancel_date(String cancel_date) {
            this.cancel_date = cancel_date;
        }

        public String getUser_cancel_policy_agree_flag() {
            return user_cancel_policy_agree_flag;
        }

        public void setUser_cancel_policy_agree_flag(String user_cancel_policy_agree_flag) {
            this.user_cancel_policy_agree_flag = user_cancel_policy_agree_flag;
        }

        public String getUser_cancel_policy_agree_date() {
            return user_cancel_policy_agree_date;
        }

        public void setUser_cancel_policy_agree_date(String user_cancel_policy_agree_date) {
            this.user_cancel_policy_agree_date = user_cancel_policy_agree_date;
        }

        public String getUser_agree_private_info_save_flag() {
            return user_agree_private_info_save_flag;
        }

        public void setUser_agree_private_info_save_flag(String user_agree_private_info_save_flag) {
            this.user_agree_private_info_save_flag = user_agree_private_info_save_flag;
        }

        public String getUser_agree_private_info_save_date() {
            return user_agree_private_info_save_date;
        }

        public void setUser_agree_private_info_save_date(String user_agree_private_info_save_date) {
            this.user_agree_private_info_save_date = user_agree_private_info_save_date;
        }

        public String getUser_agree_marketing_flag() {
            return user_agree_marketing_flag;
        }

        public void setUser_agree_marketing_flag(String user_agree_marketing_flag) {
            this.user_agree_marketing_flag = user_agree_marketing_flag;
        }

        public String getUser_agree_marketing_date() {
            return user_agree_marketing_date;
        }

        public void setUser_agree_marketing_date(String user_agree_marketing_date) {
            this.user_agree_marketing_date = user_agree_marketing_date;
        }

        public String getPayment_agency_agree_flag() {
            return payment_agency_agree_flag;
        }

        public void setPayment_agency_agree_flag(String payment_agency_agree_flag) {
            this.payment_agency_agree_flag = payment_agency_agree_flag;
        }

        public String getPayment_agency_agree_date() {
            return payment_agency_agree_date;
        }

        public void setPayment_agency_agree_date(String payment_agency_agree_date) {
            this.payment_agency_agree_date = payment_agency_agree_date;
        }

        public String getReg_date() {
            return reg_date;
        }

        public void setReg_date(String reg_date) {
            this.reg_date = reg_date;
        }
    }
}
