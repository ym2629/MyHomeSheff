MyHomeSheff
=========


MyHomeSheff 클래스 - main 

# URL 클래스
`String baseURL`
- 인스턴스 변수

`URL(String url)`
- 생성자

`void connectURL(String url)`
- url(String)을 받고 해당 url의 파일을가져오는 함수

`Elements getElement(Document doc, String selector)`
- element(Elements) 값을 받고 이터레이터를 선언해서 태그(String)값을 받은 기준으로 이터레이터 반환

`void elementPrintText(Elements element)`
- 이터레이터의 내용물을 확인해서 text를 출력하는 함수

`void elementPrintAttr(Elements  element)`
- 이터레이터의 내용물을 확인하기위해 attr을 출력하는 함수   


# Ingredient 클래스
 > 레시피에 포함되는 재료와 어떤 음식에 포함되는지 인덱스(Recipe) 저장(중복 제거)
## 변수
`HashMap ingredient`
 - String key: 재료 이름
 - int[] value: 해당 재료를 사용하는 음식의(Recipe) index array

## 함수
`void addIngredient(String ingredientName, int recipeIndex)`
 - `ingredient`에 `(ingredientName, recipeIndex)` 추가
 - `ingredientName`이 이미 존재하면 value에 index 추가

`int[] getRecipeIndex(String ingredientName)`
 - `ingredientName`의 value를 반환

`void removeIngredient()`
 - ingredient배열에서 값 삭제

`void getData()`
 - 파일에서 불러오기
 - 파일이 없으면 URL클래스 이용해서 채우기 - >파일에 저장하기

## `@override` 함수

`String toString()`
 - String 값 반환


# Recipe 클래스
`HashMap recipe`
- 인스턴스 변수

`void printRecipe()`
- 출력 메서드

`void saveRecipe()`
- 파일이 없으면 URL클래스 이용해서 채우기 - > 파일에 저장하기

`void getFileRecipe()`
- 파일 불러오기

# Refrigerator클래스
## 변수
`ArrayList[]<String> refrigerator`
- 인스턴스 변수
  
## 함수
`String toString()`
- String 값 반환

`ArrayList<String> storeFood(String food)`
- refrigerator 저장 함수

`ArrayList<String> exhaustFood(String food)`
- refrigerator 삭제 함수