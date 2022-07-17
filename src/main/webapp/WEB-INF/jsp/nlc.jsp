<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>NLC</title>
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
</head>
<body>
    <form id="frm" name="fmr" method="post">
        <!-- 로그인 -->
        <a href="javascript:fn_call('login');">로그인</a>
        <script>
            function fn_call(url) {
                if(url == "login") $("#frm").attr("action","/userInfo/getJoinPage").submit();
                else if(url == "") $("#frm").attr("action","상원이 URL").submit();
                else if(url == "") $("#frm").attr("action","윤한이 URL").submit();
            }
        </script>

        <!-- 판매 -->
        <a href="javascript:fn_call('login');">판매</a>

        <!-- 구매 -->
        <a href="javascript:fn_call('login');">구매</a>
    </form>
</body>
</html>
