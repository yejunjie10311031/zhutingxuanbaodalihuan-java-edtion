package ztxbdlh;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class zhutingxuan 
{
	String name="ÖìÍ¢Ðù";
	JLabel j1=new JLabel("");
	JLabel j2=new JLabel("");
	JLabel j3=new JLabel("");
	URL imgurl1=getClass().getResource("image/image_1.png");
	ImageIcon head=new ImageIcon(imgurl1);
	URL imgurl2=getClass().getResource("image/body.png");
	ImageIcon body=new ImageIcon(imgurl2);
	public zhutingxuan(ImageIcon s1,int x1)
	{
		head.setImage(head.getImage().getScaledInstance(x1,x1,Image.SCALE_DEFAULT));
		body.setImage(body.getImage().getScaledInstance((int)(1.6*x1),(int)(3*x1),Image.SCALE_DEFAULT));
		s1.setImage(s1.getImage().getScaledInstance((int)(1.4*x1),(int)(1.4*x1),Image.SCALE_DEFAULT));
	    j1.setIcon(head);
	    j2.setIcon(body);
	    j3.setIcon(s1);
	}
}
