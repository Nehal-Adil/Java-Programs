/*
                            Polynomial Class Problem

Implement a polynomial class, that contains following functions -
1. setCoefficient -
This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial,
then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial,
then previous coefficient value is replaced by given coefficient value.
2. add -
Adds two polynomials and returns a new polynomial which has the result.
3. subtract -
Subtracts two polynomials and returns a new polynomial which has the result.
4. multiply -
Multiplies two polynomials and returns a new polynomial which has the result.
5. print -
Prints all the terms (only terms with non-zero coefficients are to be printed) in increasing order of degree.
Print pattern for a single term : "x"
And multiple terms should be printed separated by space. For more clarity, refer sample test cases.
Note : Only keep those terms which have non-zero coefficients.

Sample Input 1 :
P1 : 1x2 2x3 4x6
P2 : 3x4 1x2
Sample Output 1 :
P1 + P2 = 2x2 2x3 3x4 4x6

Sample Input 2 :
P1 : 1x2 2x3 4x6
P2 : 3x4 1x2
Sample Output 2 :
P1 - P2 = 2x3 -3x4 4x6

*/

package CodingNinjas_Java;

public class Polynomial {
    private int poly[];
    private int maxDegree;

    public Polynomial() {
        poly = new int[5];
        maxDegree = 0;
    }

    public Polynomial(int degree) {
        poly = new int[degree];
        maxDegree = degree - 1;
    }

    //  This function sets coefficient for a particular degree value.
    public void setCoefficient(int degree, int coefficient) {
        while (degree > poly.length - 1) {
            doubleCapacity();
        }
        if (maxDegree < degree) {
            maxDegree = degree;
        }
        poly[degree] = coefficient;
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print() {
        for (int i = 0; i <= maxDegree; i++) {
            if (poly[i] != 0) {
                System.out.print(poly[i] + "x" + i + " ");
            }
        }
    }

    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p) {
        int degree1 = this.maxDegree;
        int degree2 = p.maxDegree;
        int limit = Math.max(degree1, degree2);

        Polynomial polySum = new Polynomial(limit + 1);
        for (int i = 0; i <= limit; i++) {
            int sum = 0;
            if (i <= degree1) {
                sum = sum + (this.poly[i]);
            }
            if (i <= degree2) {
                sum = sum + (p.poly[i]);
            }
            polySum.setCoefficient(i, sum);
        }
        return polySum;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p) {
        int degree1 = this.maxDegree;
        int degree2 = p.maxDegree;
        int limit = Math.max(degree1, degree2);

        Polynomial polySub = new Polynomial(limit + 1);
        for (int i = 0; i <= limit; i++) {
            int sum = 0;
            if (i <= degree1) {
                sum = sum - (this.poly[i]);
            }
            if (i <= degree2) {
                sum = sum - (p.poly[i]);
            }
            polySub.setCoefficient(i, sum);
        }
        return polySub;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p) {
        Polynomial polyMul = new Polynomial();

        for (int i = 0; i < p.poly.length; i++) {
            for (int j = 0; j < this.poly.length; j++) {
                if (i + j <= polyMul.maxDegree)
                    polyMul.setCoefficient(i + j, polyMul.poly[i + j] + p.poly[i] * this.poly[j]);
                else
                    polyMul.setCoefficient(i + j, p.poly[i] * this.poly[j]);
            }
        }
        return polyMul;
    }

    //  increase the length of the existing array
    private void doubleCapacity() {
        int temp[] = poly;
        poly = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            poly[i] = temp[i];
        }
    }

//    public Polynomial multiply(Polynomial p) {
//        int limit = this.maxDegree + p.maxDegree;
//
//        Polynomial polyMul = new Polynomial(limit + 1);
//
//        for (int i = 0; i <= this.maxDegree; i++) {
//            int product = 0;
//            for (int j = 0; j < p.maxDegree; j++) {
//                product = polyMul.poly[i + 1];
//                product = product + (this.poly[i] * p.poly[j]);
//                polyMul.setCoefficient(i + j, product);
//            }
//        }
//        return polyMul;
//    }
}

// Test cases are given in PolynomialUse class for better understanding