package zad2;

public class ChoryNaNoge extends Pacjent
{
	private String name;
	
	public ChoryNaNoge()
	{
		this("bez nazwiska");
	}
	public ChoryNaNoge(String name)
	{
		this.name=name;
	}
	
	@Override
	public String choroba()
	{
		return "noga";
	}
	@Override
	public String leczenie()
	{
		return "gips";
	}
	@Override
	public String nazwisko()
	{
		return name;
	}	

}
