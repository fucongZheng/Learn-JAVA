package com.fucongzheng.specialfile;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DOM4JExample {
    //读文件
    //写文件要用IO流
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read("Learn-JAVA/Begin/src/com/fucongzheng/specialfile/example.xml");

        Element rootElement = read.getRootElement();

        System.out.println(rootElement.getName());
    }
}
