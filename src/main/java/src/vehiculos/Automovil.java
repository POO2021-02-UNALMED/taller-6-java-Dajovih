package vehiculos;

public class Automovil extends Vehiculo{
	private static int cantidadAutomovil=0;
	private int puestos;
	
	public Automovil() {cantidadAutomovil++;}
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos=puestos;
		cantidadAutomovil++;}
	
	public int getPuestos() {
		return puestos;}
	
	public void setPuestos(int nuevo) {
		puestos=nuevo;}
	
	public static int getCantidadAutomovil() {
		return cantidadAutomovil;}
	
	public static void setCantidadAutomovil(int nuevo) {
		Automovil.cantidadAutomovil=nuevo;}}