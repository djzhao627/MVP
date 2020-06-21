package cn.djzhao.mvp.base;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements View.OnClickListener {

    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());

        mPresenter = getPresenter();
        mPresenter.bindView(this);

        initView();
        initData();
        initEvent();
    }

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initEvent();

    protected abstract int getLayout();

    protected abstract P getPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroy();
    }

    protected abstract void destroy();
}
