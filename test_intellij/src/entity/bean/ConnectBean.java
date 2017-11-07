package entity.bean;

import commander.IBean;

public class ConnectBean implements IBean{

    private String local;
    private String dbName;
    private String user;
    private String pwd;
    private boolean isAutoCommmit;



    public ConnectBean(String local, String dbName, String user, String pwd) {
        this.local = local;
        this.dbName = dbName;
        this.user = user;
        this.pwd = pwd;
    }

    public boolean isAutoCommmit() {
        return isAutoCommmit;
    }

    public void setAutoCommmit(boolean autoCommmit) {
        isAutoCommmit = autoCommmit;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
