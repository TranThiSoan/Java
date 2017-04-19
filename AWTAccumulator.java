import java.awt.*;
import java.awt.event.*;
public class AWTAccumulator extends Frame implements WindowListener {
	Label lblA, lblB;
	TextField txtA, txtB;


	public AWTAccumulator() {
		setTitle("AWT Accumulator");
		setSize(200, 200);
		// Dang ky bo lang nghe su kien
		addWindowListener(this);
		
		setLayout(new FlowLayout());
		
		 lblA = new Label ("Enter an integer");
		this.add(lblA);
		txtA = new TextField();
		this.add(txtA);

		 lblB = new Label ("Accumolated sum is:");
		this.add(lblB);
		txtB = new TextField();
		this.add(txtB);
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
		new AWTAccumulator();
	}
	

}
