public class Hotel {

    static Hotel hotels[]=new Hotel[10];

    /*���������� ������ 10 ������ �� �� ����� hotels ��� ����������� ����� Hotel.������� �� ��� ���������� ������������ ���� ���������� ������������
	 * ��� �� �����,��� �� ����������� ����� City, ��� �� ���� ������ �������� ,��� ��� ������ ��� �������� , ��� �� �� ������� ������ ��� ��� ��� ������ ���.
	 *������ ��������� � �������� (counter) �� ������� ���������,���� ����� ������ �������� �� ���� ��� �� ����������� ��� ������.
	 */

	private String name;
	private City city;
	private double averageCost;
	private int stars;
	private boolean breakfast;
	private int code;
	static int counter=0;

	/* ���������� ������������.�� ���� ����������� ���������� �������� � ������� ��
	 *���������� ����.���������� ���� ���� ��� �������� � �������������,� ������� ���������
	 * ��������� ��� ��� �������� ����� ��� ���� ��� ���� code(������ �����������).
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

   /*���������� �� ������� get ��� set.� ������� get ���� �������� ����������� ��� ���� ��� ���������� �� ��� ��� ����,� ����� �������� ������ ��� �������.
    *� ������� set ���� �������� �����-���������� ��� ���� ��� ���� � ���������.
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

	public void setAverageCost(double averageCost) { //� ���� ��������������� �� ������ �� ����� ���������� ��� ������� ��� �� ����� �����.
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

	/*� ������� toString ���������� ��������� �� �� ����������� ���� ��������� �� ���� �����������
	*���������� ��� ������������ �� ��� ����� ��� ���������� ��� ������������ ����� Hotel.
    */

	public String toString() {
		return "Hotel [id: "+code+"] :" + name +" in : "+ city + ". Average cost per night per person=" + averageCost+" euros \n "+stars+" stars hotel and breakfast include :"+breakfast ;
	}


}
