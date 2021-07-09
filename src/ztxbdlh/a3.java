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

public class a3 extends JFrame
{
	public a3() throws IOException
	{
	setTitle("第一章：厕所会战");
	Font f1=new Font(null,0,20);
	setLayout(null);
	Container c1=getContentPane();
	JLabel j2=new JLabel("");
	JLabel j3=new JLabel("生命值：");
	JLabel j5=new JLabel("李焕");
	int life=20;
	int life2=18;
	String lifes=String.valueOf(life);
	String lifes2=String.valueOf(life2);
	String s2="./";
	String s1=a1.j4+"-head.txt";
	File file1=new File(s2,s1);
	FileInputStream in;
	JLabel j4=new JLabel(lifes);
	JLabel j6=new JLabel(lifes2);
	JLabel j7=new JLabel("生命值：");
	JLabel j8=new JLabel("");
	URL imgurl1=getClass().getResource("image/wood_sword.png");
	ImageIcon item=new ImageIcon(imgurl1);
	URL imgurl2=getClass().getResource("image/wood_sword_4.png");
	ImageIcon item2=new ImageIcon(imgurl2);
	zhutingxuan z1=new zhutingxuan(item,60);
	lihuan l1=new lihuan(item2,60);
	touch t1=new touch(180,340,70,c1);
	in = new FileInputStream(file1);
	byte b[]=new byte[1024];
	int	len=in.read(b);
	String s3=new String(b,0,len);
	in.close();
	URL imgurl3=getClass().getResource(s3);
	ImageIcon i1=new ImageIcon(imgurl3);
	i1.setImage(i1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT));
	ImageIcon i2=l1.head;
	i2.setImage(i2.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT));
	a1.j2.setFont(f1);
	j2.setIcon(i1);
	j8.setIcon(i2);
	j3.setFont(f1);
	j4.setFont(f1);
	j5.setFont(f1);
	j6.setFont(f1);
	j7.setFont(f1);
	setBounds(50,50,1300,700);
	a1.j2.setBounds(150,20,100,40);
	j2.setBounds(10,10,120,120);
	j3.setBounds(150,60,100,40);
	j4.setBounds(230,60,80,40);
	j6.setBounds(930,60,100,40);
	j7.setBounds(850,60,100,40);
	j5.setBounds(850,20,80,40);
	j8.setBounds(980,10,120,120);
	z1.j1.setBounds(100,140,60,60);
	z1.j2.setBounds(80,200,96,180);
	z1.j3.setBounds(170,190,84,84);
	l1.j1.setBounds(1000,140,60,60);
	l1.j2.setBounds(980,200,96,180);
	l1.j3.setBounds(900,190,84,84);
	c1.add(a1.j2);
	c1.add(j2);
	c1.add(j3);
	c1.add(j4);
	c1.add(z1.j1);
	c1.add(z1.j2);
	c1.add(z1.j3);
	c1.add(j5);
	c1.add(j6);
	c1.add(j7);
	c1.add(j8);
	c1.add(l1.j1);
	c1.add(l1.j2);
	c1.add(l1.j3);
	setVisible(true);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		try {
			new a3();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
