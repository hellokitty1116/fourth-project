package service;

import java.util.List;

import model.views.LottoViews;

public interface LottoViewsService {
	
	List<LottoViews> queryByMemberno(String memberno);
}
