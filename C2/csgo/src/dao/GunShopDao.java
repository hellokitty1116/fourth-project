package dao;

import java.util.List;
import java.util.Map;

import model.GunShop;

public interface GunShopDao {
	void add(GunShop g);
    List<GunShop> selectAll();
    List<GunShop> selectByMemberno(String memberno);
    Map<String, Integer> getEquipmentCounts();
}
