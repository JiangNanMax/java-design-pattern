package top.jiangnanmax.chapter03.supplement;

/**
 * @author jiangnan
 * @description AbstractFactoryTest
 * @date 2020/2/11
 **/

/*
    应用实例：
        java.sql.Connection
        java.sql.Driver
 */

// 举个例子，基于数据库开发一个组件
/*
    变化的部分：mysql、oracle ...
    共性：     connection, command ...
 */

public class AbstractFactoryTest {

    public static void main(String[] args) {
        /*
        IDatabaseUtils iDatabaseUtils = new MysqlDatabaseUtils();
        IConnection iConnection = iDatabaseUtils.getConnection();
        iConnection.connect();
        ICommand iCommand = iDatabaseUtils.getCommand();
        iCommand.command();
         */
        IDatabaseUtils iDatabaseUtils = new OracleDatabaseUtils();
        IConnection iConnection = iDatabaseUtils.getConnection();
        iConnection.connect();
        ICommand iCommand = iDatabaseUtils.getCommand();
        iCommand.command();
    }



}

interface IConnection {
    void connect();
}

interface ICommand {
    void command();
}

interface IDatabaseUtils {
    IConnection getConnection();
    ICommand getCommand();
}

// 提供对mysql的支持
class MysqlConnection implements IConnection {
    public void connect() {
        System.out.println("mysql connection");
    }
}

class MysqlCommand implements ICommand {
    public void command() {
        System.out.println("mysql command");
    }
}

class MysqlDatabaseUtils implements IDatabaseUtils {
    public IConnection getConnection() {
        return new MysqlConnection();
    }

    public ICommand getCommand() {
        return new MysqlCommand();
    }
}

// 提供对Oracle的支持
class OracleConnection implements IConnection {
    public void connect() {
        System.out.println("oracle connection");
    }
}

class OracleCommand implements ICommand {
    public void command() {
        System.out.println("oracle command");
    }
}

class OracleDatabaseUtils implements IDatabaseUtils {
    public IConnection getConnection() {
        return new OracleConnection();
    }

    public ICommand getCommand() {
        return new OracleCommand();
    }
}

