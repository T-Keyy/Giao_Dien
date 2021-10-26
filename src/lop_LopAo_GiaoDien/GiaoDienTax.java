package lop_LopAo_GiaoDien;

	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;

	public class GiaoDienTax extends JFrame  {

		private JPanel contentPane;
		
		public interface payTax {
			public double calcTax(double income,int start_time,int end_time);
		}
		
		public static void main(String[] args) {
			
		}

		/**
		 * Create the frame.
		 */
		public GiaoDienTax() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			setContentPane(contentPane);
		}

	}
