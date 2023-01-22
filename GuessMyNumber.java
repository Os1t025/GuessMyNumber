import java.util.Scanner;
public class GuessMyNumber
{
public static void binarySearch(int ans, int first, int last, int num){  
   String name = new String();
   Scanner scan = new Scanner(System.in);
   int mid = (first + last)/2;  
   while( first <= last )//while loop for binary search
   {  
      if ( ans < num )
      {  
        first = mid + 1; 
        System.out.println("Is your number "+first);    
        System.out.println("Please enter C for correct, H for too high, or L for too low.");
        System.out.println("Enter your response (H/L/C): ");
        char letter=scan.next().charAt(0);
          //if statements for higher,lower,and correct  
         if (letter == 'H')
         {
            mid = (first-1)/2; 
         }  
            if (letter == 'L')
            {
               mid = ((first/2)+(first-1));
            }
               if(letter=='C')
                  {
                     System.out.println("Thank you for playing Guess My Number!");
                     break;
                  }
      }           
   }  
}
public static void main (String[] args)
   {
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter n: ");
   int num = scan.nextInt();
      while (num<=0)//While loop to make sure we have a positive int
      {
      System.out.println("Enter a positive integer for n: ");
      num = scan.nextInt();
      }
   //intro to game
   System.out.println("Welcome to Guess My Number!");
   System.out.println("Please think of a number between 0 and "+(num-1)+".");
   int ans = scan.nextInt();
   int last= num-1; 
   binarySearch(ans,0,last,num); //goes to void BinarySearch
   }
}