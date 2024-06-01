package com.baesball.baseball2.service;

import com.baesball.baseball2.common.DBConnection;
import com.baesball.baseball2.models.Stadium;

import java.sql.SQLException;
import java.util.List;

public class StadiumDAO extends DBConnection {

    public StadiumDAO(){}

    public List<Stadium> getAllStadium(){

        return null;
    }
    public Stadium getStadium(int nStadiumNo){
        String qrySelectStadium = "SELECT stadium_no, stadium_name, stadium_seat_image FROM stadium_info WHERE stadium_no = ?";
        Stadium stadium = new Stadium();
        try{
            psmt = CBaseballDbMaster.prepareStatement(qrySelectStadium);
            psmt.setInt(1,nStadiumNo);

            rs = psmt.executeQuery();

            while(rs.next()){
                stadium.setnStadiumNo(rs.getInt("stadium_no"));
                stadium.setStrStadiumName(rs.getString("stadium_name"));
                stadium.setStrStadiumImagePath(rs.getString("stadium_seat_image"));
            }

            return stadium;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }


}
