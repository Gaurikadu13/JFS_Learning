# ☕ Core Java - My Learning Journey

Hi, I'm Gauri 👩‍💻
This folder contains my daily Core Java practice and notes.

---

## 📅 Day 1 - Basics

### 📚 Topics Covered:

* Introduction to Java
* Variables
* Arithmetic Operators
* Data Types
* First Java Program

---

### 💡 What I Learned:

* Java is platform independent
* A Java program mainly consists of: Data Members, Constructors, Methods, and Blocks
* Class name and file name should be the same
* Variables are used to store data
* Arithmetic operators are used to perform calculations
* JVM get started by java, JVM call main method

---

## 📊 Data Types in Java

### 🔹 Types of Data Types

1. Primitive Data Types
2. Non-Primitive Data Types

---

### 🔹 Primitive Data Types

* There are 8 primitive data types in Java
* Size is fixed and predefined
* Stored directly in memory

| Data Type | Default Value | Size    |
| --------- | ------------- | ------- |
| byte      | 0             | 1 byte  |
| short     | 0             | 2 bytes |
| int       | 0             | 4 bytes |
| long      | 0             | 8 bytes |
| float     | 0.0           | 4 bytes |
| double    | 0.0           | 8 bytes |
| char      | ' ' (space)   | 2 bytes |
| boolean   | false         | 1 bit   |

---

### 🔹 Non-Primitive Data Types

* Also called reference data types
* Store reference (address) of data
* Default value is `null`

Examples:

* String
* Array
* Class
* Object


👉 File: [Arith_oprn.java](./Arith_oprn.java)<br>
          [Pri_data_type.java](./Pri_data_type.java)<br>
          [Non_Pri_data_type.java](./Non_Pri_data_type.java)<br>
          

---

## 📅 Day 2 - Basic

### 📚 Topics Covered:

* Method
* Classes
* Scanner class

---

### 💡 What I Learned:
## Method:
* Easy to esuse and maintain.
* Can divide code into small parts.
* Can pass differnt value to variable by creating differnt objects and by making parameterize method.

## Class:
* Class is the logical entity,blueprint.
* We write the method and member in it.
* Two type classes
1.In build class -define by java language eg System ,Stirng ,PrintlStream ,etc.<br>
2.custome class - defime by user eg . A ,Student ,Employee ,etc.

## Scanner:
* Scanner is the class which is used to tate a input from keybord.
* Scanner class is present in * package.
* Import the * package outside the class.
* to Store input use reference variable with next() method as follow 
##  Storing User Input using Scanner (Java)

| Method           | Data Type |
|------------------|----------|
| next()           | String   |
| nextLine()       | String   |
| nextInt()        | int      |
| nextLong()       | long     |
| nextFloat()      | float    |
| nextDouble()     | double   |
| nextBoolean()    | boolean  |
| next().charAt(0) | char     |

👉 File:  [Method1.java](./Method1.java)<br>
          [ClassL.java](./ClassL.java)<br>
          [ScannerL.java](./ScannerL.java)<br>

---

## 📅 Day 3 - Basic

### 📚 Topics Covered:

* Object
* Realtional Operator
* Conditional Operator

### 💡 What I Learned:
## Object:
* Object is the Physical entity,blueprint.
* Object have state(change object to object) and behaviour(always same).
* Object means saperate copy of memory and in one class we can create multiple objects

##  Operator:
* An operator is a symbol used to perform operations on variables and values.

### 1. Arithmetic Operators

Used to perform mathematical operations like addition, subtraction, multiplication, etc.

| Operator | Meaning        |
|----------|----------------|
| +        | Addition       |
| -        | Subtraction    |
| *        | Multiplication |
| /        | Division       |
| %        | Modulus        |

### 2. Relational Operators

Used to compare two values and return true or false.


| Operator | Meaning                      |
|----------|------------------------------|
| ==       | Equal to                     |
| !=       | Not equal to                 |
| >        | Greater than                 |
| <        | Less than                    |
| >=       | Greater than or equal to     |
| <=       | Less than or equal to        |

### 3. Logical Operators

Used to combine multiple conditions and return true or false.

| Operator | Meaning        |
|----------|----------------|
| &&       | Logical AND    |
| \|\|     | Logical OR     |
| !        | Logical NOT    |

### 4. Assignment Operators

Used to assign values to variables.

| Operator | Meaning              |
|----------|----------------------|
| =        | Assign value         |
| +=       | Add and assign       |
| -=       | Subtract and assign  |
| *=       | Multiply and assign  |
| /=       | Divide and assign    |
| %=       | Modulus and assign   |

### 5. Increment/Decrement

Used to increase or decrease the v

| Operator | Meaning        |
|----------|----------------|
| ++       | Increment      |
| --       | Decrement      |

### 6. Conditional Operator

Used as a short form of if-else to make decisions in one line.

| Operator | Meaning                  |
|----------|--------------------------|
| ?:       | Ternary (if-else short)  |


👉 File: [Operator.java](./Operator.java)<br>
          

---

## 📅 Day 4 - Basic

### 📚 Topics Covered:

* Conditional Statement

### 💡 What I Learned:
## Conditional Statement:
* Use to manipulate the flow to over program
* There are three type of conditional operator

1. If block :- Check the condition if true,exectute if block<br>
2. If else block :- Check the condition if true,exectute if block otherwise execute else block<br>
3. Else if block :- It is called as else if ladder , Check multipli conditions


