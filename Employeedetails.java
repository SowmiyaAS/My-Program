package week1.assignment;

public class Employeedetails {
	public void printEmployeeName(String empname,int empId)
	{
		System.out.println(empname);
		System.out.println(empId);
	
	}
	public void getEmployeeAddress(String empAddress)
	{
		System.out.println(empAddress);
	}
	public void employeeSalary(double empsalary)
	{
		System.out.println(empsalary);
	}
	
	public void employeeMobilenumber(long mobNumber)
	{
		System.out.println(mobNumber);
	}
	
	
	public static void main(String[] args) {
		Employeedetails  emp=new Employeedetails();
		emp.printEmployeeName("sowmiya",6534);
		emp.getEmployeeAddress("chennai");
		emp.employeeSalary(234534.65);
		emp.employeeMobilenumber(23456788765345l);

	}

}
