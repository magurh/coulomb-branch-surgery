// WindowClosingAdapter . java


/* −−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−
	WindowClosingAdapter : source from http : / /www. javabuch . de /
	−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−− */


import java.awt.event.*;

public class WindowClosingAdapter
extends WindowAdapter
{
	private boolean exitSystem;

/** Generates a WindowClosingAdapter for closing the window.
	If exitSystem is true, the program is terminated. */

	public WindowClosingAdapter (boolean exitSystem)
		{
		this.exitSystem = exitSystem;
		}

/** Generates a WindowClosingAdapter for closing the window.
	The program is not terminated. */


	public WindowClosingAdapter ( )
	{
	this (false);
	}

	public void windowClosing(WindowEvent event)
	{
	event.getWindow().setVisible(false);
	event.getWindow().dispose();
	if (exitSystem) {
		System.exit(0);
		}
	}
}