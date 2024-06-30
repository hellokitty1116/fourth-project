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
import dao.GunShopDao;
import model.GunShop;

public class GunShopDaoImpl implements GunShopDao{

	public static void main(String[] args) {
		//new GunShopDaoImpl().add(new GunShop("A0001","尤里","P250",1,500));

	}

	@Override
	public void add(GunShop g) {
		Connection conn = DbConnection.getDb();
        String SQL = "INSERT INTO gunshop (memberno, name, equipmentname, quantity, price, datetime) VALUES (?, ?, ?, ?, ?, ?)";
        try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			 ps.setString(1, g.getMemberNo());
	            ps.setString(2, g.getName());
	            ps.setString(3, g.getEquipmentName());
	            ps.setInt(4, g.getQuantity());
	            ps.setInt(5, g.getPrice());
	            ZonedDateTime now = ZonedDateTime.now();
				DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
	            ps.setString(6, now.format(formatter).toString());
	            ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<GunShop> selectAll() {
		Connection conn = DbConnection.getDb();
        String SQL = "SELECT * FROM gunshop";
        List<GunShop> l = new ArrayList<>();
        try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
                GunShop g = new GunShop();
                g.setId(rs.getInt("id"));
                g.setMemberNo(rs.getString("memberno"));
                g.setName(rs.getString("name"));
                g.setEquipmentName(rs.getString("equipmentname"));
                g.setQuantity(rs.getInt("quantity"));
                g.setPrice(rs.getInt("price"));
                g.setDatetime(rs.getString("datetime"));
                l.add(g);
		} }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<GunShop> selectByMemberno(String memberno) {
		Connection conn = DbConnection.getDb();
        String SQL = "SELECT * FROM gunshop where memberno=?";
        List<GunShop> l = new ArrayList<>();
        try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, memberno);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				 GunShop g = new GunShop();
	                g.setId(rs.getInt("id"));
	                g.setMemberNo(rs.getString("memberno"));
	                g.setName(rs.getString("name"));
	                g.setEquipmentName(rs.getString("equipmentname"));
	                g.setQuantity(rs.getInt("quantity"));
	                g.setPrice(rs.getInt("price"));
	                g.setDatetime(rs.getString("datetime"));
	                l.add(g);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public Map<String, Integer> getEquipmentCounts() {
        Connection conn = DbConnection.getDb();
        String SQL = "SELECT equipmentname, SUM(quantity) AS count FROM gunshop GROUP BY equipmentname";
        Map<String, Integer> equipmentCounts = new HashMap<>();
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                equipmentCounts.put(rs.getString("equipmentname"), rs.getInt("count"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return equipmentCounts;
    }

}
