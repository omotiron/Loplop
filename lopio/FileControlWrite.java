package lopio;
import java.io.*;
import java.util.*;
/*
*******************************************
* �N���X�� FileControlWrite
* ���� �ǂݍ��݃t�@�C������֘A�̃N���X
*******************************************
*/
public class FileControlWrite extends FileControl  {
//*** �萔 ***

//*** �N���X�ϐ� 
	private FileWriter      curFileWriter;
	private BufferedWriter	curBufWriter;
	private char[] delimiter;

//*** ���\�b�h ***
	public boolean open(String openfilename) {
		//�ǂݍ��ݗp�̃t�@�C�����I�[�v������B
		this.init(openfilename);  
		try {
			curFileWriter = new FileWriter(curFile);
			curBufWriter  = new BufferedWriter(curFileWriter);
			stat = true;
		} catch(FileNotFoundException e) {
			System.out.println("�G���[\n");
			stat = false;

		} catch(IOException f){
			System.out.println("�G���[\n");
			stat = false;
	 	}
			return(stat);
	}
	
	public boolean	close() {
		//�ǂݍ��ݗp�̃t�@�C�����N���[�Y����B
		//�ŐV�̔ԍ�+1���擾���Ė߂�l�Ƃ���B
		try {
			curBufWriter.close();
			curFileWriter.close();
			stat = true;
		} catch(IOException e){
			System.out.println("�G���[\n");
			stat = false;
		}
		return(stat);
	}

	public boolean write(String str,int mode) {
		//�t�@�C���ɏ������݂���B
		//mode : =0�̎��A�t�@�C���V�K�쐬�{�����񏑂�����
		//     : >0�̎��A�����t�@�C����mode�s���ڂɕ�����}��
		//mode : <0�̎��A�����t�@�C���̍ŏI�s�ɒǋL
	//	try {
			if(mode == 0){
				this.close();
				curFile.initNew();
				

			else if(mode < 0) {

			else if(mode > 0) {
			}
//		} catch(IOException e){
			System.out.println("�G���[\n");
			stat = false;
//		}
		return(stat);
	}
	
}
