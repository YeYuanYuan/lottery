package access;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import commander.ConnextSql;
import entity.bean.ConnectBean;

import javax.sql.DataSource;
import java.sql.Statement;

class AccessEmployee implements ConnextSql {

    private ConnectBean connectBean;
    private Statement[] statements = new Statement[10];

    public DataSource execute(){
        return assembly(null);
    }

    public DataSource assembly(ConnectBean connectBean) {
        if(connectBean == null){
            connectBean = ConnectBean.createDefualtBean();
        }else {
            this.connectBean = connectBean;
        }
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName(connectBean.getLocal());
        ds.setUser(connectBean.getUser());
        ds.setPassword(connectBean.getPwd());
        ds.setDatabaseName(connectBean.getDbName());

        return ds;
    }

    @Override
    public boolean isVisible() {
        return false;
    }
}
