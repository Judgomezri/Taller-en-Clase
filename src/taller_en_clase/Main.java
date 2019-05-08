/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_en_clase;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Main {
    
    public static void contarMensajes(Mailbox mbox, ArrayList<Person> personas){
        ArrayList<Mail> mails = mbox.getMails();
        int cantidad=0;
        Person p1 = personas.get(0);
        for(Person i: personas){
            for(Mail j: mails){
                if (j.getAddressee().getName() == i.getName()){
                cantidad++;
                }
            }
        }
    }
    
    public static void personaMasMails(ArrayList <Person> personas){
        Person p1 = new Person(personas.get(0).getName(),0);
        for(Person i: personas){
            if (p1.cantidadRecibidos()<=i.cantidadRecibidos()){
                p1.setName(i.getName());
                //System.out.println(p1.getName());
            }
        }        
        System.out.println("La persona con mas correos recibidos es: " + p1.getName());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<Person>();
        Mailbox mbox = new Mailbox();
        Person p1 = new Person("Juan", 4587961);
        Person p2 = new Person("Carlos", 4587962);
        Person p3 = new Person("Andres", 4587963);
        Person p4 = new Person("Laura", 4587964);
        Person p5 = new Person("Maria", 4587965);
        Person p6 = new Person("Luisa", 4587966);
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        personas.add(p6);
        
        mbox.agregarMail(p1, p2, "De p1 a p2");
        mbox.agregarMail(p4, p3, "De p4 a p3");
        mbox.agregarMail(p6, p1, "De p6 a p1");
        mbox.agregarMail(p5, p2, "De p5 a p6");
        mbox.agregarMail(p2, p2, "De p2 a p6");
        mbox.agregarMail(p1, p2, "De p1 a p6");
        
        
        listarMensajes(p1);
        personaMasMails(personas);
    }
    
}
