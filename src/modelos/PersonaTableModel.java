/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Castelao
 */
public class PersonaTableModel extends AbstractTableModel {

    private final ArrayList<Persona> personas;
    private final String[] nombresColumnas = {"ID", "Nombre", "Edad", "Teléfono", "Profesión"};

    public PersonaTableModel() {
        personas = new ArrayList<>();
        Persona p1 = new Persona("111111111A", "Luis", "22", "981212223", "Pintor");
        Persona p2 = new Persona("222222222B", "Eva", "33", "981212121", "Inspectora");
        Persona p3 = new Persona("333333333C", "Juan", "44", "987656765", "Administrativo");
        Persona p4 = new Persona("444444444D", "Antonio", "55", "657453453", "Cantamañanas");
        Persona p5 = new Persona("555555555E", "Reina", "24", "654564323", "Vaga");
        Persona p6 = new Persona("666666666F", "Lolo", "43", "986874342", "Funcionario");
        Persona p7 = new Persona("777777777G", "Carmina", "21", "912343546", "Ganadera");
        Persona p8 = new Persona("888888888H", "Nona", "64", "878767545", "Agricultora");
        Persona p9 = new Persona("999999999I", "Wences", "59", "956453432", "Pastor");
        Persona p10 = new Persona("000000000J", "Pipo", "68", "666777888", "Programador");
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        personas.add(p6);
        personas.add(p7);
        personas.add(p8);
        personas.add(p9);
        personas.add(p10);
    }

    @Override
    public int getRowCount() {
        return personas.size();

    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int fila, int col) {
        Persona p = personas.get(fila);
        switch (col) {
            case 0:
                return p.getNif();
            case 1:
                return p.getNombre();
            case 2:
                return p.getEdad();
            case 3:
                return p.getTelefono();
            case 4:
                return p.getProfesion();
        }
        return null;
    }

    @Override
    public String getColumnName(int i) {
        return nombresColumnas[i];
    }

    public Persona getPersonaByNIF(String nif) {
        Persona p = new Persona(nif, null, null, null, null);
        int i = personas.indexOf(p);
        return personas.get(i);
    }

    public Persona getPersonaByRow(int i) {
        return personas.get(i);
    }

    public void guardarPersona(Persona p) {
        personas.set(personas.indexOf(p), p);
        fireTableDataChanged();
    }

    public void borrarPersona(Persona p) {
        personas.remove(p);        
        fireTableDataChanged();
    }

}
