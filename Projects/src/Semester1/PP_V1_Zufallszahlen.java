package Semester1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class PP_V1_Zufallszahlen {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PP_V1_Zufallszahlen::createUI);
    }

    private static void createUI() {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception ignored) {}

        JFrame frame = new JFrame("3×3 Tabelle – Zufallszahl & Lineare Kongruenz");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel grid = new JPanel(new GridBagLayout());
        grid.setBorder(new EmptyBorder(12, 12, 12, 12));
        frame.setContentPane(grid);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Spalten sollen gleichmäßig wachsen (3 Spalten)
        double[] weights = {1.0, 1.0, 1.0};

        // ---- Gemeinsamer Zustand: z ----
        AtomicInteger zValue = new AtomicInteger(0);

        // ===== Zeile 1 =====
        int row = 0;

        JTextArea taInfo = new JTextArea("Drück den Knopf, um eine Zufallszahl z (0–100) zu erzeugen →");
        taInfo.setEditable(false);
        taInfo.setLineWrap(true);
        taInfo.setWrapStyleWord(true);
        taInfo.setBackground(grid.getBackground());
        addCell(grid, gbc, 0, row, weights[0], taInfo);

        JButton btnGenZ = new JButton("Zufallszahl generieren");
        addCell(grid, gbc, 1, row, weights[1], btnGenZ);

        JTextField tfZ = new JTextField();
        tfZ.setEditable(false);
        addCell(grid, gbc, 2, row, weights[2], tfZ);

        btnGenZ.addActionListener(e -> {
            int z = (int) (Math.random() * 101); // 0..100
            zValue.set(z);
            tfZ.setText("z = " + z);
        });

        // ===== Zeile 2 =====
        row++;

        // Spalte 1: Eingaben a, b, m in einem kleinen Panel
        JPanel inputs = new JPanel(new GridBagLayout());
        GridBagConstraints gi = new GridBagConstraints();
        gi.insets = new Insets(4, 4, 4, 4);
        gi.fill = GridBagConstraints.HORIZONTAL;
        gi.weightx = 1.0;

        JLabel la = new JLabel("a:");
        JTextField tfa = new JTextField(6);
        JLabel lb = new JLabel("b:");
        JTextField tfb = new JTextField(6);
        JLabel lm = new JLabel("m:");
        JTextField tfm = new JTextField(6);

        gi.gridx = 0; gi.gridy = 0; inputs.add(la, gi);
        gi.gridx = 1; gi.gridy = 0; inputs.add(tfa, gi);
        gi.gridx = 0; gi.gridy = 1; inputs.add(lb, gi);
        gi.gridx = 1; gi.gridy = 1; inputs.add(tfb, gi);
        gi.gridx = 0; gi.gridy = 2; inputs.add(lm, gi);
        gi.gridx = 1; gi.gridy = 2; inputs.add(tfm, gi);

        addCell(grid, gbc, 0, row, weights[0], inputs);

        JButton btnCompute = new JButton("Berechne (a*z + b) mod m");
        addCell(grid, gbc, 1, row, weights[1], btnCompute);

        JTextField tfResult = new JTextField();
        tfResult.setEditable(false);
        addCell(grid, gbc, 2, row, weights[2], tfResult);

        btnCompute.addActionListener(e -> {
            try {
                int a = Integer.parseInt(tfa.getText().trim());
                int b = Integer.parseInt(tfb.getText().trim());
                int m = Integer.parseInt(tfm.getText().trim());
                if (m <= 0) {
                    tfResult.setText("Fehler: m muss > 0 sein");
                    return;
                }
                int z = zValue.get();
                long tmp = (long) a * z + b;                  // vermeidet int-Overflow bei großen a
                int mod = (int) (((tmp % m) + m) % m);        // sauber positives Modulo
                tfResult.setText("(a*z + b) mod m = " + mod);
            } catch (NumberFormatException ex) {
                tfResult.setText("Fehler: Ungültige Zahl in a, b oder m");
            }
        });

        // ===== Zeile 3 =====
        row++;

        JTextArea status = new JTextArea(
                "Status/Hinweis: Erst z generieren, dann a, b, m setzen und rechnen.\n" +
                        "Modulo m muss positiv sein. Ergebnis ist immer 0..m-1."
        );
        status.setEditable(false);
        status.setLineWrap(true);
        status.setWrapStyleWord(true);
        status.setBackground(grid.getBackground());

        // Status über alle 3 Spalten (bleibt 3. Zeile)
        gbc.gridx = 0; gbc.gridy = row;
        gbc.gridwidth = 3;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        grid.add(status, gbc);
        gbc.gridwidth = 1; // reset

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void addCell(JPanel panel, GridBagConstraints gbc,
                                int x, int y, double weightx, JComponent content) {
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.weightx = weightx;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(content, gbc);
    }
}
