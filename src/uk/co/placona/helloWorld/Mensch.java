package uk.co.placona.helloWorld;

public class Mensch {

		private String Name;
		private int Alter;
		
		public String vorstellen (String Name) {
			String zuSagen = "";
			zuSagen = "Ich bin " + Name;
			return zuSagen;
		}
		
		public double addiere (double z1, double z2) {
			return z1 + z2;
		}
		
		public int alterBerechnen(int geburtsjahr) {
			this.Alter = 2018-geburtsjahr;
			return Alter;
		}
	
}
