package entity.model;

import lottery.ICreateTime;
import lottery.Identity;

import java.sql.Date;

public class BaseModel implements Identity, ICreateTime {

    protected long id;
    protected long operator_id;
    protected Date create_time;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public long getOperator() {
        return operator_id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOperator(long operatorId) {
        this.operator_id = operatorId;
    }

    @Override
    public long getCreate_time() {
        return create_time.getTime();
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
