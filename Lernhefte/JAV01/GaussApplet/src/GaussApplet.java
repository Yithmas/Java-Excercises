
public class GaussApplet extends java.applet.Applet
{
int n = 10;
int summe = n/2*(n+1);
public void paint(java.awt.Graphics g)
{
	g.drawString("Die Summe aller Zahlen von 1 bis "+n+" beträgt "+ summe, 100, 100);
	
	
}
}

