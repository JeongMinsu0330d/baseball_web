<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2024-06-02
  Time: 오후 3:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .line_border{
            border:1px solid black;
        }

        .container{
            width:300px;
            margin: 20px auto;
        }
        .signup_wrap{
            width:100%;
            padding:10px 3px;
            display:flex;
            flex-direction: column;
            align-content: center;
            box-sizing: border-box;

        }
        .signup_header{
            text-align: center;
            font-weight: bold;
            font-size:22px;

        }
        .signup_box{
            width:100%;
            margin-bottom: 12px;
        }

        .signup_box_item{
            width:280px;
            height:25px;
            margin: 4px 10px;
            border: 1px solid black;
            border-radius: 4px;
        }
        .signup_box_item_2{
            width:200px;
            height:25px;
            margin: 4px 10px;
            border: 1px solid black;
            border-radius: 4px;
        }
        .btn_signup{
            width:100%;
        }
        .btn_signup_item{
            width:100%;
            margin:4px 0;
        }
        .txt_result{
            color: blue;
        }
        .txt_result_1{
            color: blue;
        }


    </style>
    <script>
        let isEmailValidate = false;
        let isPasswordValidate = false;
        let isAgreeService = false;
        let isAgreePrivate = false;

        function emailCheck(email_address){
            email_regex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i;
            if(!email_regex.test(email_address)){
                return false;
            }else{
                return true;
            }
        }
        const validateEmail = () =>{
            var emailInput = document.getElementById('userId');
            var resultDiv = document.getElementById('result');

            var email = emailInput.value;

            if (emailCheck(email)) {
                isEmailValidate = true;
                resultDiv.style.color = 'blue';
                resultDiv.innerHTML = '유효한 이메일 주소입니다.';
            } else {
                resultDiv.style.color = 'red';
                resultDiv.innerHTML = '유효하지 않은 이메일 주소입니다.';
            }
        }

         function passwordCheck(password){\
           var reg_pwd = /^.*(?=.{6,20})(?=.*[0-9])(?=.*[a-zA-Z]).*$/;
           if(!reg_pwd.test(password)){
               return false;
           }
           return true;
        }
        function nameCheck(name){
            if(name == "" || name == null){
                return false;
            }
            const reg_name = /^[가-힣]+$/;
            if(!reg_name.test(name)){
                return false;
            }
            return true;
        }

        function addressCheck(address){
            const reg_address = /^[가-힣]+$/;
            if(!reg_address.test(address)){
                return false;
            }
            return true;
        }



        const validate =() =>{
            let message = "";
            // 이메일인증
            if(!isEmailValidate){
                return false;
            }

            // 패스워드 체크
            var passwordInput = document.getElementById('password');
            var password = passwordInput.value;

            if (passwordCheck(password)) {
                isPasswordValidate = true;
                resultDiv.innerHTML = ''
            } else {
                passwordInput.style.border = '1px solid red';
                message = '유효하지 않은 패스워드 입니다.[영문, 숫자, 특수문자를 최소 1글자 이상 사용해주셔야합니다.]';
                alert(message);
                return false;
            }

            // 이름 (한글)
            var nameInput = document.getElementById("userName");
            var name = nameInput.value;
            if(nameCheck(name)){
                message = '이름은 한글로만 입력 가능합니다.';
                alert(message);
                return false;
            }

            // 생년월일 userBirth

            // 주소 (한글)
            var addressInput = document.getElementById("userAddress");
            var address = addressInput.value;
            if(addressCheck(address)){
                message = '주소은 한글로만 입력 가능합니다.';
                alert(message);
                return false;
            }

            // 회원가입 동의 여부 체크 isAgreeService
            var isCheckService = document.getElementById("serviceAgree");
            if (isCheckService.checked) {
                isAgreeService = true;
            } else {
                message = "회원가입 서비스 동의안에 선택 해주세요"
                isAgreeService = false;
                alert(message);
                return false;
            }

            var isCheckPrivate = document.getElementById("privateAgree");
            if (isCheckPrivate.checked) {
                isAgreePrivate = true;
            } else {
                message = "개인정보 수집 동의안에 선택 해주세요"
                isAgreePrivate = false;
                alert(message);
                return false;
            }


            return true;
        }






    </script>
    <title>회원가입</title>



</head>
<body>

    <div class="container line_border">
        <div class="signup_wrap">
            <div class="signup_header">
                회원가입
            </div>
            <form action="" method="post">
                <div  class="signup_box">
                    <label>
                        <span class="label">계정생성</span>
                        <br>
                        <input type="text" id="userId" name="userId" class="signup_box_item_2" placeholder="이메일">
                        <input type="button" class="btn_email" value="인증" onClick="return validateEmail()">
                         <div class="txt_result" id="result"></div>
                        <input type="password" id="password" name="password" class="signup_box_item" placeholder="비밀번호">
                    </label>
                </div>

                <div  class="signup_box">
                    <label>
                        <span class="label">회원 정보</span>
                        <br>
                        <input type="text" name="userName" class="signup_box_item" placeholder="이 름">
                        <input type="number" name="userBirth" class="signup_box_item" placeholder="생년월일 ( YYMMDD )">
                        <input type="text" name="userAddress" class="signup_box_item" placeholder="주소">
                    </label>
                </div>

<%-- 동의 여부 --%>
                <div class="btn_signup">
                    개인정보 동의
                    <input type="checkbox" id="serviceAgree" name="isCheckedService">

                    <br>
                    서비스 이용 동의
                    <input type="checkbox" id="privateAgree" name="isCheckedPrivate">
                </div>

                <div class="btn_signup">
                    <input type="submit" value="회원가입" class="btn_signup_item" onClick="return validate()">
                    <input type="reset" value="취 소" class="btn_signup_item" onclick="">
                </div>
            </form>


        </div>


    </div>



</body>
</html>
