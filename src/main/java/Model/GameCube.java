package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="gamecube")
public class GameCube extends Game
{
	public GameCube()
	{}
	
	public GameCube(int id, String title, boolean platinum, boolean handbook, boolean mine, boolean secondHand, double price)
	{
		super(id, title, platinum, handbook, mine, secondHand, price);
	}
	
	public GameCube(int id, String title, boolean platinum, boolean mine)
	{
		super(id, title, platinum, mine);
	}
}
