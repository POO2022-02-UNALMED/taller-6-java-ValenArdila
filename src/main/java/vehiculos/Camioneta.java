package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static ArrayList<Camioneta> listado =new ArrayList<Camioneta>();

	public Camioneta(String placa, int puertas, String nombre,long precio, int peso,
			Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre,precio, peso, "4X4", fabricante);
		this.volco = volco;
		listado.add(this);
		Pais.listadoP.add(fabricante.getPais());
		Fabricante.listadoF.add(fabricante);
	}
	
	public static int cantidadCamionetas() {
		return listado.size();
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	} 
	
	

}
