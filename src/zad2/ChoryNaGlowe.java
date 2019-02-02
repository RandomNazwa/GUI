package zad2;

public class ChoryNaGlowe extends Pacjent
{
	private String name;
	
	public ChoryNaGlowe()
	{
		this("bez nazwiska");
	}
	public ChoryNaGlowe(String name)
	{
		this.name=name;
	}
	
	@Override
	public String choroba()
	{
		return "głowa";
	}
	
	@Override
	public String leczenie()
	{
		return "aspiryna";
	}
	
	@Override
	public String nazwisko()
	{
		return name;
	}
	
}
