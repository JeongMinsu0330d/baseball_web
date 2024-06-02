package com.baesball.baseball2.common;

import java.sql.*;

public class DBConnection {
    public Connection CBaseballDbMaster;
    public Statement stmt;
    public PreparedStatement psmt;
    public ResultSet rs;

    public DBConnection(){
        try{
            String msg ="";
            String url = "jdbc:mysql://192.168.0.31:3306/baseballdb";
            String user = "mncvc";
            String pwd = "wjdalstn12@A";
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.CBaseballDbMaster = DriverManager.getConnection(url,user,pwd);

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }

    }

    public void startTransaction() throws SQLException{
        try {
            CBaseballDbMaster.setAutoCommit(false);
        }catch(SQLException sqlE){
            sqlE.printStackTrace();
            CBaseballDbMaster.rollback();
        }catch(Exception e){
            CBaseballDbMaster.rollback();
        }
    }


    public void close() throws SQLException{
        CBaseballDbMaster.close();
        stmt.close();
        psmt.close();
        rs.close();
    }





}
