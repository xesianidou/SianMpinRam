public class City {

	static City cities[]=new City[10];
	/*���������� ������ 10 ������ �� �� ����� cities ��� ����������� ����� City.������� �� ��� ���������� ������������ ���� ���� ������������
	 * ���  �����, ���� ,������ ��������.������ ��������� � �������� (counter) �� ������� ���������,���� ����� ������ ��������
	 *�� ���� ��� �� ����������� ��� ������.
	 */

	private String name;
	private String country;
	private int daysOfHoliday;
	static int counter= 0;

	/* ���������� ������������.�� ���� ����������� ���������� �������� � ������� ��
     *���������� ����.���������� ���� ���� ��� �������� � �������������,� ������� ���������
     * ��������� ��� ��� �������� ����� ��� ���� ��� ���� code(������ �����).
	 */


	public City (String name,String country,int daysOfHoliday) {
		this.name = name;
		this.country=country;
		this.daysOfHoliday=daysOfHoliday;
		cities[counter]=this;
		++counter;

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


	/*� ������� toString ���������� ��������� �� �� ����������� ���� ��������� �� ���� �����������
	*���������� ��� ������������ �� ��� ����� ��� ���������� ��� ������������ ����� City.
    */

	public String toString() {
		return ""+ name + ",which is a beautiful city of "+country+" ,for  "+daysOfHoliday+ " days";
	}
}
