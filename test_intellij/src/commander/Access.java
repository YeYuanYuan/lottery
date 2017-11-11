package commander;

import java.util.List;

public interface Access {


    int insert(String sql,Object... objects);
    int update(String sql,Object... objects);
    int delete(String sql,Object... objects);
    <T> List<T> query(String sql, Class<T> tClass);

}
