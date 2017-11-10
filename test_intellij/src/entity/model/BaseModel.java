package entity.model;

import lottery.ICreateTime;
import lottery.Identity;

import java.sql.Date;

public class BaseModel implements Identity, ICreateTime {

    protected long id;
    protected long operatorId;
    protected Date createTime;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public long getOperator() {
        return operatorId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOperator(long operatorId) {
        this.operatorId = operatorId;
    }

    @Override
    public long getCreateTime() {
        return createTime.getTime();
    }
}
