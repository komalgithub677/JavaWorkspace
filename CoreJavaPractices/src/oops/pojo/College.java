package oops.pojo;

public class College {
       int clgId;
       String clgName;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int clgId, String clgName) {
		super();
		this.clgId = clgId;
		this.clgName = clgName;
	}
	public int getClgId() {
		return clgId;
	}
	public void setClgId(int clgId) {
		this.clgId = clgId;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	@Override
	public String toString() {
		return "College [clgId=" + clgId + ", clgName=" + clgName + "]";
	}
       
}
