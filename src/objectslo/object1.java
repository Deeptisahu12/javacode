package objectslo;

public class object1 {
    public void driver(){

        Complex c1=new Complex();
        c1.setComplex(10,20);
        c1.printComplex();

    }
}
class Complex{
    private int real,imag;
    public void setComplex(int r,int i){
        real=r;
        imag=i;
    }
    public void printComplex(){
        System.out.println("Real="+real+ "Imag="+imag);
    }
}
