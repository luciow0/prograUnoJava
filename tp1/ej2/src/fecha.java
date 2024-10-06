public class fecha {
    int dia;
    int mes;
    int anio;
    int[] meses = {1,2,3,4,5,6,7,8,9,10,11,12};
    int[][] dias = {
            {31},
            {28},
            {31},
            {30},
            {31},
            {30},
            {31},
            {31},
            {30},
            {31},
            {30},
            {31}
    };

    public fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public fecha(){}

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int[] getMeses() {
        return meses;
    }

    public int[][] getDias() {
        return dias;
    }
}
