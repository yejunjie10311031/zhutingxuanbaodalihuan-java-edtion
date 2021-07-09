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

public class a2 extends JFrame
{
	public a2()
	{
		setTitle("第一章：厕所会战");
		Font f1=new Font(null,0,20);
		setLayout(null);
		JLabel j1=new JLabel("第一章：厕所会战");
		JLabel j2=new JLabel("");
		URL imgurl1=getClass().getResource("image/image_2.png");
		ImageIcon i1=new ImageIcon(imgurl1);
		i1.setImage(i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT));
		j2.setIcon(i1);
		j1.setFont(f1);
		Container c1=getContentPane();
		setBounds(150,50,900,700);
		j1.setBounds(350,25,300,80);
		j2.setBounds(50,80,800,600);
		c1.add(j1);
		c1.add(j2);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		try {
			Thread.sleep(5400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dispose();
		a3.main(null);
	}
	public static void main(String[] args)
	{
		new a2();
	}
}
