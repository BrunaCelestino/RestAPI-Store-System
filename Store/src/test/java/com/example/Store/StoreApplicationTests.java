package com.example.Store;

import com.example.Store.domain.dto.ProductDTO;
import com.example.Store.domain.model.Product;
import com.example.Store.domain.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreApplicationTests {

	@Autowired
	private ProductService service;

	@Test
	public void testSave() {

		Product product = new Product( "121212", "123524323", "10/2022", "Teclado", "Teclado elétrico", "Tecnologia", 250.00,5.5, "30/10/2022", "n/a", "preto", "plástico", 12);
		ProductDTO p = service.insert(product);

		assertNotNull(p);
		Long id = p.getId();
		assertNotNull(id);

		Optional<ProductDTO> optional = service.getProductById(id);

		assertTrue(optional.isPresent());
		p = optional.get();
		assertEquals("Teclado", p.getName());
		assertEquals("Tecnologia", p.getCategory());



		service.delete(id);
		assertFalse(service.getProductById(id).isPresent());
	}



}