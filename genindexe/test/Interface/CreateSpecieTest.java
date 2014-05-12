/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import java.awt.GridLayout;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author Teddy
 */
public class CreateSpecieTest {

    public static void main(String[] args) throws SQLException {
        JFrame myFrame = new JFrame("Test interface");
        CreateSpecie test = new CreateSpecie();
        myFrame.setLayout(new GridLayout(1, 2));
        myFrame.add(test);
        myFrame.pack();
        myFrame.setVisible(true);
    }

}
