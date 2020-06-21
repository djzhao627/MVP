package cn.djzhao.mvp.login;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cn.djzhao.mvp.MainActivity;
import cn.djzhao.mvp.R;
import cn.djzhao.mvp.base.BaseActivity;

public class LoginActivity extends BaseActivity<LoginPresenter> implements ILogin.V{

    private EditText usernameET;
    private EditText passwordET;
    private Button loginBtn;

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
        mPresenter.requestLogin(username, password);
    }

    @Override
    public void loginResult(boolean ok, Object result) {
        if (ok) {
            Intent intent = new Intent();
            intent.setClass(this, MainActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "登录失败", Toast.LENGTH_SHORT).show();
        }
    }
}
