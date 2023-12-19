package org.spring.mapper;

import java.util.List;

import org.spring.model.MemberVO;

public interface MemberMapper {
	
	public List<MemberVO> getAllMembers();
	
	public MemberVO getMember(MemberVO user);
}
