// Folder: kalkulator
// File: Main.java
//Update Fixing Bug 05/01/25

package kalkulator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculatorUI::new);
    }
}