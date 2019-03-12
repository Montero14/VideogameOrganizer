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
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
  /*
public class StartViewJF extends JFrame {
     
    private JDialog dialog = new TheDialog( this, "TheDialog", true );
     
    public StartViewJF() {
        super( "StartViewJF" );
        JButton b = new JButton( "Show Dialog" );
        b.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent e ) {
                dialog.setLocationRelativeTo( (JButton)e.getSource() );
                dialog.pack();
                dialog.setVisible( true );
            }
        } );
        JPanel p = new JPanel();
        p.add( b );
        getContentPane().add( p );
    }
     
    public static void main( String[] args ) {
        JFrame f = new StartViewJF();
        f.setDefaultCloseOperation( EXIT_ON_CLOSE );
        f.setSize( 300, 300 );
        f.setLocationRelativeTo( null );
        f.setVisible( true );
    }
     */
public  class InsertGame extends JDialog implements ActionListener
{
         
        private JLabel titulo;
        private JButton insertGameButton, abortButton;
        private JTextField titleGame, tf2;
        
        public InsertGame( Frame owner, String tit, boolean modal ) 
        {
            super( owner, tit, modal );

            //this.getContentPane().setLayout(new GroupLayout(this));
    		
            this.setPreferredSize(new Dimension(400, 300));
            
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
        	 this.titulo = new JLabel("Titulo:");
             this.titleGame = new JTextField(15);
             
             //Insert button
             this.insertGameButton = new JButton( "Insertar juego" );
             this.insertGameButton.addActionListener( new ActionListener() {
                 public void actionPerformed( ActionEvent e ) {
                 	System.out.println("Juego insertado");
                 }
             } );
             this.abortButton = new JButton("Cancelar");
             this.abortButton.addActionListener(this);
            // this.add(abortButton);
             //this.abortButton.addActionListener( new ActionListener() {
             //    public void actionPerformed( ActionEvent e ) {
             //   	
             //    }
             //} );
            
             gl.setHorizontalGroup(gl.createSequentialGroup()
                     .addPreferredGap(RELATED,
                             GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(this.titulo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                 	        GroupLayout.PREFERRED_SIZE)
                     .addComponent(this.titleGame, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                    	        GroupLayout.PREFERRED_SIZE)
                     .addComponent(this.insertGameButton)
                     .addComponent(this.abortButton)
             );
             
             gl.setVerticalGroup(gl.createSequentialGroup()
                     .addPreferredGap(RELATED,
                             GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addGroup(gl.createParallelGroup()
                    		 .addComponent(this.titulo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                         	        GroupLayout.PREFERRED_SIZE)
                             .addComponent(this.titleGame, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                            	        GroupLayout.PREFERRED_SIZE)
                             .addComponent(this.insertGameButton)
                             .addComponent(this.abortButton))
             );
             gl.setAutoCreateContainerGaps(true);
             
          
             gl.linkSize(SwingConstants.HORIZONTAL, this.titulo, this.titleGame);
             gl.linkSize(SwingConstants.HORIZONTAL, this.insertGameButton, this.abortButton);
             
        }

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			this.dispose();
		}

}
