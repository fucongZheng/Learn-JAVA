package com.fucongzheng.specialfile;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
//当涉及到XML处理的示例代码，以下是一个简单的示例，展示了如何使用javax.xml包中的类和接口来解析XML文件并提取数据
public class XMLParserExample {
    public static void main(String[] args) {
        try {
            // 创建DocumentBuilderFactory和DocumentBuilder对象
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // 解析XML文件并获取Document对象
            Document document = builder.parse("example.xml");

            // 获取根元素
            Element root = document.getDocumentElement();

            // 获取所有student元素
            NodeList studentList = root.getElementsByTagName("student");

            // 遍历student元素并提取数据
            for (int i = 0; i < studentList.getLength(); i++) {
                Element student = (Element) studentList.item(i);

                // 提取姓名和年龄属性
                String name = student.getAttribute("name");
                int age = Integer.parseInt(student.getAttribute("age"));

                System.out.println("Name: " + name);
                System.out.println("Age: " + age);

                // 获取score子元素
                Element scoreElement = (Element) student.getElementsByTagName("score").item(0);

                // 提取分数值
                int score = Integer.parseInt(scoreElement.getTextContent());

                System.out.println("Score: " + score);

                System.out.println("--------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
