//Java Program to demonstrate the addition of two matrices in Java  
class Testarray5{  
public static void main(String args[]){  
//creating two matrices  
int a[][]={{1,3,4},{3,4,5}};  
int b[][]={{1,3,4},{3,4,5}};  
  
//printing elements of matrix a
System.out.println("The elements of matrix a:");
for(int i=0;i<2;i++){  
for(int j=0;j<3;j++){  
System.out.print(a[i][j]+" ");  
  }
System.out.println();//new line  
}
//printing elements of matrix b
System.out.println("The elements of matrix b:");
for(int i=0;i<2;i++){  
for(int j=0;j<3;j++){  
System.out.print(b[i][j]+" ");  
}
System.out.println();//new line  
}
//creating another matrix to store the sum of two matrices  
int c[][]=new int[2][3];  
System.out.println("Sum of both the matrix:");   
//adding and printing addition of 2 matrices  
for(int i=0;i<2;i++){  
for(int j=0;j<3;j++){  
c[i][j]=a[i][j]+b[i][j];  
System.out.print(c[i][j]+" ");  
}  
System.out.println();//new line  
}  
  
}}  