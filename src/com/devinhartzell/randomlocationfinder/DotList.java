package com.devinhartzell.randomlocationfinder;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class DotList extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8567624098263229648L;
	public static ArrayList<DotListItem> items = new ArrayList<DotListItem>();
	
	public DotList() {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setSize(200, 550);
		setBackground(Color.WHITE);
		setLayout(null);
		
		//DotListItem dotListItem = new DotListItem(1, new Location(50, 30));
		//dotListItem.setBounds(68, 5, 64, 16);
		//add(new DotListItem(1, new Location(5, 30)));
		//add(new DotListItem(2, new Location(300, 50)));	
	}

	public void addItem(DotListItem item) {
		items.add(item.index, item);
	}
	
	public void removeItem(int index) {
		
	}
	
	public static ArrayList<DotListItem> getDotList() {
		return items;
	}
	
	
}
