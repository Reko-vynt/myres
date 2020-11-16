/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.ulti.test;

import java.sql.SQLException;
import static math.ulti.MathUtilty.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VY
 */
public class MathUtiltyTest {
@Test        
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(5040, getFactorial(7));
    }
    @Test(expected = SQLException.class)
    public void getFatorial_throwsException_ifValidArgument(){
            getFactorial(-5);
    }
    
    
}
