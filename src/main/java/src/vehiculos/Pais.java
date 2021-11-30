package vehiculos;
import java.util.*;

public class Pais {
	public static Map<String, Integer> paises=new HashMap<String,Integer>();
	public static ArrayList<Pais> pais=new ArrayList<Pais>();
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre=nombre;
		Pais.pais.add(this);}
	
	public static Pais paisMasVendedor() {
		int valorMax=0;
		String respuesta="";
		Pais retorno=null;
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
		for (int i=0;i<pais.size();i++) {
			if (pais.get(i).nombre==respuesta) 
				retorno=pais.get(i);}
		return retorno;}
	
	public String getNombre() {
		return nombre;}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;}}
