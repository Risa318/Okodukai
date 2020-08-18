import java.util.*;
public class Koudou {
    public void Koudou() {
        Me me = new Me();
        for (int i = 0; i == 0;) {
            System.out.println("どの操作をするか選択してください。");
            System.out.println("Suicaの残高について　→　A");
            System.out.println("銀行の残高について　→　B");
            System.out.println("現金の残高について　→　C");
            System.out.println("現在の所持金を表示　→　D");
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
            System.out.println("半角のA～Dで入力してください。");
                me.Total();
            }
            System.out.println("操作を続けますか？続ける場合はenterを押してください。");
            System.out.println("終了する場合は、Yキーを入力してください。");
            String end = new java.util.Scanner(System.in).nextLine();
            if (end.equals("Y") || end.equals("y")) {
                break;
            } else {
                System.out.println("操作を続けます。");
            }
        }
      }
}