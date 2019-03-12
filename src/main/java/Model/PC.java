package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pc")
public class PC extends Game
{

	public PC()
	{}
	
	public PC(int id, String title, boolean platinum, boolean handbook, boolean mine, boolean secondHand, double price)
	{
		super(id, title, platinum, handbook, mine, secondHand, price);
	}
	
	public PC(int id, String title, boolean platinum, boolean mine)
	{
		super(id, title, platinum, mine);
	}
}
