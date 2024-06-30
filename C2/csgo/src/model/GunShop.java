package model;

import java.io.Serializable;

public class GunShop implements Serializable{
	 	private Integer id;
	    private String memberNo;
	    private String name;
	    private String equipmentName;
	    private Integer quantity;
	    private Integer price;
	    private String datetime;
		public GunShop() {
			super();
		}
		public GunShop(String memberNo, String name, String equipmentName, Integer quantity, Integer price) {
			super();
			this.memberNo = memberNo;
			this.name = name;
			this.equipmentName = equipmentName;
			this.quantity = quantity;
			this.price = price;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getMemberNo() {
			return memberNo;
		}
		public void setMemberNo(String memberNo) {
			this.memberNo = memberNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEquipmentName() {
			return equipmentName;
		}
		public void setEquipmentName(String equipmentName) {
			this.equipmentName = equipmentName;
		}
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
		public String getDatetime() {
			return datetime;
		}
		public void setDatetime(String datetime) {
			this.datetime = datetime;
		}
	    
}
