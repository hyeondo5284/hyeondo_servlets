package org.hyeondo.servlets.chap11.dao;

import java.util.List;

public interface MemberDao {
	Member selectByEmail(String email);

	/**
	 * 회원정보 저장
	 */
	void insert(Member member);

	/**
	 * 회원정보 수정
	 */
	void update(Member member);

	/**
	 * 회원 목록
	 */
	List<Member> selectAll(int offset, int count);
	
	/**
	 * 회원 수
	 */
	int countAll();
}
