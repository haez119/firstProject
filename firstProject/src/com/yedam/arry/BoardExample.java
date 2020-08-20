package com.yedam.arry;

import java.util.List;

public class BoardExample {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
		List<Board> list = dao.getBoardList();
		
		for(Board board : list) {
			System.out.println(board.getTitle() + " - " + board.getContent());
		}
		
	}

}
