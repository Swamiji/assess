package MyPackage;

public class Employee {
	private String name;
	private String empid;
	private double sallery;
	private int phone_no;
	private String emailaddress;
	Employee()
	{
		
	}
	Employee(String name, String empid,double sallery,int phone_no,String emailaddress){
		this.name=name;
		this.empid=empid;
		this.sallery=sallery;
		this.phone_no=phone_no;
		this.emailaddress=emailaddress;
	}
	public void Emplo(){
		System.out.println("Employee id is:" +empid+" and Sallery is:" +sallery);
	}
    public void setname(String newname){
    	name=newname;
    }
	public String setname(){
		return name;
	}
	public void setEmpid(String newempid){
    empid=newempid;
}
public String getEmpid(){
	return empid;
}
public void setSallery(double newsallery){
	sallery=newsallery;
}
public double getSallery(){
	return sallery;
}
public void setPhone_no(int newphone_no){
	phone_no=newphone_no;
}
public int getPhone_no(){
	return phone_no;
}
public void setEmailAddress(String newemailaddress){
	emailaddress=newemailaddress;
}
public String getEmailAddress(){
	return emailaddress;
}
	public static void main(String[] args) {



	}

}
