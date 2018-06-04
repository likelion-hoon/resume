<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>QnA 게시판</title>
</head>
<body>
		<table width="500" cellpadding="0" border="1">
			<tr>
				<td>번호</td>
				<td>작성자</td>
				<td>내용</td>
				<td>조회수</td>
				<td>추천수</td>
				<td>작성날짜</td>
			</tr>
			
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.idx}</td>
					<td><a href="show?bId=${dto.idx}">${dto.title}</a></td>
					<td>${dto.content} </td>
					<td>${dto.hit} </td>
					<td>${dto.recom} </td>
					<td>${dto.date} </td>
				</tr>
			</c:forEach>
			
		</table>
		<a href="write"> 글쓰기 </a>
		<a href="<%= application.getContextPath() %>"> 메인화면 </a>
</body>
</html>