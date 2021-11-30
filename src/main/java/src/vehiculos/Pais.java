package vehiculos;
import java.util.*;

public class Pais {
	public static Map<String, Integer> paises=new HashMap<String,Integer>();
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre=nombre;}
	
	public static String paisMasVendedor() {
		int valorMax=0;
		String respuesta="";
		
		for (int i=0;i<Vehiculo.vehiculos.size();i++) {
			Vehiculo x=Vehiculo.vehiculos.get(i);
			if (paises.containsKey(x.fabricante.getPais().nombre)==true)
				paises.put(x.fabricante.getPais().nombre,paises.get(x.fabricante.getPais().nombre)+1);
			else
				paises.put(x.fabricante.getPais().nombre, 1);}
		for (Map.Entry<String, Integer> entry : paises.entrySet()) {
		    final int valorActual = entry.getValue();
		    if (valorActual > valorMax) {
		        valorMax = valorActual;
		        respuesta=entry.getKey();}}
		return respuesta;}
	
	public String getNombre() {
		return nombre;}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;}}
