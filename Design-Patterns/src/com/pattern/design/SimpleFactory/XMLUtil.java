package com.pattern.design.SimpleFactory;

import javax.xml.parsers.*;  
import org.w3c.dom.*;  
import java.io.*;  

/**
* <p>Title: XMLUtil</p>
* <p>Description: </p> 
* @author peixuan.xie
* @date 2017年5月25日上午10:27:03
*/
public class XMLUtil {
	public static String getChartType() {  
        try {  
            //创建文档对象  
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder = dFactory.newDocumentBuilder();  
            Document doc;                             
            doc = builder.parse(new File("config_SimpleFactory.xml"));   

            //获取包含图表类型的文本节点  
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
