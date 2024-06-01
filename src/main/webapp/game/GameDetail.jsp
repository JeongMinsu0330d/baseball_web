<%@ page import="com.baesball.baseball2.service.TeamDAO" %>
<%@ page import="com.baesball.baseball2.models.Team" %>
<%@ page import="java.util.List" %>
<%@ page import="com.baesball.baseball2.models.Game" %>
<%@ page import="com.baesball.baseball2.service.GameDAO" %>
<%@ page import="com.baesball.baseball2.models.Stadium" %>
<%@ page import="com.baesball.baseball2.service.StadiumDAO" %><%--
  Created by IntelliJ IDEA.
  User: jeongminsu
  Date: 4/26/24
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<%
    boolean isCheckedGame = true;
    TeamDAO teamDAO = new TeamDAO();
    GameDAO gameDAO = new GameDAO();
    StadiumDAO stadiumDAO = new StadiumDAO();
    List<Team> teams = teamDAO.getAllTeam();

    int nTeamNo = Integer.parseInt(request.getParameter("team_no"));
    String dtSearchGameDate = request.getParameter("play_date") + " 12:00:00";
    Game game = gameDAO.getGameToGameNo(nTeamNo, dtSearchGameDate);


    if(game != null){
        isCheckedGame = false;
    }
%>

<html>
<head>
    <title>경기 정보 조회</title>
    <style>
        .container{
            width:80%;
            max-width: 1550px;
            min-width: 800px;
            margin:0 auto;
            box-sizing: border-box;
        }
        .container > .section_wrap{
            display:flex;
            flex-direction: column;
            width:100%;
            padding:20px 50px;
            max-width: 100%;
            min-width: 750px;
            box-sizing: border-box;
        }

        .section_wrap > .search_wrap > form{
            display:flex;
            flex-direction: row;
            align-items: center;
            justify-content: space-between;
            width:100%;
            height: 100px;
            border: 1px solid black;
            border-radius: 12px;
            margin-top:15px;
            padding: 4px;
        }

        .section_wrap  > .search_wrap  .input_search_team {
            width: 320px;
            height: 40px;
        }
        .section_wrap > .search_wrap  .input_search_date {
            width: 320px;
            height: 40px;
        }
        .section_wrap > .search_wrap  .input_search_btn {
            width: 100px;
            height: 40px;

        }
        .game_info_wrap{
            display: flex;
        }

        .info_box{
            width:180px;
            height:180px;
            border: 1px solid black;
            border-radius: 16px;
        }
        .info_txt{
            width:300px;
            height:180px;
            padding-left: 10px;
        }
        .btn_reservation{
            padding:1px 3px;
            border: 1px solid black;
        }
        .image_wrap{
            width:400px;
            height:400px;
            border: 1px solid black;

        }
        .image_box{
            width:300px;
            height:300px;
        }

    </style>
    <script>
        const isValidate = () => {
            let setPlayDate = document.getElementById("");
        }

        const clickReservation = (e) =>{
            let postData = {stadium_no: e}
            console.log(e);
            window.open("${pageContext.request.contextPath}/game/GameReservation_1.jsp?stadium_no="+e,"_blank","width=1200,height=800");

        }

    </script>
</head>
<body>
    <div class="container">
        <%@include file="../_common/Header.jsp"%>
        <div class="section_wrap">
            <div class="search_wrap">
                <form action="" method="GET">
                    <%--                    <input type="text" class="input_search_team" name="team_name" placeholder="구단명을 입력해주세요">--%>
                    <select name="team_no" id="team_no"  class="input_search_team">
                        <option value="0">구단을 선택해 주시기 바랍니다.</option>
                        <%
                            for(Team team : teams){
                        %>
                        <option value="<%= team.getnTeamNo()%>"><%=team.getStrTeamName()%></option>
                        <%
                            }
                        %>
                    </select>

                    <input type="date" class="input_search_date" vaule="" name="play_date" placeholder="경기일정 선택">
                    <input type="submit" class="input_search_btn" value = "검색" onclick="return isValidate()">
                </form>
            </div>
            <div class="context_wrap">
                <%
                    Stadium stadium = stadiumDAO.getStadium(game.getnStadiumNo());
                    if(isCheckedGame){
                %>
                    <div>경기 결과가 없습니다...</div>
                <%
                    }else {
                %>
                    <div>
                        경기 정보
                    </div>
                    <div class="game_info_wrap">
                        <div class="info_box">

                        </div>
                        <div class="info_txt">
                            <p>경기 : <%= game.getStrHomeTeamName()%> VS <%= game.getStrAwayTeamName()%></p>
                            <p>경기장 : <%= game.getStrStadiumName()%></p>
                            <p>경기 일정 : <%= game.getDtPlayDate()%></p>
                            <button class="btn_reservation" onclick="clickReservation(<%= game.getnStadiumNo()%>)">예매하기</button>
                        </div>
                    </div>
                    <div class="image_wrap">
                        <p>등급/좌석 정보</p>
                        <img class="image_box" src="<%= stadium.getStrStadiumImagePath()%>" alt="">
                        <%= stadium.getStrStadiumImagePath() %>
                    </div>
                <%
                    }
                %>
            </div>
        </div>
    </div>
</body>
</html>
