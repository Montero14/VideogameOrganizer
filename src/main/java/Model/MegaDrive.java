package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="megadrive")
public class MegaDrive extends Game
{
	public MegaDrive()
	{}
	
	public MegaDrive(int id, String title, boolean platinum, boolean handbook, boolean mine, boolean secondHand, double price)
	{
		super(id, title, platinum, handbook, mine, secondHand, price);
	}
	
	public MegaDrive(int id, String title, boolean platinum, boolean mine)
	{
		super(id, title, platinum, mine);
	}
}
