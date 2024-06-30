package model.views;
//在java中 class第一個字大寫
//類型全部用包覆類別,比較好轉
//field欄位都用小寫!!
public class LottoViews {
	private String memberno;
	private String name;
	private String gunno;
	private String gunname;
	private String amount;
	private String datetime;
	//因為此表無法修改,無須做建構式來放入參數
	public String getMemberno() {
		return memberno;
	}
	public void setMemberno(String memberno) {
		this.memberno = memberno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGunno() {
		return gunno;
	}
	public void setGunno(String gunno) {
		this.gunno = gunno;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getGunname() {
		return gunname;
	}
	public void setGunname(String gunname) {
		this.gunname = gunname;
	}
	
	
	
}
