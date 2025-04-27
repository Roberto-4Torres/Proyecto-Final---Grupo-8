package clase;

public class Libro 
{
	private String user,libro,fp,fd;

	public Libro(String user, String libro, String fp, String fd) {
		super();
		this.user = user;
		this.libro = libro;
		this.fp = fp;
		this.fd = fd;
	}

	public String getFp() {
		return fp;
	}

	public void setFp(String fp) {
		this.fp = fp;
	}

	public String getFd() {
		return fd;
	}

	public void setFd(String fd) {
		this.fd = fd;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}
}
