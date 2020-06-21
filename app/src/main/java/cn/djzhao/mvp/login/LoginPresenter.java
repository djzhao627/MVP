package cn.djzhao.mvp.login;

import cn.djzhao.mvp.base.BasePresenter;

class LoginPresenter extends BasePresenter<LoginActivity, LoginModel> implements ILogin.P {
    @Override
    protected LoginModel getModelInstance() {
        return new LoginModel(this);
    }

    @Override
    public void requestLogin(String username, String password) {
        try {
            mModel.requestLogin(username, password);
        } catch (Exception e) {
            e.printStackTrace();
            mView.loginResult(false, null);
        }
    }

    @Override
    public void loginResult(boolean ok, Object result) {
        mView.loginResult(ok, result);
    }
}
