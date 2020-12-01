package cn.lsp.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;

//public class Test12 {
//	@Test
//	private void shell(String cmd) {
//		String[] cmds = { "/bin/sh", "-c", cmd };
//		Process process;
//
//		try {

//			process = Runtime.getRuntime().exec(cmds);
//
//			StreamGobbler errorGobbler = new StreamGobbler(process.getErrorStream(), "Error");
//			StreamGobbler outputGobbler = new StreamGobbler(process.getInputStream(), "Output");
//			errorGobbler.start();
//			outputGobbler.start();
//			try {
//				process.waitFor();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
//
//	
//
//class StreamGobbler extends Thread {  
//    
//    InputStream is;  
//    String type;  
//  
//    public StreamGobbler(InputStream is, String type) {  
//        this.is = is;  
//        this.type = type;  
//    }  
//  
//    public void run() {  
//        try {  
//            InputStreamReader isr = new InputStreamReader(is);  
//            BufferedReader br = new BufferedReader(isr);  
//            String line = null;  
//            while ((line = br.readLine()) != null) {  
//                if (type.equals("Error")) {  
//                    System.out.println("Error   :" + line);  
//                } else {  
//                    System.out.println("Debug:" + line);  
//                }  
//            }  
//        } catch (IOException ioe) {  
//            ioe.printStackTrace();  
//        }  
//    }  
//}
/**
 * 
 * @author lsp
 *Java程序执行Linux命令
 */
public class Test12 {
	public static void main(String[] args) throws Exception{
//		cd /Users/lsp/Desktop/Code && cp ./Vue ./test/
		String[] cmds1 = {"/bin/sh","-c","cd /Users/lsp/Desktop/Code && pwd"};
		Process pro1 = Runtime.getRuntime().exec(cmds1);
//		String[] cmds2 = {"/bin/sh","-c","cp  ./test/"};
//		Process pro2 = Runtime.getRuntime().exec(cmds2);
		pro1.waitFor();
		InputStream in = pro1.getInputStream();
		BufferedReader read = new BufferedReader(new InputStreamReader(in));
		String line = null;
		while((line = read.readLine())!=null){
			System.out.println(line);
		}
	}
}

