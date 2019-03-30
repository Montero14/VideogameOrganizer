package View;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import static javax.swing.GroupLayout.Alignment.LEADING;
import static javax.swing.LayoutStyle.ComponentPlacement.RELATED;




import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public  class InsertGame extends JDialog implements ActionListener
{
         
        private JLabel titleLabel, platinumLabel, handbookLabel, acquiredLabel, secondHandLabel, priceLabel;
        private JButton insertGameButton, abortButton;
        private JTextField titleGame, priceGame;
        private JCheckBox platinumGame, handbookGame, acquiredGame, secondHandGame;
        
        public InsertGame( Frame owner, String tit, boolean modal ) 
        {
            super( owner, tit, modal );

            //this.getContentPane().setLayout(new GroupLayout(this));
    		
            this.setPreferredSize(new Dimension(600, 400));
            
            Container pane = getContentPane();
            GroupLayout gl = new GroupLayout(pane);
            this.getContentPane().setLayout(gl);
            
            gl.setAutoCreateGaps(true);
            gl.setAutoCreateContainerGaps(true);
            
            addOptions(gl);
           
            pack();

            setTitle("Inserta juego");
            setLocationRelativeTo(null);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            this.setVisible(true);
    	
        }

        public void addOptions(GroupLayout gl)
        {
        	
        	//Game's title
        	this.titleLabel = new JLabel("Titulo:");
        	this.titleGame = new JTextField(15);
        	//
        	this.platinumLabel = new JLabel("Platinum:");
        	this.platinumGame = new JCheckBox("");
        	//
        	this.handbookLabel = new JLabel("Manual:");
        	this.handbookGame = new JCheckBox("");
        	//
        	this.acquiredLabel = new JLabel("Adquirido:");
        	this.acquiredGame = new JCheckBox("");
        	//
        	this.secondHandLabel = new JLabel("Segunda mano:");
        	this.secondHandGame = new JCheckBox("");
        	//
        	this.priceLabel = new JLabel("Precio:");
        	this.priceGame = new JTextField(15);
        	
        	
            //Insert button
        	this.insertGameButton = new JButton( "Insertar juego" );
        	this.insertGameButton.addActionListener( new ActionListener() {
        		public void actionPerformed( ActionEvent e ) {
        			System.out.println("Juego insertado");
        		}
        	} );
        	this.abortButton = new JButton("Cancelar");
        	this.abortButton.addActionListener(this);
        
             
             
            gl.setHorizontalGroup(
            		gl.createSequentialGroup()
            			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
            					.addComponent(this.titleLabel)
            					.addComponent(this.platinumLabel)
            					.addComponent(this.acquiredLabel)
            					.addComponent(this.secondHandLabel)
            					.addComponent(this.priceLabel)
            					.addComponent(this.insertGameButton))
            			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
            					.addComponent(this.titleGame)
            					.addComponent(this.platinumGame)
            					.addComponent(this.acquiredGame)
            					.addComponent(this.secondHandGame)
            					.addComponent(this.priceGame)
            					.addComponent(this.abortButton))
            			
            		);
            gl.setVerticalGroup(
            		gl.createSequentialGroup()
            			.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE) 
            					.addComponent(this.titleLabel)
            					.addComponent(this.titleGame))
            		    .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)  
            		           .addComponent(this.platinumLabel)
            		           .addComponent(this.platinumGame))
            		    .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)  
            		           .addComponent(this.acquiredLabel)
            		           .addComponent(this.acquiredGame))
            		    .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)  
            		           .addComponent(this.secondHandLabel)
            		           .addComponent(this.secondHandGame))
            		    .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)  
            		           .addComponent(this.priceLabel)
            		           .addComponent(this.priceGame))
            		    .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)  
            		           .addComponent(this.insertGameButton)
            		           .addComponent(this.abortButton))
            		);
            
            /*
             gl.setHorizontalGroup(gl.createSequentialGroup()
                     .addPreferredGap(RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(this.titulo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                     .addComponent(this.titleGame, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                     .addComponent(this.insertGameButton)
                     .addComponent(this.abortButton)
             );
             
             gl.setVerticalGroup(gl.createSequentialGroup()
                     .addPreferredGap(RELATED,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addGroup(gl.createParallelGroup()
                    		 .addComponent(this.titulo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                             .addComponent(this.titleGame, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                             .addComponent(this.insertGameButton)
                             .addComponent(this.abortButton))
             );
             gl.setAutoCreateContainerGaps(true);
             
          
             gl.linkSize(SwingConstants.HORIZONTAL, this.titulo, this.titleGame);
             gl.linkSize(SwingConstants.VERTICAL, this.insertGameButton, this.abortButton);
             */
        }

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			this.dispose();
		}

}
