package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="wii")
public class Wii extends Game
{

	public Wii()
	{}
	
	public Wii(int id, String title, boolean platinum, boolean handbook, boolean mine, boolean secondHand, double price)
	{
		super(id, title, platinum, handbook, mine, secondHand, price);
	}
	
	public Wii(int id, String title, boolean platinum, boolean mine)
	{
		super(id, title, platinum, mine);
	}
}
