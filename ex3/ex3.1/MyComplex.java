import java.security.PublicKey;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;
    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag){
        this.imag = getImag();
        this.real = getReal();
    }
    public String toString() {
        return real + " + " + imag + "i";
    }
    public  boolean isReal() {
        if (imag == 0) {
            return true;
        }
        return false;
    }
    public boolean isImaginary() {
        if (real == 0) return true;
        return false;
    }


    public boolean equals(double real , double imag) {
        return (this.real == real && this.imag == imag);
    }
    public boolean equals(MyComplex another ) {
        return (this.real == another.real && this.imag == another.imag);
    }
    public double magnitude() {
        return Math.sqrt(real*real + imag*imag);
    }
    public double argument(){
        return Math.atan2(imag, real);
    }

    public MyComplex addInto(MyComplex right) {

        this.real += right.real;
        this.imag += right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right) {
        MyComplex MC = new MyComplex();
        MC.imag = this.imag + right.imag;
        MC.real = this.real + right.real;
        return MC;
    }
    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }
    public MyComplex subtractNew(MyComplex right) {
        MyComplex MC = new MyComplex();
        MC.real = this.real - right.real;
        MC.imag = this.imag - right.imag;
        return MC;
    }
    public  MyComplex multiply(MyComplex right) {
        this.real = (this.real * right.real) - (this.imag * right.imag);
        this.imag = (this.real * right.imag) + (this.imag * right.imag);
        return this;
    }
    public MyComplex divide(MyComplex another) {
        double denominator = (another.real * another.real) + (another.imag * another.imag);
        double newReal = ((this.real * another.real) + (this.imag * another.imag)) / denominator;
        double newImag = ((this.imag * another.real) - (this.real * another.imag)) / denominator;
        return new MyComplex(newReal, newImag);
    }

    public MyComplex onjugate() {
        this.imag *= -1;
        return this;
    }



}
