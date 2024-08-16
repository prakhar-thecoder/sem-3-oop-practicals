class Complex {
    private float i, j;
    
    public Complex (float i, float j) {
        this.i = i;
        this.j = j;
    }
    
    public void display() {
        if (j >= 0) {
            System.out.println(i + "+" + j + "i");
        } else {
            System.out.println(i + "-" + Math.abs(j) + "i");
        }
    }
    
    public Complex add(Complex c) {
        return new Complex(this.i + c.i, this.j + c.j);
    }
    
    public Complex sub(Complex c) {
        return new Complex(this.i - c.i, this.j - c.j);
    }
}

public class P4 {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        
        Complex add = c1.add(c2);
        System.out.print("c1 + c2 = ");
        add.display();
        
        Complex sub = c1.sub(c2);
        System.out.print("c1 - c2 = ");
        sub.display();
    }
}
