package practice10;

public class User {
	 
	int userId;
	String userNm;
	String mail;
	String password;
	
	//出力用
	void greeting() {
        System.out.println( this.userId +this.userNm+this.mail+this.password);
	}

}
