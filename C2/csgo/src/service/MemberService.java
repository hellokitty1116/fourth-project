package service;

import java.util.List;

import model.Member;

public interface MemberService {
	//create
		void addMember(Member m);
		
		//read
		List<Member> queryAll();
		Member queryByMemberno(String memberno);
		Member queryByMember(String account,String password);
		
		//update
		void updateMember(String memberno,String membername);
		void updateMember(String memberno,String membername,String password,String email,String address,String phone);
		
		//delete
		void deleteMember(String memberno,String account,String password);
}
