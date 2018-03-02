package dialact;

import org.hibernate.dialect.MySQL5Dialect;


public class Mysql extends MySQL5Dialect {
    public String getTableTypeString() {
        return " ENGINE=MyISAM";
    }
    public boolean dropConstraints() {
        return false;
    }
}