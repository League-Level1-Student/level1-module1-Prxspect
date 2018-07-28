
public class BackpackRunner {
public static void main(String[] args) {
	Backpack mybag = new Backpack ();
	Ruler ruler = new Ruler ();
	mybag.putInBackpack(ruler);
	Pencil pencil = new Pencil ();
	mybag.putInBackpack(pencil);
	Textbook textbook = new Textbook ();
	mybag.putInBackpack(textbook);
	mybag.goToSchool();
	
}
}
