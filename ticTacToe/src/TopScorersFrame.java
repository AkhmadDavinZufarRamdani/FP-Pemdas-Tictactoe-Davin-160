import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class TopScorersFrame extends JFrame {

    private JTable table;
    private PlayerService playerService;

    public TopScorersFrame() {

        playerService =
                new PlayerService();

        setTitle("Top 5 Scorers");
        setSize(500, 300);
        setLocationRelativeTo(null);

        String[] columns = {
                "Username",
                "Wins",
                "Losses",
                "Draws",
                "Score"
        };

        DefaultTableModel model =
                new DefaultTableModel(
                        columns,
                        0
                );

        ArrayList<Player> players =
                playerService.getTopFiveScorers();

        for (Player p : players) {

            model.addRow(
                    new Object[]{
                            p.getUsername(),
                            p.getWins(),
                            p.getLosses(),
                            p.getDraws(),
                            p.getScore()
                    }
            );
        }

        table = new JTable(model);

        add(new JScrollPane(table));
    }
}