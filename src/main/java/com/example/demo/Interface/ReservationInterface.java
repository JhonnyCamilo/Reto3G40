/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Modelo.Reservation;
/**
 *
 * @author USUARIO
 */

public interface ReservationInterface extends CrudRepository<Reservation, Integer> {
    
}
