package cn.djzhao.mvp.login2;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cn.djzhao.mvp.R;
import cn.djzhao.mvp.base2.BaseActivity;

public class LoginActivity2 extends BaseActivity<LoginPresenter, ILogin.V>{

    private EditText usernameET;
    private EditText passwordET;
    private Button loginBtn;

    @Override
    public ILogin.V getContract() {
        return new ILogin.V() {
            @Override
            public void loginResult(boolean ok, Object result) {

            }
        };
    }

    @Override
    protected void initView() {
        usernameET = findViewById(R.id.username);
        passwordET = findViewById(R.id.password);
        loginBtn = findViewById(R.id.login);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {
        loginBtn.setOnClickListener(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected LoginPresenter getPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected void destroy() {

    }

    @Override
    public void onClick(View v) {
        String username = usernameET.getText().toString();
        String password = passwordET.getText().toString();
        mPresenter.getContract().requestLogin(username, password);
    }
}
