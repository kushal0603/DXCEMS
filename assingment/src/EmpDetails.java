import java.util.*;
public class EmpDetails 
{
	ArrayList<Employee> ar= new ArrayList<>();
	public void addEmployee(String ename, int eid,String edsg,double basic)
	{
		ar.add(new Employee(ename,eid,edsg,basic));
	}
	public void PrintDET()
	{
		for(Employee obj : ar)
		{
			System.out.println(obj.getEname()+" "+obj.getEid()+" "+obj.getEdsg()+" "+obj.getBasic()+" HRA:"+CalculateHRA(obj.getBasic(),obj.getEdsg()));
		}
	}
	public double CalculateHRA(double basic, String dsg)
	{
		double HRA;
		if(dsg=="Manager");
		{
			HRA = 0.1*basic;
		}
		if(dsg=="Officer");
		{
			HRA = 0.12*basic;
		}
		if(dsg=="Clerk");
		{
			HRA = 0.05*basic;
		}
		return HRA;
	}

}
