package com.baesball.baseball2.service;

import com.baesball.baseball2.common.DBConnection;
import com.baesball.baseball2.models.Member;

import java.util.List;

public class MemberDAO extends DBConnection {

    List<Member> memberList;

    public MemberDAO() {

    }

    public List<Member> getMemberList() {

        String sql = "SELECT * FROM member ORDER BY id DESC";


        return null;
    }







}
