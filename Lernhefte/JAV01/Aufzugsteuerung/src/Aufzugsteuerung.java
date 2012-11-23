
public class Aufzugsteuerung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Einfache Aufzugsteuerung Ÿber switch
int etage =0; //int-Variable zur Festlegung des Stockwerks
String halt = "Fahrstuhl haelt: ";
switch(etage) {
case 0: halt+="Erdgeschoss";
break;
case 1: halt+="1.Stock";
break;
case 2: halt+="2.Stock";
break;
case 3: halt+="Dachgeschoss";
break;
default: halt="Eingabefehler";}
System.out.println(halt);
}}
