package service.Impl;

import java.util.List;

import dao.impl.LottoViewsDaoImpl;
import model.views.LottoViews;
import service.LottoViewsService;

public class LottoViewsServiceImpl implements LottoViewsService{
	private static LottoViewsDaoImpl lvi=new  LottoViewsDaoImpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<LottoViews> queryByMemberno(String memberno) {
		// TODO Auto-generated method stub
		return lvi.selectByMemberno(memberno);
	}

}
