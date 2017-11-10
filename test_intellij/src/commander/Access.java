package commander;

public interface Access {


    int insert(String sql,Object... objects);
    int update(String sql,Object... objects);
    int delete(String sql,Object... objects);

}
