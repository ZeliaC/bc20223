package bc20223.week1;

public class Loops {
  
  public static void main(String[] args){
    // Approach 1: FOR LOOP
    int i = 0;
    for(i = 0; i < 5; i++){//count ; condition to continue ; change of i 
      System.out.println("hello");
    }
    // if i =0, then sysout will run 5 times

    // for and while loop different

    // Approach 2: While Loop
    i = 0;
    while(i < 5){// condition to continue
    System.out.println("hey");
    i += 1;
    }

    //Approach 3: dp-while loop
    i = 0;
    do{
      System.out.println("Dear");
      i++;
    } while ( i < 5); // condition to continue

    //for loop with break
    for (byte a =0; a < 4; a++){
      System.out.println("a=" +a);
      if (a == -5) {
        break; // this break will exit the for loop
      }
    }

    //Nested For Loop
    //for (int y = 0; y < 6; y++)
      //System.out.println("*");
      /**
       * *.....x=0, row=0, *
       * **....x=1,row =1, **
       * ***
       * ****
       * *****
       * ******
       */
      // x =*
      // y = space

//for (int x = 0; x < 5; x++){ //rows
  //System.out.println("");
  //for (int y = x; y >= 0; y--) {
    //
  System.out.println("hello");
    //System.out.print(" ");
    //System.out.print("*");
  //}
    //System.out.println("");
  //}

  for (int x = 0; x >= 0; x--){ //rows
    System.out.println("");
    for (int x = 0; x <5; x++) 
    for (int y = x; y>= 0; y--)

    //{
      //System.out.println("hello");
      //System.out.print(" ");
      //System.out.print("*");
    //}
      //System.out.println("");
    }
}
}

