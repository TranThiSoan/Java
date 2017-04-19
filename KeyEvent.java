import java.awt.*;
import java.awt.event.*;
public class KeyEvent extends Frame implements KeyListener {
	Label lblA;
	TextField txtA;
	TextArea txtB;

	public KeyEvent() {
		setTitle("KeyEvent Demo");
		setSize(500, 300);
		// Dang ky bo lang nghe su kien
		addKeyListener(this);
		
		setLayout(new FlowLayout());
		
		 lblA = new Label ("Enter Text:");
		this.add(lblA);
		txtA = new TextField();
		this.add(txtA);
		txtB = new TextArea();
		this.add(txtB);
		
		setVisible(true);
	}

	// Trien khai giao dien
    // Ghi de cac phuong thuc  
	 public void windowOpened(WindowEvent arg0)  {   }
	 public void windowClosing(WindowEvent arg0)  { 
		 System.exit(0);
	 }
	 public void keyPressed(KeyEvent e) {}
	 public void keyReleased(KeyEvent e) {}
	 public void keyTyped(KeyEvent e) {
			txtB.append("You have typed " +  "\n");
			
		}
		 
	 
	 
	// Goi chuong trinh
	 public static void main(String[] args) {
		new KeyEvent();
	}
	

}
