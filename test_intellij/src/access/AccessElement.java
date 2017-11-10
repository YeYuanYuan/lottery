package access;

import entity.model.ElementModel;
import lottery.IElementEntity;

import java.sql.Date;

class AccessElement {
    Object[] insertSql(ElementModel iElementEntity) {
        return new Object[]{"insert into tb_element(element_name,create_time,remark," +
                "operator_id) values(?,?,?,?)",
                iElementEntity.getName(), new Date(iElementEntity.getCreateTime()),
                iElementEntity.getRemark(), iElementEntity.getOperator()};
    }

    Object[] upDateSql(ElementModel iElementEntity) {
        return new Object[]{"update tb_element set element_name = ?,create_time = ?" +
                ",remark = ?,operator_id = ? where = id = ?",
                iElementEntity.getName(), new Date(iElementEntity.getCreateTime()),
                iElementEntity.getRemark(), iElementEntity.getOperator(),iElementEntity.getId()};
    }

    Object[] deleteSql(long id) {
        return new Object[]{"delete from tb_element where id = ?", String.valueOf(id)};
    }
}
