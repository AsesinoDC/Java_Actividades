package org.riwi;

import org.riwi.controller.*;
import org.riwi.entity.*;
import org.riwi.persistence.enums.CohortesEmun;
import org.riwi.persistence.enums.StatusContractingEnum;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String optionInterface = "";

        do {
            optionInterface = JOptionPane.showInputDialog("""
                Bienvenido a riwi, que quieres hacer?
                
                1- Meterte a compañia
                
                2- Meterte a clanes
                
                3- Meterte a coders
                
                4- Meterte a vacantes
                
                5- Meterte a contrataciones
                
                6- Salir
                """);

            switch (optionInterface){
                case "1" -> {
                    JOptionPane.showMessageDialog(null, "Bienvenido a compañias");
                    companyInterface();
                }

                case "2" ->{
                    JOptionPane.showMessageDialog(null, "Bienvenido a clanes");
                    clanInterface();
                }

                case "3" ->{
                    JOptionPane.showMessageDialog(null, "Bienvenido a coders");
                    coderInterface();
                }

                case "4" ->{
                    JOptionPane.showMessageDialog(null, "Bienvenido a vacantes");
                    vacancyInterface();
                }

                case "5" ->{
                    JOptionPane.showMessageDialog(null, "Bienvenido a contrataciones");
                    contractingInterface();
                }

                case "6" ->{
                    JOptionPane.showMessageDialog(null,"Hasta luego");
                }

                default -> {
                    JOptionPane.showMessageDialog(null, "Dato invalido");
                    break;
                }
            }

        }while (!optionInterface.equals("6"));
    }

    public static void companyInterface(){
        CompanyController companyController = new CompanyController();
        CompanyEntity company = new CompanyEntity();
        String option = "";
        do {
            option = showOption();

            switch (option){
                case "1" -> {
                    String name_company = JOptionPane.showInputDialog("Ingresa el nombre de la compañia");
                    String location = JOptionPane.showInputDialog("Ingresa de donde es la compañia");
                    company = new CompanyEntity(name_company,location);
                    companyController.creation(company);
                }
                case "2" ->{
                    JOptionPane.showMessageDialog(null, "Estas son todas las compañias que hay en riwi");
                    JOptionPane.showMessageDialog(null, companyController.readAll());
                }

                case "3" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la empresa que quieres ver"));
                    JOptionPane.showMessageDialog(null, companyController.readById(id));
                }

                case "4" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la empresa que quieres actualizar"));

                    String name_company = JOptionPane.showInputDialog("Dame el nombre de la compañia");
                    String location = JOptionPane.showInputDialog("Dame en donde es");

                    company = new CompanyEntity(name_company,location);
                    companyController.update(company,id);
                }

                case "5" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la empresa que quieres eliminar"));
                    companyController.delete(id);
                }

                default -> {
                    option = "6";
                    break;
                }
            }

        }while (!option.equals("6"));

    }

    public static void clanInterface(){
        ClanController clanController = new ClanController();
        ClanEntity clanEntity = new ClanEntity();
        String option = "";
        do {
            option = showOption();

            switch (option){
                case "1" -> {
                    String name_clan = JOptionPane.showInputDialog("Ingresa el nombre del clan");
                    clanEntity = new ClanEntity(name_clan);
                    clanController.creation(clanEntity);
                }
                case "2" ->{
                    JOptionPane.showMessageDialog(null, "Estas son todas los clanes que hay en riwi");
                    JOptionPane.showMessageDialog(null, clanController.readAll());
                }

                case "3" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del clan que quieres ver"));
                    JOptionPane.showMessageDialog(null, clanController.readById(id));
                }

                case "4" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del clan que quieres actualizar"));

                    String name_clan = JOptionPane.showInputDialog("Ingresa el nombre del clan");
                    clanEntity = new ClanEntity(name_clan);
                    clanController.update(clanEntity, id);
                }

                case "5" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del clan que quieres eliminar"));
                    clanController.delete(id);
                }

                default -> {
                    option = "6";
                    break;
                }
            }

        }while (!option.equals("6"));
    }

    public static void coderInterface(){
        CoderController coderController = new CoderController();
        ClanController clanController = new ClanController();

        CoderEntity coderEntity = new CoderEntity();
        String option = "";
        do {
            option = showOption();

            switch (option){
                case "1" -> {
                    String name = JOptionPane.showInputDialog("Ingresa el nombre del coder");
                    String last_name = JOptionPane.showInputDialog("Ingresa el apellido del coder");
                    String document = JOptionPane.showInputDialog("Ingresa el documento del coder");
                    String technology = JOptionPane.showInputDialog("Ingresa el lenjuaje que usa");

                    CohortesEmun cohorte = (CohortesEmun) JOptionPane.showInputDialog(null,
                            "Escoje " + CohortesEmun.class + ": ",
                            "",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            CohortesEmun.values(),
                            CohortesEmun.values());

                    int id_clan = Integer.parseInt(JOptionPane.showInputDialog(null,
                            clanController.readAll()  + "\n" + "\n" + "Ingresa el clan del coder"));

                    if(coderController.searchById(id_clan,0) != null){
                        coderEntity = new CoderEntity(name,last_name,document,technology,cohorte,id_clan);
                        coderController.creation(coderEntity);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Este clan no existe");
                    }

                }
                case "2" ->{
                    JOptionPane.showMessageDialog(null, "Estas son todos los coders que hay en riwi");
                    JOptionPane.showMessageDialog(null, coderController.readAll());
                }

                case "3" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del coder que quieres ver"));
                    JOptionPane.showMessageDialog(null, coderController.readById(id));
                }

                case "4" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del coder que quieres actualizar"));

                    String name = JOptionPane.showInputDialog("Ingresa el nombre del coder");
                    String last_name = JOptionPane.showInputDialog("Ingresa el apellido del coder");
                    String document = JOptionPane.showInputDialog("Ingresa el documento del coder");
                    String technology = JOptionPane.showInputDialog("Ingresa el lenjuaje que usa");

                    CohortesEmun cohorte = (CohortesEmun) JOptionPane.showInputDialog(null,
                            "Escoje " + CohortesEmun.class + ": ",
                            "",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            CohortesEmun.values(),
                            CohortesEmun.values());

                    int id_clan = Integer.parseInt(JOptionPane.showInputDialog(null,
                            clanController.readAll()  + "\n" + "\n" + "Ingresa el clan del coder"));

                    if(coderController.searchById(id_clan, 0) != null){
                        coderEntity = new CoderEntity(name,last_name,document,technology,cohorte,id_clan);
                        coderController.update(coderEntity,id);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Este clan no existe");
                    }
                }

                case "5" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id del coder que quieres eliminar"));
                    coderController.delete(id);
                }

                default -> {
                    option = "6";
                    break;
                }
            }

        }while (!option.equals("6"));
    }

    public static void vacancyInterface(){
        VacancyController vacancyController = new VacancyController();
        ClanController clanController = new ClanController();

        VacancyEntity vacancyEntity = new VacancyEntity();

        String option = "";

        do {
            option = showOption();

            switch (option){
                case "1" -> {
                    int id_company = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id de la compañia"));
                    int id_coder = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del coder"));
                    String title_coder = JOptionPane.showInputDialog("Ingresa el titulo del coder");
                    String description = JOptionPane.showInputDialog("Ingresa la descripcion");
                    int id_clan = Integer.parseInt(JOptionPane.showInputDialog(null,
                            clanController.readAll()  + "\n" + "\n" + "Ingresa el clan del coder"));

                    StatusContractingEnum status = (StatusContractingEnum) JOptionPane.showInputDialog(null,
                            "Escoje " + StatusContractingEnum.class + ": ",
                            "",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            StatusContractingEnum.values(),
                            StatusContractingEnum.values());

                    if(vacancyController.searchById(id_company,0) != null){
                        if (vacancyController.searchById(id_coder,1) != null){
                            if(vacancyController.searchById(id_clan,2) != null){
                                vacancyEntity = new VacancyEntity(id_company,id_coder,title_coder,description,id_clan,status);
                                vacancyController.creation(vacancyEntity);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"No existe el clan que elegiste");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "No existe el coder que elegiste");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"No existe la compañia que elegiste");
                    }



                }
                case "2" ->{
                    JOptionPane.showMessageDialog(null, "Estas son todos las vacantes que hay en riwi");
                    JOptionPane.showMessageDialog(null, vacancyController.readAll());
                }

                case "3" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la vacante que quieres ver"));
                    JOptionPane.showMessageDialog(null, vacancyController.readById(id));
                }

                case "4" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la vacante que quieres actualizar"));

                    int id_company = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id de la compañia"));
                    int id_coder = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del coder"));
                    String title_coder = JOptionPane.showInputDialog("Ingresa el titulo del coder");
                    String description = JOptionPane.showInputDialog("Ingresa la descripcion");
                    int id_clan = Integer.parseInt(JOptionPane.showInputDialog(null,
                            clanController.readAll()  + "\n" + "\n" + "Ingresa el clan del coder"));

                    StatusContractingEnum status = (StatusContractingEnum) JOptionPane.showInputDialog(null,
                            "Escoje " + StatusContractingEnum.class + ": ",
                            "",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            StatusContractingEnum.values(),
                            StatusContractingEnum.values());

                    if(vacancyController.searchById(id_company,0) != null){
                        if (vacancyController.searchById(id_coder,1) != null){
                            if(vacancyController.searchById(id_clan,2) != null){
                                vacancyEntity = new VacancyEntity(id_company,id_coder,title_coder,description,id_clan,status);
                                vacancyController.update(vacancyEntity,id);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"No existe el clan que elegiste");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "No existe el coder que elegiste");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"No existe la compañia que elegiste");
                    }
                }

                case "5" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la vacante que quieres eliminar"));
                    vacancyController.delete(id);
                }

                default -> {
                    option = "6";
                    break;
                }
            }

        }while (!option.equals("6"));
    }

    public static void contractingInterface(){
        ContractingController contractingController = new ContractingController();
        ContractingEntity contractingEntity = new ContractingEntity();

        String option = "";
        do {
            option = showOption();

            switch (option){
                case "1" -> {
                    int id_vacancy = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id de la vacante"));
                    StatusContractingEnum status = (StatusContractingEnum) JOptionPane.showInputDialog(null,
                            "Escoje " + StatusContractingEnum.class + ": ",
                            "",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            StatusContractingEnum.values(),
                            StatusContractingEnum.values());
                    int salary = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el salario del coder"));

                    if(contractingController.searchById(id_vacancy, 0) != null){
                        contractingEntity = new ContractingEntity(id_vacancy,status,salary);
                        contractingController.creation(contractingEntity);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Esta vacante no existe");
                    }
                }
                case "2" ->{
                    JOptionPane.showMessageDialog(null, "Estas son todas las contrataciones que hay en riwi");
                    JOptionPane.showMessageDialog(null, contractingController.readAll());
                }

                case "3" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la contratacion que quieres ver"));
                    JOptionPane.showMessageDialog(null, contractingController.readById(id));
                }

                case "4" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la contratacion que quieres actualizar"));

                    int id_vacancy = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id de la vacante"));
                    StatusContractingEnum status = (StatusContractingEnum) JOptionPane.showInputDialog(null,
                            "Escoje " + StatusContractingEnum.class + ": ",
                            "",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            StatusContractingEnum.values(),
                            StatusContractingEnum.values());
                    int salary = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el salario del coder"));

                    if(contractingController.searchById(id_vacancy, 0) != null){
                        contractingEntity = new ContractingEntity(id_vacancy,status,salary);
                        contractingController.update(contractingEntity, id);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Esta vacante no existe");
                    }
                }

                case "5" ->{
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la contratacion que quieres eliminar"));
                    contractingController.delete(id);
                }

                default -> {
                    option = "6";
                    break;
                }
            }

        }while (!option.equals("6"));
    }

    public static String showOption(){
        String option = JOptionPane.showInputDialog("""
                1- Crear
                
                2- Mostrar todos
                
                3- Mostrar por id
                
                4- Actualizar
                
                5- Eliminar
                
                6- Volver
                """);
        return option;
    }
}