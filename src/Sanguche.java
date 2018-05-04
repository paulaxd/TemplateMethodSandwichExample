
public abstract class Sanguche {

	// Template Method
	public final void hacerSanguche() {
		
		// Pasos
		elegirPan();
		
		cortarPan();
		
		agregarIngredientes();
		
		envolver();
	}
	
	// Hook methods.
	public void elegirPan() {
		System.out.println("Eligiendo pan: Blanco");
	}
	
	// Abstract methods.
	public abstract void agregarIngredientes();
	
	// Concrete methods.
	public void cortarPan() {
		System.out.println("Cortando pan");
	}
	
	public void envolver() {
		System.out.println("Envolviendo sanguche");
	}
}
