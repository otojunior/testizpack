/**
 * 
 */
package org.otojunior.testizpack;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Janela Principal
 *
 * @author Oto Junior
 * @version $Id: $Id
 */
public class MainWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Construtor padrão.
	 */
	public MainWindow() {
		this.setSize(500, 200);
		this.setLocation(500,  500);
		this.setResizable(false);
		this.setTitle("Main Window - Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(e -> {
			MainWindow.this.setVisible(false);
			MainWindow.this.dispose();
			System.exit(0);
		});
		
		JPanel painelBotoes = new JPanel();
		painelBotoes.add(btnCancel);
		
		String str = 
				"java.version: " + System.getProperty("java.version") + "\n" +
				"java.home: " + System.getProperty("java.home") + "\n" +
				"java.vm.name: " + System.getProperty("java.vm.name") + "\n" +
				"java.class.version: " + System.getProperty("java.class.version") + "\n" +
				"os.name: " + System.getProperty("os.name") + "\n" +
				"os.arch: " + System.getProperty("os.arch") + "\n" +
				"os.version: " + System.getProperty("os.version") + "\n" +
				"user.dir: " + System.getProperty("user.dir");
		
		JTextArea textArea = new JTextArea(str);
		textArea.setEditable(false);
		textArea.setAutoscrolls(false);
		
		this.add(painelBotoes, BorderLayout.SOUTH);
		this.add(textArea, BorderLayout.CENTER);
	}
}
