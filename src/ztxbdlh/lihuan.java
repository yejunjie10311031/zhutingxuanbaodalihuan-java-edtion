package ztxbdlh;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class lihuan
{
	String name="¿Óª¿";
	JLabel j1=new JLabel("");
	JLabel j2=new JLabel("");
	JLabel j3=new JLabel("");
	URL imgurl1=getClass().getResource("image/lihuan_2.png");
	ImageIcon head=new ImageIcon(imgurl1);
	URL imgurl2=getClass().getResource("image/body.png");
	ImageIcon body=new ImageIcon(imgurl2);
	public lihuan(ImageIcon s1,int x1)
	{
		head.setImage(head.getImage().getScaledInstance(x1,x1,Image.SCALE_DEFAULT));
		body.setImage(body.getImage().getScaledInstance((int)(1.6*x1),(int)(3*x1),Image.SCALE_DEFAULT));
		s1.setImage(s1.getImage().getScaledInstance((int)(1.4*x1),(int)(1.4*x1),Image.SCALE_DEFAULT));
	    j1.setIcon(head);
	    j2.setIcon(body);
	    j3.setIcon(s1);
	}
}
