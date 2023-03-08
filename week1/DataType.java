package bc20223.week1;

public class DataType {

  public static void main(String[] args) {
    //char
    char gender = 'z'; // or 122
    System.out.println(gender);
    char fun = 'a';
    System.out.println(fun);

    char sky = 65;
    System.out.println(sky);

    System.out.println("gender"+"fun"+"sky");

    char poker = 65;
    char winner = 'A' + 'K';
    char Big = 65 + 75;
    System.out.println(Big);
    System.out.println("poker"+"winner"+"Big");
    System.out.println(poker);
    System.out.println(gender + fun);
    System.out.println(gender + fun + sky);

  int a = 1; //primitive
  Integer b = 1; //non-primitive date type (TYPE)
//Overflow
  a = Integer.MAX_VALUE;
  a = a + 1 + 888888 ;
System.out.println("a=" +a); // overflow

int i = 256;
byte j = (byte) i; //downgrade, byyte -128 to 127
System.out.println(j); // prints -56

// Operator
int x =10;
x = x + 1;
x ++; // x = x +1;
x += 1; //x = x + 1;
x -= 2; //x = x - 2;
x *= 3; //x = x * 3;
x /= 11; //x = x / 11;
System.out.println(x);// x = 3;
x --; // x = x - 1;
System.out.println(x);

//Reminder
int s = 10;
int reminder = s % 3;
System.out.println(reminder);// reminder = 1 

int counter = 0;
System.out.println(counter); //
System.out.println(++counter); //1, execute ++ first, then println
System.out.println(counter);
System.out.println(counter++);
System.out.println(counter);
  
  }
}

