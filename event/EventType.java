package event;
import java.io.*;
import java.util.*;
import java.lang.*;
/*
*******************************************
* �N���X�� EventType
* ���� EventType�֘A�̃N���X
*******************************************
*/
public class EventType  {
//*** �萔 ***

//*** ���\�b�h ***

	public int	selectedEventTypeNum;
	public String 	selectedEventTypeStr = new String();

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