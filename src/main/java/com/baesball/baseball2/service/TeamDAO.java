package com.baesball.baseball2.service;

import com.baesball.baseball2.common.DBConnection;
import com.baesball.baseball2.models.Team;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeamDAO extends DBConnection {

    public TeamDAO(){

    }
    public List<Team> getAllTeam(){
        List<Team> teams = new ArrayList<>();

        String qrySelectTeam = "SELECT team_no, team_name, team_image, stadium_no, stadium_name FROM code_baseball_team_list;";

        try {
            psmt = CBaseballDbMaster.prepareStatement(qrySelectTeam);
            rs = psmt.executeQuery();

            while(rs.next()){
                Team team = new Team();
                team.setnTeamNo(rs.getInt("team_no"));
                team.setStrTeamName(rs.getString("team_name"));
                team.setnStadiumNo(rs.getInt("stadium_no"));
                team.setStrStadiumName(rs.getString("stadium_name"));
                team.setStrTeamImage(rs.getString("team_image"));

                teams.add(team);
            }
            return teams;
        }catch(SQLException e){
            System.out.println("team_info 정보 조회 에러 1");
            e.printStackTrace();
            return null;
        }catch(Exception e){
            System.out.println("team_info 정보 조회 에러 ");
            e.printStackTrace();
            return null;
        }
    }



}
