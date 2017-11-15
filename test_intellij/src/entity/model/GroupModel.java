package entity.model;

import lottery.IGroupEntity;

public class GroupModel extends BaseModel implements IGroupEntity{

    private String group_name;
    protected String remark;
    @Override
    public String getName() {
        return group_name;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setName(String group_name) {
        this.group_name = group_name;
    }
}
