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