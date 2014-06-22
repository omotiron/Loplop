package event;
import java.io.*;
import java.util.*;
/*
*******************************************
* クラス名 EventID
* 説明 EventID関連のクラス
*******************************************
*/
public class EventID  {
//*** 定数 ***

//*** メソッド ***

	private int	currentEventID;

	int init() {
		//現ナンバー保管ファイルから現ナンバーを読み取り、
		//変数currentEventIDに保管。
		return 	currentEventID;
	}
	int show() {
		//戻り値は現在のイベントID
		return(this.currentEventID);
	}
	
	int	get() {
		//イベントIDの最新番号が記載されたファイルを開き
		//最新の番号+1を取得して戻り値とする。
		return 	currentEventID;
	}
	
	int record() {
		//現在のイベントIDを現ナンバー保管ファイルに書き込む
		//戻り値は書き込んだイベントID
		return 	currentEventID;
	}	
}