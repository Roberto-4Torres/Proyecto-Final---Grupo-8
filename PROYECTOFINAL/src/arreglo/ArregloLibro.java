package arreglo;

import java.util.ArrayList;

import clase.Libro;

public class ArregloLibro 
{
private ArrayList<Libro>li;
public ArregloLibro() 
{
li=new ArrayList<Libro>();
}
public void Adicionar(Libro x) 
{
 li.add(x);
}
public int Tamaño() 
{
	return li.size();
}
public Libro Obtener(int x) 
{
	return li.get(x);
}

}

