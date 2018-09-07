public class Dosen {
	String nama;
	String npm;

	public Dosen(String nama, String npm) {
		super();
		this.nama = nama;
		this.npm = npm;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String namaBaru) {
		this.nama = namaBaru;
	}

	public String getNpm() {
		return npm;
	}

	public void setNpm(String npmBaru) {
		this.npm = npmBaru;
	}
}
