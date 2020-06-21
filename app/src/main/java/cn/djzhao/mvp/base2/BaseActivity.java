package cn.djzhao.mvp.base2;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<P extends BasePresenter, CONTRACT> extends AppCompatActivity implements View.OnClickListener {

    protected P mPresenter;

    public abstract CONTRACT getContract();

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
