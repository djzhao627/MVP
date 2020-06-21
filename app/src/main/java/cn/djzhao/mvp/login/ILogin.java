package cn.djzhao.mvp.login;

public interface ILogin {

    public interface M {
        void requestLogin(String username, String password) throws Exception;
    }

    public interface V {
        void loginResult(boolean ok, Object result);
    }

    public interface P {
        void requestLogin(String username, String password);
        void loginResult(boolean ok, Object result);
    }
}
