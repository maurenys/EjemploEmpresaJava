package empresa;

public class Principal {

	public static void main(String[] args) {
		
		
	    TipoCliente tipoCliente1 = new TipoCliente(1, "Empresa Estatal");
        Cliente cliente1 = new Cliente(1, "Ministerio de la Mujer", tipoCliente1);

        
		Programador programador1 = new Programador(1, "Mario Perez", "Senior");
		Producto producto1 = new Producto(1, "Software de Automatizacion de tareas", cliente1,"Enviar correos masivos", programador1);
		Proveedor proveedor1 = new Proveedor(1, "Outsourcing,");
		OfertaPublica ofertaPublica1 = new OfertaPublica(1, 345, "Venta de un Software para automatizar tareas");
		Venta venta1 = new Venta(1, producto1, cliente1, proveedor1, ofertaPublica1);
		
	
		
		 System.out.println("----------------------------------------------");
	     System.out.println("  Registro de las Operaciones productivas     ");                     
	     System.out.println("----------------------------------------------"); 
	     System.out.println("Cliente: " +cliente1.getNombreC() +" " +
	                        "\nTipo Cliente : " + cliente1.getTipoCliente().getDescripcionCliente()
			                  );
	     
	     System.out.println("----------------------------------------------");
	     System.out.println("Cliente: " +cliente1.getNombreC() +" " +
                 "\nTipo Cliente : " + cliente1.getTipoCliente().getDescripcionCliente()
	                  );
	     
	     System.out.println("----------------------------------------------");
	     System.out.println("Progrador: " +programador1.getNombreProgramador() +" " +
                          "\nCargo Programador: " + programador1.getCargoProgramador()
	                  );
	     System.out.println("----------------------------------------------");
	     System.out.println("Progrador: " +programador1.getNombreProgramador() +" " +
                          "\nCargo Programador: " + programador1.getCargoProgramador()
	                  );
	}

}
