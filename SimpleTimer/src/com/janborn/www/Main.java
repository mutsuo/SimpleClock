/**
* FileName: Main.java
* 主调类
*
* @author Deng Yang
    * @Date    2018/06/01
* @version 1.00
*/
package com.janborn.www;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//解决输入法切换导致的白屏问题
			System.setProperty("sun.java2d.noddraw", "true");
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               MainWin.paintGUI();
               Timer timer = new Timer();
               TimerTask  task = new TimerTask (){
	               public void run() {
	            	   MainWin.updateTime();
	               }
               };
               timer.schedule (task, 1000L, 1000L);
           }
       });
	}

}
