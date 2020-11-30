package IFPB.POO;
class City{
	private String name;
	private String state;
	private long zipCode;
	
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String newName) {
  		this.name = newName;
  	
	}

	public String getState(){
		return this.state;
	}
	
	public void setState(String newState) {
  		this.state = newState;
  	}
       	public void setZipCode(long newZipCode) {
    		this.zipCode = newZipCode ;
 	 }

	public long getZipCode( ) {
  		return this.zipCode; 
	
	}

}
