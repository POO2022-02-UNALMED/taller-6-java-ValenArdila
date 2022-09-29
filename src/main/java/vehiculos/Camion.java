package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo {
	private int ejes;
	private static ArrayList<Camion> listado =new ArrayList<Camion>();

	public Camion(String placa, String nombre,long precio, int peso,
			Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre,precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		listado.add(this);
		Pais.listadoP.add(fabricante.getPais());
		Fabricante.listadoF.add(fabricante);
	}
	
	public static int cantidadCamion() {
		return listado.size();
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	

}
