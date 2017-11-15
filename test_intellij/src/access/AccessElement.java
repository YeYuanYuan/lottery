package access;

import com.microsoft.sqlserver.jdbc.StringUtils;
import entity.model.ElementModel;

import java.sql.Date;
import java.util.List;

public final class AccessElement {

    private AccessElement() {
    }

    public static int insertSql(ElementModel iElementEntity) {
        return AccessWrap.accessWrap.insert("insert into tb_element(element_name,create_time,remark," +
                        "operator_id) values(?,?,?,?)", iElementEntity.getName(), new Date(iElementEntity.getCreate_time()),
                iElementEntity.getRemark(), iElementEntity.getOperator()
        );
    }

    public static int upDateSql(ElementModel iElementEntity) {
        return AccessWrap.accessWrap.update("update tb_element set element_name = ?" +
                        ",remark = ?,operator_id = ? where id = ?",
                iElementEntity.getName(), iElementEntity.getRemark(),
                iElementEntity.getOperator(), iElementEntity.getId());
    }

    public static int deleteSql(long id) {
        return AccessWrap.accessWrap.delete("delete from tb_element where id = ?", String.valueOf(id));
    }


    public static List<ElementModel> query(String[] where, String[] whereValues, boolean order, String oderColumn, int limitCount) {
        String sql = "select * from tb_element ";

        if (where != null && whereValues != null && where.length == whereValues.length) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < where.length; i++) {
                stringBuilder.append(where[i] + " = " + whereValues[i]);
                if (i != where.length - 1) {
                    stringBuilder.append(", ");
                }
            }
            sql += sql + stringBuilder;
        }

        if (limitCount > 0) {
            sql += " limit " + limitCount;
        }

        if (!StringUtils.isEmpty(oderColumn)) {
            if (!order) {
                sql += " order by " + oderColumn + " DESC";
            }
        }

        System.out.println(sql);

        return AccessWrap.accessWrap.query(sql, ElementModel.class);

    }
}
