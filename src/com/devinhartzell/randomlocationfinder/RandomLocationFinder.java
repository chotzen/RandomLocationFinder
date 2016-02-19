package com.devinhartzell.randomlocationfinder;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;

public class RandomLocationFinder extends JFrame {
	
	public static ImagePanel panel;
	
	public ArrayList<Region> exclude = new ArrayList<Region>();
	public JLabel lblCoords;
	
	private static final long serialVersionUID = 3828053717800670874L;

	public RandomLocationFinder() {
		super("Random Location Finder");
		setSize(1000,700);
		getContentPane().setLayout(null);
		
		panel = new ImagePanel();
		
		//exclude.add(new Region(new Location()))
		
		getContentPane().add(panel);
		
		final DotList list = new DotList();
		//
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(673, 106, 201, 529);
		getContentPane().add(scrollPane);
		
		//list.add
		
		JButton btnAddLocation = new JButton("Add Location");
		btnAddLocation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Random r = new Random();
				int x = r.nextInt(630) + 10;
				int y = r.nextInt(630) + 10;
				list.addItem(new DotListItem(DotList.getDotList().size()+1, new Location(x, y)));
				//panel.repaint();
				
			}
		});
		btnAddLocation.setBounds(673, 47, 201, 29);
		getContentPane().add(btnAddLocation);
		
		JButton btnRemoveLocation = new JButton("Remove Location");
		btnRemoveLocation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				list.removeLast();
			}
		});
		btnRemoveLocation.setBounds(673, 76, 201, 29);
		getContentPane().add(btnRemoveLocation);
		
		lblCoords = new JLabel("");
		lblCoords.setBounds(886, 614, 108, 16);
		getContentPane().add(lblCoords);
		
		//pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static ImagePanel getPanel() {
		return panel;
	}
	
	public static void main(String args[]) {
		new RandomLocationFinder();
	}
	
	public void setMousePosition(Location l) {
		lblCoords.setText(String.format("(%s, %s)", l.x, l.y));
	}
}
