package ztxbdlh;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import ztxbdlh.a1;
public class ztxbdlh extends JFrame
{
	public ztxbdlh()
	{
		setTitle("朱廷轩暴打李焕");
		setLayout(null);
		setBounds(300,200,800,480);
		Container c1=getContentPane();
		Container c2=getContentPane();
		Font f1=new Font(null,1,35);
		JLabel j1=new JLabel("朱廷轩暴打李焕");
		JLabel j2=new JLabel("");
		JButton b1=new JButton("开始游戏");
		JButton b2=new JButton("关于");
		JButton b3=new JButton("设置");
		JButton b4=new JButton("退出游戏");
		b1.setBounds(300,140,200,50);
		b2.setBounds(300,220,200,50);
		b3.setBounds(300,300,100,50);
		b4.setBounds(400,300,100,50);
		b1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				d3 dialog=new d3(ztxbdlh.this);
				dialog.setVisible(true);
				dispose();
			}
		});
		b2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				d2 dialog=new d2(ztxbdlh.this);
				dialog.setVisible(true);
			}
		});
		b4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				d1 dialog=new d1(ztxbdlh.this);
				dialog.setVisible(true);
			}
		});
		j2.setBounds(0,0,800,480);
		ImageIcon i1=new ImageIcon("src/image/image_1.png");
		i1.setImage(i1.getImage().getScaledInstance(i1.getIconWidth(),i1.getIconHeight(),Image.SCALE_DEFAULT));
		j2.setIcon(i1);
		j2.setHorizontalAlignment(SwingConstants.CENTER);
		j2.setOpaque(true);
		j1.setFont(f1);
		j1.setBounds(280, 30, 600, 100);
		c1.add(b1);
		c1.add(b2);
		c1.add(b3);
		c1.add(b4);
		c1.add(j1);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		new ztxbdlh();
	}
}
class d1 extends JDialog
{
	public d1(ztxbdlh frame)
	{
		super(frame,"朱廷轩暴打李焕",true);
		setLayout(null);
		Container c2=getContentPane();
		Font f1=new Font(null,1,15);
		JLabel j1=new JLabel("确定要退出吗？");
		j1.setFont(f1);
        JButton b1=new JButton("返回");
		JButton b2=new JButton("退出");
		j1.setBounds(60,0,150,80);
		b1.setBounds(40,100,80,50);
		b2.setBounds(160,100,80,50);
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
			     System.exit(0);
			}
		});
		c2.add(j1);
		c2.add(b1);
		c2.add(b2);
		setBounds(500,300,300,200);
	}
	}
class d2 extends JDialog
{
	public d2(ztxbdlh frame)
	{
		setTitle("关于");
		setLayout(null);
		setBounds(500,300,400,300);
		Container c3=getContentPane();
		Font f1=new Font(null,1,12);
		JLabel j1=new JLabel("该游戏由叶俊杰开发。");
		JLabel j2=new JLabel("当前版本为JAVA版1.0。");
		JLabel j3=new JLabel("版权所有，盗版必究。");
		JButton b1=new JButton("确定");
		j1.setFont(f1);
		j2.setFont(f1);
		j3.setFont(f1);
		j1.setBounds(0,0,200,30);
		j2.setBounds(0,40,200,30);
		j3.setBounds(0,80,200,30);
		b1.setBounds(100,130,80,40);
		b1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			     dispose();
			}
		});
		c3.add(b1);
		c3.add(j2);
		c3.add(j1);
		c3.add(j3);
	}	
	}
