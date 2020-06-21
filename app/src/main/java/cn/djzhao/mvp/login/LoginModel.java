package cn.djzhao.mvp.login;

import cn.djzhao.mvp.base.BaseModel;

class LoginModel extends BaseModel<LoginPresenter> implements ILogin.M {

    LoginModel(LoginPresenter mPresenter) {
        super(mPresenter);
    }

    @Override
    public void requestLogin(String username, String password) throws Exception {
        if ("djzhao".equals(username) && "123456".equals(password)) {
            mPresenter.loginResult(true, "YES!");
        } else {
            mPresenter.loginResult(false, "OOOOOPS!");
        }
    }
}
