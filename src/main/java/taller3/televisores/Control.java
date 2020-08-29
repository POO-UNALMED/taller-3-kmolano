package taller3.televisores;

public class Control {
    TV tv;

    //GET and SET
    public TV getTv() {
        return tv;
    }
    public void setTv(TV tv) {
        this.tv = tv;
    }

    //Enlazar
    public void enlazar(TV tv) {
        tv.control = this;
        this.tv = tv;
    }

    //Subir de canal
    public void canalUp(){
        if (tv.estado && tv.canal<120 && tv.canal>=1){
            tv.canal++;
        }
    }
    //Bajar canal
    public void canalDown(){
        if(tv.estado && tv.canal<=120 && tv.canal>1)
            tv.canal--;
    }

    //Subir volumen
    public void volumenUp(){
        if(tv.estado && tv.volumen>=1 && tv.volumen<7){
            tv.volumen++;
        }
    }
    //Bajar volumen
    public void volumenDown(){
        if(tv.estado && tv.volumen>1 && tv.volumen<=7)
            tv.volumen--;
    }

    //SET canal
    public void setCanal(int canal) {
        tv.canal = canal;
    }


    public  void turnOff(){
        tv.estado = true;
    }
    public  void turnOn(){
        tv.estado = true;
    }


}
