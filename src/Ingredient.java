import java.util.ArrayList;

import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Ingredient {
	public static void main(String[] arsg) throws Exception{
		ArrayList[] ingrdient;
		URL url = new URL(); //나무위키
		String aurl = "https://www.10000recipe.com/recipe/list.html";
		Document doc = url.connectURL(aurl);
	
		Elements ele = doc.select(".rcp_cate.st3");
		ele = ele.select(".cate_list > a");
		url.elementPrintText(ele,18);
		System.out.println("===================");
		ArrayList<String> list = url.elementsList(ele,18);
		for(String str : list) {
			System.out.println(str);
		}

		
		System.out.println("=======================================================");
		
		String url_2 = aurl+"?q="+URLEncoder.encode("밑반찬","UTF-8");
		Document doc1 = Jsoup.connect(url_2).get();
		Elements ele1 = doc1.select(".tag_cont > li > a");
		url.elementPrintText(ele1,999);
	}
	
}
