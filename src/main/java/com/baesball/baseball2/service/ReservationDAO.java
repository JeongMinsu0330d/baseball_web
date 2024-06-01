package com.baesball.baseball2.service;

import com.baesball.baseball2.common.DBConnection;
import com.baesball.baseball2.models.Reservation;
import com.baesball.baseball2.models.ReservationDetail;

import java.sql.SQLException;
import java.util.List;

public class ReservationDAO extends DBConnection {
    public ReservationDAO(){

    }

    public Reservation getReservation(){

        return null;
    }
    public List<ReservationDetail> getAllReservationDetail(){
        String qrySelectAllReservation = "SELECT * FROM baseball_reservation_detail_list WHERE game_seq";



        return null;
    }

    public List<Reservation> getAllReservation(){
        return null;
    }

    public boolean setInsertReservation(Reservation reservation){
        String qryInsertReservation = "" +
                "INSERT INTO baseball_reservation_list (trade_id, user_no, game_seq," +
                " stadium_no, stadium_name, home_team_no, home_team_name, away_team_no, away_team_name, payment_method," +
                "reservation_state, reservation_price)" +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        try{
            psmt = CBaseballDbMaster.prepareStatement(qryInsertReservation);
            psmt.setInt(1,reservation.getnTradeId());
            psmt.setInt(2,reservation.getnUserNo());
            psmt.setInt(3,reservation.getnGameSeq());
            psmt.setString(4,reservation.getStrStadiumName());
            psmt.setInt(5,reservation.getnStadiumNo());
            psmt.setInt(6,reservation.getnHomeTeamNo());
            psmt.setString(7,reservation.getStrHomeTeamName());
            psmt.setInt(8,reservation.getnAwayTeamNo());
            psmt.setString(9,reservation.getStrAwayTeamName());
            psmt.setString(10,reservation.getcPaymentType());
            psmt.setString(11,reservation.getcReservationState());
            psmt.setInt(12,reservation.getnReservationPrice());

            rs = psmt.executeQuery();

        }catch(SQLException e){

        }

        return false;
    }

    public boolean setInsertReservationDetail(){

        return false;
    }




}
