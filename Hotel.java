public class Hotel {

    static Hotel hotels[]=new Hotel[10];

    /*Δημιουργία πίνακα 10 θέσεων με το όνομα hotels για αντικείμενα τύπου Hotel.Σύμφωνα με τις μεταβλητες στιγμιοτύπου κάθε ξενοδοχείο περιγράφεται
	 * από το όνομα,από το αντικείμενο τύπου City, από το μέσο κόστος διαμονής ,από τον αριθμό των αστεριών , από το αν υπάεχει πρωινό και από τον κωδικό του.
	 *Επίσης δηλώνεται ο μετρητής (counter) ως στατική μεταβλητή,όπου έχουν δηλαδή πρόσβαση σε αυτή όλα τα αντικείμενα της κλάσης.
	 */

	private String name;
	private City city;
	private double averageCost;
	private int stars;
	private boolean breakfast;
	private int code;
	static int counter=0;

	/* Δημιουργία κατασκευαστή.Σε κάθε αντικείμενο ανατίθεται αυτόματα ο κωδικός με
	 *αυξανόμενη τιμή.Ουσιαστικά κάθε φορά που καλείται ο κατασκευαστής,η στατική μεταβλητή
	 * αυξάνεται και στη συνέχεια δίνει την τιμή της στον code(κωδικό ξενοδοχείου).
     */


	public Hotel(String name,City city,double averageCost,int stars,boolean breakfast) {
		this.name = name;
		this.city=city;
		this.averageCost=averageCost;
		this.stars=stars;
		this.breakfast=breakfast;
		hotels[counter]=this;
		code=counter++;

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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public double getAverageCost() {
		return averageCost;
	}

	public void setAverageCost(double averageCost) { //Η τιμή αντικαταάστασης θα πρέπει να είναι μεγαλύτερη του μηδενός για να γίνει δεκτή.
		if(averageCost>0){
		  this.averageCost = averageCost;
	    }
	else System.out.println("Wrong value.Price did not change");
    }

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}
	public boolean getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(boolean breakfast) {
		this.breakfast = breakfast;
	}

    public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	/*Η μεθοδος toString ουσιαστικά καθορίζει τι θα εμφανίζεται όταν τυπώνεται το κάθε αντικείμενο
	*Επιστρέφει μια συμβολοσειρά με τις τιμές των μεταβλητών του αντικειμένου τύπου Hotel.
    */

	public String toString() {
		return "Hotel [id: "+code+"] :" + name +" in : "+ city + ". Average cost per night per person=" + averageCost+" euros \n "+stars+" stars hotel and breakfast include :"+breakfast ;
	}


}
