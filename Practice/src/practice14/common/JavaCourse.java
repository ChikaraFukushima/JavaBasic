package practice14.common;

public class JavaCourse implements Course{

	public String getCourseName() {   //インターフェースを継承した先はメソッドにpublic をつける
		return "Eラーニング】Java";
	}
	
	public String[] getCourseUnit() {
		String[] a= {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
		return a;
	}
}

/*
 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】Java」
 * 単元
 * 		式と演算
 * 		制御構文
 * 		メソッド
 * 		配列
 * 		オブジェクト指向
 * 		継承
 * 		高度な継承
 */