package com.example.jacksondemo;

import java.io.Serializable;
/**
 * 
 * @author DJL
 * 这里需要注意1.实体bean的结构必须与json中的数据结构一。2.实体bean中的数据名称必须与json中对应的关键词一至
 *
 */
public class BussinessBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5487473400841034412L;

	private int business_id;// you
	private int id;
	private String name;// 商户名 you
	private String branch_name;// 分店名
	private String address;// 地址 you
	private String city;// 所在城市 you
	private String regions;// 所在区域信息列表 you
	private String telephone;// 带区号的电话 you
	private double latitude;// 纬度坐标 you
	private double longitude;// 经度坐标 you
	private int has_deal;// 是否有团购 you
	private int deal_count;// 商户当前在线团购数量 you
	private float avg_rating;// 星级评分
	private int review_count;// 点评数量
	private String review_list_url; // you


	public float getAvg_rating() {
		return avg_rating;
	}

	public void setAvg_rating(float avg_rating) {
		this.avg_rating = avg_rating;
	}

	public int getReview_count() {
		return review_count;
	}

	public void setReview_count(int review_count) {
		this.review_count = review_count;
	}

	public String getReview_list_url() {
		return review_list_url;
	}

	public void setReview_list_url(String review_list_url) {
		this.review_list_url = review_list_url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegions() {
		return regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getHas_deal() {
		return has_deal;
	}

	public void setHas_deal(int has_deal) {
		this.has_deal = has_deal;
	}

	public int getDeal_count() {
		return deal_count;
	}

	public void setDeal_count(int deal_count) {
		this.deal_count = deal_count;
	}

	public int getBusiness_id() {
		return business_id;
	}

	public void setBusiness_id(int business_id) {
		this.business_id = business_id;
	}

	@Override
	public String toString() {
		return "BussinessBean [business_id=" + business_id + ", name=" + name
				+ ", branch_name=" + branch_name + ", address=" + address
				+ ", city=" + city + ", regions=" + regions + ", telephone="
				+ telephone + ", latitude=" + latitude + ", longitude="
				+ longitude + ", has_deal=" + has_deal + ", " + ", avg_rating="
				+ avg_rating + ", review_count=" + review_count
				+ ", review_list_url=" + review_list_url + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
