/**********************************
 * FileControlRead�N���X�̃e�X�g
 **********************************/
import java.io.*;
import java.util.*;
import lopio.*;

public class TFileControlRead {
		
	public static void main (String[] args) {
		FileControlRead test	= new FileControlRead();
		
		//open()�̃e�X�g
		if( test.open(args[0]) == false ) { 
		    System.out.println("open():�A�E�g");
		} else {
		    System.out.println("open():�t�@�C���� "+args[0]);
		    System.out.println("       ���ݍs     "+test.curline);
		}
		//readLine()�̃e�X�g
		int aaa;
		aaa = test.readLine();
		while(test.curLineStr.toString().compareTo("null")!=0){
			System.out.println("readLine():������ "+test.curLineStr);
			System.out.println("readLine():�s�� "+test.curline+" �߂�l "+aaa);
			aaa = test.readLine();
		}
	
		//close()�̃e�X�g
		if( test.close() == false ) { 
		    System.out.println("close():�A�E�g");
		} else {
		    System.out.println("close():�t�@�C���� "+args[0]);
		}

	}
	
}
