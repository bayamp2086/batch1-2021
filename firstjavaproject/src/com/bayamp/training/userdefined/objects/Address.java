package com.bayamp.training.userdefined.objects;

public class Address {

	private String strBuildingNumber;
	private String streetName;
	private String city;
	private String state;
	private int zipCode;


  public Address(String buildingNumber, String strtName, String city,String state, int zip){
		this.strBuildingNumber = buildingNumber;
		setAttributes(strtName,city,state,zip);
 }

//purpose is reusability of assigning the data member values
private void setAttributes(String streetName,String city,String state, int zip) {
	this.streetName = streetName;
	this.city = city;
	this.state = state;
	this.zipCode = zip;
}


}
