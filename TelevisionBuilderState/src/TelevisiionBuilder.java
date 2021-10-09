
public abstract class TelevisiionBuilder {

	

	
	String name;
	
	TelevisionTypes tvTypes;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TelevisionTypes getTvTypes() {
		return tvTypes;
	}

	public void setTvTypes(TelevisionTypes tvTypes) {
		this.tvTypes = tvTypes;
	}
	
	public abstract void change();
	public abstract void addTvTypes();
	


	
	
	
}
