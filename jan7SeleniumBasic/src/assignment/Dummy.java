package assignment;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Dummy {
	
	public static void main(String[] args) {
		
		int ar[]={55,11,777,98};
		
		int max= ar[0];
		
		for (int i=0; i<=ar.length-1; i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		
		System.out.println(max);
	}


}


