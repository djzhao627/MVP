package cn.djzhao.mvp.base;

public abstract class BasePresenter <V extends BaseActivity, M extends BaseModel> {
    protected V mView;
    protected M mModel;

    public BasePresenter() {
        this.mModel = getModelInstance();
    }

    void bindView(V view) {
        mView = view;
    }

    void unBindView() {
        mView = null;
    }

    protected abstract M getModelInstance();
}
