package connections;

import access.AccessEmployee;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {


        Connection connection = new AccessEmployee().execute();
        QueryRunner queryRunner = new QueryRunner();

//        queryRunner.insert(connection,)

    }

}
