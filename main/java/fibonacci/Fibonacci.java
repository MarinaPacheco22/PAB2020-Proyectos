package fibonacci;

public class Fibonacci {
	private long bebes;
	private long adultos;
	private long bebesEnElUltimoMes;
	//n -> meses
	//k -> descendientes/mes

	public long compute(long n, long k) {
		bebes = 1;
		adultos = 0;
		for(int i=0;i<n-1;i++) {
			bebesEnElUltimoMes = bebes;
			bebes = k*adultos;
			adultos+=bebesEnElUltimoMes;
		}
		return bebes+adultos;
	}
}
