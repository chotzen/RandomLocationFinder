package com.devinhartzell.randomlocationfinder;

import javax.swing.JFrame;
import javax.swing.JList;

import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.util.Random;

public class RandomLocationFinder extends JFrame {
	
	private static final long serialVersionUID = 3828053717800670874L;

	public RandomLocationFinder() {
		super("Random Location Finder");
		setSize(1000,700);
		getContentPane().setLayout(null);
		
		final ImagePanel panel = new ImagePanel();
		getContentPane().add(panel);
		
		final DotList list = new DotList();
		list.setBounds(673, 106, 201, 555);
		getContentPane().add(list);
		
		//list.add
		
		JButton btnAddLocation = new JButton("Add Location");
		btnAddLocation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Random r = new Random();
				int x = r.nextInt(630) + 10;
				int y = r.nextInt(630) + 10;
				list.addItem(new DotListItem(DotList.getDotList().size()+1, new Location(x, y)));
				panel.repaint();
				
			}
		});
		btnAddLocation.setBounds(673, 65, 201, 29);
		getContentPane().add(btnAddLocation);
		
		//pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new RandomLocationFinder();
	}
}
