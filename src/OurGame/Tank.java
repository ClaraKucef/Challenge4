package OurGame;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Tank {
	int x, dx, y,nx,nx2,left, dy;
	Image still,jump,reverse;
	
	int za5ira = 10;
	
	ImageIcon s = new ImageIcon("D:\\koko's\\Jam3az\\Sem3\\OOP\\Challenge4\\tannk.png");
	ImageIcon j= new ImageIcon("D:\\koko's\\Jam3az\\Sem3\\OOP\\Challenge4\\tannk.png");
	ImageIcon l = new ImageIcon("D:\\koko's\\Jam3az\\Sem3\\OOP\\Challenge4\\tannk.png");
	
	static ArrayList bullets;
	
	public Tank() {
		x = 75;
		left = 150;
		nx = 0;
		nx2= 685;
		y = 172;
		still = s.getImage();
		bullets = new ArrayList();
	
	}
	
	public Rectangle getBounds()
	{
		return new Rectangle(left,y, 63, 154);
	}  
	
	public static ArrayList getBullets()
	{
		return bullets;
	}
	
	public void fire()
	{
		if (za5ira > 0)
		{
		za5ira--;
		
			Bullet z = new Bullet((left + 10), (Board.v + 154/2));
		bullets.add(z);
	}}
	public void move() {
		if (dx != -1){
			if (left + dx <= 150)
				left+=dx;
			else{
		x = x + dx;
		
		nx2= nx2+dx;
			nx = nx + dx;
	}}
		else
	{
		if (left+dx >0)
		left = left + dx;
	}
		}

	public int getX() {
		return x;
	}
	
	public int getLeft(){
		return left;
	}

	public int getnX() {
		return nx;
	}
	
	public int getnX2() {
		return nx2;
	}

	public int getdx() {
		return dx;
	}
	
	public Image getImage() {
		return still;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT)
		{		dx = -1;
		still = l.getImage();		}
		
		if (key == KeyEvent.VK_RIGHT)
			{dx = 1;
		still = s.getImage();	
			}
		
		if (key == KeyEvent.VK_SPACE)
		{
			fire();
		}
		
		if (key == KeyEvent.VK_UP)
			{dy = 1;
			still = j.getImage();
			}			}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT)
			dx = 0;

		if (key == KeyEvent.VK_RIGHT)
			dx = 0;
		
		if (key == KeyEvent.VK_UP)
			{dy = 0;
			still = s.getImage();}
			}
	}