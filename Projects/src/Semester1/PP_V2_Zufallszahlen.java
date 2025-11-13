package Semester1;
/*
Programmierpraktikum Versuch 1: Zufallszahlen
Autor: Sebastian Kieser
Matrikelnummer: 11407472
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PP_V2_Zufallszahlen {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Zufallszahlen");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            // Root mit GBL
            JPanel root = new JPanel(new GridBagLayout());
            frame.setContentPane(root);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.NORTHWEST; // oben links
            gbc.insets = new Insets(8, 8, 8, 8);       // Rand
            gbc.fill = GridBagConstraints.NONE;        // Größe bleibt "pack"-artig

            // --- Dein eigentlicher Inhalt in einem Panel
            JPanel content = new JPanel(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            c.insets = new Insets(4, 4, 4, 4);
            c.anchor = GridBagConstraints.NORTHWEST;

            // Zeile 1: Label, Button, Ausgabe z
            c.gridx = 0; c.gridy = 0;
            content.add(new JLabel("Drücke den Button, um eine Zufallszahl für z zu berechnen → "), c);

            JButton buttonZ = new JButton("Z für z berechnen");
            c.gridx = 1; c.gridy = 0;
            content.add(buttonZ, c);

            JTextField tfZ = new JTextField(10);
            tfZ.setEditable(false);
            c.gridx = 2; c.gridy = 0;
            content.add(tfZ, c);

            // Zeile 2: a, b, m Eingabe
            JTextField tfA = new JTextField(10);
            JTextField tfB = new JTextField(10);
            JTextField tfM = new JTextField(10);

            c.gridx = 0; c.gridy = 1; content.add(new JLabel("a:"), c);
            c.gridx = 1; c.gridy = 1; content.add(tfA, c);
            c.gridx = 0; c.gridy = 2; content.add(new JLabel("b:"), c);
            c.gridx = 1; c.gridy = 2; content.add(tfB, c);
            c.gridx = 0; c.gridy = 3; content.add(new JLabel("m:"), c);
            c.gridx = 1; c.gridy = 3; content.add(tfM, c);

            JButton buttonBerechnen = new JButton("(a*z + b) mod m");
            c.gridx = 2; c.gridy = 2; c.gridheight = 2;
            c.fill = GridBagConstraints.HORIZONTAL;
            content.add(buttonBerechnen, c);
            c.gridheight = 1;
            c.fill = GridBagConstraints.NONE;

            JLabel lblErgebnis = new JLabel("Ergebnis erscheint hier.");
            c.gridx = 0; c.gridy = 4; c.gridwidth = 3;
            content.add(lblErgebnis, c);
            c.gridwidth = 1;

            // Aktionen
            final int[] zWert = {0}; // z separat speichern, nicht aus Textfeld parsen
            buttonZ.addActionListener((ActionEvent e) -> {
                zWert[0] = (int) (Math.random() * 101);
                tfZ.setText("z = " + zWert[0]);
            });

            buttonBerechnen.addActionListener((ActionEvent e) -> {
                try {
                    int a = Integer.parseInt(tfA.getText().trim());
                    int b = Integer.parseInt(tfB.getText().trim());
                    int m = Integer.parseInt(tfM.getText().trim());
                    if (m == 0) {
                        lblErgebnis.setText("m darf nicht 0 sein.");
                        return;
                    }
                    int result = Math.floorMod(a * zWert[0] + b, m);
                    lblErgebnis.setText("Das Ergebnis ist: " + result + "   (z=" + zWert[0] + ")");
                } catch (NumberFormatException ex) {
                    lblErgebnis.setText("Bitte a, b, m als ganze Zahlen eingeben.");
                }
            });

            // Inhalt oben links einhängen
            root.add(content, gbc);

            // WICHTIG: Füller, der restlichen Platz frisst → drückt content nach oben links
            gbc.gridx = 1;
            gbc.gridy = 1;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.fill = GridBagConstraints.BOTH;
            root.add(Box.createGlue(), gbc);

            frame.setSize(1000, 700);
            frame.setLocationByPlatform(true);
            frame.setVisible(true);
        });
    }
}
