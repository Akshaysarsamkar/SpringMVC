package Springmvc.Entity;

public class Cource {

	private int courceid;
	private String courcename;
	private float fee;

	public Cource() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCourceid() {
		return courceid;
	}

	public void setCourceid(int courceid) {
		this.courceid = courceid;
	}

	public String getCourcename() {
		return courcename;
	}

	public void setCourcename(String courcename) {
		this.courcename = courcename;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

}
