package dataExchange;

import java.awt.*;
import javax.swing.*;

/**
 * @author Cay Horstmann
 * @version 1.35 2018-04-10
 */
public class DataExchangeTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new DataExchangeFrame();
            frame.setTitle("DataExchangeTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
