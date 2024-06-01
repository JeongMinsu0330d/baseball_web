package com.baesball.baseball2.service;

import com.baesball.baseball2.common.DBConnection;
import com.baesball.baseball2.models.Ticket;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TicketDAO extends DBConnection {
    public TicketDAO(){

    }

    public List<Ticket> getAllSection(int nStadiumNo){
        String qrySelectSection = "SELECT stadium_no, section_type FROM stadium_seat_list WHERE stadium_no = ? GROUP BY section_type ";
        List<Ticket> tickets = new ArrayList<>();

        try{
            psmt = CBaseballDbMaster.prepareStatement(qrySelectSection);
            psmt.setInt(1,nStadiumNo);

            rs = psmt.executeQuery();
            while(rs.next()){
                Ticket ticket = new Ticket();
                ticket.setnStadiumNo(rs.getInt("stadium_no"));
                ticket.setcSectionType(rs.getString("section_type"));

                tickets.add(ticket);
            }
            return tickets;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }
    public List<Ticket> getAllSectionNo(int nStadiumNo, String strSectionType){
            String qrySelectAllTicket = "SELECT stadium_no, section_type, section_no, seat_col, seat_row FROM stadium_seat_list WHERE stadium_no = ? AND section_type = ?" ;
            List<Ticket> tickets = new ArrayList<>();
            try{
                psmt = CBaseballDbMaster.prepareStatement(qrySelectAllTicket);
                psmt.setInt(1,nStadiumNo);
                psmt.setString(2,strSectionType);

                rs = psmt.executeQuery();

                while(rs.next()){
                    Ticket ticket = new Ticket();

                    ticket.setnStadiumNo(rs.getInt("stadium_no"));
                    ticket.setcSectionType(rs.getString("section_type"));
                    ticket.setnSectionNo(rs.getInt("section_no"));
                    ticket.setnSeatCol(rs.getInt("seat_col"));
                    ticket.setnSeatRow(rs.getInt("seat_row"));

                    tickets.add(ticket);
                }
                return tickets;
            }catch(SQLException e){
                e.printStackTrace();
                return null;
            }catch(Exception e){
                e.printStackTrace();
                return null;
            }
    }


}
