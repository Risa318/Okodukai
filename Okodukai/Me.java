import java.util.*;
public class Me {
    Kouza bank = new Kouza();
    Kouza suica = new Kouza();
    Kouza cash = new Kouza();
  public void setBank() {
    System.out.println("��������ꂽ�Ȃ�Y�A�����o�����̂Ȃ�N�A�f�r�b�g�J�[�h���g�����ꍇ��D�A�������U�荞�܂ꂽ�ꍇ��R�A������U�荞�񂾏ꍇ��S");
    System.out.println("����͂��Ă��������B");
    String strChar = new Scanner(System.in).nextLine();
    if (strChar.equals("Y") || strChar.equals("y")) {
    System.out.println("��������������̂����͂��Ă��������B");
    int set = new Scanner(System.in).nextInt();
    bank.setBalance(bank.getBalance() + set);
    System.out.println("�����̌�������������܂������H���������Ȃ�Y����͂��Ă��������B");
    String que = new Scanner(System.in).nextLine();
    if (que.equals("Y") || que.equals("y")) {
      cash.setBalance(cash.getBalance() - set);
    }
    System.out.println(set + "�~���������̂ŁA���݋�s�̎c����"
                        + bank.getBalance() + "�~�A�����̎c����" + cash.getBalance() + "�~�ł��B");
    } else if (strChar.equals("N") || strChar.equals("n")) {
      System.out.println("����������o�����̂����͂��Ă��������B");
      int set = new Scanner(System.in).nextInt();
      bank.setBalance(bank.getBalance() - set);
      cash.setBalance(cash.getBalance() + set);
      System.out.println(set + "�~�����o�����̂ŁA���݂̋�s�̎c����" + bank.getBalance() +
                        "�~�A�����̎c����" + cash.getBalance() +"�~�ł��B");
    } else if (strChar.equals("D") || strChar.equals("d")) {
      System.out.println("������g�����̂����͂��Ă��������B");
      int set = new Scanner(System.in).nextInt();
      bank.setBalance(bank.getBalance() - set);
      System.out.println(set + "�~�g�����̂ŁA���݂̋�s�̎c����" + bank.getBalance()  + "�~�ł��B");
    } else if (strChar.equals("R") || strChar.equals("r")) {
      System.out.println("������U�荞�܂ꂽ�̂����͂��Ă��������B");
      int set = new java.util.Scanner(System.in).nextInt();
      bank.setBalance(bank.getBalance() + set);
      System.out.println(set + "�~�U�荞�܂ꂽ�̂ŁA���݂̋�s�̎c����" + bank.getBalance()  + "�~�ł��B");
    } else if (strChar.equals("S") || strChar.equals("s")) {
      System.out.println("������U�荞�񂾂̂����͂��Ă��������B");
      int set = new Scanner(System.in).nextInt();
      bank.setBalance(bank.getBalance() - set);
      System.out.println(set + "�~�g�����̂ŁA���݂̋�s�̎c����" + bank.getBalance()  + "�~�ł��B");
    }
    else {
      System.out.println("Y��N��D����͂��Ă��������B�������͔��p�œ��͂��Ă��������B");
      System.out.println("���݂̋�s�̎c����" + bank.getBalance() + "�~�ł��B");
    }
  }
  public void setSuica() {
    System.out.println("�`���[�W�����Ȃ�Y�A�g�����̂Ȃ�N����͂��Ă��������B");
    String strChar = new Scanner(System.in).nextLine();
    if (strChar.equals("Y") || strChar.equals("y")) {
    System.out.println("������`���[�W�����̂����͂��Ă��������B");
    int set = new Scanner(System.in).nextInt();
    suica.setBalance(suica.getBalance() + set);
    cash.setBalance(cash.getBalance() - set);
    System.out.println(set + "�~���������̂ŁA����Suica�̎c����"
                          + suica.getBalance() + "�~�A�����̎c����" + cash.getBalance() +  "�~�ł��B");
    } else if (strChar.equals("N") || strChar.equals("n")) {
      System.out.println("������g�����̂����͂��Ă��������B");
      int set = new Scanner(System.in).nextInt();
      suica.setBalance(suica.getBalance() - set);
      System.out.println(set + "�~�g�����̂ŁA����Suica�̎c����"
                                                + suica.getBalance() + "�~�ł��B");
    } else {
      System.out.println("Y��N����͂��Ă��������B�������͔��p�œ��͂��Ă��������B");
      System.out.println("���݂�Suica�̎c����" + suica.getBalance() + "�~�ł��B");
    }
  }
    public void setCash() {
      System.out.println("�����Ƃ��Ă�������������̂Ȃ�Y�A�������g�����̂Ȃ�N����͂��Ă��������B");
      String strChar = new Scanner(System.in).nextLine();
      if (strChar.equals("Y") || strChar.equals("y")) {
        System.out.println("�������������̂����͂��Ă��������B");
        int set = new Scanner(System.in).nextInt();
        cash.setBalance(cash.getBalance() + set);
        System.out.println(set + "�~��������̂ŁA���݂̌����̎c����" + cash.getBalance()
              + "�~�ł��B");
      } else if (strChar.equals("N") || strChar.equals("n")) {
        System.out.println("������g�����̂����͂��Ă��������B");
        int set = new Scanner(System.in).nextInt();
        cash.setBalance(cash.getBalance() - set);
        System.out.println(set + "�~�g�����̂ŁA���݂̌����̎c����" + cash.getBalance()
              + "�~�ł��B");
      } else {
        System.out.println("Y��N����͂��Ă��������B�������͔��p�œ��͂��Ă��������B");
        System.out.println("���݂̌����̎c����" + cash.getBalance() + "�~�ł��B");
      }
  }
  public void Total() {
    int total = suica.getBalance() + bank.getBalance() + cash.getBalance();
    System.out.println("���݂̏��������v��" + total + "�~�ł��B");
  }
}
