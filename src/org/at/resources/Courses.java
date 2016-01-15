package org.at.resources;

public enum Courses {
	
	Management ("MBA 101"),
	EPSY ("EPSY 173"),
	HLTH ("HLTH 677"),
	MSIS ("MSIS 541"),
	PSYC ("PSYC 786"),
	MATH ("MATH 213"),
	CRDV ("CRDV 343"),
	CSIS ("CSIS 987"),
	REST ("REST 439"),
	ECON ("ECON 978"),
	INTD ("INTD 563"),
	ITS ("ITS 458"),
	HIST ("HIST 226"),
	PHIL ("PHIL 223"),
	COM ("COM 102"),
	BIOL ("BIOL 667"),
	ENG ("ENG 112"),
	ANTH ("ANTH 413"),
	FASH ("FASH 321");

	public String subject;

	Courses(String subject) {
		this.subject = subject;
	}

}
