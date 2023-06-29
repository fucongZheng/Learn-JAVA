package com.fucongzheng.specialfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        // 创建Properties对象
        Properties properties = new Properties();

        try {
            // 加载属性文件
            FileInputStream fileInputStream = new FileInputStream("D:\\狂神java\\git-learn-java\\Learn-JAVA\\Begin\\src\\com\\fucongzheng\\specialfile\\config.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // 获取属性值
        String dbHost = properties.getProperty("db.host");
        String dbPort = properties.getProperty("db.port");
        String dbUsername = properties.getProperty("db.username");
        String dbPassword = properties.getProperty("db.password");
        String appName = properties.getProperty("app.name");
        String appVersion = properties.getProperty("app.version");

        // 打印属性值
        System.out.println("Database Host: " + dbHost);
        System.out.println("Database Port: " + dbPort);
        System.out.println("Database Username: " + dbUsername);
        System.out.println("Database Password: " + dbPassword);
        System.out.println("Application Name: " + appName);
        System.out.println("Application Version: " + appVersion);
    }
}
