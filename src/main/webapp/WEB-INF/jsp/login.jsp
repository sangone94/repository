<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>login</title>
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script>
            $(function(){
                $("#goJoinMember").click(function(){
                    $("#frm").attr("action","/userInfo/setJoinPageReg").submit();
                });
            });
        </script>

    </head>
    <body>

        <form id="frm" method="post" action="">
            <div id="loginDiv">
                ID : <input type="text" id="loginId" name="loginId" value="" />
                PW : <input type="text" id="loginPw" name="loginPw" value="" />
            </div>
            <input type="button" id="goLogin" name="" value="로그인" />
            <input type="button" id="goJoinMember" name="" value="회원가입" />
        </form>
    </body>
</html>
