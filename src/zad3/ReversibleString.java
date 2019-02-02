package zad3;

public class ReversibleString implements Reversible {

	private String text;
	
	
	public ReversibleString(String text) {
	    this.text = text;
	}
	
	@Override
	public void reverse() {
		String reverse = new StringBuffer(text).reverse().toString();		//funkcja odwracająca napis
		text = reverse;
	}
	
    public String toString() {
        return  text;	//zwraca zawartość zmiennej text
    }
}
