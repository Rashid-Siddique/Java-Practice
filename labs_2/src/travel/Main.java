package travel;

public class Main {
	
	public static void main(String[] args) {
		
		// Part (i)
        HillStations h;

        h = new Manali();
        h.location();
        h.famousFor();

        h = new Mussoorie();
        h.location();
        h.famousFor();

        h = new Gulmarg();
        h.location();
        h.famousFor();

        System.out.println("-------------------------------------------");
        
        
        // Part(ii)
		Manali manali = new Manali();
		manali.location();
		manali.famousFor();
		
		Mussoorie mussoorie = new Mussoorie();
		mussoorie.location();
		mussoorie.famousFor();
		
		Gulmarg gulmarg = new Gulmarg();
		gulmarg.location();
		gulmarg.famousFor();
	}
	
	

}
