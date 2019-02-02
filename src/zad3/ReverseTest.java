/**
 *
 *  @author Trembowska Katarzyna S18233
 *
 */

package zad3;


public class ReverseTest {

  public static void main(String[] args) {
  
        Reversible[] revers = new Reversible[] {
            new ReversibleString("Kot"),
            new ReversibleDouble(2),
            new ReversibleDouble(3),
            new ReversibleString("Pies"),
            new ReversibleString("Ala ma kota i psa"),
            new ReversibleDouble(10),
        };

        System.out.println("Normalne:");
        for (Reversible r : revers) {
          System.out.println(r);
        }

        for (Reversible r : revers) {
          r.reverse();
        }

        System.out.println("Odwrócone:");
        for (Reversible r : revers) {
          System.out.println(r);
        }

        System.out.println("Przywrócone i zmienione:");
        for (Reversible r : revers) {
        	r.reverse();	//przywracam znowu wartości normalne
      		if (r instanceof ReversibleString) {	//jeśli r jest klasy ReversibleString dodaję napis "Tekst"
      			System.out.println("Tekst " + r);
      		} else {	//w innym wypadku, czyli r jest klasy ReversibleDouble dodaje 10 do wartości
      			System.out.println(Double.parseDouble(r.toString()) + 10);
      		}
        }
      }
    }
