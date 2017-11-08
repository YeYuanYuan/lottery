package access;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import commander.ConnextSql;
import entity.bean.ConnectBean;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AccessEmployee implements ConnextSql {

    private Connection connection = null;
    private ConnectBean connectBean;
    private Statement[] statements = new Statement[10];

    public Connection execute(){
        return execute(null);
    }

    @Override
    public Connection execute(ConnectBean connectBean) {
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
        try {
            connection = ds.getConnection();
        } catch (SQLServerException e) {
            e.printStackTrace();
        }
        try {
            connection.setAutoCommit(connectBean.isAutoCommmit());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    @Override
    public boolean isVisible() {
        return false;
    }
}
