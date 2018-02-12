public class City {

	static City cities[]=new City[10];
	/*Δημιουργία πίνακα 10 θέσεων με το όνομα cities για αντικείμενα τύπου City.Σύμφωνα με τις μεταβλητες στιγμιοτύπου κάθε πόλη περιγράφεται
	 * από  όνομα, χώρα ,ημέρες διακοπών.Επίσης δηλώνεται ο μετρητής (counter) ως στατική μεταβλητή,όπου έχουν δηλαδή πρόσβαση
	 *σε αυτή όλα τα αντικείμενα της κλάσης.
	 */

	private String name;
	private String country;
	private int daysOfHoliday;
	static int counter= 0;

	/* Δημιουργία κατασκευαστή.Σε κάθε αντικείμενο ανατίθεται αυτόματα ο κωδικός με
     *αυξανόμενη τιμή.Ουσιαστικά κάθε φορά που καλείται ο κατασκευαστής,η στατική μεταβλητή
     * αυξάνεται και στη συνέχεια δίνει την τιμή της στον code(κωδικό πόλης).
	 */


	public City (String name,String country,int daysOfHoliday) {
		this.name = name;
		this.country=country;
		this.daysOfHoliday=daysOfHoliday;
		cities[counter]=this;
		++counter;

	}

    /*Ακολουθούν οι μέθοδοι get και set.Η μέθοδος get όταν καλείται αντικαθιστά την τιμή της μεταβλητής με μια νέα τιμή,η οποία αποτελέι όρισμα της μεθόδου.
    *Η μέθοδος set όταν καλείται δίνει-επιστρέφει την τιμή που έχει η μεταβλητή.
    */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getDaysOfHoliday() {
		return daysOfHoliday;
	}

	public void setDaysOfHoliday(int daysOfHoliday) {
		this.daysOfHoliday = daysOfHoliday;
	}


	/*Η μεθοδος toString ουσιαστικά καθορίζει τι θα εμφανίζεται όταν τυπώνεται το κάθε αντικείμενο
	*Επιστρέφει μια συμβολοσειρά με τις τιμές των μεταβλητών του αντικειμένου τύπου City.
    */

	public String toString() {
		return ""+ name + ",which is a beautiful city of "+country+" ,for  "+daysOfHoliday+ " days";
	}
}
