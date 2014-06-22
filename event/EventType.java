package event;
import java.io.*;
import java.util.*;
import java.lang.*;
/*
*******************************************
* クラス名 EventType
* 説明 EventType関連のクラス
*******************************************
*/
public class EventType  {
//*** 定数 ***

//*** メソッド ***

	public int	selectedEventTypeNum;
	public String 	selectedEventTypeStr = new String();

	String showName(int typenum) {
		//戻り値は引数のイベントタイプ番号に対応する文字列
		
		return(selectedEventTypeStr);
	}

	int showID(String typestr) {
		//戻り値は引数の文字列に対応するイベントタイプ番号
		
		return(selectedEventTypeNum);
	}
	
	boolean	insert(int typenum, String typestr) {
		boolean ret = true;
		//イベントタイプ番号と、対応する文字列を登録する。
		return 	(ret);
	}

	boolean	delete(int typenum) {
		boolean ret = true;
		//イベントタイプ番号に対応する文字列を登録する。
		return 	(ret);
	}

	boolean	delete(String typestr) {
		boolean ret = true;
		//イベントタイプ文字列に対応する文字列を登録する。
		return 	(ret);
	}
	
}