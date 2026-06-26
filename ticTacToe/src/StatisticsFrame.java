import javax.swing.*;

public class StatisticsFrame extends JFrame {

    private Player currentPlayer;

    public StatisticsFrame(Player player) {

        this.currentPlayer = player;

        setTitle("My Statistics");
        setSize(300, 250);
        setLocationRelativeTo(null);

        JTextArea txtStatistics =
                new JTextArea();

        txtStatistics.setEditable(false);

        txtStatistics.setText(
                "Username : "
                        + currentPlayer.getUsername()
                        + "\nWins : "
                        + currentPlayer.getWins()
                        + "\nLosses : "
                        + currentPlayer.getLosses()
                        + "\nDraws : "
                        + currentPlayer.getDraws()
                        + "\nScore : "
                        + currentPlayer.getScore()
        );

        add(new JScrollPane(txtStatistics));
    }
}