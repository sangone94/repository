function ajaxCall(url,data,method,async,fn_success,fn_fail) {
    $.ajax({
        url: url
        ,data: data
        ,method: method
        ,dataType: "json"
        ,async : async
        ,contentType: "application/json; charset=utf-8"
        ,success: fn_success
        ,error: fn_fail
    });
}