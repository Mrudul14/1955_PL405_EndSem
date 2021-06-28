package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {
	public static void main(String[] args) {
		Student_info s1 = new Student_info();
		s1.setStudent_name("Rushal");
		
		Std_Marks sd1 = new Std_Marks();
		sd1.setcourse1("80");
		sd1.setcourse2("60");
		sd1.setcourse3("75");
		sd1.setcourse4("40");
		sd1.setcourse5("79");
		sd1.setcourse6("25");
		
		Student_info s2 = new Student_info();
		s2.setStudent_name("Rushi");
		
		Std_Marks sd2 = new Std_Marks();
		sd2.setcourse1("65");
		sd2.setcourse2("78");
		sd2.setcourse3("87");
		sd2.setcourse4("90");
		sd2.setcourse5("15");
		sd2.setcourse6("20");
		
		Student_info s3 = new Student_info();
		s3.setStudent_name("Tushar");
		
		Std_Marks sd3 = new Std_Marks();
		sd3.setcourse1("33");
		sd3.setcourse2("46");
		sd3.setcourse3("01");
		sd3.setcourse4("62");
		sd3.setcourse5("17");
		sd3.setcourse6("52");
		
		sd1.setStudent(s1);
		sd2.setStudent(s2);
		sd3.setStudent(s3);
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(sd1);
		session.save(sd2);
		session.save(sd3);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
