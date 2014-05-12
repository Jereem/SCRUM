/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import java.sql.SQLException;
import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Teddy
 */
public class CreateSpecieTest {
    
    public static void main(String[] args) throws SQLException{
        JFrame frame = new JFrame();
        CreateSpecie test = new CreateSpecie();
        frame.add(test);
    }
    
}
