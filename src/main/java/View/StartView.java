package View;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

import Controller.Controller;


public class StartView extends JFrame
{
	private JButton insertGame;
	private JButton listGames;
	private Container panel;
	//private boolean running;
	
	private Controller controller;
	
	public StartView (Frame owner, boolean modal, Controller cont)
	{
		super("Pantalla de inicio");
		this.controller = cont;
		//this.running = true;
		//setUndecorated(true);
		//getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		
		this.startView();
	}
	/*
	public void dispose() {
	    this.running = false;
	    super.dispose();
	}
	*/
	public void startView() 
	{
		this.setDefaultCloseOperation( EXIT_ON_CLOSE );
		/*
		this.addWindowListener(new WindowAdapter()
	    {
			
		    public void windowClosing(WindowEvent e)
		    {
		    	
		    }
	    });
	    */
		
		this.setTitle("Organizador de juegos");
		this.setSize(new Dimension(450, 300));
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon(getClass().getResource("/images/gamepad.png")).getImage());
		this.setResizable(true);
		this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		
		panel = this.getContentPane();
		panel.setLayout(new GridBagLayout());
		panel.setBackground(Color.decode("#CCCCCC"));
		
		GridBagConstraints c = new GridBagConstraints();
		
		
		//Boton insertar juego
		insertGame = new JButton("Insertar juego");
		insertGame.setToolTipText("");
		insertGame.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				JDialog dialog = new InsertGame( null, "Insertar Juego", true );
				dialog.setLocationRelativeTo( (JButton)arg0.getSource() );
				//dialog.pack();
                //dialog.setVisible( true );
			}
		});
		c.gridx = 0;
		c.gridy = 5;
		c.gridheight = 1;
		c.gridwidth = 1;
		c.insets = new Insets(5, 100, 10, 2);
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.NONE;
		insertGame.setPreferredSize(new Dimension(115,25));
		panel.add(insertGame,c);
		
		
		//Boton ver lista de juegos
		listGames = new JButton("Ver juegos");
		listGames.setToolTipText("");
		listGames.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
		c.gridx = 1;
		c.gridy = 5;
		c.gridheight = 1;
		c.gridwidth = 1;
		c.insets = new Insets(5, 100, 10, 2);
		c.anchor = GridBagConstraints.EAST;
		c.fill = GridBagConstraints.NONE;
		listGames.setPreferredSize(new Dimension(95,25));
		panel.add(listGames,c);
		
		
		
		
		
		
		this.setVisible(true);
	}
	
	
	/*
	public boolean isRunning() {
		return this.running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
	*/
}
