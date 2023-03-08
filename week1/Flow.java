package bc20223.week1; 

public class Flow {
  public static void main(String[] args){
  int a = 0;
// In this scenario, line8 -> 10 -> 12 ->13 ->15
  if(a + 1 > 2){ //>, <, <=,>=
    System.out.println("hello");
  } else if (a + 1 == 2){ // = means assignment, ==means checkifthey are 
    System.out.println("Code");
      }
      else if (a + 1 < 2) {
        System.out.println("yeah");
      }
      //End the if flow

      long b = 100;
      boolean isFemale = true;

      //b == 100, asking youif b equals to 100 -> YES
      //isFelmale ==false, asking you if isFemale equals to false? ->  No
      //Flow: Line 23 -> 25 -> 26
      if (b == 100 && isFemale == false) {
        System.out.println("Hello");
      }else {
        System.out.println("code");
      }

      if (b == 100 || isFemale == false){ // || means OR
      System.out.println("yes");
    }
  
  if (b == 100 || isFemale == true && b +2 > 101) { // || means OR
    System.out.println("Sure");
  }
if (b == 99 || isFemale == true && b + 2 > 101){
  System.out.println("Zelia");
}

int numericGrade = 70;
char letterGrade = ' ';

switch (numericGrade) {
    case 90: {
        letterGrade = 'A';
        {System.out.println("case 90");}
        break;
    }
    case 80: {
        letterGrade = 'B';
        {System.out.println("case 80");}
        break;
    }
    case 70: {
        letterGrade = 'C';
        {System.out.println("case 70 ");}
        // ... lines of code
        break;
    }
    case 60: {
        letterGrade = 'D';
        {System.out.println("case 60");}
        break;
    }
    case 50: {
        letterGrade = 'E';
        {System.out.println("case 50");}
        break;
    }
    default: {
        letterGrade = 'F';
        System.out.println("case ");
        break;
    }
}

System.out.println("letterGrade: " + letterGrade); // prints 'C'

int numericGrade1 = 60;
char letterGrade1 = ' ';

switch (numericGrade1) {
    case 90: {
        letterGrade1 = 'A';
        {System.out.println("case 90");}
    }
    case 80: {
        letterGrade1 = 'B';
        {System.out.println("case 80");
    }
  }
    case 70: {
        letterGrade1 = 'C';
        {System.out.println("case 70");}
    }
    case 60: {
        letterGrade1 = 'D';
        {System.out.println("case 60");}
    }
    case 50: {
        letterGrade1 = 'E';
        {System.out.println("case 50");}
    }
    default: {
        letterGrade1 = 'F';
        System.out.println("case ");
    }
}

System.out.println("letterGrade: " + letterGrade1); // prints 'C'

int numericGrade2 = 90;
char letterGrade2 = ' ';
int score = 0;

switch (numericGrade2) {
  case 90: {
    score += 10;
  }

  case 80: {
    score += 10;
  }

  case 70: {
    score += 10;
  }
  case 60: {
    score += 10;
  }

  }
}