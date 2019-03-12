package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="psp")
public class PSP extends Game
{

	public PSP()
	{}
	
	public PSP(int id, String title, boolean platinum, boolean handbook, boolean mine, boolean secondHand, double price)
	{
		super(id, title, platinum, handbook, mine, secondHand, price);
	}
	
	public PSP(int id, String title, boolean platinum, boolean mine)
	{
		super(id, title, platinum, mine);
	}
}
