import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		/*���������� ������������ ����� City ��� ������� ��� ���� ������� (���������) rome.
		�� ����������� �� ��������� ���� ������ ��� cities.
		*/

		City rome = new City ("Rome","Italy",5);

		/*���������� ������������ ����� Hotel ��� ������� ��� ���� ������� (���������) hotel1.
		�� ����������� �� ��������� ���� ������ ��� hotels.
		*/

		Hotel hotel1 = new Hotel ("Roma bella", rome ,50,3,false);

	    //��������� � ���������� ������������ ����� City ��� Hotel �� ����� �� ���������� ��������� ����� ������� cities ��� hotels.


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



		// ������ ������������ ������� �� ����������� ������ ��� ����������.
		
		
		
	

 else if (choice == 3 ){
			     if(City.counter <9){
				        System.out.println("Create new City: "); //���������� ������������ ����� City
				            for(int i=0; i<City.cities.length; i++){
					             if(City.cities[i]== null){//�� ������ ���� ���� ���� ������
						              System.out.print("Name: ");//������ ����� �����
						              String name = scanner.next();
						              System.out.print("Country: ");//������ ����� �����
						              String country= scanner.next();
                                      System.out.print("Days of holiday: ");//������ ����� ��������
						              int days = scanner.nextInt();

						              City.cities[i]=new City (name,country,days);//���������� ��� ���������� ������������
						              System.out.println(City.cities[i].getName() +" has been stored! ");
						              break;
					              }
				  }
		  }
		       else System.out.println("No available space for new country ");//�� ��� ������ ���� ���� ���� ������ ����������� ������� ������ ���� �����
	  }