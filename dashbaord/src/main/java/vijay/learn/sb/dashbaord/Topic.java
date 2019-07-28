package vijay.learn.sb.dashbaord;

public class Topic {
	
	private String name;
	private String company;

	public Topic() {
		// TODO Auto-generated constructor stub
	}
	
	public Topic(String name,String company) {
		super();
		this.company =company;
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

}
