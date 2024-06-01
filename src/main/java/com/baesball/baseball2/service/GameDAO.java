package com.baesball.baseball2.service;

import com.baesball.baseball2.common.DBConnection;
import com.baesball.baseball2.models.Game;

import java.sql.SQLException;
import java.util.List;

public class GameDAO extends DBConnection {
    public List<Game> getAllGame(){

        return null;
    }

    public Game getGameToGameNo(int nGameNo, String dtGameDate){
        String qrySelectGame = "" +
                "SELECT seq, play_date, stadium_no, stadium_name, home_team_no, away_team_no, home_team_name, away_team_name " +
                "  FROM baseball_game_list" +
                " WHERE home_team_no = ? OR away_team_no = ? AND play_date = ?";
        Game game = new Game();
        try{
            psmt = CBaseballDbMaster.prepareStatement(qrySelectGame);
            psmt.setInt(1,nGameNo);
            psmt.setInt(2,nGameNo);
            psmt.setString(3,dtGameDate);
            rs = psmt.executeQuery() ;

            while(rs.next()){
                game.setnSeq(rs.getInt("seq"));
                game.setDtPlayDate(rs.getString("play_date"));
                game.setnHomeTeamNo(rs.getInt("home_team_no"));
                game.setnAwayTeam(rs.getInt("away_team_no"));
                game.setStrHomeTeamName(rs.getString("home_team_name"));
                game.setStrAwayTeamName(rs.getString("away_team_name"));
                game.setnStadiumNo(rs.getInt("stadium_no"));
                game.setStrStadiumName(rs.getString("stadium_name"));
            }
            return game;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

}
