package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import dao.DbConnection;
import dao.LottoResultDao;
import model.LottoResult;

public class LottoResultDaoImpl implements LottoResultDao{

	public static void main(String[] args) {
		/*LottoResult l=new LottoResult("A0004","優里","X006","1");
		new LottoResultDaoImpl().add(l);*/

	}

	@Override
	public void add(LottoResult l) {
		Connection conn= DbConnection.getDb();
		String SQL="insert into lottoresult(memberno,name,gunno,amount,datetime) values(?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, l.getMemberno());
			ps.setString(2, l.getName());
			ps.setString(3, l.getGunno());
			ps.setString(4, l.getAmount());
			ZonedDateTime now = ZonedDateTime.now();
			DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
			ps.setString(5, now.format(formatter).toString());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
