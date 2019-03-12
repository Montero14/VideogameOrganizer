package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="gb")
public class GB extends Game
{
	public GB()
	{}
	
	public GB(int id, String title, boolean platinum, boolean handbook, boolean mine, boolean secondHand, double price)
	{
		super(id, title, platinum, handbook, mine, secondHand, price);
	}
	
	public GB(int id, String title, boolean platinum, boolean mine)
	{
		super(id, title, platinum, mine);
	}
}
