package event;
import java.io.*;
import java.util.*;
/*
*******************************************
* �N���X�� Event
* ���� ���������C�x���g�̃N���X
*******************************************
*/
public class Event {
//*** �萔 ***

	final int	SIZEOFCONTENTS = 2048; //���e�̍ő啶����

//*** �N���X�ϐ� ***
	int			 eventID;					  //�C�x���gID
	short		 type;						  //�C�x���g�^�C�v
	Date		 d_create = new Date();		  //�C�x���g��������
	StringBuffer contents = new StringBuffer(SIZEOFCONTENTS);//���e

//*** ���\�b�h ***
   /*----------------------------------------
    * �C���X�^���X�̕ϐ��Ɉ����̏����Z�b�g
    *----------------------------------------*/
	public void setValue (int aaa,short bbb,String ccc,long ddd) {
		Date current 	= new Date();
		eventID			= aaa;
		type			= bbb;
		contents.delete(0,SIZEOFCONTENTS-1);
		contents.append(ccc);
		/* ���ݓ������擾���ăN���X�ϐ��ɃZ�b�g���� */
		d_create.setTime(ddd);

		/* �o�^�����o�� */
		this.displayValue();
	}

   /*----------------------------------------
    * Event�N���X�̃C���X�^���X�̓��e�\��
    *----------------------------------------*/
	public void displayValue(){
		System.out.println("\t�C�x���gID     : "+eventID);
		System.out.println("\t���������@     : "+d_create);
		System.out.println("\t�C�x���g�^�C�v : "+type);
		System.out.println("\t�C�x���g       : "+contents);
		
	}
		
}
