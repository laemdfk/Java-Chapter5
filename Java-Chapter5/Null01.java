// null = 参照型変数の中身が何もないことを表現する特別な値(Railsなどでもエラーの原因になっていたもの)

public class Null01 {
  public static void main(String[] args) {
      String string1;  // String型 ＝ 文字列。字列をプログラム上に記述する場合は、「"」(ダブルクォーテーション)で囲む。
      // ”あいう”の文字数を出力
      string1 = "あいう";
      System.out.println(string1 + "の文字数：" + string1.length());
      // ””（空文字）の文字数を出力
      string1 = "";
      System.out.println(string1 + "の文字数：" + string1.length());
      // nullの変数を参照するとNullPointerExceptionのエラー
      string1 = null;
      System.out.println(string1 + "の文字数：" + string1.length());
  }
}