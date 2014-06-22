/**********************************
 * EventIDOnFileクラスのテスト
 **********************************/
import java.io.*;
import java.util.*;
import event.*;

public class TEventIDOnFile {
		
	public static void main (String[] args) {
		EventIDOnFile test	= new EventIDOnFile();
		
		//init(),show()のテスト
		if( test.init() <= 0 ) { 
		    System.out.println("init():アウト");
		} else {
		    System.out.println("init():取得値 "+test.show());
		}

		//get()のテスト
		int intgettest1 = test.show();
		int intgettest2 = intgettest1+1;
		
		if( test.get() != intgettest2 ) { 
		    System.out.println("get():アウト");
		} else {
		    System.out.println("get():取得値 "+test.show());
		}
		//record()のテスト
		if( test.record() != test.init() ){
		    System.out.println("record():アウト");
		} else {
			System.out.println("record():取得値 "+test.show());
		}
		
	}
	
}