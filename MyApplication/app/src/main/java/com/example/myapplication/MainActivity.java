package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private GridLayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mLayoutManager = new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemViewCacheSize(-1);
        adapter = new RecyclerViewAdapter(this, createData(), new CustomItemClickListener() {

            @Override
            public void onItemClick(View v, int position) {
                Log.e("hemly","position= "+position);

            }
        });

        recyclerView.setAdapter(adapter);

    }

    private List<String> createData() {
        List<String> data = new ArrayList<String>();
        data.add("https://img.ltn.com.tw/Upload/liveNews/BigPic/600_phpm0H0V8.jpg");
        data.add("http://www.coco02.net/upload/M6/lp5/2576d3198d27466aae55cd724c19c2f8.jpg");
        data.add("https://fun01.live/ups/1099/images/20181225/5c212f45c7b49.png");
        data.add("http://www.haopic.me/wp-content/uploads/2015/09/20150913093615934.jpg");
        data.add("http://www.haopic.me/wp-content/uploads/2015/09/20150913093618148.jpg");
        data.add("http://www.haopic.me/wp-content/uploads/2015/09/20150913093619311.jpg");


        data.add("https://mstory.b-cdn.net/wp-content/uploads/2016/10/20161007-1475884594.jpg");
        data.add("https://getez.info/uploads/1479973178-vMuGw.jpg");
        data.add("http://store.limpehisforeign.com/uploads/20171121/76/7664485E0D9Dw749h1032.jpeg");

        data.add("https://img.ltn.com.tw/Upload/liveNews/BigPic/600_phpm0H0V8.jpg");
        data.add("http://www.coco02.net/upload/M6/lp5/2576d3198d27466aae55cd724c19c2f8.jpg");
        data.add("https://fun01.live/ups/1099/images/20181225/5c212f45c7b49.png");

        data.add("https://img.ltn.com.tw/Upload/liveNews/BigPic/600_phpm0H0V8.jpg");
        data.add("http://www.coco02.net/upload/M6/lp5/2576d3198d27466aae55cd724c19c2f8.jpg");
        data.add("https://fun01.live/ups/1099/images/20181225/5c212f45c7b49.png");
        data.add("https://www.mymypic.net/data/attachment/forum/201710/09/231501i70vpoz2ggie4gae.jpg");
        data.add("https://zodiac.tw/uploads/201707/10/0922_FB30n.png");
        data.add("https://img.bingfeng.tw/bingfeng/forum/201806/14/213227xx71xsw23sr4lpvk.jpg");


        data.add("https://mstory.b-cdn.net/wp-content/uploads/2016/10/20161007-1475884594.jpg");
        data.add("https://getez.info/uploads/1479973178-vMuGw.jpg");
        data.add("http://store.limpehisforeign.com/uploads/20171121/76/7664485E0D9Dw749h1032.jpeg");

        data.add("https://img.ltn.com.tw/Upload/liveNews/BigPic/600_phpm0H0V8.jpg");
        data.add("http://www.coco02.net/upload/M6/lp5/2576d3198d27466aae55cd724c19c2f8.jpg");
        data.add("https://fun01.live/ups/1099/images/20181225/5c212f45c7b49.png");

        data.add("https://img.ltn.com.tw/Upload/liveNews/BigPic/600_phpm0H0V8.jpg");
        data.add("http://www.coco02.net/upload/M6/lp5/2576d3198d27466aae55cd724c19c2f8.jpg");
        data.add("https://fun01.live/ups/1099/images/20181225/5c212f45c7b49.png");
        data.add("https://www.mymypic.net/data/attachment/forum/201710/09/231501i70vpoz2ggie4gae.jpg");
        data.add("https://zodiac.tw/uploads/201707/10/0922_FB30n.png");
        data.add("https://img.bingfeng.tw/bingfeng/forum/201806/14/213227xx71xsw23sr4lpvk.jpg");


        data.add("https://mstory.b-cdn.net/wp-content/uploads/2016/10/20161007-1475884594.jpg");
        data.add("https://getez.info/uploads/1479973178-vMuGw.jpg");
        data.add("http://store.limpehisforeign.com/uploads/20171121/76/7664485E0D9Dw749h1032.jpeg");

        data.add("https://img.ltn.com.tw/Upload/liveNews/BigPic/600_phpm0H0V8.jpg");
        data.add("http://www.coco02.net/upload/M6/lp5/2576d3198d27466aae55cd724c19c2f8.jpg");
        data.add("https://fun01.live/ups/1099/images/20181225/5c212f45c7b49.png");
        return data;
    }

}
