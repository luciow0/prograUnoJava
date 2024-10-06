public class mayorEstricto {
    int valor1;
    int valor2;
    int valor3;
    public int calcularMayorEstricto(int valor1, int valor2, int valor3){
        boolean esMayor = false;
        int mayorEstricto = -1;
        if (valor1 > valor2){
            esMayor = true;
            if (esMayor){
                if (valor1 > valor3){
                    esMayor = true;
                    mayorEstricto = valor1;
                }
                else{
                    esMayor = false;
                }
            }
        }
        if (valor2 > valor1){
            esMayor = true;
            if (esMayor){
                if (valor2 > valor3){
                    esMayor = true;
                    mayorEstricto = valor2;
                }
                else{
                    esMayor = false;
                }
            }
        }
        if (valor3 > valor2){
            esMayor = true;
            if (esMayor){
                if (valor3 > valor1){
                    esMayor = true;
                    mayorEstricto = valor3;
                }
                else{
                    esMayor = false;
                }
            }
        }

        return mayorEstricto;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getValor3() {
        return valor3;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }
}
