package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="nds")
public class NDS extends Game
{

	public NDS()
	{}
	
	public NDS(int id, String title, boolean platinum, boolean handbook, boolean mine, boolean secondHand, double price)
	{
		super(id, title, platinum, handbook, mine, secondHand, price);
	}
	
	public NDS(int id, String title, boolean platinum, boolean mine)
	{
		super(id, title, platinum, mine);
	}
}
