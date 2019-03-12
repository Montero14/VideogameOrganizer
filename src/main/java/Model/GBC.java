package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="gbc")
public class GBC extends Game
{
	public GBC()
	{}
	
	public GBC(int id, String title, boolean platinum, boolean handbook, boolean mine, boolean secondHand, double price)
	{
		super(id, title, platinum, handbook, mine, secondHand, price);
	}
	
	public GBC(int id, String title, boolean platinum, boolean mine)
	{
		super(id, title, platinum, mine);
	}
}
