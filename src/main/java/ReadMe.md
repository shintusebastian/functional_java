###April 9th class Look at files Test 2 onwards
Abstract List is an implementing class of the List interface. 
The abstract list has everything in the other list implementing classes  and an abstract method called get(). 

We can define the implementation of the get method.

Throwable is a class in Java. It is the parent class of all the exceptions and errors. 

Errors are the conditions which may occur during execution. It is not mentioning the syntax errors. Because the compiler is throwing the syntax errors. But, there can be errors happening during the run-time. 
Syntax errors are not considered as throwable. 

**Errors are the conditions which may occur during program run which you should not try to catch. 
For example: out of memory error, stack overflow. **

Logical errors are not errors but exceptions. Any condition that occurs during execution where you can handle them, is called an Exception.
We put a code which throws exception in a try block. 
All exceptions can be divided into two categories. 

1.checked exceptions (exceptions that compiler will force us to handle-compile time)
2. non-checked exceptions. 

If we want to make sure that our exception class is unchecked, 
add it as classname extends RuntimeException. 
Because all the RunTime exceptions are non-checked. But, if we want it to be checked, 
we can extend it from Exception or io.Exception.

When we throw an Invalid user-name exception using the Exception class, it throws error. 
So, if we change it to Run-time exception class, it will not throw error. Because, we are not checking it during compile time. 

It means, if we are writing a code which is throwing a checked exception,
we must declare it in our method. 
For example:

public void createUser(String name) throws InvalidUserNameException,RuntimeException{
if(name==null){
throw new InvalidUserNameException(); 

As the method can throw more than one exception, we can also say it will throw Run time exception too. 

try{
}
finally{
}
is a valid block. 
Sometimes, exceptions will come, and we don't want to handle it. 
But we want to release our resources.  

in the following scenario


try{
}


catch(Exception ex){
}


catch(InvalidUserName | IOException ex){
}


finally{
}

**In this case, the compiler will throw that the InvalidUserName exception or the 
IOException is not reachable. Because all the exceptions will come and 
get caught at the catch(Exception ex) block only. It will not reach the other exceptions.** 
The first catch block tells that, if both invalid or IO exception is handled with a single handler. 
This is a bitwise OR operation. 

try(){
}
catch(){
} This is called as resource oriented try catch. 
When we go with a resource oriented try catch, we don't need a finally-block. 

###Class Optional < T >
It is a public final class(we cannot extend it). 
If we have a possibility of getting null values from a web application where user enters null values, we can go for optional. 
Because the null values will throw us NUll pointer exception. So in such cases, we go for Optional.

dealWithApple(Optional.empty()); here we are passing an empty value to the method. 

apple.ifPresentOrElse(System.out::println,()-> System.out.println("All Good"));// This will print the value if there is any value.
// or else it will print "All Good".

apple.ifPresentOrElse(); is a consumer method. 


Optional gives us a safe way of dealing values without worrying null.

##Spring 
Spring is a framework for writing Java applications. It enables rapid development. 
It is based on an important concept called Inversion of Control(IoC) and
Dependency Injection(DI).

We will be using the spring boot framework only. 


With the community edition, we won't be able to start a project. 
So we go to start.spring.io

when we are dealing with spring, we can create a spring application
in Java. Java, Kotlin, and Groovy all uses the JVM itself. That is,
all these will create a byte code. 

The spring boot gives us options for versions. 
SNAPSHOTS are not meant for productions. So, we are going with
the 2.6.6
Spring has lots of sub-projects. We can select all the development
tools we need such as lombok.

We select the packaging as jar. 
JAR stands for Java Archive. War stands for Web Archive. 


