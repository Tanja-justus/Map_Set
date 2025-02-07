package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {

    private Map<String, Medication> medicationMap;


    public Pharmacy() {
        medicationMap = new HashMap<>();
    }

    public Medication getMedication(String name) {
        return medicationMap.get(name);
    }
    public int getCount() {
        return medicationMap.size();
    }

    public void save(Medication medication) {
        medicationMap.put(medication.getName(), medication);
        System.out.println("Medikament " + medication.getName() + " wurde erfolgreich in die Apotheke eingetragen.");
    }

    public Medication find(String medicationName) {
        Medication medication = medicationMap.get(medicationName);
        if (medication!= null) {
            return medication;
        }
        else {
            System.out.println("Kein Medikament mit dem Namen " +medicationName+ " gefunden.");
        }
        return medication;
    }

    public void delete(String MedicationName) {
        Medication removedMedication = medicationMap.remove(MedicationName);
        if (removedMedication != null) {
            System.out.println("Medikament " + MedicationName + " wurde aus der Apotheke entfernt.");
        } else {
            System.out.println("Kein Medikament mit dem Namen " + MedicationName + " gefunden, um es zu löschen.");
        }
    }

    public void AllMedicationsDetails() {
        if (medicationMap.isEmpty()) {
            System.out.println("Momentan sind keine Medikamente verfügbar.");
        } else {
            System.out.println("***********");
            System.out.println("Medikamentenübersicht:");
            for (Map.Entry<String, Medication> entry : medicationMap.entrySet()) {
                Medication medication = entry.getValue();
                System.out.println("Name: " + medication.getName());
                System.out.println("Preis: " + medication.getPrice() + "€");
                if(medication.getAvailability()){
                    System.out.println("Midikament ist verfügbar.");
                }
                else{
                    System.out.println("Momentan nicht verfügbar");
                }
                System.out.println("***********");
            }
        }
}
}
