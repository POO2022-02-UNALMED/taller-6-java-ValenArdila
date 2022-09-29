package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	static ArrayList<Pais> listadoP =new ArrayList<Pais>();

	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		Pais moda=new Pais("Mexico");
		int Repetido=0;
		for(int i=0; i<listadoP.size(); i++)
	    {
	        int f = 0;
	        for(int j=0; j<listadoP.size(); j++)
	        {
	            if(listadoP.get(i)==listadoP.get(j))
	            {
	                f++;
	            } 
	      }
	        if(f>Repetido)
            {
                moda= listadoP.get(i);
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
	

}
