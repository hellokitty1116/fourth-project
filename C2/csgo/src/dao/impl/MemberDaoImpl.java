package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.DbConnection;
import dao.MemberDao;
import model.Member;

public class MemberDaoImpl implements MemberDao{

	public static void main(String[] args) {
		//System.out.println( new MemberDaoImpl().selectMember("curry", "rice").get(0).getNationalid());
		//new MemberDaoImpl().add(new Member("A0005","杏奈","peach","fruit","peach@gamil.com","f","D123456789","tokyo","981231"));
		// System.out.println( new MemberDaoImpl().queryAccount(new MemberDaoImpl().selectAll().get(0).getAccount()).getAddress());
	}

	public String generateNextMemberNo() {
	    Connection conn = DbConnection.getDb();
	    String SQL = "SELECT MAX(memberno) AS max_memberno FROM member";
	    String nextMemberNo = "A0001"; // 默认从 A0001 开始

	    try {
	        PreparedStatement ps = conn.prepareStatement(SQL);
	        ResultSet rs = ps.executeQuery();
	        if (rs.next()) {
	            String maxMemberNo = rs.getString("max_memberno");
	            if (maxMemberNo != null) {
	                // 解析当前最大的 memberno，例如从 A9999 到 B0001
	                char prefix = maxMemberNo.charAt(0);
	                String numberPart = maxMemberNo.substring(1);
	                //.substring(1) 的作用是从 maxMemberNo 字符串中取出索引位置从1开始（第2个字符开始）到字符串末尾的子字符串，并将这个子字符串赋值给变量 numberPart。
	                if (numberPart.equals("9999")) {
	                    prefix++; // 切换到下一个字母
	                    numberPart = "0001";
	                } else {
	                    numberPart = String.format("%04d", Integer.parseInt(numberPart) + 1);
	                   //"04d": 表示输出的整数总长度为4位数，不足位数时用0填充。其中，0 是填充字符，4 是总宽度，d 表示这是一个十进制整数。
	                }
	                nextMemberNo = prefix + numberPart;
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return nextMemberNo;
	}
	@Override
	public void add(Member m) {
		Connection conn = DbConnection.getDb();
		String SQL = "insert into member(name,memberno,account,password,email,sex,nationalid,address,phone,datetime)"+
		" values(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, m.getName());
			ps.setString(2, m.getMemberno());
			ps.setString(3, m.getAccount());
			ps.setString(4, m.getPassword());
			ps.setString(5, m.getEmail());
			ps.setString(6, m.getSex());
			ps.setString(7, m.getNationalid());
			ps.setString(8, m.getAddress());
			ps.setString(9, m.getPhone());
			ZonedDateTime now = ZonedDateTime.now();
			DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
			ps.setString(10, now.format(formatter).toString());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Member> selectAll() {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from member";
		List<Member> l = new ArrayList();
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
				Member m=new Member();
				m.setId(rs.getInt("id"));
				m.setMemberno(rs.getString("memberno"));
				m.setName(rs.getString("name"));
				m.setAccount(rs.getString("account"));
				m.setPassword(rs.getString("password"));
				m.setEmail(rs.getString("email"));
				m.setSex(rs.getString("sex"));
				m.setNationalid(rs.getString("nationalid"));
				m.setAddress(rs.getString("address"));
				m.setPhone(rs.getString("phone"));
				m.setDatetime(rs.getString("datetime"));
				l.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Member> selectByMemberno(String memberno) {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from member where memberno=?";
		List<Member> l = new ArrayList();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, memberno);
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
				Member m=new Member();
				m.setId(rs.getInt("id"));
				m.setMemberno(rs.getString("memberno"));
				m.setName(rs.getString("name"));
				m.setAccount(rs.getString("account"));
				m.setPassword(rs.getString("password"));
				m.setEmail(rs.getString("email"));
				m.setSex(rs.getString("sex"));
				m.setNationalid(rs.getString("nationalid"));
				m.setAddress(rs.getString("address"));
				m.setPhone(rs.getString("phone"));
				m.setDatetime(rs.getString("datetime"));
				l.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Member> selectMember(String username, String password) {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from member where account=? and password=?";
		List<Member> l = new ArrayList();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				Member m=new Member();
				m.setId(rs.getInt("id"));
				m.setMemberno(rs.getString("memberno"));
				m.setName(rs.getString("name"));
				m.setAccount(rs.getString("account"));
				m.setPassword(rs.getString("password"));
				m.setEmail(rs.getString("email"));
				m.setSex(rs.getString("sex"));
				m.setNationalid(rs.getString("nationalid"));
				m.setAddress(rs.getString("address"));
				m.setPhone(rs.getString("phone"));
				m.setDatetime(rs.getString("datetime"));
				l.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public void update(Member m) {
		Connection conn = DbConnection.getDb();
		String SQL = "update member set name=?,password=?,email=?,address=?,phone=? where memberno=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, m.getName());
			ps.setString(2, m.getPassword());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getAddress());
			ps.setString(5, m.getPhone());
			ps.setString(6, m.getMemberno());
			ps.executeUpdate();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(String memberno,String account,String password) {
		Connection conn = DbConnection.getDb();
		String SQL = "delete from member where memberno=? and account=? and password=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1,memberno);
			ps.setString(2, account);
			ps.setString(3, password);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Member queryAccount(String account) {
		Connection conn=DbConnection.getDb();
		String SQL ="select * from member where account=?";
		Member m=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, account);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				m=new Member();
				m.setId(rs.getInt("id"));
				m.setMemberno(rs.getString("memberno"));
				m.setName(rs.getString("name"));
				m.setAccount(rs.getString("account"));
				m.setPassword(rs.getString("password"));
				m.setEmail(rs.getString("email"));
				m.setSex(rs.getString("sex"));
				m.setNationalid(rs.getString("nationalid"));
				m.setAddress(rs.getString("address"));
				m.setPhone(rs.getString("phone"));
				m.setDatetime(rs.getString("datetime"));
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m;
	}

	@Override
	public Map<String, Integer> getSexRatio() {
        Connection conn = DbConnection.getDb();
        String SQL = "SELECT sex, COUNT(*) as count FROM member GROUP BY sex";
        Map<String, Integer> sexRatio = new HashMap<>();

        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String sex = rs.getString("sex");
                int count = rs.getInt("count");
                sexRatio.put(sex, count);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sexRatio;
    }

}
