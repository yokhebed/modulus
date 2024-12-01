public class MatematikaCanggih extends Matematika {
    void modulus() {
        if (b != 0) {
            System.out.println("Hasil = " + (a % b));
        } else {
            System.out.println("Error: Operasi modulus dengan nol tidak diperbolehkan.");
        }
    }
    
}