class d3 extends JDialog
{
	public d3(ztxbdlh frame)
	{
		super(frame,"登录界面",true);
		setBounds(500,200,350,250);
		setLayout(null);
		Container c4=getContentPane();
		Font f1=new Font(null,1,20);
		JLabel j1=new JLabel("朱廷轩暴打李焕");
		JLabel j2=new JLabel("姓名");
		JLabel j3=new JLabel("密码");
		JButton b2=new JButton("登录");
		JButton b3=new JButton("注册");
		JTextField jt1=new JTextField();
		JTextField jt2=new JTextField();
		jt1.setBounds(80,50,250,40);
		jt2.setBounds(80,95,250,40);
		b2.setBounds(80,160,60,30);
		b3.setBounds(200,160,60,30);
		b3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String s1=jt1.getText();
				String s2=jt2.getText();
				String d1="0";
				String s9="image/image_1.png";
				byte[] s7=d1.getBytes();
				byte[] s5=s2.getBytes();
				byte[] s10=s9.getBytes();
				String s3="./";
				String s4=s1+".txt";
				String s6=s1+"-level"+".txt";
				String s8=s1+"-head"+".txt";
				File f1=new File(s3,s4);
				File f2=new File(s3,s6);
				File f3=new File(s3,s8);
				if(f1.exists())
				{
					d6 dialog=new d6(d3.this);
					dialog.setVisible(true);
				}
				if(s1.length()<3 || s1.length()>10)
				{
					d4 dialog=new d4(d3.this);
					dialog.setVisible(true);
				}
				if(s2.length()<6 || s2.length()>12)
				{
					d5 dialog=new d5(d3.this);
					dialog.setVisible(true);
				}
				if(s1.length()>=3 && s1.length()<=10 && s2.length()>=6 && s2.length()<=12 && f1.exists()==false)
				{
					try {
						f1.createNewFile();
						FileOutputStream out=new FileOutputStream(f1);
						out.write(s5);
						out.close();
						f2.createNewFile();
						FileOutputStream out1=new FileOutputStream(f2);
						out1.write(s7);
						out1.close();
						f3.createNewFile();
						FileOutputStream out2=new FileOutputStream(f3);
						out2.write(s10);
						out2.close();
						System.out.println("注册成功");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					d7 dialog=new d7(d3.this);
					dialog.setVisible(true);
				}
			}
		});
		b2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String s1=jt1.getText();
				String s2=jt2.getText();
				String s3="./";
				String s4=s1+".txt";
				String s6=s1+"-level"+".txt";
				String s8=s1+"-head"+".txt";
				File f2=new File(s3,s6);
				File f1=new File(s3,s4);
				File f3=new File(s3,s8);
				try {
					FileInputStream in=new FileInputStream(f1);
					FileInputStream in1=new FileInputStream(f2);
					FileInputStream in2=new FileInputStream(f3);
					byte b[]=new byte[1024];
					byte b1[]=new byte[1024];
					byte b2[]=new byte[1024];
					int	len=in.read(b);
					String s5=new String(b,0,len);
					int	len1=in1.read(b1);
					String s7=new String(b1,0,len1);
					int	len2=in2.read(b2);
					String s9=new String(b2,0,len2);
					in.close();
					in1.close();
					in2.close();
					if (f1.exists()==false || s2.equals(s5)==false)
					{
						d8 dialog=new d8(d3.this);
						dialog.setVisible(true);
					}
					if (f1.exists() && s2.equals(s5) && s1.length()<3)
					{
						d10 dialog=new d10(d3.this);
						dialog.setVisible(true);
					}
					if (f1.exists() && s2.equals(s5) && s2.length()<6||s2.length()>12)
					{
						d10 dialog=new d10(d3.this);
						dialog.setVisible(true);
					}
					if (f1.exists() && s2.equals(s5)==false && s1.length()<3||s1.length()>10)
					{
						d8 dialog=new d8(d3.this);
						dialog.setVisible(true);
					}
					if (f1.exists() && s2.equals(s5) && s1.length()>=3 && s1.length()<=10 && s2.length()>=6 && s2.length()<=12)
					{
						System.out.println("登录成功");
						d9 dialog=new d9(d3.this);
						dialog.setVisible(true);
						a1.f1(s1,s7,s1);
						dispose();
											}
				} catch (IOException e1) {
					e1.printStackTrace();
					d8 dialog=new d8(d3.this);
					dialog.setVisible(true);
				}
			}
		});
		j1.setFont(f1);
		j2.setFont(f1);
		j3.setFont(f1);
		j2.setBounds(20,45,50,40);
		j3.setBounds(20,90,50,40);
		j1.setBounds(100,20,150,40);
		c4.add(j1);
		c4.add(b2);
		c4.add(b3);
		c4.add(j2);
		c4.add(j3);
		c4.add(jt1);
		c4.add(jt2);
	}
	}
class d4 extends JDialog
{
	public d4(d3 frame)
	{
		super(frame,"警告",true);
		Container c5=getContentPane();
		setBounds(550,250,250,150);
		setLayout(null);
		Font f1=new Font(null,1,10);
		JLabel j1=new JLabel("姓名长度应大于等于3位且小于等于10位");
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
class d5 extends JDialog
{
	public d5(d3 frame)
	{
		super(frame,"警告",true);
		Container c5=getContentPane();
		setBounds(550,250,250,150);
		setLayout(null);
		Font f1=new Font(null,1,10);
		JLabel j1=new JLabel("密码长度应大于等于6位且小于等于12位");
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
class d6 extends JDialog
{
	public d6(d3 frame)
	{
		super(frame,"提示",true);
		Container c5=getContentPane();
		setBounds(550,250,250,150);
		setLayout(null);
		Font f1=new Font(null,1,10);
		JLabel j1=new JLabel("检测到该账号已存在，请尝试登录。");
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
class d7 extends JDialog
{
	public d7(d3 frame)
	{
		super(frame,"提示",true);
		Container c5=getContentPane();
		setBounds(550,250,250,150);
		setLayout(null);
		Font f1=new Font(null,1,10);
		JLabel j1=new JLabel("注册成功，现在请登录。");
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
class d8 extends JDialog
{
	public d8(d3 frame)
	{
		super(frame,"警告",true);
		Container c5=getContentPane();
		setBounds(550,250,250,150);
		setLayout(null);
		Font f1=new Font(null,1,10);
		JLabel j1=new JLabel("用户名或密码错误。");
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
class d9 extends JDialog
{
	public d9(d3 frame)
	{
		super(frame,"提示",true);
		Container c5=getContentPane();
		setBounds(550,250,250,150);
		setLayout(null);
		Font f1=new Font(null,1,10);
		JLabel j1=new JLabel("登录成功，点击按钮进入游戏");
		JButton b1=new JButton("进入游戏");
		j1.setFont(f1);
		b1.setBounds(70,60,100,40);
		b1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			    dispose();
			    a1.main(null);
			}
		});
		j1.setBounds(30,20,200,50);
		c5.add(b1);
		c5.add(j1);
	}
	}
class d10 extends JDialog
{
	public d10(d3 frame)
	{
		super(frame,"警告",true);
		Container c5=getContentPane();
		setBounds(550,250,250,150);
		setLayout(null);
		Font f1=new Font(null,1,10);
		JLabel j1=new JLabel("非法的帐户或密码");
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