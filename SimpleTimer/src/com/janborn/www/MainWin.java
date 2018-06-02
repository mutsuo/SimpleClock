/**
* FileName: MainWin.java
* 绘制GUI窗口
*
* @author Deng Yang
    * @Date    2018/06/01
* @version 1.00
*/
package com.janborn.www;

import com.sun.awt.AWTUtilities;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;


public class MainWin {
	private final static Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
	private final static int width = (int)screensize.getWidth();
	private final static int height = (int)screensize.getHeight();
	private final static int pixelPerInch=java.awt.Toolkit.getDefaultToolkit().getScreenResolution();
	
	public static JFrame frame = new JFrame();
	public static Container c = frame.getContentPane();
	public static JLabel label ;
	
	public MainWin() {
		// TODO Auto-generated constructor stub
	}
	
	public static void paintGUI() {
		
		c.setLayout(new BorderLayout());
		frame.setBounds((int)(width*0.05), (int)(height*0.55), 600, 400);
		frame.setAlwaysOnTop(true);
		
		SimpleDateFormat sdm = new SimpleDateFormat("HH:mm");
		
		label = new JLabel(sdm.format(new Date()));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setFont(new Font("等线",1,130));
		c.add(label,"Center");
		
		
		frame.setUndecorated(true);
		frame.getRootPane().setWindowDecorationStyle(JRootPane.FILE_CHOOSER_DIALOG);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		frame.setVisible(true);
	}
	
	public static void updateTime() {
		SimpleDateFormat sdm = new SimpleDateFormat("HH:mm");
		label.setText(sdm.format(new Date()));
		
		c.repaint();
		
//		frame.setVisible(true);
	}

}
