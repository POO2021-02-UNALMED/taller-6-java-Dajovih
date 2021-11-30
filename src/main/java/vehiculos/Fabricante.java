package vehiculos;
import java.util.*;

public class Fabricante {
	public static Map<String, Integer> fabricantes=new HashMap<String,Integer>();
	public static ArrayList<Fabricante> fabri=new ArrayList<Fabricante>();
	private String nombre;
	private Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		Fabricante.fabri.add(this);}
	
	public static Fabricante fabricaMayorVentas() {
		int valorMax=0;
		String respuesta="";
		for (int i=0;i<Vehiculo.vehiculos.size();i++) {
			Vehiculo x=Vehiculo.vehiculos.get(i);
			if (fabricantes.containsKey(x.fabricante.nombre)==true)
				fabricantes.put(x.fabricante.nombre,fabricantes.get(x.fabricante.nombre)+1);
			else
				fabricantes.put(x.fabricante.nombre, 1);}
		for (Map.Entry<String, Integer> entry : fabricantes.entrySet()) {
		    final int valorActual = entry.getValue();
		    if (valorActual > valorMax) { 
		        valorMax = valorActual;
		        respuesta=entry.getKey();}}
		for (int i=0;i<fabri.size();i++) {
			if (Vehiculo.vehiculos.get(i).nombre==respuesta)
				return Vehiculo.vehiculos.get(i);
		}
	}
	
	public String getNombre() {
		return nombre;}
	
	public Pais getPais() {
		return pais;}
	
	public void setNombre(String nuevo) {
		nombre=nuevo;}
	
	public void setPais(Pais nuevo) {
		pais=nuevo;}}


