

//Q1) Write the difference between JRE, JDK and JVM?
//
//Ans: 
//JRE - JRE is majorly responsible for creating 
//environment for code execution.
//
//JDK - JDK is primarily used for code execution 
//and has prime functionality of development.
//
//JVM - JVM on other hand specifies all the implementations 
//and responsible to provide these implementations to JRE.
//
//
//Q2) Write the difference between JSE, JEE and JME?
//
//Ans:
// JSE - You can develop standalone applications/desktop applications
// or multi threaded type of applications.
// 
// JEE - It’s used to develop rich enterprise web applications.
//
// JME - Can be used to develop applications running on mobile devices,
// TV set-top boxes, etc.
//
//
//Q3) How does java achieve platform independency?
//
//Ans: Java is platform-independent because it uses a virtual machine.
//    The Java programming language and all APIs are compiled into bytecodes. 
//    Bytecodes are effectively platform-independent. The virtual machine takes care of the differences between the bytecodes for the different platforms.
//
//Q4) What are features of Java and explain them?
//
//Ans: 
//1. Simple:- Java is easy to learn and its syntax is quite simple, clean and easy to
//understand.
//
//2. Object-Oriented:- Java is object-oriented, it supports all the OOPS
//characteristics.
//
//3. Platform Indepented:- Java source code is compiled and
//converted into bytecode. this bytecode can run on multiple platforms. 
//We can compile the java code in one Operating
//System and execute it on another Operating System.
//
//4. Multithreaded:- Java supports multithreading to enhance performance. by using
//this we can execute multiple functionalities simultaneously.
//
//
//Q5) Write a Java Application which prints your details?

package Sprint1;

public class Day1 {
    
	public static void main(String[] args) {
		
		System.out.println("Name: Aifanul Islam");
		System.out.println("Father's Name: Md. Minhajul Islam");
		System.out.println("Mother's Name: Nikhat Perveen");
		System.out.println("Age: 20");
		System.out.println("Gender: Male");
		System.out.println("Address: Main Road Ranchi");
		System.out.println("Mobile No.: 7867556858");
	}
}
