package net.absoft;

import java.util.Objects;

public class QuadraticEquationSolution {
  private final double x1;
  private final double x2;

  public QuadraticEquationSolution(double x1, double x2) {
    this.x1 = x1;
    this.x2 = x2;
  }

  public double getX1() {
    return x1;
  }

  public double getX2() {
    return x2;
  }

  @Override
  public String toString() {
    return "Solution{" +
        "x1=" + x1 +
        ", x2=" + x2 +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuadraticEquationSolution solution = (QuadraticEquationSolution) o;
    return (Double.compare(solution.x1, x1) == 0
        && Double.compare(solution.x2, x2) == 0)
        || (Double.compare(solution.x1, x2) == 0
        && Double.compare(solution.x2, x1) == 0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x1, x2);
  }
}
