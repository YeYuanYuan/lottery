package access;

import commander.Access;
import java.util.List;

public class AccessWrap implements Access {

    protected static AccessWrap accessWrap;
    private Access accessImp;

    static {
        accessWrap = new AccessWrap(new AccessEmployee());
    }

    private AccessWrap(AccessEmployee employee){
        accessImp = new AccessImp(employee.execute());
    }

    @Override
    public int insert(String sql, Object... objects) {
        return accessImp.insert(sql,objects);
    }

    @Override
    public int update(String sql, Object... objects) {
        return accessImp.insert(sql,objects);
    }

    @Override
    public int delete(String sql, Object... objects) {
        return accessImp.insert(sql,objects);
    }

    @Override
    public <T> List<T> query(String sql, Class<T> tClass) {
        return accessImp.query(sql,tClass);
    }
}
