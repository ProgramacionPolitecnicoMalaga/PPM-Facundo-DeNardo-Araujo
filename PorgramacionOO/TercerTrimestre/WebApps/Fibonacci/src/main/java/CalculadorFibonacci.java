public class CalculadorFibonacci {
    int tamañoSerie;

    public CalculadorFibonacci(int tamañoSerie){
        this.tamañoSerie = tamañoSerie;
    }

    public String mostrarSerie(){
        String serie = "";
        for (int i = 0; i < tamañoSerie; i++) {
            serie += fibonacci(i)+" ";
        }
        return serie;
    }

    int fibonacci(int n)
    {
        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
        }
        else if (n==1) {  // caso base
            return 1;
        }
        else if (n==0){  // caso base
            return 0;
        }
        else{ //error
            return -1;
        }
    }


}