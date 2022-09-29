package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	static ArrayList<Fabricante> listadoF =new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Pais p1=new Pais("Mexico");
		Fabricante moda=new Fabricante("Mexico",p1);
		int Repetido=0;
		for(int i=0; i<listadoF.size(); i++)
	    {
	        int f = 0;
	        for(int j=0; j<listadoF.size(); j++)
	        {
	            if(listadoF.get(i)==listadoF.get(j))
	            {
	                f++;
	            } 
	      }
	        if(f>Repetido)
            {
                moda= listadoF.get(i);
                Repetido= f;
            }   
	   }
		return moda;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	} 
	
	
}
