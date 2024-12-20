package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-06 08:52
 */

// Entity class = POJO class to hold data of some table.
public class Candidate {
	private int id;
	private String name;
	private String party;
	private int votes;
	public Candidate() {
	}
	public Candidate(int id, String name, String party, int votes) {
		this.id = id;
		this.name = name;
		this.party = party;
		this.votes = votes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", party=" + party + ", votes=" + votes + "]";
	}
}
