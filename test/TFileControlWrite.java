/**********************************
 * FileControlWrite�N���X�̃e�X�g
 **********************************/
import java.io.*;
import java.util.*;
import lopio.*;

public class TFileControlWrite {
		
	public static void main (String[] args) {
		FileControlWrite test	= new FileControlWrite();
		
		//open()�̃e�X�g
		if( test.open(args[0]) == false ) { 
		    System.out.println("open():�A�E�g");
		} else {
		    System.out.println("open():�t�@�C���� "+args[0]);
		}
	
		//write()�̃e�X�g�@�V�K��������
		String aaa = new String("this is test strings");
		if( test.write(aaa,0) == false ){
		    System.out.println("write()�@:�A�E�g");
		} else {
		    System.out.println("write()�@:�o��OK ");
		}
		//close()�̃e�X�g
		if( test.close() == false ) { 
		    System.out.println("close():�A�E�g");
		} else {
		    System.out.println("close():�t�@�C���� "+args[0]);
		}
	}
}
