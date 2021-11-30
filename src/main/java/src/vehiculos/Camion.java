package vehiculos;

public class Camion extends Vehiculo{
	private static int cantidadCamion=0;
	private int ejes;
	
	public Camion() {cantidadCamion++;}
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		this.ejes=puestos;
		cantidadCamion++;}
	
	public int getEjes() {
		return ejes;}
	
	public void setEjes(int nuevo) {
		ejes=nuevo;}
	
	public static int getCantidadCamion() {
		return cantidadCamion;}
	
	public static void setCantidadCamion(int nuevo) {
		Camion.cantidadCamion=nuevo;}}
