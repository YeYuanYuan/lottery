package commander;

import entity.bean.ConnectBean;

import java.sql.Connection;

public interface ConnextSql {

    Connection execute(ConnectBean connectBean);

    boolean isVisible();

}
