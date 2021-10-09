
public class LEDTV extends TelevisiionBuilder{
	

	
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

	@Override
	public void change() {
		 System.out.println("Change the tv monitors ");
		
	}

	@Override
	public void addTvTypes() {
		 System.out.println("Display the tv types ");
	}
	
	
}
