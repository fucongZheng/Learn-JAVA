package startjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo01 {
    public static void main(String[] args) throws Exception {
        //注册驱动
//        Class.forName("com.mysql.jdbc.Driver");

        //创建链接
        String url = "jdbc:mysql://127.0.0.1:3306/zhengfucong?useSSL=false";
        String username = "root";
        String password ="123456";
        Connection connection = DriverManager.getConnection(url, username, password);

        String sql = "update tb_zheng set age =20 where name= 'zola'";

        //创建sql执行对象
        Statement statement = connection.createStatement();

        int i = statement.executeUpdate(sql);
        System.out.println(i);
        //释放资源
        statement.close();
        connection.close();
    }
}
