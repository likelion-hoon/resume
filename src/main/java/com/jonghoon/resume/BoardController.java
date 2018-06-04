package com.jonghoon.resume;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jonghoon.resume.board.BoardDAO;

@Controller
public class BoardController {
	
	@Autowired
	private SqlSession sqlSession; 
	
	@RequestMapping("/board")
	public String list(Model model) {
		BoardDAO dao = sqlSession.getMapper(BoardDAO.class);
		model.addAttribute("list", dao.getBoardList());
		return "board";
	}
	
	@RequestMapping(value="/write", method = RequestMethod.GET)
	public String write() {
		return "write"; 
	}
	
	@RequestMapping(value="/write", method = RequestMethod.POST)
	public String write(HttpServletRequest req) {
		BoardDAO dao = sqlSession.getMapper(BoardDAO.class);
		dao.writeBoard(req.getParameter("title"), req.getParameter("content"));
		return "redirect:board"; 
	}
	
	@RequestMapping("/show") 
	public String show(HttpServletRequest req, Model model) {
		BoardDAO dao = sqlSession.getMapper(BoardDAO.class);
		String bId = req.getParameter("bId"); 
		dao.increaseHit(bId); 
		model.addAttribute("board",dao.getBoard(bId));
		return "show";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest req) {
		BoardDAO dao = sqlSession.getMapper(BoardDAO.class);
		dao.deleteBoard(req.getParameter("bId"));
		return "redirect:board";
	}
	
	@RequestMapping(value="/update", method = RequestMethod.GET)
	public String update(HttpServletRequest req, Model model) {
		BoardDAO dao = sqlSession.getMapper(BoardDAO.class);
		model.addAttribute("board",dao.getBoard(req.getParameter("bId"))); 
		return "update";
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String update(HttpServletRequest req) {
		BoardDAO dao = sqlSession.getMapper(BoardDAO.class);
		dao.updateBoard(req.getParameter("title"), req.getParameter("content"), req.getParameter("bId"));
		return "redirect:board"; 
	}
}
