package entidades;


public class Cafetera {
    private int caspacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int caspacidadMaxima, int cantidadActual) {
        this.caspacidadMaxima = caspacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCaspacidadMaxima() {
        return caspacidadMaxima;
    }

    public void setCaspacidadMaxima(int caspacidadMaxima) {
        this.caspacidadMaxima = caspacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    public void llenarCafetera(){
    this.cantidadActual=this.caspacidadMaxima;
    }
    public void servirTaza(int servir){
        if (servir>this.cantidadActual) {
            servir=this.cantidadActual;
            System.out.printf("la taza solo se lleno con %d \n",servir);
            this.cantidadActual=0;
        }else{
            this.cantidadActual-=servir;
            System.out.printf("la taza se lleno por completo con %d \n" , servir);
         }
    }
        public void vaciarCafetera(){
            System.out.println("se vacio la cafetera");
            this.cantidadActual=0;
        }    
        public void agregarCafe (int cafe){
            if (cafe+this.cantidadActual>this.caspacidadMaxima) {
                this.cantidadActual=this.caspacidadMaxima;
                System.out.printf("la cafetera se lleno por completo y sobro %d \n",(cafe+this.cantidadActual)-this.caspacidadMaxima);
            }else{
                this.cantidadActual+=cafe;
                System.out.printf("se agrego el cafe y hay %d",this.cantidadActual);
                
            }
            
                }
        public void mostrarCantidadDeCafe(){
            System.out.printf("la cantidad de cafe es %d\n",this.cantidadActual);
            
        }
    }
