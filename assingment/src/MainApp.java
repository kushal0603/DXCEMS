
public class MainApp {
	public static void main(String a[])
	{
		EmpDetails obj=new EmpDetails();
		obj.addEmployee("Kushal", 100, "Manager", 30000);
		obj.addEmployee("Prem", 102, "Manager", 40000);
		obj.addEmployee("Sreenath", 103, "Manager", 80000);
		obj.PrintDET();
	}

}
