package lopio;
import java.io.*;
import java.util.*;
/*
*******************************************
* クラス名 FileControlRead
* 説明 読み込みファイル操作関連のクラス
*******************************************
*/
public class FileControlRead extends FileControl  {
//*** 定数 ***

//*** クラス変数 
	private FileReader      curFileReader;
	private BufferedReader	curBufReader;
	private char[] delimiter;

//*** メソッド ***
	public boolean open(String openfilename) {
		//読み込み用のファイルをオープンする。
		this.init(openfilename);  
		try {
			curFileReader = new FileReader(curFile);
			curBufReader  = new BufferedReader(curFileReader);
			stat = true;
		} catch(FileNotFoundException e) {
			System.out.println("エラー\n");
			stat = false;
	 	}
			return(stat);
	}
	
	public boolean	close() {
		//読み込み用のファイルをクローズする。
		//最新の番号+1を取得して戻り値とする。
		try {
			curBufReader.close();
			curFileReader.close();
			stat = true;
		} catch(IOException e){
			System.out.println("エラー\n");
			stat = false;
		}
		return(stat);
	}
	
	public int readLine() {
		//一行読み込む
		//戻り値は、読み込んだ行番号
		//最終行到達（そのほか読み込みでnull)の場合は、バッファ変数にnullをセット
		try {
			curLineStr.delete(0,curLineStr.length());
		 	curLineStr.insert(0,curBufReader.readLine());
			curline++;
		} catch (IOException e) {
			System.out.println("エラー\n");
			stat = false;
		} catch (NullPointerException f) {
		 	curLineStr = null;
			curline++;
		}
		return(curline);
	}	
}
