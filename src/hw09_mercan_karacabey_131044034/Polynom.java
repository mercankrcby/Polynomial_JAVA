
package hw09_mercan_karacabey_131044034;

public class Polynom {

    private double[] coeffs;
    private int size;

    /**
     * Aldigi size kadar dinamik double array olusturur.
     * @param _size array boyutunu belirler
     */
    public Polynom(int _size) {
        coeffs = new double[_size];
        size = _size;
    }

    /**
     * Copy constuctor. Polinomlar arasi atama saglar
     * @param newPoly copalanacak polinom
     */
    public Polynom(Polynom newPoly) {

        size = newPoly.getSize();
        coeffs = new double[getSize()];
        for (int i = 0; i < size; ++i) {
            coeffs[i] = newPoly.coeffs[i];
        }
    }
    /**
     * Constructor
     * @param array
     * @param arrSize 
     */
    public Polynom(double array[], int arrSize) {
        size = arrSize;
        coeffs = new double[getSize()];
        for (int i = 0; i < size; ++i) {
            coeffs[i] = array[i];
        }

    }
    /**
     * 
     * @param value
     * @return 
     */
    public double evaluate(double value) {
        double sum = 0;

        for (int i = 0; i < getSize(); ++i) {
            sum = sum + Math.pow(value, getSize() - 1 - i) * getItem(i);
        }
        return sum;
    }
    /**
     * ********************GETTERS**************************
     * @param where
     * @return 
     */
    public double getItem(int where) {
        // eger array disi ise -999 return et
        return where < 0 || where > getSize() ? (-999) : coeffs[where];
    }

    public int getSize() {
        return size;
    }
    //polynom classına ait toString metodu
    @Override
    public String toString() {
        String str = ""; // bos string - null yapinca basina null koyuyo dikkat
        for (int i = 0; i < getSize(); ++i) {
            str = str + String.format("+(%2.3f)x^%d", getItem(i), getSize() - 1 - i);
        }
        return str;
    }
    //polynom classına ait equal metodu
    @Override
    public boolean equals(Object compare) {
        if (compare instanceof Polynom) { // inheritence testi
            // testi gecti cast et
            Polynom newItem = (Polynom) compare;

            int max = -999;
            max = Math.max(getSize(), newItem.getSize());

            // her elemana tek tek bakalım
            for (int i = 0; i < max; ++i) {
                if (getItem(i) != newItem.getItem(i)) // farkli bulunca false 
                {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;

    }
    /**
     * iki polinomu toplar ve sonucunda arrayi dondurur
     * @param second
     * @return 
     */
    public Polynom sumPolynom(Polynom second) {

        int sizeNew = Math.max(getSize(), second.getSize());

        double[] coefficients = new double[sizeNew];
        for (int i = 0; i < sizeNew; ++i) {
            coefficients[i] = 0;
        }

        // aradaki fark kadar git ve elemanlari sirayla yerlestir
        for (int i = 0; i < getSize(); i++) {
            coefficients[i + Math.abs(getSize() - sizeNew)] += getItem(i);
        }

        // aradaki fark kadar gir ve elemanlari sirayla yerlestir
        for (int i = 0; i < second.getSize(); i++) {
            coefficients[i + Math.abs(sizeNew - second.getSize())] += second.getItem(i);
        }

        return new Polynom(coefficients, sizeNew);
    }
    /**
     * iki polinomu cıkarır ve fark arrayini return eder
     * @param second
     * @return 
     */
    public Polynom subsPolynom(Polynom second) {

        int sizeNew = Math.max(getSize(), second.getSize());

        double[] coefficients = new double[sizeNew];
        for (int i = 0; i < sizeNew; ++i) {
            coefficients[i] = 0;
        }

        // aradaki fark kadar git ve elemanlari sirayla yerlestir
        for (int i = 0; i < getSize(); i++) {
            coefficients[i + Math.abs(getSize() - sizeNew)] += getItem(i);
        }

        // aradaki fark kadar git ve elemanlari sirayla cikar
        for (int i = 0; i < second.getSize(); i++) {
            coefficients[i + Math.abs(sizeNew - second.getSize())] -= second.getItem(i);
        }

        return new Polynom(coefficients, sizeNew);
    }
    /**
     * iki polinomu carpar ve yeni arrayi return eder
     * @param second
     * @return 
     */
    public Polynom cross(Polynom second) {

        int sizeNew = getSize() + second.getSize() - 1;
        Polynom crossPol = new Polynom(sizeNew);
        for (int i = 0; i < getSize(); i++) {
            for (int j = 0; j < second.getSize(); j++) {
                crossPol.coeffs[i + j] += (getItem(i) * second.getItem(j));
            }
        }
        return crossPol;
    }
}
