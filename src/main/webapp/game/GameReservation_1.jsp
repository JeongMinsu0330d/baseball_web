<%@ page import="com.baesball.baseball2.service.TicketDAO" %>
<%@ page import="com.baesball.baseball2.models.Ticket" %>
<%@ page import="java.util.List" %>
<%@ page import="com.baesball.baseball2.common.Classify" %>
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<%
    int nStadiumNo = Integer.parseInt(request.getParameter("stadium_no"));
//    int nStadiumNo = 1;
    TicketDAO ticketDAO = new TicketDAO();
    List<Ticket> tickets = ticketDAO.getAllSection(nStadiumNo);
    Classify classify = new Classify();



%>
<html>
<head>
    <title>Game1</title>
    <style>
        .container{
            display: flex;
            margin:0 auto;
            width:900px;
            height:600px;
            border: 1px solid black;
        }
        .wrap1{
            width:390px;
            height: 100%;
        }
        .wrap2{
            width:390px;
            height: 100%;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="wrap1">
            좌석정보
            <div>
                <img src="data:image/jpeg;base64,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" alt="">

                <div class="seatBatchForm">


                </div>
            </div>
        </div>
        <div class="wrap2">
            등급 / 구역 <br>
            <%
                for(Ticket ticket: tickets){
                    String strSectionType = classify.fnTransferSectionType(ticket.getcSectionType());
                    List<Ticket> tickets1 = ticketDAO.getAllSectionNo(nStadiumNo, ticket.getcSectionType());
            %>
                    <ul>
                        <li><%=strSectionType%></li>
                        <ul>
                        <%
                            for(Ticket ticket1 : tickets1){
                        %>
                            <li><a href="#" onclick="fnOnClickSeat()"><%= ticket1.getnSectionNo()%></a></li>
                            <div class="seatInfo">
                            <form action="./test.jsp" method="GET">
                             <table border="1">
                            <%
                                int seatNo = 1;
                                for(int i=0;i < ticket1.getnSeatCol(); i++){
                            %>
                                <tr>
                           <%
                                    for(int a = 0; a < ticket1.getnSeatRow(); a++){
                           %>
                                        <td><input type="checkbox" name="seat[]" value="<%=seatNo%>"></td>
                           <%
                                        seatNo++;
                                    }
                            %>
                                </tr>
                             <%
                                }
                            %>
                           </table>
                                <input type="submit" value="확인">
                            </form>
                            </div>
                        <%
                            }
                        %>
                        </ul>
                    </ul>
            <%
                }
            %>
            
        </div>
    </div>
    <%
        if(request.getParameter("sectionNo") != null){
    %>
    <div>
     <%
//       for
     %>
    </div>

<%
    }
%>
</body>
</html>
