package Main;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class crossProduct extends JFrame{
	
	public crossProduct(){
		
		super("Cross Product Calculator");
		setLookAndFeel();
		setSize(500,125);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo= new FlowLayout();
		setLayout(flo);
		JTextField uxField=new JTextField("Ux", 5);
		JTextField uyField=new JTextField("Uy", 5);
		JTextField uzField=new JTextField("Uz", 5);
		JTextField vxField=new JTextField("Vx", 5);
		JTextField vyField=new JTextField("Vy", 5);
		JTextField vzField=new JTextField("Vz", 5);
		JLabel x=new JLabel("X");
		JLabel ans=new JLabel("K= ");
		JButton calc= new JButton("Calculate");
		calc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				try{
					String uxStr= uxField.getText();
					double ux=Double.parseDouble(uxStr);
					String uyStr= uyField.getText();
					double uy=Double.parseDouble(uyStr);
					String uzStr= uzField.getText();
					double uz=Double.parseDouble(uzStr);
					String vxStr= vxField.getText();
					double vx=Double.parseDouble(vxStr);
					String vyStr= vyField.getText();
					double vy=Double.parseDouble(vyStr);
					String vzStr= vzField.getText();
					double vz=Double.parseDouble(vzStr);
				
					double wx=uy*vz-uz*vy;
					double wy=ux*vz-uz*vx;
					double wz=ux*vy-uy*vx;
				
					double k=wx+wy+wz;
				
					ans.setText("K= "+k);
				}catch(NumberFormatException e){
					ans.setText("K=NaN");
					JOptionPane.showMessageDialog(null,"Please Enter Numbers");
				}
			   }
		});
		add(uxField);
		add(uyField);
		add(uzField);
		add(x);
		add(vxField);
		add(vyField);
		add(vzField);
		add(calc);
		add(ans);
		setVisible(true);
	}
	
	private void setLookAndFeel(){	
		try{
			UIManager.setLookAndFeel(
				"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
			);
		}catch(Exception exc){
			
		}
		
	}
	public static void main(String[] args) {
		crossProduct frame=new crossProduct();
	
	}

}
