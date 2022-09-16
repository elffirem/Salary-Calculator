package salaryCalculater;

public class Employee {
	String name;
	int salary;
	int workHours;
	int hireYear;
	Employee(String name,int salary,int workHours,int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear =hireYear;
	}
	
	public int tax() {
		int tax=0;
		if(this.salary>1000) {
			tax=salary*3/100;
		}
		return tax;
	}
	
	public int bonus() {
		int bonus=0;
		if(this.workHours>40) {
			bonus=(workHours-40)*30*4;
		}
		return bonus;
	}
	
	public int raiseSalary() {
		int workingYears=(2021-this.hireYear);
		int raise=0;
		if(workingYears<10) {
			raise=this.salary*5/100;
		}else if(workingYears>10 && workingYears<20) {
			raise=this.salary*10/100;
		}else if(workingYears>19 ) {
			raise=this.salary*15/100;
		}
		return raise;
	}
	
	public void employeeInfo() {
		this.raiseSalary();
		System.out.println(this.name+" adli calisan, haftada "+this.workHours+" saat calismakta olup "+(2021-this.hireYear)+" yillik bir calisandir.");
		System.out.println(this.salary+ "TL maas alir.");
	}
	
	public static void calculateSalary(Employee e) {//i did the calculation here like that to make it easier to calculate for myself
		e.salary=e.salary+e.raiseSalary()+e.bonus()-e.tax();
	}

	public static void main(String[] args) {
		Employee e1=new Employee("Ali",1000,42,1991);	
		calculateSalary(e1);	
		e1.employeeInfo();
				
	}

}
