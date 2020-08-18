import java.util.*;
public class Me {
    Kouza bank = new Kouza();
    Kouza suica = new Kouza();
    Kouza cash = new Kouza();
  public void setBank() {
    System.out.println("お金を入れたならY、引き出したのならN、デビットカードを使った場合はD、お金が振り込まれた場合はR、お金を振り込んだ場合はS");
    System.out.println("を入力してください。");
    String strChar = new Scanner(System.in).nextLine();
    if (strChar.equals("Y") || strChar.equals("y")) {
    System.out.println("いくら入金したのか入力してください。");
    int set = new Scanner(System.in).nextInt();
    bank.setBalance(bank.getBalance() + set);
    System.out.println("自分の現金から入金しましたか？もしそうならYを入力してください。");
    String que = new Scanner(System.in).nextLine();
    if (que.equals("Y") || que.equals("y")) {
      cash.setBalance(cash.getBalance() - set);
    }
    System.out.println(set + "円入金したので、現在銀行の残高は"
                        + bank.getBalance() + "円、現金の残高は" + cash.getBalance() + "円です。");
    } else if (strChar.equals("N") || strChar.equals("n")) {
      System.out.println("いくら引き出したのか入力してください。");
      int set = new Scanner(System.in).nextInt();
      bank.setBalance(bank.getBalance() - set);
      cash.setBalance(cash.getBalance() + set);
      System.out.println(set + "円引き出したので、現在の銀行の残高は" + bank.getBalance() +
                        "円、現金の残高は" + cash.getBalance() +"円です。");
    } else if (strChar.equals("D") || strChar.equals("d")) {
      System.out.println("いくら使ったのか入力してください。");
      int set = new Scanner(System.in).nextInt();
      bank.setBalance(bank.getBalance() - set);
      System.out.println(set + "円使ったので、現在の銀行の残高は" + bank.getBalance()  + "円です。");
    } else if (strChar.equals("R") || strChar.equals("r")) {
      System.out.println("いくら振り込まれたのか入力してください。");
      int set = new java.util.Scanner(System.in).nextInt();
      bank.setBalance(bank.getBalance() + set);
      System.out.println(set + "円振り込まれたので、現在の銀行の残高は" + bank.getBalance()  + "円です。");
    } else if (strChar.equals("S") || strChar.equals("s")) {
      System.out.println("いくら振り込んだのか入力してください。");
      int set = new Scanner(System.in).nextInt();
      bank.setBalance(bank.getBalance() - set);
      System.out.println(set + "円使ったので、現在の銀行の残高は" + bank.getBalance()  + "円です。");
    }
    else {
      System.out.println("YかNかDを入力してください。もしくは半角で入力してください。");
      System.out.println("現在の銀行の残高は" + bank.getBalance() + "円です。");
    }
  }
  public void setSuica() {
    System.out.println("チャージしたならY、使ったのならNを入力してください。");
    String strChar = new Scanner(System.in).nextLine();
    if (strChar.equals("Y") || strChar.equals("y")) {
    System.out.println("いくらチャージしたのか入力してください。");
    int set = new Scanner(System.in).nextInt();
    suica.setBalance(suica.getBalance() + set);
    cash.setBalance(cash.getBalance() - set);
    System.out.println(set + "円入金したので、現在Suicaの残高は"
                          + suica.getBalance() + "円、現金の残高は" + cash.getBalance() +  "円です。");
    } else if (strChar.equals("N") || strChar.equals("n")) {
      System.out.println("いくら使ったのか入力してください。");
      int set = new Scanner(System.in).nextInt();
      suica.setBalance(suica.getBalance() - set);
      System.out.println(set + "円使ったので、現在Suicaの残高は"
                                                + suica.getBalance() + "円です。");
    } else {
      System.out.println("YかNを入力してください。もしくは半角で入力してください。");
      System.out.println("現在のSuicaの残高は" + suica.getBalance() + "円です。");
    }
  }
    public void setCash() {
      System.out.println("現金としてお金をもらったのならY、お金を使ったのならNを入力してください。");
      String strChar = new Scanner(System.in).nextLine();
      if (strChar.equals("Y") || strChar.equals("y")) {
        System.out.println("いくらもらったのか入力してください。");
        int set = new Scanner(System.in).nextInt();
        cash.setBalance(cash.getBalance() + set);
        System.out.println(set + "円もらったので、現在の現金の残高は" + cash.getBalance()
              + "円です。");
      } else if (strChar.equals("N") || strChar.equals("n")) {
        System.out.println("いくら使ったのか入力してください。");
        int set = new Scanner(System.in).nextInt();
        cash.setBalance(cash.getBalance() - set);
        System.out.println(set + "円使ったので、現在の現金の残高は" + cash.getBalance()
              + "円です。");
      } else {
        System.out.println("YかNを入力してください。もしくは半角で入力してください。");
        System.out.println("現在の現金の残高は" + cash.getBalance() + "円です。");
      }
  }
  public void Total() {
    int total = suica.getBalance() + bank.getBalance() + cash.getBalance();
    System.out.println("現在の所持金合計は" + total + "円です。");
  }
}
