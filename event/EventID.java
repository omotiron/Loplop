package event;
import java.io.*;
import java.util.*;
/*
*******************************************
* �N���X�� EventID
* ���� EventID�֘A�̃N���X
*******************************************
*/
public class EventID  {
//*** �萔 ***

//*** ���\�b�h ***

	private int	currentEventID;

	int init() {
		//���i���o�[�ۊǃt�@�C�����猻�i���o�[��ǂݎ��A
		//�ϐ�currentEventID�ɕۊǁB
		return 	currentEventID;
	}
	int show() {
		//�߂�l�͌��݂̃C�x���gID
		return(this.currentEventID);
	}
	
	int	get() {
		//�C�x���gID�̍ŐV�ԍ����L�ڂ��ꂽ�t�@�C�����J��
		//�ŐV�̔ԍ�+1���擾���Ė߂�l�Ƃ���B
		return 	currentEventID;
	}
	
	int record() {
		//���݂̃C�x���gID�����i���o�[�ۊǃt�@�C���ɏ�������
		//�߂�l�͏������񂾃C�x���gID
		return 	currentEventID;
	}	
}