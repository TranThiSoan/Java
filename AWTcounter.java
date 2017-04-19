import java.awt.*;
import java.awt.event.*;
public class AWTcounter extends Frame implements WindowListener {
	Label lblA;
	TextField txtA;
	Button btnOK;

	public AWTcounter() {
		setTitle("AWT Counter");
		setSize(300, 200);
		// Dang ky bo lang nghe su kien
		addWindowListener(this);
		
		setLayout(new FlowLayout());
		
		 lblA = new Label ("Counter");
		this.add(lblA);
		txtA = new TextField();
		this.add(txtA);
		Button btnOK  = new Button("Count");
		
		btnOK.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		} );
		add(btnOK); // Gan vao Frame nay
		
		setVisible(true);
	}

	// Trien khai giao dien
    // Ghi de cac phuong thuc  
	 public void windowOpened(WindowEvent arg0)  {   }
	 public void windowClosing(WindowEvent arg0)  { 
		 System.exit(0);
	 }
	 public void windowClosed(WindowEvent arg0)  {	 }
	 public void windowIconified(WindowEvent arg0)  {}
	 public void windowDeiconified(WindowEvent arg0) {	 }
	 public void windowActivated(WindowEvent arg0) {};
	 public void windowDeactivated(WindowEvent arg0) {};
	 
	 class BoLangNgheOK implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
		 
	 }
	  
	 
	 // Goi chuong trinh
	 public static void main(String[] args) {
		new AWTcounter();
	}
	

}
