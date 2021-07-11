# JAVA_stream

### Problem statement
4.  Create Student class -- rollNo(string),name,dob(LocalDate),subject(enum),gpa(double)
Create Subject enum --JAVA,CLOUD,ML,R,DBT
Add constr & to string & getters.
4.1  Create sample data for storing list of students (5 records minimum)
4.2 Write a tester to print avg gpa of students opted for subject JAVA
(Hint : filter,map,reduce)
4.3 Print name of java topper
(filter ,  max )
4.4  Check if there are any failures for the specified subject from user.
(gpa < 5 : failed case)
(filter,anyMatch)

4.5  Display Names of failures in Java
filter,findAny

4.6 How many distinctions for a specific subject
(gpa > 7.5 : distinction)
filter,count

####This Repo contains 4 files student,dummydata,subject and studenttester 
-> File1 Dummydata
Dummydata contains already filled data to be loaded  while running the program

-> File2 student
This file contains the student class, it contains private variables, constructor,get and set methods and tostring method

-> File3 subject
it contains subjects of the students and is of type enum

-> File4 studenttester
This is a driver file which integrates all other files and runs them in the main method 
The concept of stream is used in this program
