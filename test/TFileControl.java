/**********************************
 * FileControl�N���X�̃e�X�g
 **********************************/
import java.io.*;
import java.util.*;
import lopio.*;

public class TFileControl {
		
	public static void main (String[] args) {
		FileControl test	= new FileControl();
		
		//init()�̃e�X�g
		if( test.init(args[0]) == false ) { 
		    System.out.println("init():�A�E�g");
		} else {
		    System.out.println("init():�t�@�C���� "+args[0]);
		    System.out.println("       ���ݍs     "+test.curline);
		}
	}
	
}
