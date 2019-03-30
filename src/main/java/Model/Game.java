package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;



@Entity
@Table(name="games")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Game 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String title;
	@Column
	private boolean platinum;
	@Column
	private boolean handbook;
	@Column
	private boolean acquired;
	@Column
	private boolean secondHand;
	@Column
	private double price;
	
	
	
	//Constructors methods
	public Game ()
	{}
	
	public Game(int id, String title, boolean platinum, boolean handbook, boolean acquired, boolean secondHand, double price)
	{
		this.id = id;
		this.title = title;
		this.platinum = platinum;
		this.handbook = handbook;
		this.acquired = acquired;
		this.secondHand = secondHand;
		this.price = price;
	}
	
	public Game(int id, String title, boolean platinum, boolean acquired)
	{
		this.id = id;
		this.title = title;
		this.platinum = platinum;
		this.acquired = acquired;
		this.secondHand = false;
		this.price = 0;
	}

	
	//Getters and Setters methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isPlatinum() {
		return platinum;
	}

	public void setPlatinum(boolean platinum) {
		this.platinum = platinum;
	}

	public boolean isAcquired() {
		return acquired;
	}

	public void setAcquired(boolean acquired) {
		this.acquired = acquired;
	}

	public boolean isSecondHand() {
		return secondHand;
	}

	public void setSecondHand(boolean secondHand) {
		this.secondHand = secondHand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isHandbook() {
		return handbook;
	}

	public void setHandbook(boolean handbook) {
		this.handbook = handbook;
	}

	
}
