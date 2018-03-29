package entity.model;

import lottery.IElementEntity;

public class ElementModel extends BaseModel implements IElementEntity {

    protected String element_name;

    protected String remark;

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public String getName() {
        return element_name;
    }


    public void setName(String element_name) {
        this.element_name = element_name;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ElementModel{" +
                "element_name='" + element_name + '\'' +
                ", remark='" + remark + '\'' +
                ", id=" + id +
                ", operatorId=" + operatorId +
                ", createTime=" + createTime +
                '}';
    }
}
