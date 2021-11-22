/*-------------------------------------------------------------
//AUTHOR: Connor Ott 
//FILENAME: Student.java
//SPECIFICATION: This file had accessor and getter methods to get the information neccessary for the Lab9.java file, and also has an equals method to compare two student objects
//FOR: CSE 110 - Lab #9
//TIME SPENT: 1 hour
//-----------------------------------------------------------*/

public class Student {
	// private variables for the name, id, and grade of the student
	private String fullName = "foo bar";
	private String id = "null";
	private double grade = -1.0;
	// private variables keep track of updated variables and the amount of times the accessor methods have been accessed
	private int numUpdated = 0;
	private int numAccessed = 0;
		// student constructor to create a student with two strings for name & id, and a double for grade
		public Student(String sFullName, String sAsuID, double sGrade) {
		fullName = sFullName;
		id = sAsuID;
		grade = sGrade;
		}
		// constructor to create a blank student
		public Student() {
		}
		// to string method to properly acquire print student's name grade and id
		public String toString() {
			return String.format("[Name: %s, ASUID: %s, Grade: %s]", fullName, id, Double.toString(grade));
		}
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
		} // equals method to find out if two student objects are the same
		public boolean equals(Student other) { 
		    boolean isEqual = false;
		    String lowercase_FullName = fullName.toLowerCase();
		    String lowercase_otherName = other.fullName.toLowerCase();
		    if (id == other.id) {
		    	isEqual = true;
		    } else if (lowercase_FullName.equals(lowercase_otherName)) {
		    	isEqual = true;
		    } else {
		    	isEqual = false;
		    }
		    return isEqual;
		} 
}