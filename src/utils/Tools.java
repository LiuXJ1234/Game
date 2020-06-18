package utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Tools {
	
	
	
	
	//方法读取文件
	public static List<String> readFile(String address) throws Exception {
		long start = System.currentTimeMillis();
		List<String> list = new ArrayList<String>();
		FileInputStream fis =new FileInputStream(address);
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String data = null;
		while((data = br.readLine())!=null) {
			System.out.println(data);//
			list.add(data);
		}
		br.close();
		long end = System.currentTimeMillis();
		System.out.println("输出时间:==>"+(end - start));//
		return list;
	}
	
	
	//关键词搜索
	public static List<String> search(String address, String search) throws Exception {
		long start = System.currentTimeMillis();
		List<String> list = new ArrayList<String>();
		FileInputStream fis =new FileInputStream(address);
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String data = null;
		while((data = br.readLine())!=null) {
			if(data.contains(search)){
				list.add(data);
				System.out.println(data);//输出
			}
		}
		br.close();
		long end = System.currentTimeMillis();
		System.out.println("输出时间:==>"+(end - start));//输出
		return list;
	}









	
	
	
	

}
