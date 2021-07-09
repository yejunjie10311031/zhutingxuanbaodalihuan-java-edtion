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

public class item {

}

class wood_sword
{
	String name="Ä¾½£";
	int hurt=4;
	JLabel j1=new JLabel("");
	URL imgurl1=getClass().getResource("image/wood_sword.png");
	ImageIcon image=new ImageIcon(imgurl1);
	public wood_sword()
	{
	image.setImage(image.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
	j1.setIcon(image);
	}
}