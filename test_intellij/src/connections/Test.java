package connections;

import access.AccessEmployee;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        QueryRunner queryRunner = new QueryRunner(new AccessEmployee().execute());

        try {

            MapHandler mapHandler = new MapHandler();

            Map o = queryRunner.insert("insert into " +
                    "tb_account(account,phone,create_time,account_name)" +
                    " values(?,?,?,?)",mapHandler,"linhui2"
            ,"13727710862",new Date(System.currentTimeMillis()),"林辉");
            System.out.print(o.toString());

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
