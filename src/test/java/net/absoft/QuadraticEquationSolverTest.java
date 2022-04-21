package net.absoft;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertThrows;

import org.testng.annotations.Test;

public class QuadraticEquationSolverTest {

  @Test
  public void solveQuadraticEquationWithPositiveDiscriminant() {
    QuadraticEquationSolver solver = new QuadraticEquationSolver();
    QuadraticEquationSolution actual = solver.solveQuadraticEquation(1, -4, -5);

    QuadraticEquationSolution expected = new QuadraticEquationSolution(5.0, -1.0);
    assertEquals(actual, expected, "Unexpected solution!");

//    Alternative solution
//    assertTrue(actual.getX1() == expected.getX1()
//            || actual.getX1() == expected.getX2(),
//        String.format("Unexpected x1, should be %f or %f, got %f",
//            expected.getX1(), expected.getX2(), actual.getX1()));
//
//    assertTrue(actual.getX2() == expected.getX1()
//            || actual.getX2() == expected.getX2(),
//        String.format("Unexpected x2, should be %f or %f, got %f",
//            expected.getX1(), expected.getX2(), actual.getX2()));
  }

  @Test
  public void solveQuadraticEquationWithNegativeDiscriminant() {
    QuadraticEquationSolver solver = new QuadraticEquationSolver();
    assertNull(solver.solveQuadraticEquation(3, -4, 2), "Solution should be null");
  }

  @Test
  public void solveQuadraticEquationWithDiscriminantEqualToZero() {
    QuadraticEquationSolver solver = new QuadraticEquationSolver();
    assertEquals(solver.solveQuadraticEquation(1, 2, 1),
        new QuadraticEquationSolution(-1, -1), "Unexpected solution!");

//    Alternative solution
//    QuadraticEquationSolution solution = solver.solveQuadraticEquation(1.0, 2.0, 1.0);
//    assertTrue(solution.getX1() == -1.0 && solution.getX2() == -1.0,
//        String.format("Unexpected x1 and x2, should be %f, got %f and %f",
//            -1.0, solution.getX1(), solution.getX2()));
  }

  @Test
  public void quadraticEquationShouldNotHaveZeroAsFirstArgument() {
    QuadraticEquationSolver solver = new QuadraticEquationSolver();
    assertThrows(IllegalArgumentException.class, () -> solver.solveQuadraticEquation(0, 0, 0));
  }
}
