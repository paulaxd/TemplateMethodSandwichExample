
public class SangucheVegetariano extends Sanguche {

	@Override
	public void agregarIngredientes() {
		System.out.println("Agregando: Vegetales, huevo, queso");
	}
	
	// En este caso sobreescribo elegirPan() para reemplazar la implementación del Hook Method original.
	@Override
	public void elegirPan() {
		System.out.println("Eligiendo pan: Negro");
	}

}
