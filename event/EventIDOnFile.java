package event;
import java.io.*;
import java.util.*;
/*
*******************************************
* クラス名 EventIDOnFile
* 説明 EventIDをファイル管理するメソッド
*******************************************
*/
public class EventIDOnFile extends  EventID {
//*** 定数 ***
	String	numberfile	= new String(".\\files\\event_id.dat");//入力ファイル名

//*** メソッド ***

	private int	currentEventID;

	public int init() {
		//現ナンバー保管ファイルから現ナンバーを読み取り、
		//変数currentEventIDに保管。
	   	try{
    		FileReader	fread	= new FileReader(numberfile);     //入力ファイルリーダー
    		BufferedReader bfread	= new BufferedReader(fread);
    		currentEventID = Integer.parseInt(bfread.readLine());
    		   		
			bfread.close();
			fread.close();

  		} catch (IOException e){
   			System.out.println("エラー\n");
		}
		return 	currentEventID;
	}
	public int show() {
		//戻り値は現在のイベントID
		return(this.currentEventID);
	}
	
	public int	get() {
		//最新の番号+1を取得して戻り値とする。
		return 	++currentEventID;
	}
	
	public int record() {
		//現在のイベントIDを現ナンバー保管ファイルに書き込む
		//戻り値は書き込んだイベントID
	   	try{
	   		File wf = new File(numberfile);
	   		wf.delete();
	   		wf.createNewFile();
    		FileWriter	fwrite	= new FileWriter(wf);
    		fwrite.write(Integer.toString(currentEventID));
    		   		
			fwrite.close();

  		} catch (IOException e){
   			System.out.println("エラー\n");
		}
		return 	currentEventID;
	}	
}