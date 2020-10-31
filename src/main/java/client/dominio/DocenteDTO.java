package client.dominio;

public class DocenteDTO {
	private Long idDocente;
	private String nombreDocente;
	private String apellidosDocente;
	private String fechaDocente;
	private String telefonoDocente;
	

	private String departamentoDocente;
	
	public DocenteDTO() {
		
		
	}
	
	
	public DocenteDTO(Long idDocente, String nombreDocente, String apellidosDocente, String fechaDocente, String telefonoDocente, String departamentoDocente) {
		this.idDocente=idDocente;
		this.nombreDocente=nombreDocente;
		this.apellidosDocente = apellidosDocente;
		this.fechaDocente = fechaDocente;
		this.telefonoDocente = telefonoDocente;
		this.departamentoDocente = departamentoDocente;
		
	}

	public Long getIdDocente() {
		return idDocente;
	}

	public void setIdDocente(Long idDocente) {
		this.idDocente = idDocente;
	}

	public String getNombreDocente() {
		return nombreDocente;
	}

	public void setNombreDocente(String nombreDocente) {
		this.nombreDocente = nombreDocente;
	}

	public String getApellidosDocente() {
		return apellidosDocente;
	}

	public void setApellidosDocente(String apellidosDocente) {
		this.apellidosDocente = apellidosDocente;
	}

	public String getFechaDocente() {
		return fechaDocente;
	}

	public void setFechaDocente(String fechaDocente) {
		this.fechaDocente = fechaDocente;
	}
	
	public String getTelefonoDocente() {
		return telefonoDocente;
	}


	public void setTelefonoDocente(String telefonoDocente) {
		this.telefonoDocente = telefonoDocente;
	}

	public String getDepartamentoDocente() {
		return departamentoDocente;
	}

	public void setDepartamentoDocente(String departamentoDocente) {
		this.departamentoDocente = departamentoDocente;
	}
	
	
	

}
