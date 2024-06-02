<%--
  Created by IntelliJ IDEA.
  User: jeongminsu
  Date: 4/26/24
  Time: 9:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginPage</title>
    <style>
        .line_t{
            border: 1px solid black;
        }
        a{
            /*text-decoration: none;*/
            color:inherit;
            text-decoration-line: none;
        }
        .btn_login_submit{
            width:100px;
            height:30px;
            border:1px solid cornsilk;
            border-radius: 11px;
            background-color: cadetblue;
            color:white;
        }

       .container{
           display: flex;
           height:500px;
           justify-content: center;
           width: 400px;
           margin:0 auto;
           box-sizing: border-box;
        }
        /*.login_wrap{*/
        /*    display: flex;*/
        /*    height:500px;*/
        /*    justify-content: center;*/
        /*}*/
        .container > .login_wrap > .login_header_box{
            width:100%;
            font-weight: bold;
            color: #090;
            text-align: center;

        }


    </style>
    <script>
        const validate = () =>{
            var strUserId = document.getElementById("userId");
            var strPassword = document.getElementById("password");

            let isChecked

            return true;
        }

    </script>


</head>
<body>
    <div class="container line_t">
        <div class="login_wrap">
            <div class="login_header_box">
                <h2>로그인</h2>
            </div>
            <form action="../member/login" method="post">
                <input type="text" placeholder="아이디" name="userId" id="userId"><br>

                <input type="password" placeholder="패스워드" name="password" id="password">
                <div>
                    <a href="#">회원가입</a> /
                    <a href="#">아이디 찾기</a> /
                    <a href="#">패스워드 찾기</a>
                </div>
                <input type="submit" value="로그인" class="btn_login_submit" onclick="return validate()">
            </form>
        </div>
    </div>

</body>
</html>
