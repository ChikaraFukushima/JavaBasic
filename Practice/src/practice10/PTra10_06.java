package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		
		Car[]car=new Car[3];
		for (int i = 0; i < car.length; i++) {
			car[i] = new Car();
		     car[i].color = "red";
			 car[i].gasoline	 =50;
            
             
         int a = 0;
    		 int n = 0;//runメソッドを実行した回数。
    		 final int distance = 300;
    		  while(distance>a) {
    		  int b = car[i].run();
    		  if(i>0) {
    			 a = a+b;
    			 n++;
    		  }else if(b==-1){
    			  System.out.println("目的地に到達できませんでした");
    			  break;
    		  }else if(a<distance) {
    			  int x = car[i].gasoline;	//xは残りのガソリンの数です。	 
    			  System.out.println("目的地にまで"+n+"時間かかりました。残りのガソリンは、"+x+"リットルです");
    			  break;
    		  }else {
    			  break; 
    		  }
	     
		}
	}
	}	
}
	
