package com.example.imageloader;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ImageView imageView = (ImageView) findViewById(R.id.imageview);
		String uri = "http://www.people.com.cn/mediafile/pic/20160914/34/1194544308422891454.jpg";
		
		//初始化init配置，使用默认的配置参数
		//ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(getApplicationContext()));
		
		ImageLoader.getInstance().displayImage(uri, imageView);
		
	}

	

}
