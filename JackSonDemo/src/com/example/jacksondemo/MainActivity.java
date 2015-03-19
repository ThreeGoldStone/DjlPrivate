package com.example.jacksondemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.djl.utils.JackSonUtil;
import com.example.jacksondemo.R;

/**
 * 
 * @author DJL
 * @since 2015/03/19 11:01
 * @version 1.0 这里需要注意1.实体bean的结构必须与json中的数据结构一。2.实体bean中的数据名称必须与json中对应的关键词一至
 * 
 */
public class MainActivity extends Activity {

	private ArrayList<CategoryBean> categorys;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		InputStream is;
		try {
			// 获取json数据流
			is = getAssets().open("demo.json");
			// 海量json数据，一行瞬间解析，这种feel谁用谁知道
			JsonBaseBean baseBean = JackSonUtil.parse(JsonBaseBean.class, is);
			categorys = baseBean.deals;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 这里我仅做一下解析出的数据的简单展示,具体的用处你们比我清楚
		StringBuilder sb = new StringBuilder();
		for (CategoryBean c : categorys) {
			sb.append("\n categorys").append(c.toString()).append("\n\n\n");
		}
		TextView tv = (TextView) findViewById(R.id.tv);

		tv.setText(sb.toString());
	}
}
