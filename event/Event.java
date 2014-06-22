package event;
import java.io.*;
import java.util.*;
/*
*******************************************
* クラス名 Event
* 説明 発生したイベントのクラス
*******************************************
*/
public class Event {
//*** 定数 ***

	final int	SIZEOFCONTENTS = 2048; //内容の最大文字数

//*** クラス変数 ***
	int			 eventID;					  //イベントID
	short		 type;						  //イベントタイプ
	Date		 d_create = new Date();		  //イベント生成日時
	StringBuffer contents = new StringBuffer(SIZEOFCONTENTS);//内容

//*** メソッド ***
   /*----------------------------------------
    * インスタンスの変数に引数の情報をセット
    *----------------------------------------*/
	public void setValue (int aaa,short bbb,String ccc,long ddd) {
		Date current 	= new Date();
		eventID			= aaa;
		type			= bbb;
		contents.delete(0,SIZEOFCONTENTS-1);
		contents.append(ccc);
		/* 現在日時を取得してクラス変数にセットする */
		d_create.setTime(ddd);

		/* 登録情報を出力 */
		this.displayValue();
	}

   /*----------------------------------------
    * Eventクラスのインスタンスの内容表示
    *----------------------------------------*/
	public void displayValue(){
		System.out.println("\tイベントID     : "+eventID);
		System.out.println("\t生成日時　     : "+d_create);
		System.out.println("\tイベントタイプ : "+type);
		System.out.println("\tイベント       : "+contents);
		
	}
		
}
