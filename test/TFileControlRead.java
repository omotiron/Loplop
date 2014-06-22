/**********************************
 * FileControlReadクラスのテスト
 **********************************/
import java.io.*;
import java.util.*;
import lopio.*;

public class TFileControlRead {
		
	public static void main (String[] args) {
		FileControlRead test	= new FileControlRead();
		
		//open()のテスト
		if( test.open(args[0]) == false ) { 
		    System.out.println("open():アウト");
		} else {
		    System.out.println("open():ファイル名 "+args[0]);
		    System.out.println("       現在行     "+test.curline);
		}
		//readLine()のテスト
		int aaa;
		aaa = test.readLine();
		while(test.curLineStr.toString().compareTo("null")!=0){
			System.out.println("readLine():文字列 "+test.curLineStr);
			System.out.println("readLine():行数 "+test.curline+" 戻り値 "+aaa);
			aaa = test.readLine();
		}
	
		//close()のテスト
		if( test.close() == false ) { 
		    System.out.println("close():アウト");
		} else {
		    System.out.println("close():ファイル名 "+args[0]);
		}

	}
	
}
