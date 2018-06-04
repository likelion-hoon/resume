package com.jonghoon.resume.board;

import java.util.ArrayList;

public interface BoardDAO {

	// 전체 목록 가져오기
	public ArrayList<BoardDTO> getBoardList(); 
	public void writeBoard(String title, String content); 
	public BoardDTO showBoard(String bId); 
	public void deleteBoard(String bId); 
	
}
