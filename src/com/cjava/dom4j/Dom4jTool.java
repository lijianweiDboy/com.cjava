package com.cjava.dom4j;

import java.util.List;

import org.dom4j.Element;
import org.dom4j.QName;

public class Dom4jTool {
	
      public static List<Element> ListElement(Element rootElement,String qurename) {
    	QName qname = new QName(qurename);
  		List<Element>   sampleInfos = rootElement.elements(qname);
  		return sampleInfos;
    	  
      }
}
