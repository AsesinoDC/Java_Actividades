package org.hospital;

import org.hospital.controller.MedicoController;
import org.hospital.controller.PatientController;
import org.hospital.controller.QuoteController;
import org.hospital.controller.SpecialityController;
import org.hospital.entity.MedicoEntity;
import org.hospital.entity.PatientEntity;
import org.hospital.entity.QuoteEntity;
import org.hospital.entity.SpecialtyEntity;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String option = "";

        do {
            option = JOptionPane.showInputDialog("""
                    Bienvenido al hospital, que quieres hacer?
                    
                    1. Entrar a las especialidades
                        
                    2. Entrar a medicos
                        
                    3. Entrar a pacientes
                        
                    4. Entrar a citas
                        
                    5. Salir
                    """);

            switch (option){
                case "1" -> {specialityInterface();}

                case "2" -> {medicoInterface();}

                case "3" -> {patientInterface();}

                case "4" -> {quoteInterface();}

                case "5" -> {
                    JOptionPane.showMessageDialog(null,
                            "Saliste del programa, gracias por usarlo");
                }

                default -> {
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                }
            }
        }while (!option.equals("5"));
    }

    public static void specialityInterface(){
        SpecialityController specialityController = new SpecialityController();
        SpecialtyEntity specialtyEntity = new SpecialtyEntity();

        String option = "";

        do {
            option = showOptions("Especialidades");

            switch (option){
                case "1" -> {
                    String name = JOptionPane.showInputDialog("Dame el nombre de la especialidad");
                    String description = JOptionPane.showInputDialog("Dame una descripcion");
                    specialtyEntity = new SpecialtyEntity(name, description);

                    specialityController.create(specialtyEntity);
                }

                case "2" -> {
                    JOptionPane.showMessageDialog(null, "Aqui estan todos las especialidades:");
                    JOptionPane.showMessageDialog(null, specialityController.readAll().toString());
                }

                case "3" -> {
                    JOptionPane.showMessageDialog(null, "Vas a buscar una especialidad por id:");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de al especialidad:"));

                    JOptionPane.showMessageDialog(null, specialityController.readById(id).toString());
                }

                case "4" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la especialidad que quieres actualizar:"));

                    String name = JOptionPane.showInputDialog("Dame el nombre de la especialidad");
                    String description = JOptionPane.showInputDialog("Dame una descripcion");
                    specialtyEntity = new SpecialtyEntity(name, description);

                    specialityController.update(specialtyEntity, id);
                }

                case "5" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la especialidad que quieres eliminar:"));

                    specialityController.delete(id);
                }

                case "6" -> {
                    JOptionPane.showMessageDialog(null,
                            "Volviendo a la interfaz principal");
                }

                default -> {
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                }
            }
        }while (!option.equals("6"));
    }

    public static void medicoInterface(){
        MedicoController medicoController = new MedicoController();
        MedicoEntity medicoEntity = new MedicoEntity();

        String option = "";

        do {
            option = showOptions("Medicos");

            switch (option){
                case "1" -> {
                    String name = JOptionPane.showInputDialog("Dame el nombre del medico");
                    String last_name = JOptionPane.showInputDialog("Dame el apellido del medico");
                    int id_speciality = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la especilidad que tiene el medico"));

                    if(medicoController.searchById(id_speciality,0) != null){
                        medicoEntity = new MedicoEntity(name, last_name,id_speciality);

                        medicoController.create(medicoEntity);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"No existe esta especialidad");
                    }

                }

                case "2" -> {
                    JOptionPane.showMessageDialog(null, "Aqui estan todos los medicos:");
                    JOptionPane.showMessageDialog(null, medicoController.readAll().toString());
                }

                case "3" -> {
                    JOptionPane.showMessageDialog(null, "Vas a buscar un medico por id:");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del medico:"));

                    JOptionPane.showMessageDialog(null, medicoController.readById(id).toString());
                }

                case "4" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del medico que quieres actualizar:"));

                    String name = JOptionPane.showInputDialog("Dame el nombre del medico");
                    String last_name = JOptionPane.showInputDialog("Dame el apellido del medico");
                    int id_speciality = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la especilidad que tiene el medico"));
                    medicoEntity = new MedicoEntity(name, last_name,id_speciality);

                    medicoController.update(medicoEntity,id);
                }

                case "5" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del medico que quieres eliminar:"));

                    medicoController.delete(id);
                }

                case "6" -> {
                    JOptionPane.showMessageDialog(null,
                            "Volviendo a la interfaz principal");
                }

                default -> {
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                }
            }
        }while (!option.equals("6"));
    }

    public static void patientInterface(){
        PatientController patientController = new PatientController();
        PatientEntity patientEntity = new PatientEntity();

        String option = "";

        do {
            option = showOptions("Pacientes");

            switch (option){
                case "1" -> {
                    String name = JOptionPane.showInputDialog("Dame el nombre del paciente");
                    String last_name = JOptionPane.showInputDialog("Dame el apellido del paciente");
                    String birth_date = JOptionPane.showInputDialog("Dame la fecha de nacimiento del paciente \n YYYY-MM-DD");
                    String document = JOptionPane.showInputDialog("Dam3e el documento del paciente");
                    patientEntity = new PatientEntity(name, last_name,birth_date, document);

                    patientController.create(patientEntity);
                }

                case "2" -> {
                    JOptionPane.showMessageDialog(null, "Aqui estan todos los pacientes:");
                    JOptionPane.showMessageDialog(null,  patientController.readAll().toString());
                }

                case "3" -> {
                    JOptionPane.showMessageDialog(null, "Vas a buscar un paciente por id:");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del paciente:"));

                    JOptionPane.showMessageDialog(null, patientController.readById(id).toString());
                }

                case "4" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del paciente que quieres actualizar:"));

                    String name = JOptionPane.showInputDialog("Dame el nombre del paciente");
                    String last_name = JOptionPane.showInputDialog("Dame el apellido del paciente");
                    String birth_date = JOptionPane.showInputDialog("Dame la fecha de nacimiento del paciente \n YYYY-MM-DD");
                    String document = JOptionPane.showInputDialog("Dam3e el documento del paciente");
                    patientEntity = new PatientEntity(name, last_name,birth_date, document);

                    patientController.update(patientEntity, id);
                }

                case "5" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del paciente que quieres eliminar:"));

                    patientController.delete(id);
                }

                case "6" -> {
                    JOptionPane.showMessageDialog(null,
                            "Volviendo a la interfaz principal");
                }

                default -> {
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                }
            }
        }while (!option.equals("6"));
    }

    public static void quoteInterface(){
        QuoteController quoteController = new QuoteController();
        QuoteEntity quoteEntity = new QuoteEntity();

        String option = "";

        do {
            option = showOptions("Citas");

            switch (option){
                case "1" -> {
                    int id_patient = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del paciente"));
                    int id_medico = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del medico"));
                    String quote_date = JOptionPane.showInputDialog("Dame la fecha de la cita \n YYYY-MM-DD");
                    String quote_time = JOptionPane.showInputDialog("Dame el tiempo de la cita \n HH:MM:SS");
                    String motive = JOptionPane.showInputDialog("Dame el motivo de al cita");

                    if(quoteController.searchById(id_patient, 0) != null){
                        if(quoteController.searchById(id_medico, 1) != null){
                            quoteEntity = new QuoteEntity(id_patient, id_medico,quote_date, quote_time, motive);
                            quoteController.create(quoteEntity);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"El medico no existe");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"El paciente no existe");
                    }
                }

                case "2" -> {
                    JOptionPane.showMessageDialog(null, "Aqui estan todos las citas:");
                    JOptionPane.showMessageDialog(null, quoteController.readAll().toString());
                }

                case "3" -> {
                    JOptionPane.showMessageDialog(null, "Vas a buscar una cita por id:");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la cita:"));

                    JOptionPane.showMessageDialog(null, quoteController.readById(id).toString());
                }

                case "4" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la cita que quieres actualizar:"));

                    int id_patient = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del paciente"));
                    int id_medico = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del medico"));
                    String quote_date = JOptionPane.showInputDialog("Dame la fecha de la cita \n YYYY-MM-DD");
                    String quote_time = JOptionPane.showInputDialog("Dame el tiempo de la cita \n HH:MM:SS");
                    String motive = JOptionPane.showInputDialog("Dame el motivo de al cita");

                    if(quoteController.searchById(id_patient, 0) != null){
                        if(quoteController.searchById(id_medico, 1) != null){
                            quoteEntity = new QuoteEntity(id_patient, id_medico,quote_date, quote_time, motive);
                            quoteController.update(quoteEntity,id);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"El medico no existe");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"El paciente no existe");
                    }
                }

                case "5" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la cita que quieres eliminar:"));

                    quoteController.delete(id);
                }

                case "6" -> {
                    JOptionPane.showMessageDialog(null,
                            "Volviendo a la interfaz principal");
                }

                default -> {
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                }
            }
        }while (!option.equals("6"));
    }

    public static String showOptions(String entity){
        String option = JOptionPane.showInputDialog(
                "Bienvenido a la interfaz de " + entity + "\n" +
                        """
                        1. Crear
                        
                        2. Leer todos
                        
                        3. Leer uno
                        
                        4. Actualizar
                        
                        5. Eliminar
                        
                        6. Volver
                        """);

        return option;
    }
}