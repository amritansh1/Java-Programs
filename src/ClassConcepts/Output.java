package ClassConcepts;

class Complex {  
    private double  re, im;           
   
    public Complex(double re, double it) {  
        this.re = re;  
        this.im = im;  
    }  
}  
    
// Driver class to test the Complex level  
public class Output {  
    public static void main(String[] args) {  
        Complex c1 = new Complex(10, 15);  
        System.out.println(c1);  
        System.out.println("A" + 'B' + 'A'); 
        System.out.println('B' + 'A'+"C"); 
        System.out.println("10"+20+30); 
        System.out.println(20+30+"10"); 
    }  
} 