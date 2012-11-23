
public class Appletname extends java.applet.Applet
{
int n = 1000;
int summe = n/2*(n+1);
public void paint(java.awt.Graphics g)
{
	g.drawString("Die Summe aller Zahlen von 1 bis "+n+" beträgt "+ summe, 30, 30);
	
	
}
}
