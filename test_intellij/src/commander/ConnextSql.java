package commander;

import entity.bean.ConnectBean;

import javax.sql.DataSource;
import java.sql.Connection;

public interface ConnextSql {

    DataSource assembly(ConnectBean connectBean);

    boolean isVisible();

}
