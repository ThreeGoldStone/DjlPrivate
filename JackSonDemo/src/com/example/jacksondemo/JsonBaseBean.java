package com.example.jacksondemo;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * 
 * @author DJL
 * 这里需要注意1.实体bean的结构必须与json中的数据结构一。2.实体bean中的数据名称必须与json中对应的关键词一至
 *
 */
public class JsonBaseBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1737635290522901166L;
	public String status; // 状态码(OK为成功,ERROR)
	public int count; // 当页的数量
	public int total_count; // 总数量
	public ArrayList<CategoryBean> deals; // 数据集合

}
