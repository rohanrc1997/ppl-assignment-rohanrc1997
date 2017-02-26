IPPL430C Assignment
(A JAVA Project)

Author:
IIT2015073
Rohan Chaudhary

This is the PPL Assignment, by Prof. Rahul Kala.
This repository contains the questions 1 - 2 of the assignment (right now).


*** "root" refers to the topmost directory containing the entire project having the following directories inside it:
     -build 
     -dist
     -nbproject 
     -src
     -test


KEY FEATURES:

*Different Namespaces are used to classify classes according to algorithms, data structures, data items and utilities.

*Consists of a utility (Random_gen_util.java) for producing randomly generated data in the following file: root/build/classes/input.txt 
 for input boys, gifts and girls and uses a 
 dictionary of names (root/build/classes/girl.txt and root/build/classes/boy.txt) to choose the names from.

*Consists of a utility to store all the events namely, commitments and gift exchanges in the
 following text file along with a timestamp :     root/build/classes/log.txt

*The Java-Documentation for the Project is present in : root/dist/javadoc/index.html
  and can be viewed using an internet browser



Operating System Used and Java Version Used: 

1.8.0_111 Java HotSpot(TM) 64-Bit Server VM 25.111-b14
Linuxmint-17.3-Cinnamon-64bit

JDK 1.8.111
Windows-10-64-bit-(10.0, Build 10586)



Developer Tools used:

Netbeans Build 8.2 , Javadoc , Code 2 UML


Compilation and Build Procedure (using command line):

1. Change the current working directory to that of the root of the project directory which contains the 'src' directory inside it:
   Then, Run the following command to compile all the project packages at once:
   
>>  javac  src/algorithm/*.java  src/data_structures/*.java   src/dataitem/*.java   src/utilities/*.java;


2. Change the Current Directory to that of (/build/classes) using the following command:

>>  cd build/classes;


3. Now, for Running the Program for Question 1, Enter the following command:

>>  java algorithm.q1;


***The Q1 program takes the Number of Boys, Number of girls and Number of gifts (in order) from the terminal from the user.
   It then generates random data items using the random utility.
   Couples then are allocated and printed in the terminal itself as well as in the following file with a timestamp : root/build/classes/log.txt
   Furthermore, the random input data is stored in : 'root/build/classes/input.txt' for easier debugging;


4. Similarly, to Run the Program for Question 2, Enter :

>>  java algorithm.q2;

***The Q2 program takes Number of Boys, Number of girls and Number of gifts (in order) from the terminal, from the user.
   It also requires an input integer 'k' from the user. (where k < TOTAL NUMBER OF COUPLES FORMED)
   Gift Exchanges then are printed in the terminal itself as well as in the following file with a timestamp : root/build/classes/log.txt
   It also prints the k-most compatible and k-most happiest couples.
   Furthermore, the random input data is stored in : 'root/build/classes/input.txt' for easier debugging;
