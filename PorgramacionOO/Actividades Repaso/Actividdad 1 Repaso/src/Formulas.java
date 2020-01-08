public class Formulas {

    public Formulas(){

    }

    public double HipCatetos(double cateto1, double cateto2){
        double formula = ((cateto1 * cateto1) + (cateto2 * cateto2));
        double hipotenusa = Math.sqrt(formula);
        return hipotenusa;
    }

    public double CatHipYCat(double cateto, double hipotenusa){
        double formula = ((hipotenusa * hipotenusa) + (cateto * cateto));
        double catetoX = Math.sqrt(formula);
        return catetoX;
    }

    public double AreaCatEHip(double cateto, double hipotenusa){
        double catetoFaltante = CatHipYCat(cateto,hipotenusa);
        double area = (cateto * catetoFaltante) / 2 ;
        return area;
    }

    public double AreaDoscatetos( double cateto1, double cateto2){
        double area = (cateto1 * cateto2) / 2;
        return area;
    }
}
