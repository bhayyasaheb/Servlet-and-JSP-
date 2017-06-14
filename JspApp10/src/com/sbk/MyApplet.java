package com.sbk;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MyApplet extends Applet {

	String msg1;
	String msg2;
	
	public void paint(Graphics g)
	{
		msg1 = getParameter("message1");
		msg2 = getParameter("message2");
		
		Font f = new Font("arial",Font.BOLD,40);
		g.setFont(f);
		this.setBackground(Color.blue);
		this.setForeground(Color.white);
		
		g.drawString(msg1, 150, 70);
		g.drawString(msg2, 200, 100);
	}
}
