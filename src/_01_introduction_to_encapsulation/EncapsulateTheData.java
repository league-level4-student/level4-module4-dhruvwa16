package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData extends TestCase{
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	public int getitemsRecieved() {
		return this.itemsReceived;
	}
	public void setitemsRecieved(int itemsRecieved) {
		if(itemsRecieved>=0) {
			this.itemsReceived = itemsRecieved;
		}
		else {
			this.itemsReceived = 0;
		}
	}
	
	public float getdegreesTurned() {
		return this.degreesTurned;
	}
	public void setdegreesTurned(float degreesTurned) {
		if(degreesTurned > 0.0 && degreesTurned < 360.0) {
			this.degreesTurned = degreesTurned;
		}
	}
	
	public String getnomenclature() {
		return this.nomenclature;
	}
	public void setnonmenclature(String nomenclature) {
		if(nomenclature != "") {
			this.nomenclature = nomenclature;
		}
		else {
			this.nomenclature = " ";
		}
	}
	
	public Object getmemberObj() {
		return this.memberObj;
	}
	public void setmemberObj(Object memberObj) {
		if(memberObj instanceof String) {
			this.memberObj = new Object();
		}
		else {
			this.memberObj = memberObj;
		}
	}
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	static EncapsulateTheData data = new EncapsulateTheData();
	public void test() {
		data.setitemsRecieved(-3);
		assertEquals(data.getitemsRecieved(), 0);
		data.setdegreesTurned(-5);
		assertEquals(data.getdegreesTurned(), (float)0.0);
		data.setnonmenclature("");
		assertEquals(data.getnomenclature(), " ");
		data.setmemberObj(1);
		assertEquals(data.getmemberObj(), 1);
	}
	public static void main(String[] args) {
		data.test();
		
	}
}
