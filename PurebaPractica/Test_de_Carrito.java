package controladorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import controlador.Carrito;
import modelo.Producto;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
class Test_de_Carrito {

	Carrito carrito = new Carrito();
	Producto producto1 = new Producto(1, "Galleta de Chocolate", "20/06/2020", 1000, 10);
	Producto producto2 = new Producto(2, "Bolsa de Leche", "30/05/2020", "Colanta", 3000, 20);
	Producto producto3 = new Producto(3, "Gaseosa", "20/06/2020", 2000, 15);
	Producto auxiliar = producto3;
	
	@BeforeEach
	@DisplayName("Test de agregacion de productos al carrito antes de ejectar el resto del test")
	public void agregarDatos() {
		carrito.anadirCarrito(producto1, 5);
		carrito.anadirCarrito(producto2, 15);
	}

	@AfterEach
	@DisplayName("Test de eliminacion de los productos del carrito")
	public void eliminarTodos() {
		carrito.vaciarCarrito();
	}
	
	
	@Test
	@DisplayName("Test agregacion de productos al carrito superando la cantidad disponible")
	void testAgregacion() {
		boolean actual = carrito.anadirCarrito(auxiliar, 20);
		boolean esperado = false;
		//11
		assertEquals(actual, esperado);

	}
	
	@Test
	@DisplayName("Test agregacion de productos al carrito no superando la cantidad disponible")
	void testAgregacion2() {
		//12
		assertTrue(carrito.anadirCarrito(auxiliar, 5));

	}
	
	@Test
	@DisplayName("Test agregacion de productos al carrito superando la cantidad disponible por uno")
	void testAgregacion3() {
		//13
		assertFalse(carrito.anadirCarrito(auxiliar, 16));

	}
	
	@Test
	@DisplayName("Test agregacion de productos al carrito con la misma cantidad disponible")
	void testAgregacion4() {
		//14
		//Preguntar----------------------------------------------------------------------------
		assertTrue(carrito.anadirCarrito(auxiliar, 15));
		//15
		assertFalse(carrito.anadirCarrito(auxiliar, 15));
	}

}
