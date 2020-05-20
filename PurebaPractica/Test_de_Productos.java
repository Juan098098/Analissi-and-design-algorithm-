package controladorTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import controlador.Productos;
import modelo.Producto;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
class Test_de_Productos {


			Productos productos = new Productos();
			Producto producto1 = new Producto(1, "Galleta de Chocolate", "20/06/2020", 1000, 10);
			Producto producto2 = new Producto(2, "Bolsa de Leche", "30/05/2020", "Colanta", 3000, 20);
			Producto producto3 = new Producto(3, "Gaseosa", "20/06/2020", 2000, 15);
			Producto producto4 = new Producto(1, "Producto con Id repetido", "20/06/2020", 2000, 15);
			Producto producto5 = new Producto(5, "Pan", "20/06/2020", 2000, 20);


	@BeforeEach
	@DisplayName("Test de agregacion de productos antes de ejectar el resto del test")
	public void agregarDatos() {
		productos.agregar(producto1);
		productos.agregar(producto2);
		productos.agregar(producto3);
	}

	@AfterEach
	@DisplayName("Test de eliminacion de los productos de la lista")
	public void eliminarTodos() {
		productos.eliminar(producto1);
		productos.eliminar(producto2);
		productos.eliminar(producto3);
	}

	//@Nested
	//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
	//class Pruebas_de_Productos {			

		@Test
		@Order(1)
		@DisplayName("Test de validacion para agregar productos con ID no repetida")
		public void testAgregar() {
			boolean expected = false;
			boolean actual = productos.agregar(producto4);
			//1
			assertEquals(expected, actual);  
			//2
			assertNotSame(producto4,producto1);
		}
		
		@ParameterizedTest
		@Order(3)
		@ValueSource(strings = { "Galleta de Chocolate", "Gaseosa" })
		@DisplayName("Test parametrizado para buscar diferentes productos en la lista de productos")
		void testBuscar(String entrada) {
			//3
			assertNotNull(productos.buscarPorNombre(entrada));
			//4
			//assertTimeout(1,productos.buscarPorNombre(entrada),"Tiempo de ejecucion debe ser menor a 0.5 segundos" );
		} 

		@Order(2)
		@RepeatedTest(value = 3, name = "{displayName} Repeticion {currentRepetition} de {totalRepetitions}")
		@DisplayName("Test para buscar el mismo producto 3 veces.")
		public void testRepetido() {
			//5
			assertEquals(producto2, productos.buscarPorId(2));
			
			//6
			//assertAll("", productos.buscarPorId(1),productos.buscarPorId(2),productos.buscarPorId(3));
		}
		
		@Test
		@DisplayName("Test para mostrar lista")
		@Disabled("Test para mostrar lista desactivado")
		void mostrarLista() {
			String expected = "";
			String actual = productos.mostrarLista();
			//7
			assertEquals(expected, actual);
		}
		
		@Test
		@DisplayName("Test para disminuir cantidad de productos")
		@Timeout(1)
		@Order(4)
		void testdDismCant() {
			productos.disminuirCantidad(2, 1);
			//8
			assertEquals(19,producto2.getCantidad());
		}
		
		@Test
		@DisplayName("Test para eliminar productos existentes y no existentes")
		@Order(5)
		void testdEliminar() {
			//9
			assertTrue(productos.eliminar(producto3));
			//10
			assertFalse(productos.eliminar(producto5));
		}

		// TODO add test methods here.
		// The methods must be annotated with annotation @Test. For example:
		//
		// @Test
		// public void hello() {}

	}
//}
