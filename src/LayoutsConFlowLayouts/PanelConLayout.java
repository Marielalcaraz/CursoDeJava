package LayoutsConFlowLayouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

class PanelConLayout extends JPanel{
	
	
	public PanelConLayout() {
		//AQU� ESPECIFICAMOS EL TIPO DE LAYOUTS
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("amarillo"));
		add(new JButton("verde"));
		add(new JButton("rojo"));
	}

}
