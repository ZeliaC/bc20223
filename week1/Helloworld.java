package bc20223.week1;

import javax.print.DocFlavor.STRING;

public class Helloworld {
  public static void main(String[] args) {

    // primitive data type
    //intt stand Integer, can -ve or +ve
    double age = 23;

    age = age - 0.4 + 10; //32.6

    age = age + (9 - 11) * 2 /10;
    System.out.println("print age" + age);
    age = age * 2 /10; //?
    System.out.println("print age=" + age);
    //long -> integer
    int amount = 200000000;
    amount = 1000 * 10;
    System.out.println("amount=" + amount);

    //char
    char space = ' ';
    char gender = 'F'; //exception char gender =123
    System.out.println("space" + space + gender);
  
    // naming convertion, caml-case
    double ageWithDp = 23.3;
    double ageWithDp2 = 23; // -> 23.0
    double Zelia = 23;
    boolean isCompleted = true; //true, flase
    //non-primitive date type
    String str = "123abc";
    String str2 = "456def";
    String str3 = str + str2 + "Poker";


    ///Object
    //shortcut: sysout
    System.out.println("age=" + age );
    System.out.println(str3);
    System.out.println("str=" + str);
    System.out.println("ageWithDp" + Zelia + isCompleted);
    System.out.println("Zelia" + Zelia);
    System.out.println(age);
    System.out.println(ageWithDp);
    System.out.println(ageWithDp2);
    System.out.println(Zelia);

    Zelia = 28;
    System.out.println(isCompleted + "space" +str);
    System.out.println("Hello. World!!錢錢");
    System.out.println("PokerAA");
  }
}
