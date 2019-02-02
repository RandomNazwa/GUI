package zad2;

public class ChoryNaDyspepsje extends Pacjent
{
	private String name;
	
	public ChoryNaDyspepsje()
	{
		this("bez nazwiska");
	}
	public ChoryNaDyspepsje(String name)
	{
		this.name=name;
	}
	
	@Override
	public String choroba()
	{
		return "dyspepsja";
	}
	
	@Override
	public String leczenie()
	{
		return "węgiel";
	}
	
	@Override
	public String nazwisko()
	{
		return name;
	}

}
