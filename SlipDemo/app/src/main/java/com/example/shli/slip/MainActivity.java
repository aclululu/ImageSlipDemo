package com.example.shli.slip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.shli.slip.support.BaseEntry;
import com.example.shli.slip.support.SlipView;
import com.example.shli.slip.support.SlipTo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    SlipView slipViewImage;

    private String[] mImgs = new String[]{"http://img3.imgtn.bdimg.com/it/u=1131868718,2318762161&fm=21&gp=0.jpg",
            "http://img1.imgtn.bdimg.com/it/u=998216620,3976144567&fm=21&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=1060261861,3940957884&fm=21&gp=0.jpg",
            "http://img1.imgtn.bdimg.com/it/u=1061144504,2402681105&fm=21&gp=0.jpg"};


    private String[] mTitles = new String[]{"一个美女",
            "一个美女动图",
            "还是一个美女",
            "脑洞男"};

    private List<BaseEntry> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slipViewImage = (SlipView) findViewById(R.id.slip);
        for (int j = 0; j < mImgs.length; j++) {
            BaseEntry entity = new BaseEntry();
            entity.pathurl = mImgs[j];
            entity.title = mTitles[j];
            data.add(entity);
        }
        slipViewImage.setData(data);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slipViewImage.slipTo(SlipTo.DOWN);
            }
        });
    }


}
