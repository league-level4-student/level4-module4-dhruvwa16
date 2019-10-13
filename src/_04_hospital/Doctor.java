package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public void assignPatient(Patient patient) {
		// TODO Auto-generated method stub
		if(patients.size()<3) {
		patients.add(patient);
		}
	}

	public boolean performsSurgery() {
		// TODO Auto-generated method stub

		return false;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for(Patient p:patients) {
			p.checkPulse();
		}
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

}
