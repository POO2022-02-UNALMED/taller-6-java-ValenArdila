package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo {
	private int puestos;
	private static ArrayList<Automovil> listado =new ArrayList<Automovil>(); 

	public Automovil(String placa, String nombre,long precio, int peso,Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre,precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		listado.add(this);
		Pais.listadoP.add(fabricante.getPais());
		Fabricante.listadoF.add(fabricante);
	}
	
	public static int cantidadAutomoviles() {
		return listado.size();
		} 

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	

}
