	package com.paraparp.javafx.controller;

	import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.paraparp.javafx.model.entity.Cliente;
import com.paraparp.javafx.service.IClienteService;

import javafx.fxml.FXML;

@Controller
public class FormularioController {

    @FXML
    private JFXDatePicker dateCreate;

    @FXML
    private JFXTextField txtId;

    @FXML
    private JFXTextField txtNombre;

    @FXML
    private JFXTextField txtApellidos;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtFoto;

    @FXML
    private JFXButton btnCancelar;

    @FXML
    private JFXButton btnActualizar;

    @FXML
    private JFXButton btnNuevo;

    @FXML
    private JFXButton btnGuardar;

    @FXML
    private JFXButton btnModificar;

    @FXML
    private JFXButton btnSalir;

	
	@Autowired
	@Qualifier("clienteServiceImp")
	private IClienteService clienteService;
	

	
	public String crear(Map<String, Object> model) {

		Cliente cliente = new Cliente();
		model.put("cliente", cliente);
		model.put("titulo", "Formulario de Cliente");
		return "form";
	}
	
}
