package dao;

import java.util.List;
import java.util.Map;

import model.Member;

public interface MemberDao {
			//create
			void add(Member m);
			//read
			List<Member> selectAll();
			List<Member> selectByMemberno(String memberno);
			List<Member> selectMember(String account,String password);
			Member queryAccount(String account);

			//update
			void update(Member m);

			//delete
			void delete(String memberno,String account,String password);
			
			
			 String generateNextMemberNo();
			 Map<String, Integer> getSexRatio();
}
