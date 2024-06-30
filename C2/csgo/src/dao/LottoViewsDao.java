package dao;

import java.util.List;
import java.util.Map;

import model.views.LottoViews;

public interface LottoViewsDao {
		
	//read
	List<LottoViews> selectByMemberno(String memberno);
	Map<String, Integer> getGunnameCounts();
}
