package main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("org.hibernate");
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);

		Configuration configuracion = new Configuration();
		configuracion.configure("./hibernate.cfg.xml");
		SessionFactory factoria = configuracion.buildSessionFactory();
		Session sesion = factoria.openSession();

		// 1
//		System.out.println("\n1\n");
//		Query consulta = sesion.createQuery("FROM Empleados WHERE puesto = :puesto ORDER BY nombreEmpleado");
//		consulta.setParameter("puesto", "ADMINISTRATIVO");
//
//		for (Empleados empleado : (ArrayList<Empleados>) consulta.list()) {
//			System.out.println(empleado);
//		}

		// 2
//		System.out.println("\n2\n");
//		Query consulta2 = sesion.createQuery("SELECT nombre FROM Departamentos ORDER BY localidad desc");
//
//		for (String nombreDepartamento : (ArrayList<String>) consulta2.list()) {
//			System.out.println(nombreDepartamento);
//		}

		// 3
//		System.out.println("\n3\n");
//		Query consulta3 = sesion
//				.createQuery("SELECT nombreEmpleado, puesto, salario FROM Empleados ORDER BY puesto, salario");
//
//		for (Object[] empleado : (ArrayList<Object[]>) consulta3.list()) {
//			System.out.println(empleado[0] + " " + empleado[1] + " " + empleado[2]);
//		}

		// 4
//		System.out.println("\n4\n");
//		Query consulta4 = sesion
//				.createQuery("SELECT nombreEmpleado, puesto, salario FROM Empleados ORDER BY puesto desc, salario");
//
//		for (Object[] empleado : (ArrayList<Object[]>) consulta4.list()) {
//			System.out.println(empleado[0] + " " + empleado[1] + " " + empleado[2]);
//		}

		// 5
//		System.out.println("\n5\n");
//		Query consulta5 = sesion.createQuery("SELECT salario, comision FROM Empleados WHERE departamentos = 30");
//
//		for (Object[] empleado : (ArrayList<Object[]>) consulta5.list()) {
//			System.out.println(empleado[0] + " " + empleado[1]);
//		}

		// 6
//		System.out.println("\n6\n");
//		Query consulta6 = sesion.createQuery("SELECT salario + 1000 FROM Empleados WHERE departamentos = 30");
//
//		for (BigDecimal nuevoSalario : (ArrayList<BigDecimal>) consulta6.list()) {
//			System.out.println(nuevoSalario);
//		}

		// 7
//		System.out.println("\n7\n");
//		Query consulta7 = sesion.createQuery("SELECT salario, salario + 1000 FROM Empleados WHERE departamentos = 30");
//
//		for (Object[] salarios : (ArrayList<Object[]>) consulta7.list()) {
//			System.out.println("Salario original - " + salarios[0] + " \nNuevo - " + salarios[1] + "\n");
//		}

		// 8
//		System.out.println("\n8\n");
//		Query consulta8 = sesion.createQuery("FROM Empleados WHERE comision > salario / 2");
//
//		for (Empleados empleado : (ArrayList<Empleados>) consulta8.list()) {
//			System.out.println(empleado);
//		}

		// 9
		System.out.println("\n9\n");
		Query consulta9 = sesion.createQuery("FROM Empleados WHERE comision <= salario * 0.25");

		for (Empleados empleado : (ArrayList<Empleados>) consulta9.list()) {
			System.out.println(empleado);
		}

		// 10
//		System.out.println("\n10\n");
//		Query consulta10 = sesion.createQuery("SELECT salario, comision FROM Empleados WHERE numEmpleado > 7500");
//
//		for (Object[] empleado : (ArrayList<Object[]>) consulta10.list()) {
//			System.out.println(empleado[0] + " " + empleado[1]);
//		}

		// 11
//		System.out.println("\n11\n");
//		Query consulta11 = sesion.createQuery(
//				"SELECT nombreEmpleado, puesto FROM Empleados WHERE nombreEmpleado > 'J' and nombreEmpleado < 'Z' ORDER BY nombreEmpleado, puesto");
//
//		for (Object[] empleado : (ArrayList<Object[]>) consulta11.list()) {
//			System.out.println(empleado[0] + " " + empleado[1]);
//		}

		// 12
//		System.out.println("\n12\n");
//		Query consulta12 = sesion.createQuery(
//				"SELECT nombreEmpleado, puesto FROM Empleados WHERE nombreEmpleado > 'J' and nombreEmpleado < 'Z' ORDER BY nombreEmpleado, puesto");
//
//		for (Object[] empleado : (ArrayList<Object[]>) consulta12.list()) {
//			System.out.println(empleado[0] + " " + empleado[1]);
//		}

		// 13
//		System.out.println("\n13\n");
//		Query consulta13 = sesion.createQuery(
//				"SELECT nombreEmpleado, puesto FROM Empleados WHERE nombreEmpleado > 'J' and nombreEmpleado < 'Z' and (comision is NULL OR comision = 0) ORDER BY nombreEmpleado, puesto");
//
//		for (Object[] empleado : (ArrayList<Object[]>) consulta13.list()) {
//			System.out.println(empleado[0] + " " + empleado[1]);
//		}

		// 14
		System.out.println("\n14\n");
		Query consulta14 = sesion.createQuery(
				"SELECT nombreEmpleado, puesto FROM Empleados WHERE nombreEmpleado > 'J' and nombreEmpleado < 'Z' and (comision is NULL OR comision = 0) ORDER BY nombreEmpleado, puesto");

		for (Object[] empleado : (ArrayList<Object[]>) consulta14.list()) {
			System.out.println(empleado[0] + " " + empleado[1]);
		}

		sesion.close();
	}

}
