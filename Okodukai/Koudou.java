import java.util.*;
public class Koudou {
    public void Koudou() {
        Me me = new Me();
        for (int i = 0; i == 0;) {
            System.out.println("�ǂ̑�������邩�I�����Ă��������B");
            System.out.println("Suica�̎c���ɂ��ā@���@A");
            System.out.println("��s�̎c���ɂ��ā@���@B");
            System.out.println("�����̎c���ɂ��ā@���@C");
            System.out.println("���݂̏�������\���@���@D");
            String strChar = new java.util.Scanner(System.in).nextLine();
            if (strChar.equals("A") || strChar.equals("a")) {
                me.setSuica();
            } else if (strChar.equals("B") || strChar.equals("b")) {
                me.setBank();
            } else if (strChar.equals("C") || strChar.equals("c")) {
                me.setCash();
            } else if (strChar.equals("D") || strChar.equals("d")) {
                me.Total();
            } else {
            System.out.println("���p��A�`D�œ��͂��Ă��������B");
                me.Total();
            }
            System.out.println("����𑱂��܂����H������ꍇ��enter�������Ă��������B");
            System.out.println("�I������ꍇ�́AY�L�[����͂��Ă��������B");
            String end = new java.util.Scanner(System.in).nextLine();
            if (end.equals("Y") || end.equals("y")) {
                break;
            } else {
                System.out.println("����𑱂��܂��B");
            }
        }
      }
}