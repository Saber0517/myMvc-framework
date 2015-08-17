package cn.johnyu.mymvc.framework.util;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by ZHANGJA4 on 7/29/2015.
 */
public class ParseXMLDemo {

    public static void main(String[] args) throws IOException, JDOMException {
        InputStream in = new FileInputStream("d:/cusomers.xml");
        SAXBuilder saxBuilder = new SAXBuilder();
        Document  doc = saxBuilder.build(in);
        Element root = doc.getRootElement();
        System.out.println(root.getName());

        List<Element> customizers = root.getChildren();
        for(Element cust:customizers){
            for (Element e:cust.getChildren()){
                System.out.println(e.getName()+"\t"+e.getText());
            }
            System.out.println("===================");
        }
    }
}
