package vehiculos;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Fabricante {
	public static Map<String, Integer> fabricantes=new HashMap<String,Integer>();
	private String nombre;
	private Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		fabricantes1.add(this);}
	
	public static Fabricante fabricaMayorVentas() {
		int valorMax=0;
		Fabricante respuesta=null;
		for (int i=0;i<Vehiculo.vehiculos.size();i++) {
			Vehiculo x=Vehiculo.vehiculos.get(i);
			if (fabricantes.containsKey(x.fabricante)==true)
				fabricantes.put(x.fabricante,fabricantes.get(x.fabricante)+1);
			else
				fabricantes.put(x.fabricante, 1);}
		for (Map.Entry<String, Integer> entry : fabricantes.entrySet()) {
		    final int valorActual = entry.getValue();
		    if (valorActual > valorMax) {
		        valorMax = valorActual;
		        respuesta=entry.getKey();}}
		return respuesta;}
	
	public String getNombre() {
		return nombre;}
	
	public Pais getPais() {
		return pais;}
	
	public void setNombre(String nuevo) {
		nombre=nuevo;}
	
	public void setPais(Pais nuevo) {
		pais=nuevo;}}


