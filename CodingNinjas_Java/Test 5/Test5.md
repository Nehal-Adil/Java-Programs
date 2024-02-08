## Ques 1:
### Predict the Output

```java
class Student{
    String name;
    int rollNo;
    Student(int n){
    rollNo = n;
    }   
    void print(){
    System.out.print(rollNo +" " + name+" ");
    }
}

public class Use {
    public static void main(String[] args) {
    Student s = new Student(56);
    s.print();
    }
}  
```
### Ans: 56 null

## Ques 2:
### Keyword
```text
Which keyword works as a reference to the current Object whose Method or constructor is being invoked ?
```
### Ans: this

## Ques 3:
### Predict the Output
```java
class A{
    A(){
        System.out.print("first ");
    }
}
class B extends A{
    B(){
        System.out.print("second ");
    }
}
class C extends B{
    C(){
        System.out.print("third ");
    }
}
class Main{
    public static void main (String[] args) {
        C c=new C();
    }
}
```
### Ans: first second third

## Ques 4:
### Figure out the correct statement
```java
class Car{
    String color;
    double price;
}
public class new_Car {
    public static void main(String[] args) {
        Car c = new Car();
        //Figure out the correct statement to set color of the car object referred by c to “black”
    }
}
```
### Ans: c.color="black"