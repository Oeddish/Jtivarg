package org.tsoft.jtivarg.yticlock;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 */
public class MainFrame extends JFrame
{
	Application m_application;

	public MainFrame(Application application, JPanel surface)
	{
		super("Jtivarg ~ Gravity -> ytivarG in Java!");

		m_application = application;

		add(surface);
	}

	public void init()
	{
        // Init menu here if desired
	}
}
