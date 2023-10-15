public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree() {
        return coeffs.length - 1;
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }


    public MyPolynomial add(MyPolynomial another) {
        int maxDegree = Math.max(this.getDegree(), another.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];
        for (int i = 0; i <= maxDegree; i++) {
            newCoeffs[i] = (i <= this.getDegree() ? this.coeffs[i] : 0)
                    + (i <= another.getDegree() ? another.coeffs[i] : 0);
        }
        return new MyPolynomial(newCoeffs);
    }


    public MyPolynomial multiply(MyPolynomial another) {
        int newDegree = this.getDegree() + another.getDegree();
        double[] newCoeffs = new double[newDegree + 1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= another.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * another.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial subtract(MyPolynomial another) {
        int maxDegree = Math.max(this.getDegree(), another.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];
        for (int i = 0; i <= maxDegree; i++) {
            newCoeffs[i] = (i <= this.getDegree() ? this.coeffs[i] : 0)
                    - (i <= another.getDegree() ? another.coeffs[i] : 0);
        }
        return new MyPolynomial(newCoeffs);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                sb.append(coeffs[i] > 0 ? " + " : " - ");
                sb.append(Math.abs(coeffs[i]));
                if (i > 0) {
                    sb.append("*x");
                    if (i > 1) {
                        sb.append("^" + i);
                    }
                }
            }
        }
        return sb.toString();
    }
}
