## Ques 1:
### What will be the output of the following code?
```java
public static int [] change(int input[]){
        input = new int[5];
        input[3] = 15;
        return input;
        }

public static void main(String args[]){
        int arr[] = new int[15];
        arr=change(arr);
        System.out.println(arr[7]);
        }
```
### Ans: error

## Ques 2:
### What will be the Time Complexity of following code in terms of ‘n’ ?
```java
for(i= 2; i<n; i=i+1)
{
   for(j = 1; j < c; j++)
        // A line of code of Θ(1)
}
//where c is a constant
```
### Ans: O(n)

## Ques 3:
### What will be the output of the following code?
```java
public static void main(String[] args)
        {
        int arr[] = new int[5];
        int arr2[] = new int['a'];
        int bt = 10;
        int arr3[] = new int[bt];
        System.out.print(arr.length);
        System.out.print(" "+arr2.length+" ");
        System.out.print(arr3.length);
        } 
```
### Ans: 5 97 10

## Ques 4:
### What will be the output of the following code?
```java
public static void main(String args[]) 
{ 
    String str1 = new String ("I love coding"); 
    String str2 = "I love coding"; 
    boolean check=(str1=="I love coding");
    System.out.println((str1 == str2) + " " + str1.equals(str2)+" " + check); 
}
```
### Ans: false true false

## Ques 5:
### Time Complexity
```text
In a competition, four different functions are observed. All the functions use a single for loop and within the for loop, same set of statements(with constant time) are executed. Consider the following for loops:

A) for(i = 0; i < n; i++) 

B) for(i = 0; i < n; i += 2) 

C) for(i = 1; i < n; i *= 2) 

D) for(i = n; i > 0; i /= 2) 
If n is the size of input(positive), which function(s) is/are the most efficient?
```
### Ans: (C) (D)