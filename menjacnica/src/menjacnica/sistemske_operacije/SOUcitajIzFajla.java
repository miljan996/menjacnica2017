package menjacnica.sistemske_operacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import menjacnica.Valuta;

public class SOUcitajIzFajla {

	public static LinkedList<Valuta> izvrsi(String putanja) {

		try {
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(putanja)));
			LinkedList<Valuta> temp = (LinkedList<Valuta>) in.readObject();
			in.close();
			return temp;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
