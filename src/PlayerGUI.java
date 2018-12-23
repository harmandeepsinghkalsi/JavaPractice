import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import javazoom.jl.player.Player;

public class PlayerGUI {

	private JFrame frame;
	private JTextField pathField;
	private File songFile;
	Player p;

	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					PlayerGUI window = new PlayerGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		);
	}

	public PlayerGUI() {

		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Kalsi's Music Player");
		frame.setBounds(100, 100, 575, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		JButton startBtn = new JButton("Start");
		startBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		startBtn.setBounds(10, 42, 254, 61);
		frame.getContentPane().add(startBtn);

		startBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					p = new Player(new FileInputStream(songFile));
					p.play();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "No File Selcted", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		JButton stopBtn = new JButton("Stop");
		stopBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		stopBtn.setBounds(275, 42, 260, 61);
		frame.getContentPane().add(stopBtn);

		stopBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					p.wait();
				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}
		});

		pathField = new JTextField();
		pathField.setForeground(Color.DARK_GRAY);
		pathField.setEditable(true);
		pathField.setText("Song Path");
		pathField.setBounds(10, 11, 182, 20);
		frame.getContentPane().add(pathField);
		pathField.setColumns(10);

		JButton openBtn = new JButton("Open");
		openBtn.setBounds(205, 10, 59, 23);
		frame.getContentPane().add(openBtn);

		openBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser browse = new JFileChooser();
					browse.setDialogTitle("Choose song to load...");
					browse.showOpenDialog(null);
					songFile = browse.getSelectedFile();
					pathField.setText(songFile.getAbsolutePath());

					if (!songFile.getName().endsWith(".mp3")) {
						JOptionPane.showMessageDialog(null, "Invalid File Type selected", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});

	}
}