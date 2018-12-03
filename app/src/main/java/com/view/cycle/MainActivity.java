package com.view.cycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.view.wheelview.WheelData;
import com.view.wheelview.WheelView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    WheelView wheelView;
    List<View> views = new ArrayList<>();
    List<WheelData> data = new ArrayList<>();
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        View view1 = new View(this);
//        final int id1 = 1;
//        final int id2 = 2;
//        final int id3 = 3;
//        final int id4 = 4;
//        final int id5 = 5;
//        view1.setBackgroundColor(Color.RED);
//        View view2 = new View(this);
//        view2.setBackgroundColor(Color.BLUE);
//        View view3 = new View(this);
//        view3.setBackgroundColor(Color.YELLOW);
//        View view4 = new View(this);
//        view4.setBackgroundColor(Color.CYAN);
//        View view5 = new View(this);
//        view5.setBackgroundColor(Color.DKGRAY);
//        view1.setId(id1);
//        view2.setId(id2);
//        view3.setId(id3);
//        view4.setId(id4);
//        view5.setId(id5);
//        view1.setTag("标题1");
//        view2.setTag("标题2");
//        view3.setTag("标题3");
//        view4.setTag("标题4");
//        view5.setTag("标题5");
//        views.add(view1);
//        views.add(view2);
//        views.add(view3);
//        views.add(view4);
//        views.add(view5);

        String url1 = "https://ww3.sinaimg.cn/large/610dc034jw1fasakfvqe1j20u00mhgn2.jpg";
        String url2 = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543839178273&di=ec929a86e47f6cbacd0db06cbdd93c05&imgtype=0&src=http%3A%2F%2Fpic1a.nipic.com%2F2009-01-07%2F20091713417344_2.jpg";
        data.add(new WheelData(url1, "标题1"));
        data.add(new WheelData(url2, "标题2"));
        data.add(new WheelData(url1, "标题3"));
        data.add(new WheelData(url2, "标题4"));

        imageView = findViewById(R.id.view);
        Picasso.get().load(url1).placeholder(R.drawable.placeholder).error(R.drawable.error).into(imageView);

        wheelView = findViewById(R.id.wheel);
        wheelView.setData(data);
        wheelView.setOnPageClickListener(new WheelView.OnPageClickListener() {
            @Override
            public void onPageClick(View view, int position) {
                Log.i("life", data.get(position).getUrl());
            }
        });
    }
}
