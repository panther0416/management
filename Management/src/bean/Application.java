package bean;

public class Application implements Bean{
	private int id;
    private String name;
    private String version;
    private String type;
    private String project;
    private String bussinessCategory;
    private String bussinessType;
    private String runningMode;
    private String environment;
    private String loadMode;
    private String location;
    
	public Application() {}
    public Application(int id, String name, String version, String type, String project, String bussinessCategory,
    		String bussinessType, String runningMode, String environment, String loadMode, String location) {
    	this.id = id;
    	this.name = name;
    	this.version = version;
    	this.type = type;
    	this.project = project;
    	this.bussinessCategory = bussinessCategory;
    	this.bussinessType = bussinessType;
    	this.runningMode = runningMode;
    	this.environment = environment;
    	this.loadMode = loadMode;
    	this.location = location;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getBussinessCategory() {
		return bussinessCategory;
	}
	public void setBussinessCategory(String bussinessCategory) {
		this.bussinessCategory = bussinessCategory;
	}
	public String getBussinessType() {
		return bussinessType;
	}
	public void setBussinessType(String bussinessType) {
		this.bussinessType = bussinessType;
	}
	public String getRunningMode() {
		return runningMode;
	}
	public void setRunningMode(String runningMode) {
		this.runningMode = runningMode;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getLoadMode() {
		return loadMode;
	}
	public void setLoadMode(String loadMode) {
		this.loadMode = loadMode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
    
}
