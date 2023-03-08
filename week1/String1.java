package bc20223.week1;

public class String1 {
  public static void main(String[]args){
     String name = " Today is a nice day ";
    int age = 10;
    int index = 4;

    System.out.println("hello");
    System.out.println(name.charAt(0)); // index 0 represents the 1st postion
    System.out.println(name.charAt(index)); // print a

    System.out.println(name.indexOf("y")); // print 5
    System.out.println(name.indexOf("nice")); // print 12

    System.out.println(name.trim()); // remove space from the beginning and end space
    System.out.println(name.replace("Today", "Tomorrow"));

    System.out.println(name.length()); //print 21
    System.out.println(name.substring(1, 3)); //start from index 1,end 

    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());

    String newString = (name.concat(", but raining.").toUpperCase());
    String finalString = newString.toUpperCase();
    System.out.println(finalString);

    System.out.println(name.concat(", but raining."));

    int a = 10;
    if (a == 10) {
      System.out.println("");
    }
    String firstName = "John";
    if ("Mary".equals(firstName)) {// the best way to compare String 
      System.out.println("hello");
    } else {
      System.out.println("They are not equal");
    }

    String s1 = "Hello";
String s2 = "Hello";
System.out.println(s1 == s2); // prints true
System.out.println(s1.equals(s2));  // prints true

String s3 = new String("Hello");
String s4 = new String("Hello");
System.out.println(s3 == s4); // prints false
System.out.println(s3.equals(s4));  // prints true

String str = "brown";
String myString = "The " + "quick " + str + " fox..."; // 
System.out.println("The quick brown fox..." == myString); // prints true
System.out.println("The quick brown fox...".equals(myString)); // prints true

String myString1 = "The " + "quick " + "brown" + " fox..."; // 
System.out.println("The quick brown fox..." == myString1); // prints true
System.out.println("The quick brown fox...".equals(myString1)); // prints true

//int ->
Integer i1 = new Integer(10);
Integer i2 = new Integer(10);

int c = 10;
if (c ==10){

}

if(i1 == i2){
  System.out.println("They are same object in Heap");
} else {
  System.out.println("They are not the same object in heap");// print 
}
//system.out.println(i1.compareTo(i2));
if (i1.compareTo(i2) == 0){
  System.out.println("They have equal value");
} else{
  System.out.println("They arenot the same object in heap");
}

Integer d = 127;
Integer d2 = 127;

Integer e1 = 128;
Integer e2 = 128;
if (d == d2){
  System.out.println("d = d2");
}else {
  System.out.println("d ! = d2");}

  if (e1 == e2) {
    System.out.println("e1 = e2");
  } else {
    System.out.println("e1 ! = e2");
  }
  //Unboxing
  int i = new Integer(1); // unboxing
  //Autoboxing
  Integer integer = 128; // new Integer(128)
  Integer integer2 = 127; // find if there is existing object with value 127
                          // object

   //
   int y =Integer.valueOf(1); // new Integer(1)
   boolean bool = Boolean.valueOf(true); //new Boolean(true)
   
   Double double2 = new Double(10.98);// by default, 10.98 is a type od double
   Float float2 = new Float((Float)10.98);

   Character char3 = new Character(0)
  }
}