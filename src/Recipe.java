import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class Recipe {
	HashMap recipe;
	
	void saveRecipe(String recipe) { //레시피 저장 or 파일 불러오기
		int data = 0;
		String fileName = "../MyHomeSheff/recipe.csv";
		File file = new File(fileName);
		
		if(file.exists()) { //파일 불러오기
			try {//출력 스트림 생성
				BufferedReader br = new BufferedReader(new FileReader(fileName));
				String line = null;
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
				br.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		else{ //파일 생성 후 내용(레시피 크롤링 후) 집어 넣기
			try {
				//입력 스트림 생성
				BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	            bw.write("하하");//입력
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
	
}

