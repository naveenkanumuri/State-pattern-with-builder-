

public class TVState implements State{

	@Override
	public void build() {

System.out.println(" Building the televison");
		
	}

	@Override
	public void setTvBody() {
		System.out.println(" Set the body parts to  televison  ");
		
	}

	@Override
	public void addElectricparts() {
		System.out.println(" Add electricitems to the Television");
		
	}

	@Override
	public void addAudioSystem() {
		System.out.println(" Set the Audio speakers to the Television  ");
		
	}

	@Override
	public void DisplyMonitor() {
		System.out.println("Set the Disply Monitors to the Television");
		
	}

}
