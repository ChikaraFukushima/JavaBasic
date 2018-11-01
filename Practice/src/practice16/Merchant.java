package practice16;

public class Merchant {
	//属性
	int price =100;
	int stock = 100;
	int money =0;
	
	
	
	//商品を売る
    void sellItem(int count) {
        this.stock -= count;
        this.money += this.PRICE * count;
    }
    // 売上を取得する
    String confirmMoney() {
        return "売上は" + this.money + "円です。";
	
	
	
}
}
