package ztxbdlh;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class touch
{
	JButton bw=new JButton("W");
	JButton ba=new JButton("A");
	JButton bs=new JButton("S");
	JButton bd=new JButton("D");
	JButton fight=new JButton("¹¥»÷");
	public touch(int x1,int x2,int x3,Container c)
	{
		bw.setBounds(x1,x2,x3,x3);
		ba.setBounds(x1-(int)(1.4*x3),x2+(int)(1.4*x3),x3,x3);
		bs.setBounds(x1,x2+(int)(3*x3),x3,x3);
		bd.setBounds(x1+(int)(1.4*x3),x2+(int)(1.4*x3),x3,x3);
		fight.setBounds(x1+(int)(12*x3),x2+(int)(0.8*x3),(int)(2*x3),x3);
		c.add(bw);
		c.add(ba);
		c.add(bs);
		c.add(bd);
		c.add(fight);
	}
}
