package service.Impl;

import java.util.List;

import dao.impl.MemberDaoImpl;
import model.Member;
import service.MemberService;

public class MemberServiceImpl implements MemberService{
	public static void main(String[] args) {
		
	}
	private static MemberDaoImpl mdi=new  MemberDaoImpl();
	@Override
	public void addMember(Member m) {
		mdi.add(m);
		
		
	}

	@Override
	public List<Member> queryAll() {
		
		return mdi.selectAll();
	}

	@Override
	public Member queryByMemberno(String memberno) {
		List<Member> l =mdi.selectByMemberno(memberno);
		Member[] m = l.toArray(new Member[1]);
		return m[0];
	}

	@Override
	public Member queryByMember(String account, String password) {
		List<Member> l =mdi.selectMember(account, password);
		Member[] m =l.toArray(new Member[1]);
		
		return m[0];
	}

	@Override
	public void updateMember(String memberno, String membername) {
		Member m = queryByMemberno(memberno);
		m.setName(membername);
		mdi.update(m);
	}

	@Override
	public void updateMember(String memberno, String membername, String password, String email,
			String address, String phone) {
		Member m = queryByMemberno(memberno);
		m.setName(membername);
		m.setPassword(password);
		m.setEmail(email);
		m.setAddress(address);
		m.setPhone(phone);
		mdi.update(m);
		
		
	}

	@Override
	public void deleteMember(String memberno, String account, String password) {
		mdi.delete(memberno, account, password);
		
	}
	

}
