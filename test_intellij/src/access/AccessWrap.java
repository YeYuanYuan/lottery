package access;

import commander.Access;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.MapHandler;

import javax.sql.DataSource;
import java.sql.SQLException;

public final class AccessWrap {

    static AccessWrap access;
    static {
        access = new AccessWrap(new AccessEmployee());
    }

    private AccessImp accessImp;

    private AccessWrap(AccessEmployee employee){
        accessImp = new AccessImp(employee.execute());
    }

    public static Access  getInstance(){
        return access.accessImp;
    }

    private static final class AccessImp implements Access{

        private DataSource dataSource;
        private QueryRunner queryRunner;

        public AccessImp(DataSource dataSource) {
            this.dataSource = dataSource;
            queryRunner = new QueryRunner(dataSource);
        }

        @Override
        public int insert(String sql, Object... objects) {
            MapHandler arrayHandler = new MapHandler();
            try {
                queryRunner.insert(sql, arrayHandler,objects);
                return 1;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return -1;
        }

        @Override
        public int update(String sql, Object... objects) {
            return -1;
        }

        @Override
        public int delete(String sql, Object... objects) {
            return -1;
        }
    }

}
