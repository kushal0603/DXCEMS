
public class Employee {
	private String ename;
	private int eid;
	private String edsg;
	private double basic;
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", edsg=" + edsg + ", basic=" + basic + "]";
	}
	public Employee(String ename, int eid, String edsg, double basic) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.edsg = edsg;
		this.basic = basic;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEdsg() {
		return edsg;
	}
	public void setEdsg(String edsg) {
		this.edsg = edsg;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	

}
