package com.dio.meetingroommanagerapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "room")
@Data
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "date", nullable = false)
	private String Date;

	@Column(name = "start_hour", nullable = false)
	private String startHour;

	@Column(name = "end_hour", nullable = false)
	private String endHour;

	public Room(long id, String name, String date, String startHour, String endHour) {
		super();
		this.id = id;
		this.name = name;
		Date = date;
		this.startHour = startHour;
		this.endHour = endHour;
	}

}
