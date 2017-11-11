package access;

import commander.Access;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

final class AccessImp implements Access {
    private DataSource dataSource;
    private QueryRunner queryRunner;

    public AccessImp(DataSource dataSource) {
        this.dataSource = dataSource;
        queryRunner = new QueryRunner(this.dataSource);
    }

    @Override
    public int insert(String sql, Object... objects) {
        MapHandler arrayHandler = new MapHandler();
        try {
            queryRunner.insert(sql, arrayHandler, objects);
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int update(String sql, Object... objects) {
        MapHandler arrayHandler = new MapHandler();
        try {
            queryRunner.update(sql, arrayHandler, objects);
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int delete(String sql, Object... objects) {
        MapHandler arrayHandler = new MapHandler();
        try {
            queryRunner.execute(sql, arrayHandler, objects);
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public <T> List<T> query(String sql, Class<T> tClass) {
        BeanListHandler<T> beanListHandler = new BeanListHandler<T>(tClass);
        try {
            return queryRunner.query(sql, beanListHandler);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

}
