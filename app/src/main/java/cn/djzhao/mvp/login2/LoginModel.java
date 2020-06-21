package cn.djzhao.mvp.login2;

import cn.djzhao.mvp.base2.BaseModel;
import cn.djzhao.mvp.login2.ILogin;

class LoginModel extends BaseModel<LoginPresenter, ILogin.M>  {

    LoginModel(LoginPresenter mPresenter) {
        super(mPresenter);
    }

    @Override
    public ILogin.M getContract() {
        return new ILogin.M() {

            @Override
            public void requestLogin(String username, String password) throws Exception {
                if ("djzhao".equals(username) && "123456".equals(password)) {
                    mPresenter.getContract().loginResult(true, "YES!");
                } else {
                    mPresenter.getContract().loginResult(false, "OOOOOPS!");
                }
            }
        };
    }
}
