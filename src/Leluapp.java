
public class Leluapp {

	public static void main(String[] args) {

		Lelu lelu = new Lelu("Auto", 30);
		//lelu.tulostaTiedot();

		Vieteriauto vieteriauto = new Vieteriauto("Iso vieteriauto", 50);
		vieteriauto.kiihdyta();
		vieteriauto.kiihdyta();
		vieteriauto.kiihdyta();
		vieteriauto.tulostaTiedot();

		Paloauto paloauto = new Paloauto("Punainen paloauto", 40);
		paloauto.kiihdyta();
		paloauto.tulostaTiedot();
	}

} // MAIN LOPPU

class Lelu {
	public String nimi;
	public int paino;

	public Lelu() {
		nimi = "";
		paino = 0;
	}

	public Lelu(String lelunNimi, int lelunPaino) {
		nimi = lelunNimi;
		paino = lelunPaino;
	}

	public void tulostaTiedot() {
		System.out.println("Lelun nimi: " + nimi + ", Lelun paino: " + paino);
	}
}

class Vieteriauto extends Lelu {
	int nopeus;

	public Vieteriauto() {
		nopeus = 0;
	}

	public Vieteriauto(String lelunNimi, int lelunPaino) {
		nimi = lelunNimi;
		paino = lelunPaino;
	}

	public void kiihdyta() {
		nopeus++;
	}

	@Override
	public void tulostaTiedot() {
		System.out.println("Lelun nimi: " + nimi);
		System.out.println("Lelun paino: " + paino);
		System.out.println("Lelun nopeus: " + nopeus);
	}

}

class Paloauto extends Lelu

{
	int nopeus;

	public Paloauto() {
		nopeus = 0;
	}

	public Paloauto(String lelunNimi, int lelunPaino) {
		nimi = lelunNimi;
		paino = lelunPaino;
	}

	public void kiihdyta() {
		System.out.println("Paloauto kiihdytt‰‰");
		nopeus++;
	}

	@Override
	public void tulostaTiedot() {
		System.out.println("Lelun nimi: " + nimi);
		System.out.println("Lelun paino: " + paino);
		System.out.println("Lelun nopeus: " + nopeus);
	}

}
