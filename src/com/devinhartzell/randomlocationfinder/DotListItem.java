package com.devinhartzell.randomlocationfinder;

import java.awt.Color;

import javax.swing.JLabel;

public class DotListItem extends JLabel {

	private static final long serialVersionUID = -7223185639056387461L;
	public int index;
	public Dot d;
	
	public DotListItem(int index, Location location) {
		this.index = index;
		setText(String.format("%s. (%s, %s)", index, location.x, location.y));
		setBounds(2, ((index-1)*15)+2, 196, 15);
		
		setBackground(Color.WHITE);
		setOpaque(true);
		
		d = new Dot(location);
	
		DotList.getDotList().add(this);
	}
	
	public Dot getDot() {
		return d;
	}
}


