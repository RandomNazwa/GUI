package zad3;

public class ReversibleDouble implements Reversible {
	 
    private double liczba;
 
    public ReversibleDouble(double liczba) {
        this.liczba=liczba;
    }
 
    @Override
    public void reverse () {
    	liczba=1/liczba;		//odwraca liczbę
    }
      
    public String toString() {
        return  Double.toString(liczba);		//zwraca aktualną wartość zmiennej liczba
    }
}
