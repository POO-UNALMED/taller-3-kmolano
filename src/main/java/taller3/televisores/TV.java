package taller3.televisores;

public class TV {
    Marca marca;
    int canal = 1;
    int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;
    static int numTV = 0;

    //Constructor sobre marca y estado
    public TV(){
        numTV++;
    }
    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    //Metodos SET and GET
    //Marca
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    //Canal
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        if(this.estado && (canal >=1 && canal<=120)){
            this.canal = canal;
        }
    }

    //Precio
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //Volumen
    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    //Control
    public Control getControl() {
        return control;
    }
    public void setControl(Control control) {
        this.control = control;
    }

    //numTV
    public static int getNumTV() {
        return numTV;
    }
    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    //Estado
    public boolean getEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //Metodo prender y apagar
    public  void turnOn(){
        this.estado = true;
    }
    public  void turnOff(){
        this.estado = false;
    }

    //Subir de canal
    public void canalUp(){
        if ((this.estado) && (this.canal<120 && this.canal>=1)){
            this.canal++;
        }
    }
    //Bajar de canal
    public void canalDown(){
        if((this.estado) && (this.canal<=120 && this.canal>1))
        this.canal--;
    }

    //Subir volumen
    public void volumenUp(){
        if(this.estado && this.volumen>=1 && this.volumen<7){
            this.volumen++;
        }
    }
    //Bajar volumen
    public void volumenDown(){
        if(this.estado && this.volumen>1 && this.volumen<=7)
        this.volumen--;
    }







}
