package lopio;
import java.io.*;
import java.util.*;
/*
*******************************************
* �N���X�� FileControl
* ���� �t�@�C������֘A�̃N���X
*******************************************
*/
public class FileControl  {
//*** �萔 ***
//*** �N���X�ϐ� ***
	public File          curFile;
	public int           curline;
	public StringBuffer  curLineStr = new StringBuffer();
	boolean stat = true;

//*** ���\�b�h ***
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
