package com.baesball.baseball2.models;

public class ReservationDetail {
    private int seq; // seq
    private int user_no; //user_no
    private int trade_id;//거래번호 등록
    private int stadium_no;
    private String stadium_name;
    private int home_team_no;
    private String home_team_name;
    private int away_team_no;
    private String away_team_name;
    private int game_list_seq;
    private int stadium_seat_list_seq;
    private int seat_no;
    private String reservation_state; // a:예매, b:예매중, c:예매 취소
    private int object_seq;
    private int total_price;
    private String age_type; // 연령타입 :a:일반, b:만 6세 이상 ~ 만 12세 미만, c:만 6세 미만
    private String ticket_date_type; // 주중 타입 : a : 주중, b: 주말
    private int ticket_price;
    private String discount_code;
    private int discount_price;
    private String reg_date;

}


//