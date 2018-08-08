/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		Hero hero2 = new Hero();
		Slime slime2 = new Slime();
		hero2.setName("勇者");
		slime2.setName("スライム");	
		
		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		while(true) {
			 System.out.println( "ヒーローは、スライムを攻撃した！");
			 boolean slimeDead = slime2.damage(hero2.attack());
		if(slimeDead) {
			System.out.println(hero2.getName()+"は"+slime2.getName()+"との戦闘に勝利した");
			break;
		}
		System.out.println( "スライムはヒーローを攻撃した");
		   boolean hero1Dead = hero2.damage(slime2.attack());
		 if(hero1Dead) {
			 System.out.println(slime2.getName()+"は"+hero2.getName()+"との戦闘に勝利した");
			 break;
		 }

		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
}
