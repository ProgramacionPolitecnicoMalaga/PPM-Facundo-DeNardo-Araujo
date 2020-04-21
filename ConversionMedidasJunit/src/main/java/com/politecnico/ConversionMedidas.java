package com.politecnico;

public  class ConversionMedidas {
    public  Double inchACm(double inch){
        double cm = inch * 2.54;
        return cm;
    }

    public  Double cmAInch(double cm){
        double inch = cm/2.54;
        return  inch;
    }
}
