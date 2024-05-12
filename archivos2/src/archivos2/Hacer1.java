package archivos2;

public class Hacer1 {
    int Can;
    double Cos;
    double total;

    public Hacer1(int Can, double Cos) {
        this.Can = Can;
        this.Cos = Cos;
    }

    public Hacer1(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    

    public int getCan() {
        return Can;
    }

    public void setCan(int Can) {
        this.Can = Can;
    }

    public double getCos() {
        return Cos;
    }

    public void setCos(double Cos) {
        this.Cos = Cos;
    }
    
}
