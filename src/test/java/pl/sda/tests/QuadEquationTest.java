package pl.sda.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadEquationTest {

    @Test
    public void testForDeltaLessThanZero() {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 2, 3);
        double delta = quadraticEquation.getDelta();
        Assertions.assertTrue(delta < 0);
    }

    @Test
    public void testForNoSolutions() {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 2, 3);
        double[] solutions = quadraticEquation.getSolutions();
        Assertions.assertNull(solutions);
    }

    @Test
    public void testFor2Solutions() {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,0,-9);
        double[] solutions = quadraticEquation.getSolutions();
        Assertions.assertArrayEquals(new double[]{-3, 3},solutions);

        Assertions.assertTrue((solutions[0] == 3 && solutions[1] == -3) || (solutions[1] == 3 || solutions[0] == -3));
    }




}
