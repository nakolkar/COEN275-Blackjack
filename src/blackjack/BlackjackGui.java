package blackjack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;

public class BlackjackGui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackjackGui window = new BlackjackGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BlackjackGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel dealerPanel = new JPanel();
		dealerPanel.setBounds(6, 6, 588, 190);
		frame.getContentPane().add(dealerPanel);
		dealerPanel.setLayout(null);
		
		JPanel deckPanel = new JPanel();
		deckPanel.setBounds(506, 21, 60, 80);
		dealerPanel.add(deckPanel);
		
		JLabel dealerLbl = new JLabel("Dealer");
		dealerLbl.setBounds(6, 6, 60, 16);
		dealerPanel.add(dealerLbl);
		
		JPanel dealerHandPanel = new JPanel();
		dealerHandPanel.setBounds(131, 45, 300, 80);
		dealerPanel.add(dealerHandPanel);
		dealerHandPanel.setLayout(new GridLayout(1, 5, 0, 0));
		
		JPanel playerPanel = new JPanel();
		playerPanel.setBounds(6, 201, 588, 190);
		frame.getContentPane().add(playerPanel);
		playerPanel.setLayout(null);
		
		JPanel playerHandPanel = new JPanel();
		playerHandPanel.setBounds(131, 45, 300, 80);
		playerPanel.add(playerHandPanel);
		playerHandPanel.setLayout(new GridLayout(1, 5, 0, 0));
		
		JPanel optionsPanel = new JPanel();
		optionsPanel.setBounds(462, 22, 120, 102);
		playerPanel.add(optionsPanel);
		optionsPanel.setLayout(new GridLayout(3, 2, 0, 0));
		
		JButton standBtn = new JButton("Stand");
		standBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		JButton hitBtn = new JButton("Hit");
		hitBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		JButton splitBtn = new JButton("Split");
		splitBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		JButton doubleBtn = new JButton("Double");
		doubleBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		JButton surrenderBtn = new JButton("Surrender");
		surrenderBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		optionsPanel.add(standBtn);
		optionsPanel.add(hitBtn);
		optionsPanel.add(splitBtn);
		optionsPanel.add(doubleBtn);
		optionsPanel.add(surrenderBtn);
		
		
		JLabel playerLbl = new JLabel("Player: LoNG Name");
		playerLbl.setBounds(6, 6, 135, 16);
		playerPanel.add(playerLbl);
		
		JLabel balanceLbl = new JLabel("Balance: $100");
		balanceLbl.setBounds(6, 21, 99, 16);
		playerPanel.add(balanceLbl);
		
		JPanel betPanel = new JPanel();
		betPanel.setBounds(6, 97, 65, 87);
		playerPanel.add(betPanel);
		betPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton oneBtn = new JButton("$1");
		oneBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		JButton fiveBtn = new JButton("$5");
		fiveBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		JButton tenBtn = new JButton("$10");
		tenBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		JButton twentyFiveBtn = new JButton("$25");
		twentyFiveBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		JButton fiftyBtn = new JButton("$50");
		fiftyBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		betPanel.add(oneBtn);
		betPanel.add(fiveBtn);
		betPanel.add(tenBtn);
		betPanel.add(twentyFiveBtn);
		betPanel.add(fiftyBtn);
	}
}
