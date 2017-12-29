/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OurGame;

/**
 *
 * @author clara
 */

import javax.swing.*;

public class Challenge4x3 {

	public Challenge4x3(){
		JFrame frame = new JFrame();
		frame.add(new Board());	
		frame.setTitle("Tank Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1900,600);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	public static void main(String[] args){
		new Challenge4x3();
	}
}
