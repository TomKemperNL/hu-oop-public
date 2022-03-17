package nl.hu.oop.demos;

public class Rekening {
    private int rekeningnr;
    private double saldo;

    public Rekening(){
        rekeningnr = 1000;
        saldo = 0;
    }

    public Rekening(int reknr){
        rekeningnr = reknr;
        saldo = 0;
//        this(reknr, 0);
    }

    public Rekening(int reknr, double startSaldo){
        rekeningnr = reknr;
        saldo = startSaldo;
    }


    public void stort(double bedrag){
        saldo = saldo + bedrag;
    }

    public void stort(double bedrag, String geldsoort){
        if(geldsoort.equals("EUR")){
            this.stort(bedrag);
        }else if(geldsoort.equals("DOL")){
            this.stort(bedrag * 0.9);
        }else{
            System.out.println("ONBEKENDE VALUTA");
        }
    }

    public double getSaldo(){
        return saldo;
    }
    public String toString(){
        return "Rekeningnr: " + rekeningnr + ", saldo: " + saldo;
    }


}
