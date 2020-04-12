
public class Department {
	private String deptName;
	private String manager;
	
	Department(String deptName, String manager) {
    	this.deptName = deptName;
    	this.manager = manager;
    }
	
    String getManager() {
    	return manager;
    }
    
    String getDeptName() {
    	return deptName;
    }
    
    public void setManager(String manager) {
    	this.manager = manager;
    }
    
    public String dept() {
    	return deptName + manager;
    }
}