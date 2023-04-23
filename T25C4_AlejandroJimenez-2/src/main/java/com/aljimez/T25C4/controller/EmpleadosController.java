package com.aljimez.T25C4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aljimez.T25C4.dto.Empleados;
import com.aljimez.T25C4.service.EmpleadosServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadosController {


		@Autowired
		EmpleadosServiceImpl empleadoServiceImpl;
		
	

		@GetMapping("/empleados")
		public List<Empleados> listarEmpleados() {
			return empleadoServiceImpl.listarEmpleados();
		}
		

		@GetMapping("/empleados/{dni}")
		public Empleados empleadoXID(@PathVariable(name = "dni") String dni) {
			Empleados empleadoById = new Empleados();
			empleadoById = empleadoServiceImpl.empleadoXID(dni);
			
			return empleadoById;
		}

		@PostMapping("/empleados")
		public Empleados guardarEmpleados(@RequestBody Empleados empleado) {
			return empleadoServiceImpl.guardarEmpleados(empleado);
		}

		@PutMapping("/empleados/{dni}")
		public Empleados updateEmpleado(@PathVariable(name = "dni") String dni, @RequestBody Empleados empleado) {
			Empleados empleado_Selected = new Empleados(dni, empleado.getNombre(), empleado.getApellidos(),
					empleado.getDepartamento());
			Empleados empleado_Updated = new Empleados();

			empleado_Updated = empleadoServiceImpl.actualizarEmpleado(empleado_Selected);

			return empleado_Updated;
		}
		@DeleteMapping("/empleados/{dni}")
		public void deleteEmpleado(@PathVariable(name = "dni") String dni) {
			empleadoServiceImpl.eliminarEmpleado(dni);
		}
		
}
