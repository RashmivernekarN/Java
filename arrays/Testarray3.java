//Java Program to demonstrate the way of passing an array  
//to method.  
class Testarray3{  
//creating a method which receives an array as a parameter  
static void min(int arr[]){  
System.out.println("Given array elements:");
for(int i=0;i<arr.length;i++) 
System.out.println(arr[i]);
int min=arr[0];  
for(int i=1;i<arr.length;i++)  
 if(min>arr[i])  
  min=arr[i];  
System.out.println("Minimum of given array elements="+min);  
}  
public static void main(String args[]){  
int a[]={33,3,4,5};//declaring and initializing an array  
min(a);//passing array to method  
}}  