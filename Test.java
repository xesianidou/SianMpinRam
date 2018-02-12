import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		/*Δημιουργία αντικειμένου τύπου City και ανάθεσή του στην αναφορά (μεταβλητή) rome.
		Το αντικείμενο θα προστεθεί στον πίνακα των cities.
		*/

		City rome = new City ("Rome","Italy",5);

		/*Δημιουργία αντικειμένου τύπου Hotel και ανάθεσή του στην αναφορά (μεταβλητή) hotel1.
		Το αντικείμενο θα προστεθεί στον πίνακα των hotels.
		*/

		Hotel hotel1 = new Hotel ("Roma bella", rome ,50,3,false);

	    //Ακολουθεί η δημιουργία αντικειμένων τύπου City και Hotel τα οποία θα προστεθούν αυτομάτως στους πίνακες cities και hotels.


		City berlin = new City ("Berlin","Germany",4);
		new Hotel ("Mercure Hotel",berlin,55.5,3,true);
		new Hotel("Berlin ,Berlin",berlin,50.0,4,true);

		City paris= new City ("Paris","France",3);
		new Hotel ("Hotel Montmartre mon Amour",paris,95.50,3,true);

		City barcelona= new City ("Barcelona","Spain",3);
		new Hotel ("Barca",barcelona,32.30,2,false);

		City newYork = new City("New York","U.S.A.",12);
		new Hotel ("Holday inn",newYork,67.50,3,true);

		City london=new City("London","Great Britain",6);
		new Hotel ("Milestone",london,350,4,true);


		City tokyo =new City("Tokyo","Japan",10);
		new Hotel ("Niwa Tokyo",tokyo,110.30,4,true);



		// Έχουμε δημιουργήσει πίνακες με αντικείμενα πόλεις και ξενοδοχεία.


		while (true){
			System.out.println("\n------ Welcome to our DMST Marvelous Travel Agency ------");
			System.out.println("1. Display all destinations");
			System.out.println("2. Search available hotels  by City's name");
			System.out.println("3. Create new City");
			System.out.println("4. Diplay the most expensive hotels");
			System.out.println("5. Change price of hotels");
			int choice = scanner.nextInt(); //ο χρήστης θα επιλέξει τον αριθμό που αντιστοιχεί σε κάποια επιλογή του μενού.

			if (choice == 1){
				System.out.println(" Our Destinations are: ");
				for (int i=0; i<City.cities.length; i++){//Εκτύπωση όλων των αντικειμένων του πίνακα cities(δεν είναι γεμάτος ο πίνακας)
					if (City.cities[i]!= null)//αν υπάρχει αντικείμενο στη θέση
						System.out.println(City.cities[i].toString());
				}
			}
			else if (choice == 2 ){
					System.out.println("Please write the city : ");//Αναζήτηση hotel με βάση τη μεταβλητή στιγμιοτύπου name του αντικειμένου τύπου City.
					String choice2=scanner.next();//ο χρήστης μας δηλώνει την πόλη επιλογής του
					int hotelcounter=0; //αρχικά μετραμε τα ξενοδοχεία που βρίσκονται στην πόλη αναζήτησης με τον μετρητη hotelcounter
						for(int y=0; y<Hotel.hotels.length; y++){
							 if(Hotel.hotels[y]!= null){//αν υπάρχει αντικείμενο στη θέση του πίνακα
								if (choice2.equals(Hotel.hotels[y].getCity().getName())){ /*άμα η πόλη επιλογής ταυτίζεται με τη μεταβλητή στιγμιοτύπου name
									                                                      *του αντικειμένου τύπου City
									                                                      */

									hotelcounter++;// τότε ο μετρητής hotelcounter αυξάνεται
											}
										}
								}
										System.out.println(hotelcounter+" hotels were found");//εμφάνιση του αριθμού των ξενοδοχείων που βρέθηκαν
										   for(int y=0; y<Hotel.hotels.length; y++){
											  if(Hotel.hotels[y]!= null && choice2.equals(Hotel.hotels[y].getCity().getName())){
											     System.out.println(Hotel.hotels[y].toString());//εμφάνιση των αντικειμένων τύπου Hotel που αντιστοιχούνστην επιλογή
												 }
											}
								    }



 else if (choice == 3 ){
			     if(City.counter <9){
				        System.out.println("Create new City: "); //δημιουργία αντικειμένου τύπου City
				            for(int i=0; i<City.cities.length; i++){
					             if(City.cities[i]== null){//αν βρεθεί κενή θέση στον πίνακα
						              System.out.print("Name: ");//Ζητάμε όνομα πόλης
						              String name = scanner.next();
						              System.out.print("Country: ");//Ζητάμε όνομα χώρας
						              String country= scanner.next();
                                      System.out.print("Days of holiday: ");//Ζητάμε μέρες διακοπών
						              int days = scanner.nextInt();

						              City.cities[i]=new City (name,country,days);//δημιουργία και αποθήκευση αντικειμένου
						              System.out.println(City.cities[i].getName() +" has been stored! ");
						              break;
					              }
				  }
		  }
		       else System.out.println("No available space for new country ");//αν δεν βρεθεί κενή θεση στον πίνακα εμφανίζεται σχετικό μήνυμα στην οθόνη
	  }
	    else if (choice == 4){
	  				double max=0;//ορίζουμε τη μεταβλητή max που θα "συγκρίνει τις τιμές ώστε να καταλήξει στην μεγαλύτερη τιμή
	  				  for(int i=0; i<Hotel.hotels.length; i++){//για κάθε  hotel
	  					if(Hotel.hotels[i]!= null && Hotel.hotels[i].getAverageCost()> max){/*αν υπάρχει αντικείμενο hotel στη συγκεκριμένη θέση του πίνακα,
	  					                                                                    *με κόστος μεγαλύτερο από την τιμη του max
	  					                                                                    */
	  						max=Hotel.hotels[i].getAverageCost();//η νέα τιμη του max ισούται με την τιμή  του ξενοδοχείου.
	  					}
	  			}
	  			/*Η συγκριση με την τιμή του max, η οποία αλλάζει αν συγκρίνεται με μεγαλύτερες τιμές συνεχίζει μέχρι να περάσει τη διαδικασία αυτή κάθε αντικείμενο
	  			*του πίνακα(διαφορο του null).Τελικά θα μείνει η μέγιστη τιμή.
	  			*/
	  						for(int y=0; y<Hotel.hotels.length; y++){
	  							if(Hotel.hotels[y]!= null){
	  								if (max==Hotel.hotels[y].getAverageCost()){//ώστε να εμφανιστούν τα ξενοδοχεία με την μέγιστη τιμή διαμονής
	  						           System.out.println(Hotel.hotels[y].toString());
	  							}
	  						}
	  					}
	  				}

	  			else if (choice == 5){
	  			    System.out.print("Insert index: ");//Δηλώνεται η θέση του πίνακα , η οποία ταυτίζεται με τη στατική μεταβλητή code(για ευκολία του χρήστη)
	  				int index=scanner.nextInt();
	  				    if (Hotel.hotels[index]==null){
	  				       System.out.println( "No hotel is stored in this index!" );//ο αριθμός αντιστοιχεί σε κενή θέση πίνακα
	  			   }
	  				    else {
	  					   System.out.println("Your search for hotels stored in index  "+index+":"+Hotel.hotels[index].getName());//δίνεται το όνομα του ξενοδοχείου
	  				       System.out.println("New price :");
	  				       double newPrice=scanner.nextDouble();//ο χρήστης δίνει τη νέα τιμή
	  					   Hotel.hotels[index].setAverageCost(newPrice);//η νέα τιμή μέσω της μεθόδου set δίνεται στο ξενοδοχείο(έλεγχος καταλληλότητας εντός μεθόδου)
	  					   System.out.println( Hotel.hotels[index].toString());//εμφάνιση του αντικειμένου
	  					  }

	  		}
	  			else {
	  			System.out.println("wrong input");//για εισαγωγή αριθμού από το χρήστη εκτός των διαθέσιμων επιλογών του μενού
	  			System.out.println("------------------\n");
	  		}
	  	  }
	     }
     }