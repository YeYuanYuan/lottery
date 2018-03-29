package access;

import commander.Access;
import entity.model.ElementModel;
import entity.model.GroupModel;

import java.sql.Date;

public class AccessGroup {


    public static int insertSql(GroupModel groupModel) {
        return AccessWrap.accessWrap.insert("insert into tb_group values(?,?,?)"
                , groupModel.getName(), new Date(groupModel.getCreateTime()), groupModel);
    }


}
