<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<title>글 수정 페이지</title>
</head>
<body>
	<h2> 글을 수정해주세요. </h2>
	<form action="update" method="post">
		<table width="500" cellpadding="0" border="1">
			<tr>
				<td><input type="hidden" name="bId" value="${board.idx}" ></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" size="50" value="${board.title}"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type="text" name="content" size="150" value="${board.content}"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정">&nbsp;&nbsp; <a href="board">목록보기</a></td>
			</tr>
		</table>
	</form>
</body>
</html>