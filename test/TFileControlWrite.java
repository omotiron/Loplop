/**********************************
 * FileControlWriteクラスのテスト
 **********************************/
import java.io.*;
import java.util.*;
import lopio.*;

public class TFileControlWrite {
		
	public static void main (String[] args) {
		FileControlWrite test	= new FileControlWrite();
		
		//open()のテスト
		if( test.open(args[0]) == false ) { 
		    System.out.println("open():アウト");
		} else {
		    System.out.println("open():ファイル名 "+args[0]);
		}
	
		//write()のテスト①新規書き込み
		String aaa = new String("this is test strings");
		if( test.write(aaa,0) == false ){
		    System.out.println("write()①:アウト");
		} else {
		    System.out.println("write()①:出力OK ");
		}
		//close()のテスト
		if( test.close() == false ) { 
		    System.out.println("close():アウト");
		} else {
		    System.out.println("close():ファイル名 "+args[0]);
		}
	}
}
