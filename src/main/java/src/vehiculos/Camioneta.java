package vehiculos;

public class Camioneta extends Vehiculo{
	private static int cantidadCamioneta=0;
	private boolean volco;
	
	public Camioneta() {cantidadCamioneta++;}
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean puestos) {
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
		this.volco=puestos;
		cantidadCamioneta++;}
	
	public boolean isVolco() {
		return volco;}
	
	public void setVolco(boolean nuevo) {
		volco=nuevo;}
	
	public static int getCantidadCamioneta() {
		return cantidadCamioneta;}
	
	public static void setCantidadCamioneta(int nuevo) {
		Camioneta.cantidadCamioneta=nuevo;}}
