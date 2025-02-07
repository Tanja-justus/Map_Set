package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        // Hinzufügen von Medikamenten mit der save-Methode
        Medication paracetamol = new Medication("Paracetamol", 8.49, false);
        Medication aspirin = new Medication("Aspirin", 5.99, true);
        Medication ibuprofen = new Medication("Ibuprofen", 11.49, false);
        pharmacy.save(paracetamol);
        pharmacy.save(aspirin);
        pharmacy.save(ibuprofen);

        // Anzeige aller Medikamenten-Daten
        pharmacy.AllMedicationsDetails();

        // Löschen eines Medikaments
        pharmacy.delete("Aspirin");

        // Anzeige aller Medikamente nach dem Löschen
        pharmacy.AllMedicationsDetails();
    }
}