package com.jonghoon.resume.board;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
	
	private int idx; // 글 번호, auto increment
	private String title; // 글 제목
	private String content; // 글 내용
	private int hit; // 조회수, default 0
	private int recom; // 추천수, default 0
	private String date; 
}
