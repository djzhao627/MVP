package cn.djzhao.mvp.base2;

public abstract class BaseModel <P extends BasePresenter, CONTRACT> extends SuperBase<CONTRACT> {

    protected P mPresenter;

    public BaseModel(P mPresenter) {
        this.mPresenter = mPresenter;
    }
}
