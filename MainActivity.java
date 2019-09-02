package com.example.carousel_bs1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;
import me.relex.circleindicator.CircleIndicator2;

public class MainActivity extends AppCompatActivity {

    //private ArrayList<String> mnames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    RecyclerView recyclerView;
    SnapHelper snapHelper ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircleIndicator2 indicator = findViewById(R.id.indicator);

        readJson();
        snapHelper = new PagerSnapHelper();
        recyclerView.setOnFlingListener(null);
        snapHelper.attachToRecyclerView(recyclerView);

    }

    public void readJson() {
        String json_string = null;
        ArrayList<String> URLs = new ArrayList<>();

        try {
            InputStream inputStream = getAssets().open("demo.json");
            int size = ((InputStream) inputStream).available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json_string = new String(buffer, "UTF-8");
            Gson gson = new Gson();

            Post posts = gson.fromJson(json_string, Post.class);
            List<com.example.carousel_bs1.View> views = posts.getViews();
            List<Item> temp = views.get(0).getItems();

            for (int i = 0; i < temp.size(); i++) {
                List<Item> items = views.get(0).getItems();
                String url = items.get(i).getImageUrl();
                mImageUrls.add(url);
                //android.util.Log.d("TAG", "readJson: "+i+" "+url);
            }
            //android.util.Log.d("TAG", "readJson: "+ url);


        } catch (Exception e) {
            e.printStackTrace();
        }

        initRecyclerView();
    }

    /*private void initImageBitmaps(){

        mImageUrls.add("https://assetscdn1.paytm.com/images/catalog/view_item/432632/1564831398739.jpg");
        mImageUrls.add("https://assetscdn1.paytm.com/images/catalog/view_item/432632/1564831398739.jpg");
        mImageUrls.add("https://assetscdn1.paytm.com/images/catalog/view_item/432632/1564831398739.jpg");
        mImageUrls.add("https://assetscdn1.paytm.com/images/catalog/view_item/432632/1564831398739.jpg");
        mImageUrls.add("https://assetscdn1.paytm.com/images/catalog/view_item/448307/1565099388260.jpg");
        mImageUrls.add("https://assetscdn1.paytm.com/images/catalog/view_item/453705/1566805649993.jpg");
        mImageUrls.add("https://assetscdn1.paytm.com/images/catalog/view_item/405193/1564831584448.jpg");
        mImageUrls.add("https://assetscdn1.paytm.com/images/catalog/view_item/405193/1564831584448.jpg");
        mImageUrls.add("https://assetscdn1.paytm.com/images/catalog/view_item/405193/1564831584448.jpg");
        mImageUrls.add("https://assetscdn1.paytm.com/images/catalog/view_item/405193/1564831584448.jpg");
        mImageUrls.add("https://assetscdn1.paytm.com/images/catalog/view_item/405193/1564831584448.jpg");
        initRecyclerView();
    }*/

    private void initRecyclerView() {
        //Log.d(TAG, "initRecyclerView: ");
        recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mImageUrls);
        snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        pagerSnapHelper.attachToRecyclerView(recyclerView);


    }
}