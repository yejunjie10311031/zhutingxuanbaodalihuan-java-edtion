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

import ztxbdlh.item;
public class a1 extends JFrame
{
	static JLabel j2;
	static JLabel j3;
	static String j4;
	String n2;
	public a1()
	{
		setTitle("朱廷轩暴打李焕");
		setLayout(null);
		setBounds(150,50,900,700);
		Container c1=getContentPane();
		JButton b1=new JButton("我的信息");
		JButton b2=new JButton("返回");
		JButton b3=new JButton("背包");
		JButton b4=new JButton("商城");
		JButton b5=new JButton("单人打李焕-->");
		JButton b6=new JButton("多人打李焕-->");
		URL imgurl1=getClass().getResource("image/wood_sword.png");
		ImageIcon item=new ImageIcon(imgurl1);
		zhutingxuan z1=new zhutingxuan(item,120);
		b2.setBounds(20,140,60,30);
		b1.setBounds(20,40,150,80);
		b3.setBounds(20,180,60,30);
		b4.setBounds(20,220,60,30);
		b5.setBounds(650,100,180,40);
		b6.setBounds(650,160,180,40);
		z1.j1.setBounds(300,60,120,120);
		z1.j2.setBounds(270,180,192,360);
		z1.j3.setBounds(440,220,168,168);
		b1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				c1 dialog;
				try {
					dialog = new c1(a1.this);
					dialog.setVisible(true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		b2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
				ztxbdlh.main(null);
			}
		});
		b3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				c4 dialog=new c4(a1.this);
				dialog.setVisible(true);
			}
		});
		b4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				c5 dialog=new c5(a1.this);
				dialog.setVisible(true);
			}
		});
		b5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
				a2.main(null);
			}
		});
		c1.add(b2);
		c1.add(b1);
		c1.add(b3);
		c1.add(b4);
		c1.add(z1.j1);
		c1.add(z1.j2);
		c1.add(z1.j3);
		c1.add(b5);
		c1.add(b6);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main (String[] args)
	{
		new a1();
	}
	public static void f1(String n1,String level,String s1)
	{
		a1.j2=new JLabel(n1);
		a1.j3=new JLabel(level);
		a1.j4=s1;
	}
}
class c1 extends JDialog
{
	public c1(a1 frame) throws IOException
	{
		super(frame,"我的信息",true);
		Container c2=getContentPane();
		setBounds(150,50,400,300);
		setLayout(null);
		String s2="./";
		String s1=a1.j4+"-head.txt";
		File file1=new File(s2,s1);
		FileInputStream in = new FileInputStream(file1);
		byte b[]=new byte[1024];
		int	len=in.read(b);
		String s3=new String(b,0,len);
		in.close();
		Font f1=new Font(null,1,10);
		JLabel j1=new JLabel("我的姓名：");
		JLabel j2=new JLabel("等级：");
		JLabel j3=new JLabel("我的头像");
		JButton b1=new JButton("返回");
		JButton b2=new JButton("更改头像");
		URL imgurl1=getClass().getResource(s3);
		ImageIcon i1=new ImageIcon(imgurl1);
		i1.setImage(i1.getImage().getScaledInstance(140,140,Image.SCALE_DEFAULT));
		JLabel j4=new JLabel("");
		j4.setIcon(i1);
		j4.setHorizontalAlignment(SwingConstants.CENTER);
		j4.setOpaque(true);
		j3.setFont(f1);
		j1.setFont(f1);
		j2.setFont(f1);
		a1.j2.setFont(f1);
		a1.j3.setFont(f1);
		a1.j2.setBounds(75,5,120,30);
		a1.j3.setBounds(75,30,80,30);
		b1.setBounds(40,200,80,50);
		b1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			    dispose();
			}
		});
		b2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				c2 dialog=new c2(c1.this);
				dialog.setVisible(true);
			}
		});
		b2.setBounds(180,200,120,50);
		j1.setBounds(20,5,75,30);
		j2.setBounds(20,30,75,30);
		j3.setBounds(200,10,80,40);
		j4.setBounds(160,40,140,140);
		c2.add(a1.j2);
		c2.add(a1.j3);
		c2.add(j1);
		c2.add(j2);
		c2.add(j3);
		c2.add(j4);
		c2.add(b1);
		c2.add(b2);
	}
	}
class c2 extends JDialog
{
	public c2(c1 frame)
	{
		super(frame,"更改头像",true);
		Container c1=getContentPane();
		setBounds(150,100,350,150);
		setLayout(null);
		Font f1=new Font(null,1,10);
		JLabel j1=new JLabel("请输入图片的相对路径");
		JButton b1=new JButton("确定");
		JTextField jt1=new JTextField();
		j1.setFont(f1);
		b1.setBounds(80,70,140,30);
		b1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			    String s1=jt1.getText();
			    String s2="./";
			    String s3=a1.j4+"-head.txt";
			    byte[] s4=s1.getBytes();
			    File f1=new File(s2,s3);
			    File f2=new File(s1);
			    if(f2.exists()==false)
			    {
			    	c3 dialog=new c3(c2.this);
					dialog.setVisible(true);
			    }
			    if(f2.exists())
			    {
				try {
					FileOutputStream out=new FileOutputStream(f1);
					out.write(s4);
					out.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				dispose();
			    }
			}
		});
		j1.setBounds(80,5,200,30);
		jt1.setBounds(20,40,250,30);
		c1.add(b1);
		c1.add(jt1);
		c1.add(j1);
	}
	}
class c3 extends JDialog
{
	public c3(c2 frame)
	{
		super(frame,"提示",true);
		Container c5=getContentPane();
		setBounds(150,100,250,150);
		setLayout(null);
		Font f1=new Font(null,1,10);
		JLabel j1=new JLabel("该图像不存在或路径错误");
		JButton b1=new JButton("确定");
		j1.setFont(f1);
		b1.setBounds(70,60,100,40);
		b1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			    dispose();
			}
		});
		j1.setBounds(30,20,200,50);
		c5.add(b1);
		c5.add(j1);
	}
	}
class c4 extends JDialog
{
	public c4(a1 frame)
	{
		super(frame,"背包",true);
		wood_sword w1=new wood_sword();
		Font f1=new Font(null,0,7);
		JLabel j1=new JLabel(w1.name);
		j1.setFont(f1);
		Container c1=getContentPane();
		setBounds(250,150,550,400);
		setLayout(null);
		JButton b1=new JButton("返回");
		b1.setBounds(0,0,100,30);
	    w1.j1.setBounds(5,35,20,20);
		j1.setBounds(10,60,30,20);
		b1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			    dispose();
			}
		});
		c1.add(b1);
		c1.add(j1);
		c1.add(w1.j1);
	}
	}
class c5 extends JDialog
{
	public c5(a1 frame)
	{
		super(frame,"商城",true);
		Font f1=new Font(null,0,10);
		JLabel j1=new JLabel("商城功能待开放");
		JLabel j2=new JLabel("金币：");
		j1.setFont(f1);
		j2.setFont(f1);
		Container c1=getContentPane();
		setBounds(250,150,550,400);
		setLayout(null);
		JButton b1=new JButton("返回");
		b1.setBounds(0,0,100,30);
	    j1.setBounds(150,100,100,40);
	    j2.setBounds(400,5,50,30);
		b1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			    dispose();
			}
		});
		c1.add(b1);
		c1.add(j1);
		c1.add(j2);
	}
	}
