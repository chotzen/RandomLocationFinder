package com.devinhartzell.randomlocationfinder;

import java.awt.Color;

import javax.swing.JLabel;

public class DotListItem {

	private static final long serialVersionUID = -7223185639056387461L;
	public int index;
	public Dot d;
	public Location location;
	
	public DotListItem(int index, Location location) {
		this.index = index;
		this.location = location;
		//setText(String.format("%s. (%s, %s)", index, location.x, location.y));
		//setBounds(2, ((index-1)*15)+2, 196, 15);
		
		//setBackground(Color.WHITE);
		//setOpaque(true);
		
		d = new Dot(location, RandomLocationFinder.getPanel());
	
		//DotList.getDotList().add(this);
	}
	
	public Dot getDot() {
		return d;
	}
	
	public String toString() {
		return String.format("%s. (%s, %s)", index, location.x, location.y);
	}
}


