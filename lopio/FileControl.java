package lopio;
import java.io.*;
import java.util.*;
/*
*******************************************
* クラス名 FileControl
* 説明 ファイル操作関連のクラス
*******************************************
*/
public class FileControl  {
//*** 定数 ***
//*** クラス変数 ***
	public File          curFile;
	public int           curline;
	public StringBuffer  curLineStr = new StringBuffer();
	boolean stat = true;

//*** メソッド ***
	public boolean init(String openfilename) {
		curline = 0;		
        	curFile = new File(openfilename);
       		if(curFile.canRead()){
			stat = true;
		} else {
			stat = false;
		} 
		return(stat);
	}
	public boolean initNew(String openfilename) {
		curline = 0;		
        	curFile = new File(openfilename);
       		if(curFile.canRead()){
			curFile.delete();
			curFile.createNewFile();
			stat = true;
		} else {
			stat = false;
		} 
		return(stat);
	}
}
