<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>게시글 보기</title>
</head>
<body>
		<h2> ${board.idx} 번 글입니다.</h2>
		<p> 번호 : ${board.idx} </p>
		<p>	작성자 : ${board.title} </p>
		<p>	내용 : ${board.content} </p>
		<p>	조회수 : ${board.hit} </p>
		<p>	추천수 : ${board.recom} </p>
		<p>	작성날짜 : ${board.date}</p>
	
		<a type="button" href="board">뒤로가기</a>
		<a type="button" href="delete?bId=${board.idx}">삭제</a>
		<a type="button" href="update?bId=${board.idx}">수정</a>
</body>
</html>