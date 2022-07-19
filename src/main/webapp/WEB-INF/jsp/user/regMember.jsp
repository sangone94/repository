<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>login</title>
        <script type="text/javascript" src="/jquery/jquery-3.5.1.js"></script>
        <script type="text/javascript" src="/js/common.js"></script>
        <script>
            $(function(){
                $("#saveBtn").click(function() {
                    // let data = { name: "홍길동" };
                    // ajaxCall("/userInfo/regUserInfo",data,"post",false,fn_succ_call,fn_fail_call);
                });
            });
        </script>

    </head>
    <body>
        <form id="frm" method="post" action="">
            아이디 : <input type="password" id="id" name="id" value="" placeholder="아이디를 입력하세요" /> <br>
            비밀번호 : <input type="password" id="pwd" name="pwd" value="" placeholder="비밀번호 입력하세요" /> <br>
            전화번호 : <input type="password" id="tel1" name="tel" value="" placeholder="" maxlength="3" /> -
            <input type="password" id="tel2" name="tel" value="" placeholder="" maxlength="4" /> -
            <input type="password" id="tel3" name="tel" value="" placeholder="" maxlength="4" />
            <br>
            주소 : <input type="text" id="addr" name="addr" value="" />
            <br>
            상세 : <input type="text" id="addrDtl" name="addrDtl" value=""/>
            <br>

            <br>
            <input type="button" id="closeBtn" name="closeBtn" value="취소" />
            <input type="button" id="saveBtn" name="saveBtn" value="회원가입" />
        </form>
    </body>
</html>
