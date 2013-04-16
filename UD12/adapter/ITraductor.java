package adapter;

interface ITraductor {
	
	/**
	 * Traduce la palabra introducida por parametro en funcion del adaptador a utilizar
	 * @param palabraATraducir  palabra que será traducida
	 * @return	devuelve la traduccion
	 */
	
	public String traducir(String palabraATraducir);

	
}
