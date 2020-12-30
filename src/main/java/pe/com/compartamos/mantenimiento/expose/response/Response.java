package pe.com.compartamos.mantenimiento.expose.response;

public class Response {

	private String codigoRespuesta;
	private String descripcionRespuesta;
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}
	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}
	public String getDescripcionRespuesta() {
		return descripcionRespuesta;
	}
	public void setDescripcionRespuesta(String descripcionRespuesta) {
		this.descripcionRespuesta = descripcionRespuesta;
	}
	@Override
	public String toString() {
		return "Response [codigoRespuesta=" + codigoRespuesta + ", descripcionRespuesta=" + descripcionRespuesta + "]";
	}
	
	
}
