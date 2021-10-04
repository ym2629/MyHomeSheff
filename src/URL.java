import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class URL {
	
	String baseURL;
	URL(){
		this.baseURL = https://www.10000recipe.com/index.html;
	}
	URL(String url){
		this.baseURL = url;
	}
	
	Document connectURL(String url) { //connet url
		Document doc = null;   
		try {
			doc = Jsoup.connect(url).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}
	
	Elements getElement(Document doc, String selector) {
		return doc.select(selector);  
	}
	
	void elementPrintText(Elements element) {
		Iterator<Element> ie1 = element.iterator();
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
		}
	}
	
	void elementPrintAttr(Elements element, String attrName) {
		Iterator<Element> ie1 = element.iterator();
		while(ie1.hasNext()) {
			System.out.println(ie1.next().attr(attrName));
		}
	}
	
}
