
public class TelevisionStateBuildersDemo {

	public static void main(String[] args) {
		 
		State tvBuilderstate = new TVState();

		tvBuilderstate.build();
		
		tvBuilderstate.setTvBody();
		 
		tvBuilderstate.addElectricparts();
		 
		tvBuilderstate.addAudioSystem();
		 
		tvBuilderstate.DisplyMonitor();
		
		
	}

}
