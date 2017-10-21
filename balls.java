package balls;

import java.util.*;  
import java.applet.*;  
import java.awt.*;  
import java.awt.event.*;  

public class bb extends Applet implements Runnable  
{  
Random r = new Random(); 
int x = 10, y = 10,s1 = 0, s = 0, h = 500 , wi = 500;  
public void init()  
{  
Thread t = new Thread(this);  
t.start();  
}  
public void run()  
{  
while(true)  
{  
try  
{  
repaint();  
Thread.sleep(55);   
if( x < wi - 100)    
x += 5;  
if( y < h - 100)  
y += 5;  
if( x > wi - 100)  
x = wi - 100;  
if( y > h - 100)  
y = h - 100;  
s1 += 10;  
s += 10;  
}  
catch(Exception e)  
{ }  
}  
}  
public void paint(Graphics g)  
{  
Dimension d = getSize();  
h= d.height;  
wi = d.width;  
g.setColor(Color.blue);  
g.fillArc(x,20,100,100,s1,90);  
g.setColor(Color.red);  
g.fillArc(x,20,100,100,s1 + 90,90);  
g.setColor(Color.green);  
g.fillArc(x,20,100,100,s1 + 180,90);  
g.setColor(Color.orange);  
g.fillArc(x,20,100,100,s1 + 270,90);  
g.setColor(Color.darkGray);  
g.fillArc(10, y, 100, 100, s ,90);  
g.setColor(Color.magenta);  
g.fillArc(10,y,100,100, s + 90,90);  
g.setColor(Color.PINK);  
g.fillArc(10,y,100,100,s + 180,90);  
g.setColor(Color.black);  
g.fillArc(10,y,100,100,s + 270,90);  
g.setColor(Color.cyan);
}  
}