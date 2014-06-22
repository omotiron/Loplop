package event;
import java.io.*;
import java.util.*;
/*
*******************************************
* �N���X�� EventIDOnFile
* ���� EventID���t�@�C���Ǘ����郁�\�b�h
*******************************************
*/
public class EventIDOnFile extends  EventID {
//*** �萔 ***
	String	numberfile	= new String(".\\files\\event_id.dat");//���̓t�@�C����

//*** ���\�b�h ***

	private int	currentEventID;

	public int init() {
		//���i���o�[�ۊǃt�@�C�����猻�i���o�[��ǂݎ��A
		//�ϐ�currentEventID�ɕۊǁB
	   	try{
    		FileReader	fread	= new FileReader(numberfile);     //���̓t�@�C�����[�_�[
    		BufferedReader bfread	= new BufferedReader(fread);
    		currentEventID = Integer.parseInt(bfread.readLine());
    		   		
			bfread.close();
			fread.close();

  		} catch (IOException e){
   			System.out.println("�G���[\n");
		}
		return 	currentEventID;
	}
	public int show() {
		//�߂�l�͌��݂̃C�x���gID
		return(this.currentEventID);
	}
	
	public int	get() {
		//�ŐV�̔ԍ�+1���擾���Ė߂�l�Ƃ���B
		return 	++currentEventID;
	}
	
	public int record() {
		//���݂̃C�x���gID�����i���o�[�ۊǃt�@�C���ɏ�������
		//�߂�l�͏������񂾃C�x���gID
	   	try{
	   		File wf = new File(numberfile);
	   		wf.delete();
	   		wf.createNewFile();
    		FileWriter	fwrite	= new FileWriter(wf);
    		fwrite.write(Integer.toString(currentEventID));
    		   		
			fwrite.close();

  		} catch (IOException e){
   			System.out.println("�G���[\n");
		}
		return 	currentEventID;
	}	
}