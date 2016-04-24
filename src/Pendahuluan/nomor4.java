package Pendahuluan;
import javax.swing.*;
public class nomor4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= JOptionPane.showInputDialog("Silahkan Masukkan Nilai: ");
		int b= Integer.parseInt(a);
		int data[]= {4,6,4,2,8,4,2,11};
		JOptionPane.showMessageDialog(null, "index"+b+"menunjukan nilai"+data[b]);

	}

}
