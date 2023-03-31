function RequestAjax(type) {
    if (type.value == "PUT" || type.value == "DELETE") {
        if ($("#cust_no").val() == "") {
            alert("고객번호를 입력하세요.");
            return;
        }
    }

    $("#getList").empty();
    var params = {
              cust_no   : $("#cust_no").val()
            , name      : $("#name").val()
            , sex       : $("#sex").val()
            , age       : $("#age").val()
            , tellPh    : $("#tellPh").val()
    }

    $.ajax({
        type : type.value,
        url : "/user",
        data : params,
        success : function(data){
            if (type.value == "GET") {
                var htmlText = '<h1>getList</h1><br>';

                for(var i = 0; i < data.userList.length; i++){
                    htmlText += '========================================<br>'
                    htmlText += 'cust_no : '    + data.userList[i].cust_no + '<br>';
                    htmlText += 'name : '       + data.userList[i].name + '<br>';
                    htmlText += 'sex : '        + data.userList[i].sex + '<br>';
                    htmlText += 'age : '        + data.userList[i].age + '<br>';
                    htmlText += 'tellPh : '     + data.userList[i].tellPh + '<br>';
                }
                $("#getList").append(htmlText);
            }
            alert("응답코드 : " + data.code + "\n통신 성공");
        },
        error : function(XMLHttpRequest, textStatus, errorThrown){
            alert("통신 실패.")
        }
    });
}