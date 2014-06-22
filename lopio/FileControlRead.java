package lopio;
import java.io.*;
import java.util.*;
/*
*******************************************
* �N���X�� FileControlRead
* ���� �ǂݍ��݃t�@�C������֘A�̃N���X
*******************************************
*/
public class FileControlRead extends FileControl  {
//*** �萔 ***

//*** �N���X�ϐ� 
	private FileReader      curFileReader;
	private BufferedReader	curBufReader;
	private char[] delimiter;

//*** ���\�b�h ***
	public boolean open(String openfilename) {
		//�ǂݍ��ݗp�̃t�@�C�����I�[�v������B
		this.init(openfilename);  
		try {
			curFileReader = new FileReader(curFile);
			curBufReader  = new BufferedReader(curFileReader);
			stat = true;
		} catch(FileNotFoundException e) {
			System.out.println("�G���[\n");
			stat = false;
	 	}
			return(stat);
	}
	
	public boolean	close() {
		//�ǂݍ��ݗp�̃t�@�C�����N���[�Y����B
		//�ŐV�̔ԍ�+1���擾���Ė߂�l�Ƃ���B
		try {
			curBufReader.close();
			curFileReader.close();
			stat = true;
		} catch(IOException e){
			System.out.println("�G���[\n");
			stat = false;
		}
		return(stat);
	}
	
	public int readLine() {
		//��s�ǂݍ���
		//�߂�l�́A�ǂݍ��񂾍s�ԍ�
		//�ŏI�s���B�i���̂ق��ǂݍ��݂�null)�̏ꍇ�́A�o�b�t�@�ϐ���null���Z�b�g
		try {
			curLineStr.delete(0,curLineStr.length());
		 	curLineStr.insert(0,curBufReader.readLine());
			curline++;
		} catch (IOException e) {
			System.out.println("�G���[\n");
			stat = false;
		} catch (NullPointerException f) {
		 	curLineStr = null;
			curline++;
		}
		return(curline);
	}	
}
