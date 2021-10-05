import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class URL {
	String baseURL;
	
	URL(){
		this.baseURL = "https://www.10000recipe.com/index.html";
	}
	URL(String url){
		this.baseURL = url;
	}
	Document connectURL(String url){ //connet url
		Document doc = null;   
		try {
			doc = Jsoup.connect(url).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}
	Elements getElement(Document doc, String selector) {
		Elements ele = null;
		try {
			return doc.select(selector); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ele;
	}
	void elementPrintText(Elements element, int number) throws Exception{
		Iterator<Element> ie1 = element.iterator();
		int i = 0;
		
		while(ie1.hasNext()) {
			if(i == number) {
				break;
			}
			System.out.println(ie1.next().text());
			i++;
		}
	}
	ArrayList elementsList(Elements element, int number) {
		ArrayList list = new ArrayList();
		Iterator<Element> ie1 = element.iterator();
		for(int i=0;i<number;i++) {
			list.add(ie1.next().text()); 
		}
		return list;	
	}
	void elementPrintAttr(Elements element, String attrName) throws Exception {
		Iterator<Element> ie1 = element.iterator();
		while(ie1.hasNext()) {
			System.out.println(ie1.next().attr(attrName));
		}
	}
	
}
