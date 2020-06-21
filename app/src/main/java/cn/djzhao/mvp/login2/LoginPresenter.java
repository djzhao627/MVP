package cn.djzhao.mvp.login2;

import cn.djzhao.mvp.base2.BasePresenter;

class LoginPresenter extends BasePresenter<LoginActivity2, LoginModel, ILogin.P> {
    @Override
    protected LoginModel getModelInstance() {
        return new LoginModel(this);
    }

    @Override
    public ILogin.P getContract() {
        return new ILogin.P() {

            @Override
            public void requestLogin(String username, String password) {
                try {
                    mModel.getContract().requestLogin(username, password);
                } catch (Exception e) {
                    e.printStackTrace();
                    mView.getContract().loginResult(false, null);
                }
            }

            @Override
            public void loginResult(boolean ok, Object result) {
                mView.getContract().loginResult(ok, result);
            }
        };
    }
}
