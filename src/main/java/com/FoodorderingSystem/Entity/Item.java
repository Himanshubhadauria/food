package com.FoodorderingSystem.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;




@Entity
public class Item {
    @Id
	int iid;
	String iname;
	String iprice;
	String item_img;
	
	
	


	@OneToOne
	Category category;


	public Item() {
		
	}


	public int getIid() {
		return iid;
	}


	public void setIid(int iid) {
		this.iid = iid;
	}


	public String getIname() {
		return iname;
	}


	public void setIname(String iname) {
		this.iname = iname;
	}


	public String getIprice() {
		return iprice;
	}


	public void setIprice(String iprice) {
		this.iprice = iprice;
	}
	


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}
	public String getItem_img() {
		return item_img;
	}


	public void setItem_img(String item_img) {
		this.item_img = item_img;
	}


	public Item(int iid, String iname, String iprice, Category category, String item_img) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.iprice = iprice;
		this.category = category;
		this.item_img= item_img;
	}


	@Override
	public String toString() {
		return "Item [iid=" + iid + ", iname=" + iname + ", iprice=" + iprice + ", category=" + category + ", Item Image="+ item_img +"]";
	}


	


	
	


	
	}


