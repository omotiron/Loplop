package event;
import java.io.*;
import java.util.*;
/*
*******************************************
* �N���X�� EventTypeOnFile
* ���� EventType�֘A������t�@�C���ōs���N���X
*******************************************
*/
public class EventTypeOnFile extends EventType  {
//*** �萔 ***

//*** ���\�b�h ***

	String	eventfile	= new String(".\\files\\event_list");

	String showName(int typenum) {
		//�߂�l�͈����̃C�x���g�^�C�v�ԍ��ɑΉ����镶����
		
		return(selectedEventTypeStr);
	}

	int showID(String typestr) {
		//�߂�l�͈����̕�����ɑΉ�����C�x���g�^�C�v�ԍ�
		
		return(selectedEventTypeNum);
	}
	
	boolean	insert(int typenum, String typestr) {
		boolean ret = true;
		//�C�x���g�^�C�v�ԍ��ƁA�Ή����镶�����o�^����B
		return 	(ret);
	}

	boolean	delete(int typenum) {
		boolean ret = true;
		//�C�x���g�^�C�v�ԍ��ɑΉ����镶�����o�^����B
		return 	(ret);
	}

	boolean	delete(String typestr) {
		boolean ret = true;
		//�C�x���g�^�C�v������ɑΉ����镶�����o�^����B
		return 	(ret);
	}
	
}