package org.proyectosMaven.pruebasHibernate;

import java.util.List;

import org.hibernate.Session;

public class Main {
	public Main(){
		anadirPersonas();
		verDatos(1l);
		verTotal();
	}
	
	public void anadirPersonas(){
		Persona p=new Persona(1, "Pepe", "Marron");
		Persona p2=new Persona(3, "Pedro", "Limonada");
		
		// Persistencia
		Session s = HibernateUtil.getSession();
		s.beginTransaction();
		s.save(p2);
		s.save(p);
		s.getTransaction().commit();
		
		
	}
	
	public void verDatos(Long id){
		Session s= HibernateUtil.getSession();
		s.beginTransaction();
		Persona p=(Persona) s.load(Persona.class, id);
		System.out.println(p.getNombre()+" "+p.getApellidos());
	}
	
	public void verTotal(){
		Session s=HibernateUtil.getSession();
		s.beginTransaction();
		List<Persona> ps= s.createQuery("from Persona").list();
		s.getTransaction().commit();
		
		for( Persona n : ps){
			System.out.println(n.getNombre());
		}
	}
	public static void main(String[] args) {
		new Main();
	}
	
	
}
