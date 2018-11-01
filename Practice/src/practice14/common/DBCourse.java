package practice14.common;

public class DBCourse implements Course{
	
	public String getCourseName() {   //インターフェースを継承した先はメソッドにpublic をつける
		return "【Eラーニング】DB基礎";
	}
	
	public String[] getCourseUnit() {
		String[] b= {"DB基礎","SQL基礎","正規化","SQL応用"};
		return b;
	}

}
/*
 * ★ common.Courseを実装した、DBCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】DB基礎」
 * 単元
 * 		DB基礎
 * 		SQL基礎
 * 		正規化
 * 		SQL応用
 */
