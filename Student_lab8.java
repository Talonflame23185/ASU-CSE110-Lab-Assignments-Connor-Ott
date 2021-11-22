/*-------------------------------------------------------------
//AUTHOR: Connor Ott 
//FILENAME: Student.java
//SPECIFICATION: This file had accessor and getter methods to get the information neccessary for the Lab8.java file
//FOR: CSE 110 - Lab #8
//TIME SPENT: .5 hours
//-----------------------------------------------------------*/

public class Student {
	// private variables for the name, id, and grade of the student
	private String fullName = " ";
	private String id = " ";
	private double grade = 0;
	// private variables keep track of updated variables and the amount of times the accessor methods have been accessed
	private int numUpdated = 0;
	private int numAccessed = 0;
		// accessor method to access the student's full name
		public String getFullName()
		{
			numAccessed ++;
			return fullName;
		}
		// accessor method to access the student's ID 
		public String getId()
		{
			numAccessed ++;
			return id;
		}
		// accesssor method to access the student's grade
		public double getGrade()
		{
			numAccessed ++;
			return grade;
		}
		// accessor method to get the number of times accessor methods have been accessed
		public int getNumAccessed()
		{
			numAccessed ++;
			return numAccessed;
		}
		// accessor method to get the number of times setter methods have been accessed
		public int getNumUpdated()
		{
			numAccessed ++;
			return numUpdated;
		}
		// setter method to set the fullName = newName
		public void setFullName(String newName)
		{
			numUpdated ++;
			fullName = newName;
		}
		// setter method to set the id = newId
		public void setId(String newId)
		{
			numUpdated ++;
			id = newId;
		}
		// setter method to set the grade = newGrade
		public void setGrade(double newGrade)
		{
			numUpdated ++;
			grade = newGrade;
		}
}