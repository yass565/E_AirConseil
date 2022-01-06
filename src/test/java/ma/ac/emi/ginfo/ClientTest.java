package ma.ac.emi.ginfo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import ma.ac.emi.ginfo.controllers.ClientControlleur;
import ma.ac.emi.ginfo.models.ClientModel;
import ma.ac.emi.ginfo.repository.ClientRepository;

class ClientTest {
	
	@InjectMocks
	private ClientControlleur service;

	@Mock
	private ClientRepository repository;
	
	@Before
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testFindAll() {
		Assertions.assertFalse(repository.findAll().isEmpty());
	}

	@Test
	public void getClientsTest() {
		when(service.getAllClients()).thenReturn(Stream
				.of(new ClientModel("aeuri", "jsmkf", 3546, "gfhklk"),new ClientModel("aeuri", "jsmkf", 3546, "gfhklk")).collect(Collectors.toList()));
		assertEquals(2, service.getAllClients().size());
	}

	
}
