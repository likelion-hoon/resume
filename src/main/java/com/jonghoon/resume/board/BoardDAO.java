package com.jonghoon.resume.board;

import java.util.ArrayList;

public interface BoardDAO {

	public ArrayList<BoardDTO> getBoardList();   // 전체목록 가져오기
	public void writeBoard(String title, String content); // 글 쓰기
	public BoardDTO getBoard(String bId); // 글 보기 
	public void deleteBoard(String bId); // 글 삭제
	public void updateBoard(String title, String content, String bId); // 글 수정
	public void increaseHit(String bId); // 조회수 증가
	
}
