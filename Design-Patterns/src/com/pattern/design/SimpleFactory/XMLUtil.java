package com.pattern.design.SimpleFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * <p>Title: XMLUtil</p>
 * <p>Description: </p>
 * @author peixuan.xie
 * @date 2017��5��25������10:27:03
 */
public class XMLUtil {
    public static String getChartType() {
        try {
            //�����ĵ�����  
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("config_SimpleFactory.xml"));

            //��ȡ����ͼ�����͵��ı��ڵ�  
            NodeList nl = doc.getElementsByTagName("chartType");
            Node classNode = nl.item(0).getFirstChild();
            String chartType = classNode.getNodeValue().trim();
            return chartType;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
