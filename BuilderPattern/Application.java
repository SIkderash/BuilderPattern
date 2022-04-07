public class Application{
	public static void main(String args[]){

		Director director = new Director();

		PCBuilder officePCbBuilder = new OfficePCBuilder();
		director.setBuilder(officePCbBuilder);
		Pc officePC = director.makePC();
		officePC.showDetails();

		
		PCBuilder gamingPCbBuilder = new GamingPCBuilder();
		director.setBuilder(gamingPCbBuilder);
		Pc gamingPC = director.makePC();
		gamingPC.showDetails();
	}
                
}
