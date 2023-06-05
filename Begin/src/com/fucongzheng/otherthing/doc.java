package com.fucongzheng.otherthing;

/**
 * @author Zhengfucong
 * @version v1.0.0
 * @since   java8
// * @param
// * @throws
 */
public class doc {
    /*
        java doc 是用来记录生成自己API 文档的
        参数信息
        官方文档链接：https://docs.oracle.com/javase/8/docs/api/
         */

    String name ;

    /**
     *
     * @param name;
     * @return String
     * @throws Exception;
     */
    public String test(String name) throws Exception{
        return name;
    }
    //使用Idea 生成Javadoc
    //命令行生成Javadoc  Javadoc -encoding utf-8 -charset utf-8 doc.java

}
