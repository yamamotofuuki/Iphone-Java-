package iphone;

public class SmartPhone extends Mp3player { //extends (継承する) 演習➁
	public void call() {
		System.out.println("電話");
	}
	public void mail() {
		System.out.println("メール");
	}
	
	public void photo() {
		System.out.println("写真");
	}	
	public void internet() {
		System.out.println("インターネット");
	}
	
	
	//演習④ オーバーライド (親クラスを上書き)
	public void play() {
		System.out.println("再生(ハイレゾ機能)");
	}
	public void stop() {
		System.out.println("停止(ハイレゾ機能)");
	}
	public void next() {
		System.out.println("次へ(ハイレゾ機能)");
	}
	public void back() {
		System.out.println("戻る(ハイレゾ機能)");
	}
	
	
	//演習⑤ (Android用)
	public void movie() {
		System.out.println("動画");
	}
}
