package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
	protected static ArrayList<Vehiculo> vehiculos=new ArrayList<Vehiculo>();  
	protected static int cantidadVehiculos=0;
	protected String placa;
	protected int puertas;
	protected float velocidadMaxima;
	protected String nombre;
	protected float precio;
	protected float peso;
	protected String traccion;
	protected Fabricante fabricante;
	
	public Vehiculo() {cantidadVehiculos++;}
	
	public Vehiculo(String placa, int puertas, float velocidad,String nombre, float precio, float peso, String traccion, Fabricante fabricante) {
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidad;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		cantidadVehiculos++;
		vehiculos.add(this);}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.getCantidadAutomovil()+"\nCamionetas: "+Camioneta.getCantidadCamioneta()+"\nCamiones: "+Camion.getCantidadCamion();}}