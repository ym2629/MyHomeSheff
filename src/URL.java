import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class URL {
	
	String base_url;
	
	URL(String url){
		System.out.println("asdf");
		this.base_url = url;
	}
	
	void Connet_URL(String url) { //connet url
		Document doc = null;   
		try {
			doc = Jsoup.connect(url).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	Elements set_Element(Document doc, String cla) {
		return doc.select(cla);  
	}
	
	void Element_print_text(Elements element) {
		Iterator<Element> ie1 = element.iterator();
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text());
		}
	}
	
	void Element_print_attr(Elements element, String cla) {
		Iterator<Element> ie1 = element.iterator();
		while(ie1.hasNext()) {
			System.out.println(ie1.next().attr(cla));
		}
	}
	
}
