package cn.djzhao.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import cn.djzhao.mvp.base.BasePresenter;

public class MainActivity extends AppCompatActivity {

    private final String bingPic = "https://api.xygeng.cn/Bing/";
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.iv);
    }


    public void downLoad(View view) {
        Glide.with(this).load(bingPic).into(imageView);
    }
}
