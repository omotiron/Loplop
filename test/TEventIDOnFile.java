/**********************************
 * EventIDOnFile�N���X�̃e�X�g
 **********************************/
import java.io.*;
import java.util.*;
import event.*;

public class TEventIDOnFile {
		
	public static void main (String[] args) {
		EventIDOnFile test	= new EventIDOnFile();
		
		//init(),show()�̃e�X�g
		if( test.init() <= 0 ) { 
		    System.out.println("init():�A�E�g");
		} else {
		    System.out.println("init():�擾�l "+test.show());
		}

		//get()�̃e�X�g
		int intgettest1 = test.show();
		int intgettest2 = intgettest1+1;
		
		if( test.get() != intgettest2 ) { 
		    System.out.println("get():�A�E�g");
		} else {
		    System.out.println("get():�擾�l "+test.show());
		}
		//record()�̃e�X�g
		if( test.record() != test.init() ){
		    System.out.println("record():�A�E�g");
		} else {
			System.out.println("record():�擾�l "+test.show());
		}
		
	}
	
}