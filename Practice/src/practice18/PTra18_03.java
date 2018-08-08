/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		 ArrayList<Player> array = new ArrayList<>();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) { //次の行があるかぎり繰り返す
	                String line = scanner.nextLine();
	                // ★ 1行ごとにArrayListに格納してください
	                String[] a = line.split(",");
	               Player p1 = new Player();

	               p1.setPosition(a[0]);
	               p1.setName(a[1]);
	               p1.setCountry(a[2]);
	               p1.setTeam(a[3]);

	               array.add(p1);

	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
	        List<Player> set = new ArrayList<>();
	        set.add(array.indexOf(new String[] {"レアル・マドリード","バルセロナ"}), null);
			
	        
	        
	        array.removeAll(set);
	        

		// ★ 削除後のArrayListの中身を全件出力してください
	        for(Player a:array) {
        		System.out.println(a.toString());
        }
        }

	}

