package org.airline;

import org.airline.controller.AirPlaneController;
import org.airline.controller.FlightController;
import org.airline.controller.PassengerController;
import org.airline.entity.Airplane;
import org.airline.entity.Flight;
import org.airline.entity.Passenger;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

    }

    public void airplane(){
        //AirPlaneController airPlaneController = new AirPlaneController();
        /*String model = JOptionPane.showInputDialog("Ingresa el modelo");
        int capasity = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la capasidad del avion"));

        Airplane airplane = new Airplane(model,capasity);

        airPlaneController.create(airplane);*/

        //JOptionPane.showMessageDialog(null, airPlaneController.readAll());

        //int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un id"));

        //JOptionPane.showMessageDialog(null, airPlaneController.readById(id).toString());

        //airPlaneController.update(airplane,id);

        //airPlaneController.delete(id);
    }

    public void flight(){
        FlightController flightController = new FlightController();

        /*String destination = JOptionPane.showInputDialog("Ingresa el destino adonde se dirije");
        String departure_date = JOptionPane.showInputDialog("Ingresa el momento de destino " + "\n" + "YYYY-MM-DD");
        String departure_time = JOptionPane.showInputDialog("Ingresa la hora en la que salio" + "\n" + "HH:mm:ss");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un id de el avion"));

        if(flightController.searchById(id) != null){
            Flight flight = new Flight(destination, departure_date, departure_time, id);
            flightController.creation(flight);
        }
        else{
            JOptionPane.showMessageDialog(null, "No existe este avion");
        }*/

        //flightController.delete(6);
        //JOptionPane.showMessageDialog(null, flightController.readById(1));
        //JOptionPane.showMessageDialog(null, flightController.readAll());

        /*int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un id quieras actualizar"));
        String destination = JOptionPane.showInputDialog("Ingresa el destino adonde se dirije");
        String departure_date = JOptionPane.showInputDialog("Ingresa el momento de destino " + "\n" + "YYYY-MM-DD");
        String departure_time = JOptionPane.showInputDialog("Ingresa la hora en la que salio" + "\n" + "HH:mm:ss");
        int id_airplane = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un id de el avion"));

        if(flightController.searchById(id_airplane) != null){
            Flight flight = new Flight(destination, departure_date, departure_time, id_airplane);
            flightController.update(flight,id);
            JOptionPane.showMessageDialog(null, "Actualizado exitosamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "No existe este avion");
        }*/
    }

    public void passenger(){
        //PassengerController passengerController = new PassengerController();

        /*String name = JOptionPane.showInputDialog("Ingresa el nombre del pasajero");
        String lastName = JOptionPane.showInputDialog("Ingresa el apellido del pasajero");
        String document = JOptionPane.showInputDialog("Ingresa el documento del pasajero");

        Passenger passenger = new Passenger(name, lastName, document);

        passengerController.create(passenger);*/

        //JOptionPane.showMessageDialog(null,passengerController.readById(2));

        /*int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del pasajero que quieres editar"));
        String name = JOptionPane.showInputDialog("Ingresa el nombre del pasajero");
        String lastName = JOptionPane.showInputDialog("Ingresa el apellido del pasajero");
        String document = JOptionPane.showInputDialog("Ingresa el documento del pasajero");

        Passenger passenger = new Passenger(name, lastName, document);

        passengerController.update(passenger,id);*/

        //passengerController.delete(2);
    }
}