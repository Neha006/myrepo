/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Enter a no. ");
		Scanner sc= new Scanner(System.in);
// 		int n= sc.nextInt();
// 			System.out.println("Enter a digit  to find frequency : ");
	
// 		int d= sc.nextInt();
		
		//-------------------------------------------------------hollow SQUARE
// 		for(int i=1;i<=n;i++){
// 		    for(int j=1;j<=n;j++){
// 		        if(i==1||j==1|| i==n|| j==n){
// 		            System.out.print("*");
// 		        }
// 		        else {
// 		            System.out.print(" ");
// 		        }
// 		    }
// 		    System.out.println();
// 		}

//-------------------------------------------------------pyramid
//*
//**
//***
//****
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    //-------------------------------------------------------pyramid invert
   // ****
    //***
    //**
    //*
    // for(int i=1;i<=n;i++){
    //     for(int j=n-i+1;j>=1;j--){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    //------------------------------------------------------------puramid + half pyramid
    // *
    // **
    // ***
    // ****
    // ***
    // **
    // *
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // for(int i=1;i<=n;i++){
    //     for(int j=2;j<=n-i+1;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println(" ");
    // }
    //------------------------------------------------------------inverted half puramid
    //   *
    //   **
    //  ***
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
            
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    //------------------------------------------------------------space pyramid
    // *
    //  **
    //   ***
    //   ****
    //     *****
    //   ****
    //   ***
    //  **
    // *
    
    // for(int i=1;i<=n;i++){
    //     //spaces
    //     for(int j=1;j<=i-1;j++){
    //         System.out.print(" ");
    //     }
    //     //stars
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //       System.out.println();
    // }
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i+1;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=n-i+1;j++){
    //         System.out.print("*");
            
    //     }
    //     System.out.println();
    // }
    // ------------------------------------------------------------half pyramid with no.
    // 1
    // 1 2
    // 1 2 3
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }
    //------------------------------------------------------------ fibonacci 
    //
    // nth fib no.------------------------------------------------------------
    // int num1=0;
    // int num2=1;
    // int count=0;
    // while(count<n){
      
    //     int num3=num1+num2;
    //     //swap
    //     num1=num2;
    //     num2=num3;
    //     count++;
    // }
    //   System.out.print(num1+ " ");
    //------------------------------------------------------------missing no.
    
    // int [] a={1,2,3,4,6};
    // int n=6;
    // int sum=n*(n+1)/2;
    // int aSum=0;
    // for(int num:a)
    //     aSum+=num;
    // int diff=sum-aSum;
    // System.out.println(diff);
    //------------------------------------------------------------no.of digit in a given no.
    // int count=0;
    
    // while(n>0){
        
    //     count++;
    //     n=n/10;
    // }
    // System.out.println(count);
    //------------------------------------------------------------freq of digit d in no.
    // int count=0;
    // while(n>0){
    //     int mod=n%10;
    //     if(mod==d)
    //     count++;
    //     n=n/10;
    // }
    // System.out.println(count);
    //------------------------------------------------------------AppLE=aPPle 'a'='A'+32  'A'='a'-32
//     System.out.println("Enter string here:");
//     String str=sc.nextLine();
//     System.out.println(convert(str));
//     // for(int i=0;i<str.length();i++){
        
//     // }
// 	}
// 	public static String convert(String s){
	   
// 	    StringBuilder sb=new StringBuilder();
// 	    for(int i=0;i<s.length();i++){
// 	        if(s.charAt(i)>='A' && s.charAt(i)<='Z')
// 	        sb.append((char)(s.charAt(i)+32));
// 	        else if(s.charAt(i)>='a' && s.charAt(i)<='z')
// 	        sb.append((char)(s.charAt(i)-32));
// 	        else
// 	        sb.append(s.charAt(i));
// 	    }
// 	    return sb.toString();

//------------------------------------------------------------string pattern
// char ch='A';
// for(int i=1;i<=n;i++){
//     for(int j=0;j<=i-1;j++){
//         System.out.print((char)(ch+i));
//     }
//     System.out.println();
// }
//------------------------------------------------------------count total no. of vowel , consonent specials
//         System.out.println("Enter string here:");
//         String str=sc.nextLine();
//         int countv=0;
//         int countcons=0;
//         int countspecial=0;
//         int n=str.length();
//         for(int i=0;i<n;i++){
//             char ch=str.charAt(i);
//             if(isvowel(ch))
//             countv++;
//                   else if(ch >='a' && ch<='z' && isvowel(ch) == false) countcons++;
           
            
//         }
//         System.out.println((int)(str.length() - countv - countcons));
//          System.out.println( "countcons :"+countcons);
//           System.out.println("countv : "+countv);
// 	}
// 	public static boolean isvowel(char ch){
// 	    if(ch=='a'|| ch=='e' ||ch=='i' || ch=='o' || ch=='u')
// 	    return true;
// 	    return false;
//------------------------------------------------------------element that occur one times
            // System.out.println("Enter string here:");
            // String str=sc.nextLine();
            // TreeSet<Character> unique = new TreeSet<Character>();
            // for(int i=0;i<str.length();i++){
            //     char ch = str.charAt(i);
            //     if(unique.contains(ch))
            //     unique.remove(ch);
            //     else
            //     unique.add(ch);
            // }
            // if(unique.size()==0)
            // System.out.println("no. unique element");
            // else
            // {
            //     for(char x:unique)
            //     System.out.print(x+" ");
            // }
            //------------------------------------------------------------array reverse
            // int [] a={1,2,3,4,5};
            // int n=a.length;
            // int i=0;
            // int j=n-1;
            
            // while(i<j){
            //     //swapp
            //     int temp=a[i];
            //     a[i]=a[j];
            //     a[j]=temp;
            //     i++;
            //     j--;
            // }
            // for(int num:a){
            //     System.out.print(num+" ");
            // }
           // ------------------------------------------------------------string reverse
        //     String str="abcdef";
        //     int i=0;
        //     int j=str.length()-1;
        //     char[] charArr= str.toCharArray();
        //     while(i<j){
        //         //swapp
        //         char ch=charArr[i];
        //         charArr[i]=charArr[j];
        //         charArr[j]=ch;
        //         i++;
        //         j--;
        //     }
        //   System.out.print(Arrays.toString(charArr));
        //------------------------------------------------------------
            
	}
}
