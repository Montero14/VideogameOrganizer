package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ps2")
public class PS2  extends Game
{

	public PS2()
	{}
	
	public PS2(int id, String title, boolean platinum, boolean handbook, boolean mine, boolean secondHand, double price)
	{
		super(id, title, platinum, handbook, mine, secondHand, price);
	}
	
	public PS2(int id, String title, boolean platinum, boolean mine)
	{
		super(id, title, platinum, mine);
	}
}
