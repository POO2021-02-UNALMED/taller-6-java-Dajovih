package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
	protected static ArrayList<Vehiculo> vehiculos=new ArrayList<Vehiculo>();  
	protected static int cantidadVehiculos=0;
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	
	public Vehiculo() {cantidadVehiculos++;}
	
	public Vehiculo(String placa, int puertas, int velocidad,String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
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
		return "Automoviles: "+Automovil.getCantidadAutomovil()+"\nCamionetas: "+Camioneta.getCantidadCamioneta()+"\nCamiones: "+Camion.getCantidadCamion();}
	
	public String getPlaca() {
		return placa;}
	
	public int getPuertas() {
		return puertas;}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;}
	
	public String getNombre() {
		return nombre;}
	
	public int getPrecio() {
		return precio;}
	
	public int getPeso() {
		return peso;}
	
	public String getTraccion() {
		return traccion;}
	
	public Fabricante getFabricante() {
		return fabricante;}
	
	public void setPlaca(String nuevo) {
		placa=nuevo;}
	
	public void setPuertas(int nuevo) {
		puertas=nuevo;}
	
	public void setVelocidadMaxima(int nuevo) {
		velocidadMaxima=nuevo;}
	
	public void setNombre(String nuevo) {
		nombre=nuevo;}
	
	public void setPrecio(int nuevo) {
		precio=nuevo;}
	
	public void setPeso(int nuevo) {
		peso=nuevo;}
	
	public void setTraccion(String nuevo) {
		traccion=nuevo;}
	
	public void setFabricante(Fabricante nuevo) {
		fabricante=nuevo;}
	
	public static void setCantidadVehiculos(int nuevo) {
		cantidadVehiculos=nuevo;}}