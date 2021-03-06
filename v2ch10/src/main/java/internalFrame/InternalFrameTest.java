package internalFrame;

import java.awt.*;
import javax.swing.*;

/**
 * This program demonstrates the use of internal frames.
 *
 * @author Cay Horstmann
 * @version 1.13 2018-05-01
 */
public class InternalFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            var frame = new DesktopFrame();
            frame.setTitle("InternalFrameTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
