package lopio;
import java.io.*;
import java.util.*;
/*
*******************************************
* クラス名 FileControlWrite
* 説明 読み込みファイル操作関連のクラス
*******************************************
*/
public class FileControlWrite extends FileControl  {
//*** 定数 ***

//*** クラス変数 
	private FileWriter      curFileWriter;
	private BufferedWriter	curBufWriter;
	private char[] delimiter;

//*** メソッド ***
	public boolean open(String openfilename) {
		//読み込み用のファイルをオープンする。
		this.init(openfilename);  
		try {
			curFileWriter = new FileWriter(curFile);
			curBufWriter  = new BufferedWriter(curFileWriter);
			stat = true;
		} catch(FileNotFoundException e) {
			System.out.println("エラー\n");
			stat = false;

		} catch(IOException f){
			System.out.println("エラー\n");
			stat = false;
	 	}
			return(stat);
	}
	
	public boolean	close() {
		//読み込み用のファイルをクローズする。
		//最新の番号+1を取得して戻り値とする。
		try {
			curBufWriter.close();
			curFileWriter.close();
			stat = true;
		} catch(IOException e){
			System.out.println("エラー\n");
			stat = false;
		}
		return(stat);
	}

	public boolean write(String str,int mode) {
		//ファイルに書き込みする。
		//mode : =0の時、ファイル新規作成＋文字列書き込み
		//     : >0の時、既存ファイルのmode行数目に文字列挿入
		//mode : <0の時、既存ファイルの最終行に追記
	//	try {
			if(mode == 0){
				this.close();
				curFile.initNew();
				

			else if(mode < 0) {

			else if(mode > 0) {
			}
//		} catch(IOException e){
			System.out.println("エラー\n");
			stat = false;
//		}
		return(stat);
	}
	
}
