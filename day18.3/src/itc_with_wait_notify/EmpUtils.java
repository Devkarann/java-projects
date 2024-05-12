package itc_with_wait_notify;

public class EmpUtils {
	private Emp e;
	private boolean dataReady;

	public synchronized void writeData(Emp ref) throws Exception {
		System.out.println("w entered --- " + Thread.currentThread().getName());
		while(dataReady) //till data is ready i.e consumer has not yet read it !
		 wait();
		// produce data
		e = ref;
		System.out.println("Write Data " + e);
		System.out.println("w exited --- " + Thread.currentThread().getName());
		dataReady=true;
		notify();//producer sending un blocks --Consumer
		
	}

	public synchronized Emp readData() throws Exception {
		System.out.println("r entered --- " + Thread.currentThread().getName());
		while(!dataReady)
			wait();
		// consume data
		System.out.println("Read  Data " + e);		
		System.out.println("r exited --- " + Thread.currentThread().getName());
		dataReady=false;
		notify();//consumer un blocks producer
		return e;
	}

}
