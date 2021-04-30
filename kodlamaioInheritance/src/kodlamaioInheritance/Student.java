package kodlamaioInheritance;

public class Student extends User {
	
	String kullaniciadi;
	String sifre;
	
	public Student() {
		
	}
	
	public Student(int id,String userName,String lastName, String kullaniciadi, String sifre) {
		super(id,userName,lastName);
		this.kullaniciadi = kullaniciadi;
		this.sifre = sifre;
	}

	public String getKullaniciadi() {
		return kullaniciadi;
	}

	public void setKullaniciadi(String kullaniciadi) {
		this.kullaniciadi = kullaniciadi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	

}
