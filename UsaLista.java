
/**
 * Write a description of class UsaLista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UsaLista
{
    public static void main(String[] args){
        ListaDoble lista = new ListaDoble();
        lista.insertaPrimerNodo("R");
		lista.imprimir();
		lista.insertaPrimerNodo("F");
		lista.imprimir();
		System.out.println(lista);
		lista.insertaAntesPrimerNodo("H");
		System.out.println(lista);
		lista.insertaAlFinal("Z");
    }
}
