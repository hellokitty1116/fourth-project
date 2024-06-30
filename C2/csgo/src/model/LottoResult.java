package model;

public class LottoResult {
	private Integer id;
	private String memberno;
	private String name;
	private String gunno;
	private String amount;
	private String datetime;
	public LottoResult() {
		super();
	}
	public LottoResult(String memberno, String name, String gunno, String amount) {
		super();
		this.memberno = memberno;
		this.name = name;
		this.gunno = gunno;
		this.amount = amount;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	
	
	
	

}
