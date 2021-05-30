package program1;

class Complex {
    double real;
    double imag;

    public Complex(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }

    public Complex(double real)
    {
        this(real, 0.0);
    }
    public String print()
    {
        return  real+" + "+imag+"i";
    }

}
