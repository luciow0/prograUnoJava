public class verificador{
    fecha fecha;

    public boolean verificarBisiesto(int anio) {
        boolean bisiesto = false;
        if (anio % 4 == 0){
            bisiesto = true;
            if(anio % 100 == 0){
                bisiesto = false;
            } else if (anio % 400 == 0) {
                bisiesto = true;
            }
        }

        return bisiesto;
    }

    public boolean verificarFecha(fecha fecha) {
        int mes = fecha.getMes();
        int dia = fecha.getDia();
        boolean fechaValida = true;
        int anio = fecha.getAnio();
        boolean verificarAnio = verificarBisiesto(anio);
        int[][] matriz = fecha.getDias();

        if(mes == 2 && verificarAnio){
           int valor = matriz[1][0];
            valor += 1;
            matriz[1][0] = valor;
        }
        if (anio < 1000){
            fechaValida = false;
        } else if (mes < 1 || mes > 12) {
            fechaValida = false;
        }
        else if (dia < 1 || dia > matriz[mes -1][0]) {
            fechaValida = false;
        }
        else{
            fechaValida = true;
        }

        return fechaValida;
    }


}
