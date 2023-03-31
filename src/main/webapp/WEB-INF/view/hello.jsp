<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<html>

<head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="/resources/js/common.js"></script>
</head>

<body>
<p>Hello, Spring Boot App</p>
한글 테스트
<div>
    <section>
        <div>
            <article>
                <div>
                    <h2>ajax 테스트</h2>
                    <dl>
                        <dt>성명 <input type="text"  id="name" value="홍길동"/></dt>
                    </dl>
                    <dl>
                        <dt>성별 <input type="text"  id="sex" value="남자"/></dt>
                    </dl>
                    <dl>
                        <dt>나이 <input type="text"  id="age" value="20"/></dt>
                    </dl>
                    <dl>
                        <dt>전화번호 <input type="text"  id="tellPh" value="010-0000-0000"/></dt>
                    </dl>
                    <dl>
                        <dt>insert <input type="button" id="postRequest" value="POST" onclick="RequestAjax(this)"/></dt>
                        <dt>select all <input type="button" id="getRequest" value="GET" onclick="RequestAjax(this)"/></dt>
                        <br>
                        고객번호 : <input type="text"  id="cust_no" value="" style="width:50px"/>
                        <dt>update <input type="button" id="updateRequest" value="PUT" onclick="RequestAjax(this)"/></dt>
                        <dt>delete <input type="button" id="deleteRequest" value="DELETE" onclick="RequestAjax(this)"/></dt>
                    </dl>
                    <br>

                </div>
                <div id="getList">
                </div>
            </article>
        </div>
    </section>
</div>
</body>

</html>