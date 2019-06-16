package controller;

import java.util.ArrayList;
import java.util.List;

import model.Member;

public interface MemberService {	
	int create(Member member);
	Member read(Member member);
	ArrayList<Member> readList();
	int update(Member member);
	int delete(Member member);	
	int findByUid(Member member);	
	
	List<Member> findByAddress(String address);
	List<Member> findByName(String name);
}
