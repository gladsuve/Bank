<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<hr>
request 공유영역 phone : ${ phone }<br>
넘어온 파라미터 정보<br>
name =  ${ param.name }<br>
	<h2>Include된 내용</h2>
	<h2>Include된 내용</h2>
	<h2>Include된 내용</h2>
<hr>
<c:set var="phone" value="010-7777-8888" scope="request"/>