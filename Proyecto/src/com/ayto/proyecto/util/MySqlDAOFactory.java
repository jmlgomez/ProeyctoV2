package com.ayto.proyecto.util;

import org.hibernate.SessionFactory;

public class MySqlDAOFactory {
		private SessionFactory sf;

		public MySqlDAOFactory() {
			try {
				sf = HibernateUtility.getSessionFactory();
			} catch (Throwable ex) {
				throw new ExceptionInInitializerError(ex);
			}
		}
	/*	
		public EntregasDAO getEntregasDAO(){
			return new EntregasDaoImpl(sf);
		}
		
		public AveriasSimDAO getAveriasSimDAO(){
			return new AveriasSimDaoImpl(sf);
		}

		public AveriasTerminalesDAO getAveriasTerminalesDAO(){
			return new AveriasTerminalesDaoImpl(sf);
			
		} 
		
		public TarjetasDAO getTarjetasDAO(){
			return new TarjetasDaoImpl(sf);
			
		}
		
		public TerminalesDAO getTerminalesDAO(){
			return new TerminalesDaoImpl(sf);

		}
		
		public UsuariosDAO getUsuariosDAO(){
			
			return new UsuariosDaoImpl(sf);
		}
				
	*/	

}
