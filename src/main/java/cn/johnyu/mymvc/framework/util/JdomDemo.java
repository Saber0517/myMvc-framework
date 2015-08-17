package cn.johnyu.mymvc.framework.util;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by ZHANGJA4 on 7/29/2015.
 */
public class JdomDemo {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("d:/cusomers.xml");
        Document doc = new Document();
        Element root = new Element("customers");
        doc.setRootElement(root);

        int i = 0;
        while (i++ < 10) {
            Element e = new Element("customer");
            e.setAttribute("cid",i+"");
            Element nameEle = new Element("cname");
            nameEle.addContent("jhon"+i);
            Element psdEle =new Element("psd");
            psdEle.addContent("123"+i);
            Element birthEle = new Element("birth");
            birthEle.addContent("1922-05-1"+i);
            e.addContent(nameEle);
            e.addContent(psdEle);
            e.addContent(birthEle);
            root.addContent(e);

        }
        XMLOutputter outputter = new XMLOutputter();
        outputter.setFormat(Format.getPrettyFormat());
        outputter.output(doc, out);
        out.close();
    }
}

