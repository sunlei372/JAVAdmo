package cn.sinomdt.sn.test.demo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class Demo02 {
	 public void MyDemo(){
		 File file=new File("D:/","Test1122.txt");
		 OutputStr(file);
		 InputStr(file);
		 WriterStr(file);
	 }

	 /*
	  * 写文件
	  * 
	 */
	 private void OutputStr(File file){
		 FileOutputStream out=null;
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		 System.out.println("文件已创建");
		try {
			out=new FileOutputStream(file); 
			byte[] btyStr="hello world 456".getBytes();
			out.write(btyStr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
		   if (null!=out) {
			  try {
				  out.close();
				  System.out.println("文件已关闭");
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		}
	 }
	 /*
	  * 读文件
	 */
	 private void InputStr(File file) {
		FileInputStream in=null;
		byte[]byt=new byte[1024];
		try {
			if (!file.exists()) {
				System.out.println("文件不存在");
				return;
			}
			in=new FileInputStream(file);
			//;
			System.out.println("文件中的信息是："+new String(byt,0,in.read(byt)));
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if (null!=in) {
					in.close();
				}
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}
	 /*
	  * 写文件
	 */
	 private void WriterStr(File file) {
		FileWriter writer=null;
		try {
			if (!file.exists()) {
				return;
			}
			writer= new FileWriter(file); 
			writer.append("这是新添加进来的");//.write("这是新添加进来的");
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(null!=writer){
					writer.close();
					InputStr(file);
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
