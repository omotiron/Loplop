/**********************************
 * FileControlクラスのテスト
 **********************************/
import java.io.*;
import java.util.*;
import lopio.*;

public class TFileControl {
		
	public static void main (String[] args) {
		FileControl test	= new FileControl();
		
		//init()のテスト
		if( test.init(args[0]) == false ) { 
		    System.out.println("init():アウト");
		} else {
		    System.out.println("init():ファイル名 "+args[0]);
		    System.out.println("       現在行     "+test.curline);
		}
	}
	
}
