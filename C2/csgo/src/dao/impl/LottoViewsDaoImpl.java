package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.DbConnection;
import dao.LottoViewsDao;
import model.views.LottoViews;

public class LottoViewsDaoImpl implements LottoViewsDao{

	public static void main(String[] args) {
		System.out.println(new LottoViewsDaoImpl().selectByMemberno("A0001"));

	}

	@Override
	public List<LottoViews> selectByMemberno(String memberno) {
		Connection conn= DbConnection.getDb();
		String SQL="select * from lottoviews where memberno=?";
		List <LottoViews> l= new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, memberno);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				LottoViews lo=new LottoViews();
				lo.setMemberno(rs.getString("memberno"));
				lo.setName(rs.getString("name"));
				lo.setGunno(rs.getString("gunno"));
				lo.setGunname(rs.getString("gunname"));
				lo.setAmount(rs.getString("amount"));
				lo.setDatetime(rs.getString("datetime"));
				l.add(lo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public Map<String, Integer> getGunnameCounts() {
		Connection conn = DbConnection.getDb();
		String SQL = "SELECT gunname, COUNT(*) AS count FROM lottoviews GROUP BY gunname";
		Map<String, Integer> gunnameCounts = new HashMap<>();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				gunnameCounts.put(rs.getString("gunname"), rs.getInt("count"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gunnameCounts;
	}

}
