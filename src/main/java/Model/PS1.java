package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ps1")
public class PS1 extends Game
{

	public PS1()
	{}
	
	public PS1(int id, String title, boolean platinum, boolean handbook, boolean mine, boolean secondHand, double price)
	{
		super(id, title, platinum, handbook, mine, secondHand, price);
	}
	
	public PS1(int id, String title, boolean platinum, boolean mine)
	{
		super(id, title, platinum, mine);
	}
}
