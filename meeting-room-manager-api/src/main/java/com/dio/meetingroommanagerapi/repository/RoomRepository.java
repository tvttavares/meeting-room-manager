package com.dio.meetingroommanagerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.meetingroommanagerapi.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
