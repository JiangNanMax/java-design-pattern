package top.jiangnanmax.chapter04.v5;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.List;
import java.util.Vector;

/**
 * @author jiangnan
 * @description DbProc
 * @date 2020/2/12
 **/

// 封装一下数据库的操作类
public class DbProc {
    private String strDriver = "com.mysql.jdbc.Driver";
    private String strDb = "?";
    private String strUser = "root";
    private String strPwd = "?";
    private Connection conn;

    public boolean connect() throws Exception {
        Class.forName(strDriver);
        conn = DriverManager.getConnection(strDb, strUser, strPwd);
        return true;
    }

    public int executeUpdate(String strSQL) throws Exception {
        Statement stm = conn.createStatement();
        int n = stm.executeUpdate(strSQL);
        stm.close();
        return n;
    }

    public List executeQuery(String strSQL) throws Exception {
        List list = new Vector();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(strSQL);
        ResultSetMetaData metaData = rst.getMetaData();
        while (rst.next()) {
            Vector unit = new Vector();
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                unit.add(rst.getString(i));
            }
            list.add(unit);
        }
        return list;
    }

    public void close() throws Exception {
        conn.close();
    }
}
