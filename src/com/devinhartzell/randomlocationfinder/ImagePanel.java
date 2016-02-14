package com.devinhartzell.randomlocationfinder;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {

	private static final long serialVersionUID = 8873765865956076615L;
	
	private static final String IMG_PATH = "/resources/punahoucampus.png";
	private BufferedImage image;
	
	
	//private Graphics2D g2;
	
	public ImagePanel() {
		super();
		setBackground(Color.WHITE);
		setBounds(11, 11, 650, 650);
		
		try {
			image = ImageIO.read(getClass().getResource(IMG_PATH));
		} catch (IOException e) {
			System.out.println(String.format("Error: Could not read image resource at %s", IMG_PATH));
		}
		
		
		//paintDot(100, 100);
		
		
	}
	
	@Override 
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, 650, 650, null);
		
		Graphics2D g2 = (Graphics2D) g;
		//System.out.println(g2.toString());
		
		g2.setPaint(Color.RED);
		for (DotListItem item : DotList.getDotList())
			g2.fill(item.getDot());
	}
	
	

}
