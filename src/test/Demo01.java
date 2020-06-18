package test;

import utils.Tools;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Demo01 {
	
	public static void main(String[] args) throws Exception {
		//need to buy a good computer
		/*System.out.println("hello!");
		new Thread(new Runnable() {
			int count = 0;
			@Override
			public void run() {
				System.out.println(count);
				count++;
			}
		}).start();*/
		long start =  System.currentTimeMillis();
		Tools.readFile("src/resources/无限从龙骑士开始.txt");
		long end =  System.currentTimeMillis();
		System.out.println(end-start);
		
	}
	
	
	//方法读取文件
	/*public static void readFile(String address) throws Exception {
		
		FileInputStream fis =new FileInputStream(address);
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String data = null;
		while((data = br.readLine())!=null) {
			System.out.println(data);
		}
		br.close();
	}*/
	
	
	
	
	
}
