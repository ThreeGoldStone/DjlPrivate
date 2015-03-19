package com.example.jacksondemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author DJL 这里需要注意1.实体bean的结构必须与json中的数据结构一。2.实体bean中的数据名称必须与json中对应的关键词一至
 * 
 */
public class CategoryBean implements Serializable {

	/** */
	private static final long serialVersionUID = -6885896872916345676L;

	public CategoryBean() {
	}

	// public getUrl
	public CategoryBean(String json) {
		// TODO Auto-generated constructor stub
	}

	private boolean isChecked;
	public boolean isDZ = true;
	/** deal_id string 团购单ID */
	private String deal_id;
	// title string 团购标题
	private String title;
	// description string 团购描述
	private String description;
	// city string 城市名称，city为＂全国＂表示全国单，其他为本地单，城市范围见相关API返回结果
	private String city;
	// list_price float 团购包含商品原价值
	private float list_price;
	// current_price float 团购价格
	private float current_price;
	// regions list 团购适用商户所在行政区
	private List<Object> regions;
	// categories list 团购所属分类
	private List<CategoryBean> categories;
	// purchase_count int 团购当前已购买数
	private int purchase_count;
	// publish_date string 团购发布上线日期
	private String publish_date;
	// purchase_deadline string 团购单的截止购买日期
	private String purchase_deadline;
	// distance int
	// 团购单所适用商户中距离参数坐标点最近的一家与坐标点的距离，单位为米；如不传入经纬度坐标，结果为-1；如团购单无关联商户，结果为MAXINT
	private int distance;
	// image_url string 团购图片链接，最大图片尺寸450×280
	private String image_url;
	// s_image_url string 小尺寸团购图片链接，最大图片尺寸160×100
	private String s_image_url;
	// deal_url string 团购Web页面链接，适用于网页应用
	private String deal_url;
	// deal_h5_url string 团购HTML5页面链接，适用于移动应用和联网车载应用
	private String deal_h5_url;
	// commission_ratio float 当前团单的佣金比例
	private float commission_ratio;
	// businesses list 团购所适用的商户列表
	private ArrayList<BussinessBean> businesses;

	public String getDeal_id() {
		return deal_id;
	}

	public void setDeal_id(String deal_id) {
		this.deal_id = deal_id;
	}

	@Override
	public String toString() {
		return "CategoryBean [isChecked=" + isChecked + ", isDZ=" + isDZ
				+ ", deal_id=" + deal_id + ", title=" + title
				+ ", description=" + description + ", city=" + city
				+ ", list_price=" + list_price + ", current_price="
				+ current_price + ", regions=" + regions + ", categories="
				+ categories + ", purchase_count=" + purchase_count
				+ ", publish_date=" + publish_date + ", purchase_deadline="
				+ purchase_deadline + ", distance=" + distance + ", image_url="
				+ image_url + ", s_image_url=" + s_image_url + ", deal_url="
				+ deal_url + ", deal_h5_url=" + deal_h5_url
				+ ", commission_ratio=" + commission_ratio + ", businesses="
				+ getBusinessesString() + "]";
	}

	public String getTitle() {
		return title;
	}

	public String getBusinessesString() {
		StringBuilder sb = new StringBuilder();
		if (businesses != null) {
			for (BussinessBean b : businesses) {
				sb.append("\n   businesses:").append(b.toString());
			}
		}
		return sb.toString();

	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getList_price() {
		return list_price;
	}

	public void setList_price(float list_price) {
		this.list_price = list_price;
	}

	public float getCurrent_price() {
		return current_price;
	}

	public void setCurrent_price(float current_price) {
		this.current_price = current_price;
	}

	public List<Object> getRegions() {
		return regions;
	}

	public void setRegions(List<Object> regions) {
		this.regions = regions;
	}

	public List<CategoryBean> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryBean> categories) {
		this.categories = categories;
	}

	public int getPurchase_count() {
		return purchase_count;
	}

	public void setPurchase_count(int purchase_count) {
		this.purchase_count = purchase_count;
	}

	public String getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}

	public String getPurchase_deadline() {
		return purchase_deadline;
	}

	public void setPurchase_deadline(String purchase_deadline) {
		this.purchase_deadline = purchase_deadline;
	}

	public int getDistance() {
		return distance;
	}

	public String getDistanceS() {
		if (distance < 0) {
			// return "获取距离失败";
			return "";
		}
		StringBuilder sb = new StringBuilder();
		if (distance / 1000 == 0) {
			sb.append(distance).append("m");
		} else {
			sb.append(distance / 1000).append(".").append(distance % 1000)
					.append("km");

		}
		return sb.toString();
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getS_image_url() {
		return s_image_url;
	}

	public void setS_image_url(String s_image_url) {
		this.s_image_url = s_image_url;
	}

	public String getDeal_url() {
		return deal_url;
	}

	public void setDeal_url(String deal_url) {
		this.deal_url = deal_url;
	}

	public String getDeal_h5_url() {
		return deal_h5_url;
	}

	public void setDeal_h5_url(String deal_h5_url) {
		this.deal_h5_url = deal_h5_url;
	}

	public float getCommission_ratio() {
		return commission_ratio;
	}

	public void setCommission_ratio(float commission_ratio) {
		this.commission_ratio = commission_ratio;
	}

	public ArrayList<BussinessBean> getBusinesses() {
		return businesses;
	}

	public void setBusinesses(ArrayList<BussinessBean> businesses) {
		this.businesses = businesses;
	}

	public boolean isChecked() {
		return isChecked;
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
}