👉 File: [IF.java](./IF.java)<br>
          [If_else.java](./If_else.java)<br>
          [Else_if.java](./Else_if.java)<br>
          
---

## 📅 Day 5 - Basic

### 📚 Topics Covered:

* Switch_case statement
* break keyword

### 💡 What I Learned:
## Switch_case:
* Switch Case is the alternative of if_else.
* It is use when we want to choose a choice from multiple options.
* If the input matches with case the it will execute the respective case.
* if no case match execute the default condition.

## break keyword:
* Break keyword is use for skip the next belonging code after break it will left the switch case.




👉 File: [Switch_case.java](./Switch_case.java)<br>
          [Switch_case2.java](./Switch_case2.java)<br>
          
---

## 📅 Day 6 - Basic

### 📚 Topics Covered:

* Loops

### 💡 What I Learned:
## Loops:
* Looping is use to print or execute multiple interation.
* It is use when we know the exact number of iterations.
* Loop we do initialization,check condition,increament.
* There are three loops

1. For Loop
2. While Loop
3. Do-while Loop

### 1.For loop  

In while loop first the condition check and the execute.  

syntax: for(intialize , condition , increament/decreament)<br>
{  
      //Code to be execute.  
}

eg.
for(int i=0 ; i<=5 ; i++)  
{  
       System.out.println(i);  
}

👉 File: [For.java](./For.java)<br>

### 2.While loop  

In while loop first the condition check and the execute.  

syntax: intialization  
while(condition)  
{  
        //code to be execute  
        inceament/decreament
}  

eg .
int i=0;  
while(i<=5)  
{  
        System.out.println("Hello !");  
        i++;  
}

👉 File: [While.java](./While.java)<br>

### 3.Do-while loop  

In do-while loop first the it execute  and then check condition.  

syntax: intialization  
do  
{  
         //code to be execute  
        inceament/decreament
}  
while(i<=5);

eg .
int i=0;  
do  
{  
        System.out.println("Hello !");  
        i++;  
}
while(i<=5);


👉 File: [Do_while.java](./Do_while.java)<br>
          
---

## 📅 Day 7 - Basic

### 📚 Topics Covered:

* Constructor
* this keyword

### 💡 What I Learned:
## Constructor:
* Constructor name is same name as class name.
* If class not have any constructor, constructor put default constructor
* One class class have multiple constructor.
* Constructor is to intialize the instace variable of class.
* Constructor automaticaly created when class created.
* Type of constructor:
1. default constructor
2. parameterize constructor
3. non-parameterize constructor

## this keyword:
* This keyword is to refer current object.
* It will store or pointout the current object

👉 File: [Constructor.java](./Constructor.java)<br>
          [Student_constructor.java](./Student_constructor.java)<br>
          
---

## 📅 Day 8 - Basic

### 📚 Topics Covered:

* Setter-getter method

### 💡 What I Learned:
## Setter-getter method:
* Setter-getter method is use to take a input and to return it.
* setter is use to set the value .
* getter is use to get the value.
* the return type of setter method is always void but return type of getter is according to the instance variable.

👉 File: [Constructor.java](./Constructor.java)<br>
          [Student_constructor.java](./Student_constructor.java)<br>
          
---

## 📅 Day 9 - Basic

### 📚 Topics Covered:

* Has-A relationship
* Has-A relationship using constructor

### 💡 What I Learned:
## Has-A relationship
* Has a relationship called as secondary reference
* In Has-A relationship we can use one class refernce variable/method in anather class.

## Has-A relationship using constructor
* In constructor we pass values at the time of object creation.
* Other class variable is called by using the (.)

👉 File: [Has_A.java](./Has_A.java)<br>
          [Has_A_constructor.java](./Has_A_constructor.java)<br>
          
---

## 📅 Day 10 - Basic

### 📚 Topics Covered:

* Method parameter using constructor and getter mehod

### 💡 What I Learned:
## Has-A relationship
* we can give the class as a parameter to any method.
* we can access the class variable and method in anather class.
* we can pass the value throught constructor and get the value throught getter.

👉 File: [Method_parameter.java](./Method_parameter.java)<br>
                    
---

## 📅 Day 11 - Basic

### 📚 Topics Covered:

* Method return type
1.Method return type as a class type.
2.Method return type with Has_A relationship.

### 💡 What I Learned:
## Method return type as a class type.
* method can return an object of a class instead of a primitive data type (like int, float, etc.).
* This means the return type of the method is a class name.

## Method return type with Has_A relationship.
* A Has-A relationship means one class contains another class as a member
* In such cases, a method can return an object of the contained class.


👉 File: [Method_return_classtype.java](./Method_return_classtype.java)<br>
          [Method_return_Has_A.java](./Method_return_Has_A.java)<br>
             
---

## 📅 Day 12 - Basic

### 📚 Topics Covered:

* Final keyword

### 💡 What I Learned:
## Final Keyword
* Final keyword is used to achieve constant in java.
* constant means the value of final variable will not change throughout the program.
* We can make variable, method and class as final.
* Naming convesion of final variable is in camel case.
* We need to intialie the final variable at the time of declaration or inside the constructor.
* We can make local variable as final.
* if we make a reference variable as final then it can't point to any other object.


👉 File: [Final.java](./Final.java)<br>
          
          
---
## 🎯 Goal

* Build a strong foundation in Core Java
* Improve programming skills

---
